package org.openapitools.model;

import org.openapitools.model.CreateModerationRequestInput;
import org.openapitools.model.CreateModerationRequestModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateModerationRequest  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CreateModerationRequestInput input;

  @ApiModelProperty(value = "")
  @Valid
  private CreateModerationRequestModel model = omni-moderation-latest;
 /**
  * Get input
  * @return input
  */
  @JsonProperty("input")
  @NotNull
  public CreateModerationRequestInput getInput() {
    return input;
  }

  /**
   * Sets the <code>input</code> property.
   */
 public void setInput(CreateModerationRequestInput input) {
    this.input = input;
  }

  /**
   * Sets the <code>input</code> property.
   */
  public CreateModerationRequest input(CreateModerationRequestInput input) {
    this.input = input;
    return this;
  }

 /**
  * Get model
  * @return model
  */
  @JsonProperty("model")
  public CreateModerationRequestModel getModel() {
    return model;
  }

  /**
   * Sets the <code>model</code> property.
   */
 public void setModel(CreateModerationRequestModel model) {
    this.model = model;
  }

  /**
   * Sets the <code>model</code> property.
   */
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

