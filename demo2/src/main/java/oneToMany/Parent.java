package oneToMany;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
//@Table(name = "Parent_details")
public class Parent {
    @Id
    
    private int id;
    
    private String pName;
    
    @OneToMany
    private Set<Childs> child;

    public Parent()
    {
        
    }
    public Parent(int id, String pName, Set<Childs> child) {
        this.id = id;
        this.pName = pName;
        this.child = child;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getpName() {
        return pName;
    }
    public void setpName(String pName) {
        this.pName = pName;
    }
    public Set<Childs> getChild() {
        return child;
    }
    public void setChild(Set<Childs> childSet) {
        this.child = childSet;
    }

       @Override
    public String toString() {
        return "Parent [id=" + id + ", pName=" + pName + ", child=" + child + "]";
    }
    
}
