package com.widetech.training.controller;
import com.widetech.training.service.ProductService;
import com.widetech.training.service.ProductServiceImpl;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.widetech.training.domain.Product;
import com.widetech.training.repositories.RepositoryProduct;
import com.widetech.training.service.ProductService;



@RestController
public class ProductController {
private ProductServiceImpl ps;

public ProductController(ProductServiceImpl ps) {
	this.ps= ps;
}
	@Autowired
	public RepositoryProduct repo;
   
	@CrossOrigin
	@GetMapping("/products")
	public List<Product> getProducts(){
		return ps.getAllProduct();
	}
	
    @CrossOrigin
	@PostMapping("/products")
	public ResponseEntity<String> postProduct(@RequestBody Product prd ) {
		repo.save(prd);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	
 	//Controller untuk melakukan view table data
    
	 @GetMapping("/viewProducts")
		public  ModelAndView viewProducts(Model model) {
		model.addAttribute("products",ps.getAllProduct());
		return new ModelAndView("ListProduct");}
	  
		//Controller untuk melakukan add data
	    
	@GetMapping("/addProducts")
		public ModelAndView ShowaddProductsPage(Model model) {
		model.addAttribute("command", new Product());
		return new ModelAndView("NewProduct");
	}
	
    @RequestMapping(value = "/addProducts", method = RequestMethod.POST)
    	public ModelAndView createProduct(@ModelAttribute("product") Product product) {
        ps.saveContact(product);
        return new ModelAndView("added");
    }
	
    
    // //Controller untuk melakukan Update data

    @RequestMapping(value = "/updateProduct/{id}")
    	public ModelAndView showUpdateContactPage(@PathVariable int id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("command", ps.findByid(id).orElse(null));
        return new ModelAndView("UpdateProductPage");
    }
    
    @RequestMapping(value = "/updateProduct/{id}", method = RequestMethod.POST)
    	public ModelAndView updateProduct(@PathVariable int id, @ModelAttribute("product") Product product) {
        ps.updateProduct(id, product);
        return new ModelAndView("Updated");
    }
     
	  //Controller untuk melakukan delete data
	  
	  @RequestMapping(value="/deleteProducts/{id}")
	  	public ModelAndView deleteProduct(@PathVariable int id) {
		ps.deleteById(id);
		return new ModelAndView("DeleteProductPage");
	  }
}

	
	

	
	


