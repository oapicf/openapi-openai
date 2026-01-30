package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeObject;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsFileSearchObject;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsFunctionObject;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RunStepDeltaStepDetailsToolCallsObjectToolCallsInner  {
  
 /**
  * The index of the tool call in the tool calls array.
  */
  @ApiModelProperty(required = true, value = "The index of the tool call in the tool calls array.")
  private Integer index;

 /**
  * The ID of the tool call object.
  */
  @ApiModelProperty(value = "The ID of the tool call object.")
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

  @ApiModelProperty(value = "")
  @Valid
  private RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter;

 /**
  * For now, this is always going to be an empty object.
  */
  @ApiModelProperty(required = true, value = "For now, this is always going to be an empty object.")
  private Object fileSearch;

  @ApiModelProperty(value = "")
  @Valid
  private RunStepDeltaStepDetailsToolCallsFunctionObjectFunction function;
 /**
  * The index of the tool call in the tool calls array.
  * @return index
  */
  @JsonProperty("index")
  @NotNull
  public Integer getIndex() {
    return index;
  }

  /**
   * Sets the <code>index</code> property.
   */
 public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Sets the <code>index</code> property.
   */
  public RunStepDeltaStepDetailsToolCallsObjectToolCallsInner index(Integer index) {
    this.index = index;
    return this;
  }

 /**
  * The ID of the tool call object.
  * @return id
  */
  @JsonProperty("id")
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
  public RunStepDeltaStepDetailsToolCallsObjectToolCallsInner id(String id) {
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
  public RunStepDeltaStepDetailsToolCallsObjectToolCallsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * Get codeInterpreter
  * @return codeInterpreter
  */
  @JsonProperty("code_interpreter")
  public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter getCodeInterpreter() {
    return codeInterpreter;
  }

  /**
   * Sets the <code>codeInterpreter</code> property.
   */
 public void setCodeInterpreter(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
  }

  /**
   * Sets the <code>codeInterpreter</code> property.
   */
  public RunStepDeltaStepDetailsToolCallsObjectToolCallsInner codeInterpreter(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
    return this;
  }

 /**
  * For now, this is always going to be an empty object.
  * @return fileSearch
  */
  @JsonProperty("file_search")
  @NotNull
  public Object getFileSearch() {
    return fileSearch;
  }

  /**
   * Sets the <code>fileSearch</code> property.
   */
 public void setFileSearch(Object fileSearch) {
    this.fileSearch = fileSearch;
  }

  /**
   * Sets the <code>fileSearch</code> property.
   */
  public RunStepDeltaStepDetailsToolCallsObjectToolCallsInner fileSearch(Object fileSearch) {
    this.fileSearch = fileSearch;
    return this;
  }

 /**
  * Get function
  * @return function
  */
  @JsonProperty("function")
  public RunStepDeltaStepDetailsToolCallsFunctionObjectFunction getFunction() {
    return function;
  }

  /**
   * Sets the <code>function</code> property.
   */
 public void setFunction(RunStepDeltaStepDetailsToolCallsFunctionObjectFunction function) {
    this.function = function;
  }

  /**
   * Sets the <code>function</code> property.
   */
  public RunStepDeltaStepDetailsToolCallsObjectToolCallsInner function(RunStepDeltaStepDetailsToolCallsFunctionObjectFunction function) {
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
    RunStepDeltaStepDetailsToolCallsObjectToolCallsInner runStepDeltaStepDetailsToolCallsObjectToolCallsInner = (RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) o;
    return Objects.equals(this.index, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.index) &&
        Objects.equals(this.id, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.id) &&
        Objects.equals(this.type, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.type) &&
        Objects.equals(this.codeInterpreter, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.codeInterpreter) &&
        Objects.equals(this.fileSearch, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.fileSearch) &&
        Objects.equals(this.function, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, id, type, codeInterpreter, fileSearch, function);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

