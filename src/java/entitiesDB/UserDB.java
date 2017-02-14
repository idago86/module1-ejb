/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitiesDB;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Israel Dago
 */
@Entity
@Table(name = "useri")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserDB.findAll", query = "SELECT u FROM UserDB u")
    , @NamedQuery(name = "UserDB.findById", query = "SELECT u FROM UserDB u WHERE u.id = :id")
    , @NamedQuery(name = "UserDB.findByUsername", query = "SELECT u FROM UserDB u WHERE u.username = :username")
    , @NamedQuery(name = "UserDB.findByParola", query = "SELECT u FROM UserDB u WHERE u.parola = :parola")
    , @NamedQuery(name = "UserDB.findByAdmin", query = "SELECT u FROM UserDB u WHERE u.admin = :admin")})
public class UserDB implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "parola")
    private String parola;
    @Basic(optional = false)
    @NotNull
    @Column(name = "admin")
    private boolean admin;

    public UserDB() {
    }

    public UserDB(Integer id) {
        this.id = id;
    }

    public UserDB(String username, String parola, boolean admin) {
        this.username = username;
        this.parola = parola;
        this.admin = admin;
    }

    
    
    
    public UserDB(Integer id, String username, String parola, boolean admin) {
        this.id = id;
        this.username = username;
        this.parola = parola;
        this.admin = admin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public boolean getAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
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
        if (!(object instanceof UserDB)) {
            return false;
        }
        UserDB other = (UserDB) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiesDB.UserDB[ id=" + id + " ]";
    }
    
}
