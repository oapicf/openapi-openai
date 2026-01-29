package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RunStepDetailsToolCallsCodeOutputImageObject;
import org.openapitools.model.RunStepDetailsToolCallsCodeOutputImageObjectImage;
import org.openapitools.model.RunStepDetailsToolCallsCodeOutputLogsObject;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner  {
  
public enum TypeEnum {

    @JsonProperty("logs") LOGS(String.valueOf("logs")),
    @JsonProperty("image") IMAGE(String.valueOf("image"));

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
  * Always `logs`.
  */
  @ApiModelProperty(required = true, value = "Always `logs`.")
  private TypeEnum type;

 /**
  * The text output from the Code Interpreter tool call.
  */
  @ApiModelProperty(required = true, value = "The text output from the Code Interpreter tool call.")
  private String logs;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private RunStepDetailsToolCallsCodeOutputImageObjectImage image;
 /**
  * Always &#x60;logs&#x60;.
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
  public RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * The text output from the Code Interpreter tool call.
  * @return logs
  */
  @JsonProperty("logs")
  @NotNull
  public String getLogs() {
    return logs;
  }

  /**
   * Sets the <code>logs</code> property.
   */
 public void setLogs(String logs) {
    this.logs = logs;
  }

  /**
   * Sets the <code>logs</code> property.
   */
  public RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner logs(String logs) {
    this.logs = logs;
    return this;
  }

 /**
  * Get image
  * @return image
  */
  @JsonProperty("image")
  @NotNull
  public RunStepDetailsToolCallsCodeOutputImageObjectImage getImage() {
    return image;
  }

  /**
   * Sets the <code>image</code> property.
   */
 public void setImage(RunStepDetailsToolCallsCodeOutputImageObjectImage image) {
    this.image = image;
  }

  /**
   * Sets the <code>image</code> property.
   */
  public RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner image(RunStepDetailsToolCallsCodeOutputImageObjectImage image) {
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
    RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner = (RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner) o;
    return Objects.equals(this.type, runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.type) &&
        Objects.equals(this.logs, runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.logs) &&
        Objects.equals(this.image, runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, logs, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {\n");
    
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

