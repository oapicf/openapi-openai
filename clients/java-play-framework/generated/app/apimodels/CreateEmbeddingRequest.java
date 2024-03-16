package apimodels;

import apimodels.CreateEmbeddingRequestInput;
import apimodels.CreateEmbeddingRequestModel;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateEmbeddingRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-16T01:12:54.315235707Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateEmbeddingRequest   {
  @JsonProperty("model")
  @NotNull
@Valid

  private CreateEmbeddingRequestModel model;

  @JsonProperty("input")
  @NotNull
@Valid

  private CreateEmbeddingRequestInput input;

  @JsonProperty("user")
  
  private String user;

  public CreateEmbeddingRequest model(CreateEmbeddingRequestModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public CreateEmbeddingRequestModel getModel() {
    return model;
  }

  public void setModel(CreateEmbeddingRequestModel model) {
    this.model = model;
  }

  public CreateEmbeddingRequest input(CreateEmbeddingRequestInput input) {
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  public CreateEmbeddingRequestInput getInput() {
    return input;
  }

  public void setInput(CreateEmbeddingRequestInput input) {
    this.input = input;
  }

  public CreateEmbeddingRequest user(String user) {
    this.user = user;
    return this;
  }

   /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
   * @return user
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

