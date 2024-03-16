package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CreateModerationRequestInput;
import org.openapitools.model.CreateModerationRequestModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class CreateModerationRequest   {
  
  private CreateModerationRequestInput input;

  private CreateModerationRequestModel model = text-moderation-latest;

  /**
   **/
  public CreateModerationRequest input(CreateModerationRequestInput input) {
    this.input = input;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("input")
  @NotNull
  public CreateModerationRequestInput getInput() {
    return input;
  }
  public void setInput(CreateModerationRequestInput input) {
    this.input = input;
  }


  /**
   **/
  public CreateModerationRequest model(CreateModerationRequestModel model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("model")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

