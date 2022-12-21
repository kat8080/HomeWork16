package Passport;


import java.util.Objects;

public class Passport {
    private final int number;
    private final String surname;
    private final String name;
    private final String patronymic;
    private final String date;

    public Passport(int number, String surname, String name, String patronymic, String date) {
        this.number = number;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getdate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Passport:" + " № " + number + ", Ф.И.О. - " + surname + " " + name + " " + patronymic + ", дата рождения - " + date;
    }
}
