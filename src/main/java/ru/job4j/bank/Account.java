package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель счета пользователя.
 * @author IGOR GRINKO
 *   @version 1.0
 */
public class Account {
    /**
     * Поле принимающее номер счета.
     */
    private String requisite;
    /**
     * Поле принимающее значение баланса.
     */
    private double balance;

    /**
     * Конструктор принимает на вход номер счета и значение баланса,
     * далее устанавливает в поля с соответствующими именами
     * эти значения и возвращает объект.
     * @param requisite Передаваемый номер счета.
     * @param balance Передаваемое значение баланса.
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод не принимающий параметров на входе.
     * @return Возвращает значение поля requisite.
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод принимает на вход номер счета и
     * устанавливает значение в поле requisite.
     * @param requisite Передаваемый номер счета.
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод не принимающий параметров на входе.
     * @return Возвращает значение поля balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод принимает на вход значение balance и
     * устанавливает значение в поле balance.
     * @param balance Передаваемое значение balance.
     */
    public void setBalance(double balance) {
        this.balance = balance;
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
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Переопределение метода hashCode()
     * @return Возвращает 32 битное число типа int.
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
