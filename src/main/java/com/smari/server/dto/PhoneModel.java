package com.smari.server.dto;

import java.io.Serializable;

/**
 * @author smari
 */
public class PhoneModel  implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String phoneNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
