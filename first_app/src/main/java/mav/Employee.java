/*
 * Session:-
 * A session is an object that maintains the connection between java object application and database.
 * 
 * 
 */

package mav;

//pojo or Entity class
// Bean
/*
 * Annotations to give information that it will be mapped.
 */


public class Employee {
    
    private int id;
    private String name;
    private String desig;
    private int sal;

    public Employee ()
    {

    }

     public Employee(int id, String name, String desig, int sal) 
     {
        this.id = id;
        this.name = name;
        this.desig = desig;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
    
    
    
}
