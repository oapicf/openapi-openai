package org.openapitools.api;

import io.swagger.jaxrs.config.SwaggerContextService;
import io.swagger.models.*;

import io.swagger.models.auth.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public class Bootstrap extends HttpServlet {
  @Override
  public void init(ServletConfig config) throws ServletException {
    Info info = new Info()
      .title("OpenAPI Server")
      .description("The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.")
      .termsOfService("https://openai.com/policies/terms-of-use")
      .contact(new Contact()
        .email("blah+oapicf@cliffano.com"))
      .license(new License()
        .name("MIT")
        .url("https://github.com/openai/openai-openapi/blob/master/LICENSE"));

    ServletContext context = config.getServletContext();
    Swagger swagger = new Swagger().info(info);

    new SwaggerContextService().withServletConfig(config).updateSwagger(swagger);
  }
}
