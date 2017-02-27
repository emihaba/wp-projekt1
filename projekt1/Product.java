
package projekt1;

import java.util.Date;


public class Product {
    int idProduct;
    double price;
    Date createdAt;
    Date updatedAt;
   
      public double getPrice()
    {
        return price;
    }
      
      public int getIdProduct()
    {
        return idProduct;
    }
      
      public Product setIdProduct(int idProduct) throws Exception
    {
        if(idProduct < 0)
        {
            throw new Exception ("Id cannot be negative!");
        }
        else{
            this.idProduct = idProduct;
        }
        return this;
    }
        
    public Product setPrice(double price) throws Exception
    {
        if(price < 0)
        {
            throw new Exception ("Price cannot be negative!");
        }
        else{
            this.price = price;
        }
        return this;
    }
    
}
