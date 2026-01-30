package apimodels;

import apimodels.RunStepDetailsToolCallsObjectToolCallsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Details of the tool call.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RunStepDetailsToolCallsObject   {
  /**
   * Always `tool_calls`.
   */
  public enum TypeEnum {
    TOOL_CALLS("tool_calls");

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

  @JsonProperty("tool_calls")
  @NotNull
@Valid

  private List<RunStepDetailsToolCallsObjectToolCallsInner> toolCalls = new ArrayList<>();

  public RunStepDetailsToolCallsObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Always `tool_calls`.
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RunStepDetailsToolCallsObject toolCalls(List<RunStepDetailsToolCallsObjectToolCallsInner> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  public RunStepDetailsToolCallsObject addToolCallsItem(RunStepDetailsToolCallsObjectToolCallsInner toolCallsItem) {
    if (this.toolCalls == null) {
      this.toolCalls = new ArrayList<>();
    }
    this.toolCalls.add(toolCallsItem);
    return this;
  }

   /**
   * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
   * @return toolCalls
  **/
  public List<RunStepDetailsToolCallsObjectToolCallsInner> getToolCalls() {
    return toolCalls;
  }

  public void setToolCalls(List<RunStepDetailsToolCallsObjectToolCallsInner> toolCalls) {
    this.toolCalls = toolCalls;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDetailsToolCallsObject runStepDetailsToolCallsObject = (RunStepDetailsToolCallsObject) o;
    return Objects.equals(type, runStepDetailsToolCallsObject.type) &&
        Objects.equals(toolCalls, runStepDetailsToolCallsObject.toolCalls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, toolCalls);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsObject {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
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

