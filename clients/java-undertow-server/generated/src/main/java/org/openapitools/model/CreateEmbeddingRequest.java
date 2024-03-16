/*
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
 *
 * OpenAPI document version: 2.0.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CreateEmbeddingRequestInput;
import org.openapitools.model.CreateEmbeddingRequestModel;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-16T01:12:58.923191288Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateEmbeddingRequest   {
  
  private CreateEmbeddingRequestModel model;
  private CreateEmbeddingRequestInput input;
  private String user;

  /**
   */
  public CreateEmbeddingRequest model(CreateEmbeddingRequestModel model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("model")
  public CreateEmbeddingRequestModel getModel() {
    return model;
  }
  public void setModel(CreateEmbeddingRequestModel model) {
    this.model = model;
  }

  /**
   */
  public CreateEmbeddingRequest input(CreateEmbeddingRequestInput input) {
    this.input = input;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("input")
  public CreateEmbeddingRequestInput getInput() {
    return input;
  }
  public void setInput(CreateEmbeddingRequestInput input) {
    this.input = input;
  }

  /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
   */
  public CreateEmbeddingRequest user(String user) {
    this.user = user;
    return this;
  }

  
  @ApiModelProperty(example = "user-1234", value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")
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

