package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObject;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner  {
  
 /**
  * The index of the output in the outputs array.
  */
  @ApiModelProperty(required = true, value = "The index of the output in the outputs array.")

  private Integer index;

public enum TypeEnum {

LOGS(String.valueOf("logs")), IMAGE(String.valueOf("image"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
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

 /**
  * Always `logs`.
  */
  @ApiModelProperty(required = true, value = "Always `logs`.")

  private TypeEnum type;

 /**
  * The text output from the Code Interpreter tool call.
  */
  @ApiModelProperty(value = "The text output from the Code Interpreter tool call.")

  private String logs;

  @ApiModelProperty(value = "")

  @Valid

  private RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage image;
 /**
   * The index of the output in the outputs array.
   * @return index
  **/
  @JsonProperty("index")
  @NotNull
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner index(Integer index) {
    this.index = index;
    return this;
  }

 /**
   * Always &#x60;logs&#x60;.
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * The text output from the Code Interpreter tool call.
   * @return logs
  **/
  @JsonProperty("logs")
  public String getLogs() {
    return logs;
  }

  public void setLogs(String logs) {
    this.logs = logs;
  }

  public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner logs(String logs) {
    this.logs = logs;
    return this;
  }

 /**
   * Get image
   * @return image
  **/
  @JsonProperty("image")
  public RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage getImage() {
    return image;
  }

  public void setImage(RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage image) {
    this.image = image;
  }

  public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner image(RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage image) {
    this.image = image;
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
    RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner = (RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner) o;
    return Objects.equals(this.index, runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.index) &&
        Objects.equals(this.type, runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.type) &&
        Objects.equals(this.logs, runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.logs) &&
        Objects.equals(this.image, runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, logs, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

