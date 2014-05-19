/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.users.webservice.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author antonio
 */
//@XmlRootElement(name = "User")
public class User{

    private String firstName;
    private String lastName;
    private String nickName;
    private Date dateBirth;
    private final DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

    public User() {
    }

    public User(String firstName, String lastName, String nickName, Date dateBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.dateBirth = dateBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
    
    	@Override
	public String toString() {
	   return "User [firstName=" + this.firstName + ", lastName=" + this.lastName + ", nickName="
		+ nickName + ", dateBirthday=" + df.format(dateBirth) + "]";
	}

}
