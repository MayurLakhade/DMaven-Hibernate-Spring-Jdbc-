package oneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
//@Table(name = "Childs_details")
public class Childs {
    @Id
    private int cId;

    @Column(name = "cName")
    private String cName;
    
    @ManyToOne
    private Parent parent;

    public Childs()
    {

    }
    
    public Childs(String cName, Parent parent) {
        this.cName = cName;
        this.parent = parent;
    }

    
    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }


    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Childs [cName=" + cName + ", parent=" + parent + "]";
    }

    
}
