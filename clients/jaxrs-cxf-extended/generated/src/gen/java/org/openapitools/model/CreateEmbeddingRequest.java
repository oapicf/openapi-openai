package org.openapitools.model;

import org.openapitools.model.CreateEmbeddingRequestInput;
import org.openapitools.model.CreateEmbeddingRequestModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateEmbeddingRequest  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CreateEmbeddingRequestModel model;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CreateEmbeddingRequestInput input;

 /**
  * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
  */
  @ApiModelProperty(example = "user-1234", value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")
  private String user;
 /**
  * Get model
  * @return model
  */
  @JsonProperty("model")
  @NotNull
  public CreateEmbeddingRequestModel getModel() {
    return model;
  }

  /**
   * Sets the <code>model</code> property.
   */
 public void setModel(CreateEmbeddingRequestModel model) {
    this.model = model;
  }

  /**
   * Sets the <code>model</code> property.
   */
  public CreateEmbeddingRequest model(CreateEmbeddingRequestModel model) {
    this.model = model;
    return this;
  }

 /**
  * Get input
  * @return input
  */
  @JsonProperty("input")
  @NotNull
  public CreateEmbeddingRequestInput getInput() {
    return input;
  }

  /**
   * Sets the <code>input</code> property.
   */
 public void setInput(CreateEmbeddingRequestInput input) {
    this.input = input;
  }

  /**
   * Sets the <code>input</code> property.
   */
  public CreateEmbeddingRequest input(CreateEmbeddingRequestInput input) {
    this.input = input;
    return this;
  }

 /**
  * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
  * @return user
  */
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  /**
   * Sets the <code>user</code> property.
   */
 public void setUser(String user) {
    this.user = user;
  }

  /**
   * Sets the <code>user</code> property.
   */
  public CreateEmbeddingRequest user(String user) {
    this.user = user;
    return this;
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
    return Objects.equals(this.model, createEmbeddingRequest.model) &&
        Objects.equals(this.input, createEmbeddingRequest.input) &&
        Objects.equals(this.user, createEmbeddingRequest.user);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

