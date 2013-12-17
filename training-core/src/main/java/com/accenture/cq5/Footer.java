package com.accenture.cq5;

import java.util.Iterator;

import com.day.cq.wcm.api.Page;

public class Footer {
	public Footer(Page currentPage){
		   Page parent = currentPage.getParent();
	        
	        if (parent != null) {
	        
	            // Create an Iterator. listChildren() method returns an Iterator<Page>
	            Iterator<Page> children = parent.listChildren();
	            
	            // While the iterator list has a next child
	            while (children.hasNext()){
	                
	                // Get the child page. The next() method returns the next object in the collection.
	                Page child = children.next();
	                
	                // Check that we are not including the current page. Using the equals() method inherited from the java Object class 
	                if (currentPage.equals(child)) { continue; }
	            }
	        }
	
	}

}
