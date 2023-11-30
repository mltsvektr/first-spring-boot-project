package ru.itgirls.firstspringbootproject;

public enum Days {
    MONDAY("понедельник"),
    TUESDAY("вторник"),
    WEDNESDAY("среда"),
    THURSDAY("четверг"),
    FRIDAY("пятница"),
    SATURDAY("суббота"),
    SUNDAY("воскресенье");

    private final String DAY_OF_WEEK;
    Days(String dayOfWeek) {
        this.DAY_OF_WEEK = dayOfWeek;
    }

    public String getDAY_OF_WEEK() {
        return DAY_OF_WEEK;
    }
}

