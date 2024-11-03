package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.RunStepDetailsToolCallsCodeObjectCodeInterpreter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Details of the Code Interpreter tool call the run step was involved in.
 */
@ApiModel(description = "Details of the Code Interpreter tool call the run step was involved in.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-03T11:07:18.723034005Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RunStepDetailsToolCallsCodeObject   {
  @JsonProperty("id")
  private String id;

  /**
   * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
   */
  public enum TypeEnum {
    CODE_INTERPRETER("code_interpreter");

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

  public RunStepDetailsToolCallsCodeObject id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the tool call.
   * @return id
   */
  @ApiModelProperty(required = true, value = "The ID of the tool call.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RunStepDetailsToolCallsCodeObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
   * @return type
   */
  @ApiModelProperty(required = true, value = "The type of tool call. This is always going to be `code_interpreter` for this type of tool call.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RunStepDetailsToolCallsCodeObject codeInterpreter(RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
    return this;
  }

  /**
   * Get codeInterpreter
   * @return codeInterpreter
   */
  @ApiModelProperty(required = true, value = "")
  public RunStepDetailsToolCallsCodeObjectCodeInterpreter getCodeInterpreter() {
    return codeInterpreter;
  }

  public void setCodeInterpreter(RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObject = (RunStepDetailsToolCallsCodeObject) o;
    return Objects.equals(this.id, runStepDetailsToolCallsCodeObject.id) &&
        Objects.equals(this.type, runStepDetailsToolCallsCodeObject.type) &&
        Objects.equals(this.codeInterpreter, runStepDetailsToolCallsCodeObject.codeInterpreter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, codeInterpreter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsCodeObject {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

