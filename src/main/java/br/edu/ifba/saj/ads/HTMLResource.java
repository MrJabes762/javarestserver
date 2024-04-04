package br.edu.ifba.saj.ads;

import java.util.List;
import java.util.UUID;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/helloHTML")
public class HTMLResource {
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String hello() {
        String html = """
            <html>
              <head>
                <title>My Web Page</title>
              </head>
              <body>
                <h1>Hello, world</h1>
              </body>
            </html>
            """;

        return html;
    }
}
