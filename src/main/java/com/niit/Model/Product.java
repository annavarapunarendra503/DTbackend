package com.niit.Model;
import javax.persistence.*;

@Entity
@Table
public class Product
{
         @Id
         @GeneratedValue
	    int productId;
	     
	    String productName,productDesc;
	    int stock,price,catId,supId;
	    
	    
	    public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		private String image;
	    
	    //MultipartFile pimage;
	    
	    public int getSupId() {
			return supId;
		}
		public void setSupId(int supId) {
			this.supId = supId;
		}
		
	     
	   
		public int getProductId() {
	        return productId;
	    }
	    public void setProductId(int productId) {
	        this.productId = productId;
	    }
	    public String getProductName() {
	        return productName;
	    }
	    public void setProductName(String productName) {
	        this.productName = productName;
	    }
	    public String getProductDesc() {
	        return productDesc;
	    }
	    public void setProductDesc(String productDesc) {
	        this.productDesc = productDesc;
	    }
	    public int getStock() {
	        return stock;
	    }
	    public void setStock(int stock) {
	        this.stock = stock;
	    }
	    public int getPrice() {
	        return price;
	    }
	    public void setPrice(int price) {
	        this.price = price;
	    }
	    public int getCatId() {
	        return catId;
	    }
	    public void setCatId(int catId) {
	        this.catId = catId;
	    }
	  
	     
	     
	
}
