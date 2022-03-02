package org.generation.mentoritosdb.controller;

import java.util.List;

import org.generation.mentoritosdb.model.User;
import org.generation.mentoritosdb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/users/")
@CrossOrigin("*")
public class UserController {

	
	public final UserService userService;
	
	@Autowired
	public UserController(UserService prodService) {
		this.userService=prodService;
	}
	
	@GetMapping
	public List<User> getProductos(){
		return userService.getProductos();
	}// getProductos
	
	@GetMapping(path="{prodId}")
	public User getProducto(@PathVariable("prodId") Long prodId){
		return userService.getProducto(prodId);
	}// getProducto
	
	@DeleteMapping(path="{prodId}")
	public void deleteProducto(@PathVariable("prodId") Long prodId) {
		userService.deleteProducto(prodId);
	}//deleteProducto
	
	@PostMapping
	public void addProducto(@RequestBody User prod) {
		userService.addProducto(prod);
	}//addProducto
	
	@PutMapping(path="{prodId}")
    public void updateProducto(@PathVariable("prodId") Long prodId,
    		@RequestParam(required=false) String email, 
    		@RequestParam(required=false) String uid,
    		
    		@RequestParam(required=false) String url_Imagen) {
		userService.updateProducto (prodId, email, uid,url_Imagen);
	}// updateProducto

	
	
}//ProductoController
