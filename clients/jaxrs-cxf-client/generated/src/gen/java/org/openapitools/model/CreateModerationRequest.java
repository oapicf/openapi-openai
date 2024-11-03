package org.openapitools.model;

import org.openapitools.model.CreateModerationRequestInput;
import org.openapitools.model.CreateModerationRequestModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateModerationRequest  {
  
  @ApiModelProperty(required = true, value = "")
  private CreateModerationRequestInput input;

  @ApiModelProperty(value = "")
  private CreateModerationRequestModel model = text-moderation-latest;
 /**
   * Get input
   * @return input
  **/
  @JsonProperty("input")
  public CreateModerationRequestInput getInput() {
    return input;
  }

  public void setInput(CreateModerationRequestInput input) {
    this.input = input;
  }

  public CreateModerationRequest input(CreateModerationRequestInput input) {
    this.input = input;
    return this;
  }

 /**
   * Get model
   * @return model
  **/
  @JsonProperty("model")
  public CreateModerationRequestModel getModel() {
    return model;
  }

  public void setModel(CreateModerationRequestModel model) {
    this.model = model;
  }

  public CreateModerationRequest model(CreateModerationRequestModel model) {
    this.model = model;
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
    CreateModerationRequest createModerationRequest = (CreateModerationRequest) o;
    return Objects.equals(this.input, createModerationRequest.input) &&
        Objects.equals(this.model, createModerationRequest.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, model);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationRequest {\n");
    
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
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

