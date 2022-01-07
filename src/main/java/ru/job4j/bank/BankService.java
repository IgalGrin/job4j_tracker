package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает модель банковской системы.
 * @author IGOR GRINKO
 *   @version 1.0
 */

public class BankService {
    /**
     * Хранение пользователей (объектов типа User) и ассоциируемых с ними
     * счетов (объектов типа Account, помещенных в коллекцию типа ArrayList)
     * осуществляется в коллекции users типа HashMap.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя (ключ), проверяет не создана
     * ли уже по такому ключу пара в коллекции users, если не создана,
     * то создает новую пару : пользователя (объект типа User) и ассоциируемый с ним
     * список счетов (незаполненную коллекцию типа ArrayList).
     * @param user Пользователь который добавляется в список пользователей.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод принимает на вход номер паспорта и счет (объект типа Account).
     * Передает номер паспорта в аргумент метода findByPassport() и если пользователь -
     * ключ (объект типа User) найден, то получает по ключу доступ к списку счетов
     * пользователя в коллекции users. Далее метод проверяет не содержит ли список счет
     * (объект типа Account) переданный на входе. Если не содержит, то добавляет этот
     * счет в список счетов ассоциируемый с пользователем - ключем.
     *
     * @param passport Передаваемый номер паспорта.
     * @param account Передаваемый номер счета.
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = users.get(user.get());
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод принимает на вход номер паспорта, в цикле извлекает значение
     * ключа (объект типа User) из коллекции users, сравнивает значение его
     * поля passport с номером переданным на входе.
     * @param passport Передаваемый номер паспорта.
     * @return Если номера паспортов совпадают, возвращает пользователя
     * (объект типа User) иначе возвращает null.
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(u -> u.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод принимает на входе номер паспорта и номер счета пользователя.
     * Передает номер паспорта в аргумент метода findByPassport() и если пользователь -
     * ключ (объект типа User) найден, то получает по ключу доступ к списку счетов
     * пользователя в коллекции users. Далее метод в цикле перебирает из списка каждый счет
     * (объект типа Account) сравнивая содержимое его поля requisite с номером счета переданным
     * на входе.
     * @param passport Передаваемый номер паспорта.
     * @param requisite Передаваемый номер счета.
     * @return Если номера счетов совпадают возвращает найденный счет (объект типа Account) иначе
     * возвращает null.
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        Optional<Account> rsl = null /*Optional.empty()*/;
        if (user.isPresent()) {
            rsl = users.get(user.get())
                    .stream()
                    .filter(a -> a.getRequisite().equals(requisite))
                    .findFirst();
        }
        return rsl;
    }

    /**
     * Метод принимает на входе сумму перевода, номер паспорта и номер счета пользователя который
     * осуществляет перевод, а также номер паспорта и номер счета пользователя который получает
     * перевод. Номера паспортов и номера счетов пользователей передаются в аргумент метода
     * findByRequisite() который возвращает счета (объекты типа Account или null).
     * Далее выполняется проверка найденных счетов на null. Если они не null, метод получает
     * значения полей balance этих счетов. Далее метод проверяет достаточна ли сумма счета
     * откуда осуществляется перевод, сравнивая значение поля balance и суммы перевода
     * переданной на входе. Если сумма достаточна, то происходит переопределение полей balance
     * счетов в соответствии с суммой перевода.
     * @param srcPassport Передаваемый номер паспорта клиента осуществляющего перевод.
     * @param srcRequisite Передаваемый номер счета клиента осуществляющего перевод.
     * @param destPassport Передаваемый номер паспорта клиента получающего перевод.
     * @param destRequisite Передаваемый номер счета клиента получающего перевод.
     * @param amount Сумма перевода.
     * @return Если перевод осуществлен, возвращает true, иначе null.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && destAccount.isPresent()) {
            double srcBalance = srcAccount.get().getBalance();
            double destBalance = destAccount.get().getBalance();
                if (srcBalance >= amount) {
                    destAccount.get().setBalance(destBalance + amount);
                    srcAccount.get().setBalance(srcBalance - amount);
                    rsl = true;
                }
        }
        return rsl;
    }
}
