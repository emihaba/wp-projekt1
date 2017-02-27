
package projekt1;
        
import java.util.Date;

public class Person {
    int idPerson;
    String name;
    int age;
    Date createdAt;
    Date updatedAt;
    int modifiedById;
    int updatedById;
    Product product;
    int productId;
    
    public String getName()
    {
        return name;
    }
    
     public int getAge()
    {
        return age;
    }
     
     public int getIdPerson()
    {
        return idPerson;
    }
     
     public int getProductId(){
         return productId;
     }
     
     public Product getProduct(){
         return product;
     }
    
    public Person setName(String name) throws Exception
    {
        if(name.length() > 100)
        {
            throw new Exception ("Name is too long!");
        }
        else{
            this.name = name;
        }
        return this;
    }
    
        
    public Person setAge(int age) throws Exception
    {
        if(age < 0)
        {
            throw new Exception ("Age cannot be negative!");
        }
        else{
            this.age = age;
        }
        return this;
    }
    
    public Person setIdPerson(int idPerson) throws Exception
    {
        if(idPerson < 0)
        {
            throw new Exception ("Id cannot be negative!");
        }
        else{
            this.idPerson = idPerson;
        }
        return this;
    }
    
}
