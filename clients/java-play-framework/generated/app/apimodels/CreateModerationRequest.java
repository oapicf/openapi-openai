package apimodels;

import apimodels.CreateModerationRequestInput;
import apimodels.CreateModerationRequestModel;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateModerationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateModerationRequest   {
  @JsonProperty("input")
  @NotNull
@Valid

  private CreateModerationRequestInput input;

  @JsonProperty("model")
  @Valid

  private CreateModerationRequestModel model = omni-moderation-latest;

  public CreateModerationRequest input(CreateModerationRequestInput input) {
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

