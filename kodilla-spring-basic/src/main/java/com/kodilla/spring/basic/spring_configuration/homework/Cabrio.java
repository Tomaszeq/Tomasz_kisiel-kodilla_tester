package com.kodilla.spring.basic.spring_configuration.homework;

class Cabrio implements Car {
    @Override
    public boolean hasHeadlightsTurnedOn() {
        return true;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
