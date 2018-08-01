/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
*
* @author Ivan
*/
@Entity
@Table(name = "login")
@XmlRootElement
@NamedQueries({
@NamedQuery(name="Login.control", query="SELECT l FROM Login l WHERE l.loGin=:username AND l.pasSword=:password AND l.estado='1'"),
@NamedQuery(name = "Login.findAll", query = "SELECT l FROM Login l"),
@NamedQuery(name = "Login.findById", query = "SELECT l FROM Login l WHERE l.id = :id"),
@NamedQuery(name = "Login.findByLoGin", query = "SELECT l FROM Login l WHERE l.loGin = :loGin"),
@NamedQuery(name = "Login.findByPasSword", query = "SELECT l FROM Login l WHERE l.pasSword = :pasSword"),
@NamedQuery(name = "Login.findByEstado", query = "SELECT l FROM Login l WHERE l.estado = :estado")})
public class Login implements Serializable {
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Basic(optional = false)
@Column(name = "id")
private Integer id;
@Size(max = 255)
@Column(name = "loGin")
private String loGin;
@Size(max = 40)
@Column(name = "pasSword")
private String pasSword;
@Column(name = "estado")
private Boolean estado;

public Login() {
}

public Login(Integer id) {
this.id = id;
}

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getLoGin() {
return loGin;
}

public void setLoGin(String loGin) {
this.loGin = loGin;
}

public String getPasSword() {
return pasSword;
}

public void setPasSword(String pasSword) {
this.pasSword = pasSword;
}

public Boolean getEstado() {
return estado;
}

public void setEstado(Boolean estado) {
this.estado = estado;
}

@Override
public int hashCode() {
int hash = 0;
hash += (id != null ? id.hashCode() : 0);
return hash;
}

@Override
public boolean equals(Object object) {
// TODO: Warning - this method won't work in the case the id fields are not set
if (!(object instanceof Login)) {
return false;
}
Login other = (Login) object;
//if ((this.id == null &amp;&amp; other.id != null) || (this.id != null &amp;&amp; !this.id.equals(other.id))) 
{
return false;
}
//return true;
}

@Override
public String toString() {
return "com.entity.Login[ id=" + id + " ]";
}

}