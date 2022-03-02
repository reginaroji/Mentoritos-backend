package org.generation.mentoritosdb.service;

import java.util.List;
import java.util.Optional;

import org.generation.mentoritosdb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private final UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository productosRepository) {
		this.userRepository = productosRepository;
	}
	
	public List<User> getProductos() {
		return userRepository.findAll();
	}
	
	public User getProducto(Long prodId) {
		return userRepository.findById(prodId).
				orElseThrow(()-> new IllegalStateException("El producto"
						+ "con el ID" + prodId + "no existe."));
	}
	
	public void deleteProducto(Long prodId) {
		if(userRepository.existsById(prodId)) {
			userRepository.deleteById(prodId);
		}
	}

	public void addProducto(User prod) {
		Optional<User> prodByName =
				userRepository.findByNombre(prod.getEmail());	
		if (prodByName.isPresent()) {
			throw new IllegalStateException("El nombre [" + prod.getEmail()
			+"ya existe");
		} else {
			userRepository.save(prod);
		}
	}

	public void updateProducto(Long prodId, String email, String uid, String url_Imagen) {
		if (userRepository.existsById(prodId)) { 
			User p = userRepository.getById(prodId);
			if (email != null) p.setEmail(email); 
			if (uid != null) p.setUid(uid);			
			if (url_Imagen !=null) p.setURL_Imagen(url_Imagen);
		}else {
			System.out.println("No existe el id "+prodId);
			System.err.println("*No existe el id "+prodId);
		}// if 		
		
	} // updateProducto

}
