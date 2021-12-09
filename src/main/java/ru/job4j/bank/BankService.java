package ru.job4j.bank;

import java.util.*;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        ArrayList<Account> accounts = new ArrayList<Account>();
        if (users.size() == 0 || users.containsKey(user)) {
        users.put(user, accounts);
        }
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List accounts = users.get(user);
        if (!accounts.contains(account)) {
            accounts.add(account);
            users.put(user, accounts);
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                return user;
            }
            break;
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (account.getRequisite().contains(requisite)) {
                    return account;
                }
            }
            }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        double srcBalance = findByRequisite(srcPassport, srcRequisite).getBalance();
        Account destAccount = findByRequisite(destPassport, destRequisite);
        double destBalance = destAccount.getBalance();
        if (srcBalance - amount >= 0) {
            destAccount.setBalance(destBalance + amount);
                    rsl = true;
        }
        return rsl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankService that = (BankService) o;
        return Objects.equals(users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }
}
