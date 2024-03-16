package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.CreateEmbeddingRequestInput;
import org.openapitools.vertxweb.server.model.CreateEmbeddingRequestModel;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateEmbeddingRequest   {
  
  private CreateEmbeddingRequestModel model;
  private CreateEmbeddingRequestInput input;
  private String user;

  public CreateEmbeddingRequest () {

  }

  public CreateEmbeddingRequest (CreateEmbeddingRequestModel model, CreateEmbeddingRequestInput input, String user) {
    this.model = model;
    this.input = input;
    this.user = user;
  }

    
  @JsonProperty("model")
  public CreateEmbeddingRequestModel getModel() {
    return model;
  }
  public void setModel(CreateEmbeddingRequestModel model) {
    this.model = model;
  }

    
  @JsonProperty("input")
  public CreateEmbeddingRequestInput getInput() {
    return input;
  }
  public void setInput(CreateEmbeddingRequestInput input) {
    this.input = input;
  }

    
  @JsonProperty("user")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEmbeddingRequest createEmbeddingRequest = (CreateEmbeddingRequest) o;
    return Objects.equals(model, createEmbeddingRequest.model) &&
        Objects.equals(input, createEmbeddingRequest.input) &&
        Objects.equals(user, createEmbeddingRequest.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, input, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEmbeddingRequest {\n");
    
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
