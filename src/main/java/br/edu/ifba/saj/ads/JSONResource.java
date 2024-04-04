package br.edu.ifba.saj.ads;

import java.util.List;
import java.util.UUID;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/helloJSON")
public class JSONResource {

    public record DTO(UUID id, String nome) {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<DTO> hello() {

        return List.of(
                new DTO(UUID.randomUUID(), "Leandro"),
                new DTO(UUID.randomUUID(), "Leandro2"));
    }
}
