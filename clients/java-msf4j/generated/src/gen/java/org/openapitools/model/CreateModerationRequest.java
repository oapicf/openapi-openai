package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CreateModerationRequestInput;
import org.openapitools.model.CreateModerationRequestModel;

/**
 * CreateModerationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-03T11:07:10.127704480Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateModerationRequest   {
  @JsonProperty("input")
  private CreateModerationRequestInput input;

  @JsonProperty("model")
  private CreateModerationRequestModel model = text-moderation-latest;

  public CreateModerationRequest input(CreateModerationRequestInput input) {
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @ApiModelProperty(required = true, value = "")
  public CreateModerationRequestInput getInput() {
    return input;
  }

  public void setInput(CreateModerationRequestInput input) {
    this.input = input;
  }

  public CreateModerationRequest model(CreateModerationRequestModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
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

