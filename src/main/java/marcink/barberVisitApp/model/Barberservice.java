package marcink.barberVisitApp.model;

/**
 * Created by Marcin on 2015-02-22.
 */

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Marcin
 */

@Entity
@Table(name = "BARBERSERVICE")
public class Barberservice implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @Column(name = "ID_SERVICE")
    private BigDecimal idService;

    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NAME")
    private String name;

    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "DURATION")
    private String duration;

    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PRICE")
    private String price;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "barberserviceIdService")
    private Collection<Visit> visitCollection;

    public Barberservice() {
    }

    public Barberservice(BigDecimal idService) {
        this.idService = idService;
    }

    public Barberservice(BigDecimal idService, String name, String duration, String price) {
        this.idService = idService;
        this.name = name;
        this.duration = duration;
        this.price = price;
    }

    public BigDecimal getIdService() {
        return idService;
    }

    public void setIdService(BigDecimal idService) {
        this.idService = idService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Collection<Visit> getVisitCollection() {
        return visitCollection;
    }

    public void setVisitCollection(Collection<Visit> visitCollection) {
        this.visitCollection = visitCollection;
    }


    @Override
    public String toString() {
        return "marcink.barberVisitApp.model.Barberservice[ idService=" + idService + " ]";
    }

}
