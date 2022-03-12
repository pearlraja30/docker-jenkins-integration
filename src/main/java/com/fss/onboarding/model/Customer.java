package com.fss.onboarding.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter @Setter @ToString
public class Customer {

    @Id
    @Column(name = "customer_id")
    private long customerId;

    @Column (name = "device_id")
    private String device_id;

    @Column(name = "model_name")
    private String model_name;

    @Column(name = "model_number")
    private String model_number;

    @Column(name = "serial_number")
    private String serial_number;

    @Column(name = "IMEI")
    private String IMEI;

    @Column(name = "mobile_number")
    private String mobile_number;

    @Column(name= "os_name")
    private String os_name;

    @Column(name = "os_type")
    private String os_type;

    @Column(name = "os_version")
    private String os_version;

    @Column(name = "status")
    private String status;

    @Column(name = "ip")
    private String ip;

    @Column(name = "lan")
    private String lan;

    @Column(name = "lat")
    private String lat;

    @Column(name = "create_dt")
    private LocalDate createDt;
}
