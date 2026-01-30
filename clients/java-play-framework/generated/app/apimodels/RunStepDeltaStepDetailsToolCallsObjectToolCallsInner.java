package apimodels;

import apimodels.RunStepDeltaStepDetailsToolCallsCodeObject;
import apimodels.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter;
import apimodels.RunStepDeltaStepDetailsToolCallsFileSearchObject;
import apimodels.RunStepDeltaStepDetailsToolCallsFunctionObject;
import apimodels.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RunStepDeltaStepDetailsToolCallsObjectToolCallsInner   {
  @JsonProperty("index")
  @NotNull

  private Integer index;

  @JsonProperty("id")
  
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
  @Valid

  private RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter;

  @JsonProperty("file_search")
  @NotNull

  private Object fileSearch;

  @JsonProperty("function")
  @Valid

  private RunStepDeltaStepDetailsToolCallsFunctionObjectFunction function;

  public RunStepDeltaStepDetailsToolCallsObjectToolCallsInner index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The index of the tool call in the tool calls array.
   * @return index
  **/
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public RunStepDeltaStepDetailsToolCallsObjectToolCallsInner id(String id) {
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

  public RunStepDeltaStepDetailsToolCallsObjectToolCallsInner type(TypeEnum type) {
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

  public RunStepDeltaStepDetailsToolCallsObjectToolCallsInner codeInterpreter(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
    return this;
  }

   /**
   * Get codeInterpreter
   * @return codeInterpreter
  **/
  public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter getCodeInterpreter() {
    return codeInterpreter;
  }

  public void setCodeInterpreter(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
  }

  public RunStepDeltaStepDetailsToolCallsObjectToolCallsInner fileSearch(Object fileSearch) {
    this.fileSearch = fileSearch;
    return this;
  }

   /**
   * For now, this is always going to be an empty object.
   * @return fileSearch
  **/
  public Object getFileSearch() {
    return fileSearch;
  }

  public void setFileSearch(Object fileSearch) {
    this.fileSearch = fileSearch;
  }

  public RunStepDeltaStepDetailsToolCallsObjectToolCallsInner function(RunStepDeltaStepDetailsToolCallsFunctionObjectFunction function) {
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  public RunStepDeltaStepDetailsToolCallsFunctionObjectFunction getFunction() {
    return function;
  }

  public void setFunction(RunStepDeltaStepDetailsToolCallsFunctionObjectFunction function) {
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
    RunStepDeltaStepDetailsToolCallsObjectToolCallsInner runStepDeltaStepDetailsToolCallsObjectToolCallsInner = (RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) o;
    return Objects.equals(index, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.index) &&
        Objects.equals(id, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.id) &&
        Objects.equals(type, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.type) &&
        Objects.equals(codeInterpreter, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.codeInterpreter) &&
        Objects.equals(fileSearch, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.fileSearch) &&
        Objects.equals(function, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, id, type, codeInterpreter, fileSearch, function);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsToolCallsObjectToolCallsInner {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

