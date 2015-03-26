package marcink.barberVisitApp.model;

/**
 * Created by Marcin on 2015-02-22.
 */
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Marcin
 */

@Entity
@Table(name = "CLIENT")
public class Client implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @Column(name = "ID_CLIENT")
    private BigDecimal idClient;

    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NAME")
    private String name;

    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "SURNAME")
    private String surname;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "EMAIL")
    private String email;

    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "PASSWORD")
    private String password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clientIdClient")
    private Collection<Visit> visitCollection;

    public Client() {
    }

    public Client(BigDecimal idClient) {
        this.idClient = idClient;
    }

    public Client(BigDecimal idClient, String name, String surname, String email, String password) {
        this.idClient = idClient;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    public BigDecimal getIdClient() {
        return idClient;
    }

    public void setIdClient(BigDecimal idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Visit> getVisitCollection() {
        return visitCollection;
    }

    public void setVisitCollection(Collection<Visit> visitCollection) {
        this.visitCollection = visitCollection;
    }


    @Override
    public String toString() {
        return "marcink.barberVisitApp.model.Client[ idClient=" + idClient + " ]";
    }

}
