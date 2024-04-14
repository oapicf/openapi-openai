package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.RunObjectRequiredActionSubmitToolOutputs;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Details on the action required to continue the run. Will be `null` if no action is required.
 **/
@ApiModel(description="Details on the action required to continue the run. Will be `null` if no action is required.")

public class RunObjectRequiredAction  {
  
public enum TypeEnum {

SUBMIT_TOOL_OUTPUTS(String.valueOf("submit_tool_outputs"));


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

  @ApiModelProperty(required = true, value = "For now, this is always `submit_tool_outputs`.")
 /**
   * For now, this is always `submit_tool_outputs`.
  **/
  private TypeEnum type;

  @ApiModelProperty(required = true, value = "")
  private RunObjectRequiredActionSubmitToolOutputs submitToolOutputs;
 /**
   * For now, this is always &#x60;submit_tool_outputs&#x60;.
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

  public RunObjectRequiredAction type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get submitToolOutputs
   * @return submitToolOutputs
  **/
  @JsonProperty("submit_tool_outputs")
  public RunObjectRequiredActionSubmitToolOutputs getSubmitToolOutputs() {
    return submitToolOutputs;
  }

  public void setSubmitToolOutputs(RunObjectRequiredActionSubmitToolOutputs submitToolOutputs) {
    this.submitToolOutputs = submitToolOutputs;
  }

  public RunObjectRequiredAction submitToolOutputs(RunObjectRequiredActionSubmitToolOutputs submitToolOutputs) {
    this.submitToolOutputs = submitToolOutputs;
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
    RunObjectRequiredAction runObjectRequiredAction = (RunObjectRequiredAction) o;
    return Objects.equals(this.type, runObjectRequiredAction.type) &&
        Objects.equals(this.submitToolOutputs, runObjectRequiredAction.submitToolOutputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, submitToolOutputs);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

