package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CreateModerationRequestInput;
import org.openapitools.model.CreateModerationRequestModel;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-16T01:12:27.532392463Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateModerationRequest   {
  @JsonProperty("input")
  private CreateModerationRequestInput input;

  @JsonProperty("model")
  private CreateModerationRequestModel model = text-moderation-latest;

  /**
   **/
  public CreateModerationRequest input(CreateModerationRequestInput input) {
    this.input = input;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("input")
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
    return Objects.equals(input, createModerationRequest.input) &&
        Objects.equals(model, createModerationRequest.model);
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

