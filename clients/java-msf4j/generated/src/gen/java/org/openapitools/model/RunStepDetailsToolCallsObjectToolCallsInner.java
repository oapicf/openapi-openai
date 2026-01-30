package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepDetailsToolCallsCodeObject;
import org.openapitools.model.RunStepDetailsToolCallsCodeObjectCodeInterpreter;
import org.openapitools.model.RunStepDetailsToolCallsFileSearchObject;
import org.openapitools.model.RunStepDetailsToolCallsFileSearchObjectFileSearch;
import org.openapitools.model.RunStepDetailsToolCallsFunctionObject;
import org.openapitools.model.RunStepDetailsToolCallsFunctionObjectFunction;

/**
 * RunStepDetailsToolCallsObjectToolCallsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDetailsToolCallsObjectToolCallsInner   {
  @JsonProperty("id")
  private String id;

  /**
   * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
   */
  public enum TypeEnum {
    CODE_INTERPRETER("code_interpreter"),
    
    FILE_SEARCH("file_search"),
    
    FUNCTION("function");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("code_interpreter")
  private RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter;

  @JsonProperty("file_search")
  private RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch;

  @JsonProperty("function")
  private RunStepDetailsToolCallsFunctionObjectFunction function;

  public RunStepDetailsToolCallsObjectToolCallsInner id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the tool call object.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID of the tool call object.")
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
  @ApiModelProperty(required = true, value = "The type of tool call. This is always going to be `code_interpreter` for this type of tool call.")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(this.id, runStepDetailsToolCallsObjectToolCallsInner.id) &&
        Objects.equals(this.type, runStepDetailsToolCallsObjectToolCallsInner.type) &&
        Objects.equals(this.codeInterpreter, runStepDetailsToolCallsObjectToolCallsInner.codeInterpreter) &&
        Objects.equals(this.fileSearch, runStepDetailsToolCallsObjectToolCallsInner.fileSearch) &&
        Objects.equals(this.function, runStepDetailsToolCallsObjectToolCallsInner.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, codeInterpreter, fileSearch, function);
  }

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

