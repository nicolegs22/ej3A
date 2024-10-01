package com.example.clientservice;

import com.example.clientservice.model.User;
import com.example.clientservice.service.ClientService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClientServiceApplicationTests {

	@Test
	public void testCreateUser() {
		ClientService clientService = new ClientService();
		User user = new User();
		user.setNombre("Juan");
		user.setApellidoPaterno("Perez");
		user.setApellidoMaterno("Lopez");
		user.setDocumentoIdentidad("12345678");

		assertDoesNotThrow(() -> clientService.saveUser(user));
	}
}
