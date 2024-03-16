package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.CreateModerationRequestInput;
import org.openapitools.vertxweb.server.model.CreateModerationRequestModel;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateModerationRequest   {
  
  private CreateModerationRequestInput input;
  private CreateModerationRequestModel model = text-moderation-latest;

  public CreateModerationRequest () {

  }

  public CreateModerationRequest (CreateModerationRequestInput input, CreateModerationRequestModel model) {
    this.input = input;
    this.model = model;
  }

    
  @JsonProperty("input")
  public CreateModerationRequestInput getInput() {
    return input;
  }
  public void setInput(CreateModerationRequestInput input) {
    this.input = input;
  }

    
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
