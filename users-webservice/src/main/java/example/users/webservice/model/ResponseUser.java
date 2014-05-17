/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.users.webservice.model;

import java.util.List;

/**
 *
 * @author antonio
 */
public class ResponseUser {

    private List<User> users;
    private boolean result;
    private String operation;

    public String getOperation() {
        return operation;
    }

    public ResponseUser(String op) {
        this.operation = op;
        this.result = true;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public ResponseUser() {
        this.result = true;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean succes) {
        this.result = succes;
    }

}
