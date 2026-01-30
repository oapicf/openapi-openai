package apimodels;

import apimodels.RunToolCallObjectFunction;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Tool call objects
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RunToolCallObject   {
  @JsonProperty("id")
  @NotNull

  private String id;

  /**
   * The type of tool call the output is required for. For now, this is always `function`.
   */
  public enum TypeEnum {
    FUNCTION("function");

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

  @JsonProperty("function")
  @NotNull
@Valid

  private RunToolCallObjectFunction function;

  public RunToolCallObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RunToolCallObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of tool call the output is required for. For now, this is always `function`.
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RunToolCallObject function(RunToolCallObjectFunction function) {
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  public RunToolCallObjectFunction getFunction() {
    return function;
  }

  public void setFunction(RunToolCallObjectFunction function) {
    this.function = function;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunToolCallObject runToolCallObject = (RunToolCallObject) o;
    return Objects.equals(id, runToolCallObject.id) &&
        Objects.equals(type, runToolCallObject.type) &&
        Objects.equals(function, runToolCallObject.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, function);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunToolCallObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
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

