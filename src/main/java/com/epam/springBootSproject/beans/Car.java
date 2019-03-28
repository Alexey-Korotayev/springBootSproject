package com.epam.springBootSproject.beans;

import java.util.Date;

public class Car {
    private Date dateOfManufacture;
    private String carMake;
    private String licence;
    private boolean cruiseControl;

    public Car() {
    }

    public Car(Date dateOfManufacture, String carMake, String licence, boolean cruiseControl) {
        this.dateOfManufacture = dateOfManufacture;
        this.carMake = carMake;
        this.licence = licence;
        this.cruiseControl = cruiseControl;
    }

    @Override
    public String toString() {
        return "Car{" +
                "dateOfManufacture=" + dateOfManufacture +
                ", carMake='" + carMake + '\'' +
                ", licence='" + licence + '\'' +
                ", cruiseControl=" + cruiseControl +
                '}';
    }

    public Date getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(Date dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public boolean isCruiseControl() {
        return cruiseControl;
    }

    public void setCruiseControl(boolean cruiseControl) {
        this.cruiseControl = cruiseControl;
    }
}
