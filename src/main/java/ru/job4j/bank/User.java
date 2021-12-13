package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель пользователя банка.
 * @author IGOR GRINKO
 *   @version 1.0
 */
public class User {
    /**
     * Поле принимающее номер паспорта.
     */
    private String passport;
    /**
     * Поле принимающее имя пользователя.
     */
    private String username;

    /**
     * Конструктор принимает на вход номер паспорта и имя пользователя,
     * далее устанавливает в поля с соответствующими именами
     * эти значения и возвращает объект.
     * @param passport Передаваемый номер паспорта.
     * @param username Передаваемое имя пользователя.
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод не принимающий параметров на входе.
     * @return Возвращает значение поля passport.
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод принимает на вход номер паспорта и устанавливает значение
     * в поле с соответствующим именем.
     * @param passport Передаваемый номер паспорта.
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод не принимающий параметров на входе.
     * @return Возвращает значение поля username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод принимает на вход имя пользователя и устанавливает значение
     * в поле с соответствующим именем.
     * @param username Передаваемое имя пользователя.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Переопределение метода equals()
     * @param o Передаваемый объект.
     * @return Возвращает true если объекты эквивалентны,
     * иначе false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Переопределение метода hashCode()
     * @return Возвращает 32 битное число типа int.
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
