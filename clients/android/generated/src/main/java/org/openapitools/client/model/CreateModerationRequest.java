/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CreateModerationRequestInput;
import org.openapitools.client.model.CreateModerationRequestModel;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateModerationRequest {
  
  @SerializedName("input")
  private CreateModerationRequestInput input = null;
  @SerializedName("model")
  private CreateModerationRequestModel model = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CreateModerationRequestInput getInput() {
    return input;
  }
  public void setInput(CreateModerationRequestInput input) {
    this.input = input;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CreateModerationRequestModel getModel() {
    return model;
  }
  public void setModel(CreateModerationRequestModel model) {
    this.model = model;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateModerationRequest createModerationRequest = (CreateModerationRequest) o;
    return (this.input == null ? createModerationRequest.input == null : this.input.equals(createModerationRequest.input)) &&
        (this.model == null ? createModerationRequest.model == null : this.model.equals(createModerationRequest.model));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.input == null ? 0: this.input.hashCode());
    result = 31 * result + (this.model == null ? 0: this.model.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationRequest {\n");
    
    sb.append("  input: ").append(input).append("\n");
    sb.append("  model: ").append(model).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
