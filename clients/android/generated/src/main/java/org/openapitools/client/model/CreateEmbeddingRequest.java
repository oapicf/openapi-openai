/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CreateEmbeddingRequestInput;
import org.openapitools.client.model.CreateEmbeddingRequestModel;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateEmbeddingRequest {
  
  @SerializedName("model")
  private CreateEmbeddingRequestModel model = null;
  @SerializedName("input")
  private CreateEmbeddingRequestInput input = null;
  @SerializedName("user")
  private String user = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CreateEmbeddingRequestModel getModel() {
    return model;
  }
  public void setModel(CreateEmbeddingRequestModel model) {
    this.model = model;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CreateEmbeddingRequestInput getInput() {
    return input;
  }
  public void setInput(CreateEmbeddingRequestInput input) {
    this.input = input;
  }

  /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
   **/
  @ApiModelProperty(value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")
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
    return (this.model == null ? createEmbeddingRequest.model == null : this.model.equals(createEmbeddingRequest.model)) &&
        (this.input == null ? createEmbeddingRequest.input == null : this.input.equals(createEmbeddingRequest.input)) &&
        (this.user == null ? createEmbeddingRequest.user == null : this.user.equals(createEmbeddingRequest.user));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.model == null ? 0: this.model.hashCode());
    result = 31 * result + (this.input == null ? 0: this.input.hashCode());
    result = 31 * result + (this.user == null ? 0: this.user.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEmbeddingRequest {\n");
    
    sb.append("  model: ").append(model).append("\n");
    sb.append("  input: ").append(input).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
