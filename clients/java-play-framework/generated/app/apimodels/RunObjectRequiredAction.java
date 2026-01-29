package apimodels;

import apimodels.RunObjectRequiredActionSubmitToolOutputs;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Details on the action required to continue the run. Will be &#x60;null&#x60; if no action is required.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T10:45:05.350526304Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RunObjectRequiredAction   {
  /**
   * For now, this is always `submit_tool_outputs`.
   */
  public enum TypeEnum {
    SUBMIT_TOOL_OUTPUTS("submit_tool_outputs");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  @NotNull

  private TypeEnum type;

  @JsonProperty("submit_tool_outputs")
  @NotNull
@Valid

  private RunObjectRequiredActionSubmitToolOutputs submitToolOutputs;

  public RunObjectRequiredAction type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * For now, this is always `submit_tool_outputs`.
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RunObjectRequiredAction submitToolOutputs(RunObjectRequiredActionSubmitToolOutputs submitToolOutputs) {
    this.submitToolOutputs = submitToolOutputs;
    return this;
  }

   /**
   * Get submitToolOutputs
   * @return submitToolOutputs
  **/
  public RunObjectRequiredActionSubmitToolOutputs getSubmitToolOutputs() {
    return submitToolOutputs;
  }

  public void setSubmitToolOutputs(RunObjectRequiredActionSubmitToolOutputs submitToolOutputs) {
    this.submitToolOutputs = submitToolOutputs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunObjectRequiredAction runObjectRequiredAction = (RunObjectRequiredAction) o;
    return Objects.equals(type, runObjectRequiredAction.type) &&
        Objects.equals(submitToolOutputs, runObjectRequiredAction.submitToolOutputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, submitToolOutputs);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunObjectRequiredAction {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    submitToolOutputs: ").append(toIndentedString(submitToolOutputs)).append("\n");
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

