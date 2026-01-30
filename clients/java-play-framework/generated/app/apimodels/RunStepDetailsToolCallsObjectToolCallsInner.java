package apimodels;

import apimodels.RunStepDetailsToolCallsCodeObject;
import apimodels.RunStepDetailsToolCallsCodeObjectCodeInterpreter;
import apimodels.RunStepDetailsToolCallsFileSearchObject;
import apimodels.RunStepDetailsToolCallsFileSearchObjectFileSearch;
import apimodels.RunStepDetailsToolCallsFunctionObject;
import apimodels.RunStepDetailsToolCallsFunctionObjectFunction;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RunStepDetailsToolCallsObjectToolCallsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RunStepDetailsToolCallsObjectToolCallsInner   {
  @JsonProperty("id")
  @NotNull

  private String id;

  /**
   * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
   */
  public enum TypeEnum {
    CODE_INTERPRETER("code_interpreter"),
    
    FILE_SEARCH("file_search"),
    
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

  @JsonProperty("code_interpreter")
  @NotNull
@Valid

  private RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter;

  @JsonProperty("file_search")
  @NotNull
@Valid

  private RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch;

  @JsonProperty("function")
  @NotNull
@Valid

  private RunStepDetailsToolCallsFunctionObjectFunction function;

  public RunStepDetailsToolCallsObjectToolCallsInner id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the tool call object.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RunStepDetailsToolCallsObjectToolCallsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RunStepDetailsToolCallsObjectToolCallsInner codeInterpreter(RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
    return this;
  }

   /**
   * Get codeInterpreter
   * @return codeInterpreter
  **/
  public RunStepDetailsToolCallsCodeObjectCodeInterpreter getCodeInterpreter() {
    return codeInterpreter;
  }

  public void setCodeInterpreter(RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
  }

  public RunStepDetailsToolCallsObjectToolCallsInner fileSearch(RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch) {
    this.fileSearch = fileSearch;
    return this;
  }

   /**
   * Get fileSearch
   * @return fileSearch
  **/
  public RunStepDetailsToolCallsFileSearchObjectFileSearch getFileSearch() {
    return fileSearch;
  }

  public void setFileSearch(RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch) {
    this.fileSearch = fileSearch;
  }

  public RunStepDetailsToolCallsObjectToolCallsInner function(RunStepDetailsToolCallsFunctionObjectFunction function) {
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  public RunStepDetailsToolCallsFunctionObjectFunction getFunction() {
    return function;
  }

  public void setFunction(RunStepDetailsToolCallsFunctionObjectFunction function) {
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
    RunStepDetailsToolCallsObjectToolCallsInner runStepDetailsToolCallsObjectToolCallsInner = (RunStepDetailsToolCallsObjectToolCallsInner) o;
    return Objects.equals(id, runStepDetailsToolCallsObjectToolCallsInner.id) &&
        Objects.equals(type, runStepDetailsToolCallsObjectToolCallsInner.type) &&
        Objects.equals(codeInterpreter, runStepDetailsToolCallsObjectToolCallsInner.codeInterpreter) &&
        Objects.equals(fileSearch, runStepDetailsToolCallsObjectToolCallsInner.fileSearch) &&
        Objects.equals(function, runStepDetailsToolCallsObjectToolCallsInner.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, codeInterpreter, fileSearch, function);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsObjectToolCallsInner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    codeInterpreter: ").append(toIndentedString(codeInterpreter)).append("\n");
    sb.append("    fileSearch: ").append(toIndentedString(fileSearch)).append("\n");
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

