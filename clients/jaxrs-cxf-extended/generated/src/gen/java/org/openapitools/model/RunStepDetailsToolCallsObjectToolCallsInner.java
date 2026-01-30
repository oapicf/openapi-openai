package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RunStepDetailsToolCallsCodeObject;
import org.openapitools.model.RunStepDetailsToolCallsCodeObjectCodeInterpreter;
import org.openapitools.model.RunStepDetailsToolCallsFileSearchObject;
import org.openapitools.model.RunStepDetailsToolCallsFileSearchObjectFileSearch;
import org.openapitools.model.RunStepDetailsToolCallsFunctionObject;
import org.openapitools.model.RunStepDetailsToolCallsFunctionObjectFunction;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RunStepDetailsToolCallsObjectToolCallsInner  {
  
 /**
  * The ID of the tool call object.
  */
  @ApiModelProperty(required = true, value = "The ID of the tool call object.")
  private String id;

public enum TypeEnum {

    @JsonProperty("code_interpreter") CODE_INTERPRETER(String.valueOf("code_interpreter")),
    @JsonProperty("file_search") FILE_SEARCH(String.valueOf("file_search")),
    @JsonProperty("function") FUNCTION(String.valueOf("function"));

    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  */
  @ApiModelProperty(required = true, value = "The type of tool call. This is always going to be `code_interpreter` for this type of tool call.")
  private TypeEnum type;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private RunStepDetailsToolCallsFunctionObjectFunction function;
 /**
  * The ID of the tool call object.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public RunStepDetailsToolCallsObjectToolCallsInner id(String id) {
    this.id = id;
    return this;
  }

 /**
  * The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type == null ? null : type.value();
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public RunStepDetailsToolCallsObjectToolCallsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * Get codeInterpreter
  * @return codeInterpreter
  */
  @JsonProperty("code_interpreter")
  @NotNull
  public RunStepDetailsToolCallsCodeObjectCodeInterpreter getCodeInterpreter() {
    return codeInterpreter;
  }

  /**
   * Sets the <code>codeInterpreter</code> property.
   */
 public void setCodeInterpreter(RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
  }

  /**
   * Sets the <code>codeInterpreter</code> property.
   */
  public RunStepDetailsToolCallsObjectToolCallsInner codeInterpreter(RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
    return this;
  }

 /**
  * Get fileSearch
  * @return fileSearch
  */
  @JsonProperty("file_search")
  @NotNull
  public RunStepDetailsToolCallsFileSearchObjectFileSearch getFileSearch() {
    return fileSearch;
  }

  /**
   * Sets the <code>fileSearch</code> property.
   */
 public void setFileSearch(RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch) {
    this.fileSearch = fileSearch;
  }

  /**
   * Sets the <code>fileSearch</code> property.
   */
  public RunStepDetailsToolCallsObjectToolCallsInner fileSearch(RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch) {
    this.fileSearch = fileSearch;
    return this;
  }

 /**
  * Get function
  * @return function
  */
  @JsonProperty("function")
  @NotNull
  public RunStepDetailsToolCallsFunctionObjectFunction getFunction() {
    return function;
  }

  /**
   * Sets the <code>function</code> property.
   */
 public void setFunction(RunStepDetailsToolCallsFunctionObjectFunction function) {
    this.function = function;
  }

  /**
   * Sets the <code>function</code> property.
   */
  public RunStepDetailsToolCallsObjectToolCallsInner function(RunStepDetailsToolCallsFunctionObjectFunction function) {
    this.function = function;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

