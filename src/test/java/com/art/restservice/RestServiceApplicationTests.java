package com.art.restservice;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class RestServiceApplicationTests {


	@Autowired
	private GalleryController controller;

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

	/**
	 * Tests for "/piece" path.
	 */
	@Test
	public void pieceShouldReturnDefaultMessage() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/piece",
				String.class)).contains("Self Portrait 2020");
	}

	@Test
	public void pieceShouldReturnNotFoundErrorIfNotFound() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/piece" +"/?name=fake",
				String.class)).contains("Not Found");
	}


	@Test
	public void pieceShouldReturnPieceIfFound() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/piece" +"/?name=womanhood",
				String.class)).contains("Womanhood");
	}


	/**
	 * Tests for "/all" path.
	 */
	@Test
	public void allShouldReturnDefaultMessage() throws Exception {
		for (ArtPiece piece: Gallery.pieces) {
			assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/all",
					String.class)).contains(piece.getName());
		}

	}



}
