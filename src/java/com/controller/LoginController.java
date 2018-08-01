/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.controller;

import com.query.Query;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

/**
*
* @author Ivan
*/
@ManagedBean(name="login")
@SessionScoped
public class LoginController implements Serializable {

private String username;
private String password;
private final Query query = new Query();
public String loginControl(){
if(query.loginControl(username, password)){
return "home.xhtml?faces-redirect=true";
}
RequestContext.getCurrentInstance().update("growl");
FacesContext context = FacesContext.getCurrentInstance();
context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Error de acceso"));
return "";
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
}