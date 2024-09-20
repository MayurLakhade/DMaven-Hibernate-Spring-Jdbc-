package comTune;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Husband_details")
public class Husband {
    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "husband_id")
    private int hId;
    @Column(name = "husband_name")
    private String hName;
    @OneToOne
    private Wife wife;

    public Husband()
    {

    } 

    public Husband(int hId, String hName, Wife wife) {
        this.hId = hId;
        this.hName = hName;
        this.wife = wife;
    }

    public int gethId() {
        return hId;
    }

    public void sethId(int hId) {
        this.hId = hId;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "Husband [hId=" + hId + ", hName=" + hName + ", wife=" + wife + "]";
    }

    
    
}
