package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Details of the Code Interpreter tool call the run step was involved in.
 **/
@ApiModel(description="Details of the Code Interpreter tool call the run step was involved in.")

public class RunStepDeltaStepDetailsToolCallsCodeObject  {
  
  @ApiModelProperty(required = true, value = "The index of the tool call in the tool calls array.")
 /**
   * The index of the tool call in the tool calls array.
  **/
  private Integer index;

  @ApiModelProperty(value = "The ID of the tool call.")
 /**
   * The ID of the tool call.
  **/
  private String id;

public enum TypeEnum {

CODE_INTERPRETER(String.valueOf("code_interpreter"));


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

  @ApiModelProperty(required = true, value = "The type of tool call. This is always going to be `code_interpreter` for this type of tool call.")
 /**
   * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  **/
  private TypeEnum type;

  @ApiModelProperty(value = "")
  private RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter;
 /**
   * The index of the tool call in the tool calls array.
   * @return index
  **/
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public RunStepDeltaStepDetailsToolCallsCodeObject index(Integer index) {
    this.index = index;
    return this;
  }

 /**
   * The ID of the tool call.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RunStepDeltaStepDetailsToolCallsCodeObject id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RunStepDeltaStepDetailsToolCallsCodeObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get codeInterpreter
   * @return codeInterpreter
  **/
  @JsonProperty("code_interpreter")
  public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter getCodeInterpreter() {
    return codeInterpreter;
  }

  public void setCodeInterpreter(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
  }

  public RunStepDeltaStepDetailsToolCallsCodeObject codeInterpreter(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
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
    RunStepDeltaStepDetailsToolCallsCodeObject runStepDeltaStepDetailsToolCallsCodeObject = (RunStepDeltaStepDetailsToolCallsCodeObject) o;
    return Objects.equals(this.index, runStepDeltaStepDetailsToolCallsCodeObject.index) &&
        Objects.equals(this.id, runStepDeltaStepDetailsToolCallsCodeObject.id) &&
        Objects.equals(this.type, runStepDeltaStepDetailsToolCallsCodeObject.type) &&
        Objects.equals(this.codeInterpreter, runStepDeltaStepDetailsToolCallsCodeObject.codeInterpreter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, id, type, codeInterpreter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsToolCallsCodeObject {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    codeInterpreter: ").append(toIndentedString(codeInterpreter)).append("\n");
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
