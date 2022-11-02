package models;

import java.sql.Date;

public class Account {
    private  int id;
    private String name;
    private String username;
    private String password;
    private String address;
    private Date birth;
    private int id_role;

    public Account() {
    }

    public Account( int id, String username, String password, String address, Date birth, int id_role) {
        this.id = id;

        this.username = username;
        this.password = password;
        this.address = address;
        this.birth = birth;
        this.id_role = id_role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public int getId_role() {
        return id_role;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }
}
