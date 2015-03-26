package marcink.barberVisitApp.model;

/**
 * Created by Marcin on 2015-02-22.
 */

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Marcin
 */
@Entity
@Table(name = "VISIT")
public class Visit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @Column(name = "ID_VISIT")
    private BigDecimal idVisit;

    @NotNull
    @Column(name = "TERM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date term;
    @JoinColumn(name = "BARBERSERVICE_ID_SERVICE", referencedColumnName = "ID_SERVICE")
    @ManyToOne(optional = false)
    private Barberservice barberserviceIdService;
    @JoinColumn(name = "CLIENT_ID_CLIENT", referencedColumnName = "ID_CLIENT")
    @ManyToOne(optional = false)
    private Client clientIdClient;

    public Visit() {
    }

    public Visit(BigDecimal idVisit) {
        this.idVisit = idVisit;
    }

    public Visit(BigDecimal idVisit, Date term) {
        this.idVisit = idVisit;
        this.term = term;
    }

    public BigDecimal getIdVisit() {
        return idVisit;
    }

    public void setIdVisit(BigDecimal idVisit) {
        this.idVisit = idVisit;
    }

    public Date getTerm() {
        return term;
    }

    public void setTerm(Date term) {
        this.term = term;
    }

    public Barberservice getBarberserviceIdService() {
        return barberserviceIdService;
    }

    public void setBarberserviceIdService(Barberservice barberserviceIdService) {
        this.barberserviceIdService = barberserviceIdService;
    }

    public Client getClientIdClient() {
        return clientIdClient;
    }

    public void setClientIdClient(Client clientIdClient) {
        this.clientIdClient = clientIdClient;
    }


    @Override
    public String toString() {
        return "marcink.barberVisitApp.model.Visit[ idVisit=" + idVisit + " ]";
    }

}
