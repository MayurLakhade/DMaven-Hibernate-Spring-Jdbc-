package comTune;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Wife_details")
public class Wife {
   
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "wife_id")
    private int wId;
    @Column(name = "wife_name")
    private String wName;
    @OneToOne // relation mapping
    private Husband husband; // association


    
    public Wife() {
    }



    public Wife(int wId, String wName, Husband husband) {
        this.wId = wId;
        this.wName = wName;
        this.husband = husband;
    }

    public int getwId() {
        return wId;
    }

    public void setwId(int wId) {
        this.wId = wId;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }
    
    @Override
    public String toString() {
        return "Wife [wId=" + wId + ", wName=" + wName + ", husband=" + husband + "]";
    }

    
    
}
