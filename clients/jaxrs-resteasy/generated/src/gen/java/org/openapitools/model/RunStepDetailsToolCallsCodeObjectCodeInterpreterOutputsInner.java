package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepDetailsToolCallsCodeOutputImageObject;
import org.openapitools.model.RunStepDetailsToolCallsCodeOutputImageObjectImage;
import org.openapitools.model.RunStepDetailsToolCallsCodeOutputLogsObject;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-04-14T13:41:51.736364282Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner   {
  

  /**
   * Always &#x60;logs&#x60;.
   */
  public enum TypeEnum {
    LOGS("logs"),

        IMAGE("image");
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TypeEnum type;
  private String logs;
  private RunStepDetailsToolCallsCodeOutputImageObjectImage image;

  /**
   * Always &#x60;logs&#x60;.
   **/
  
  @ApiModelProperty(required = true, value = "Always `logs`.")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The text output from the Code Interpreter tool call.
   **/
  
  @ApiModelProperty(required = true, value = "The text output from the Code Interpreter tool call.")
  @JsonProperty("logs")
  @NotNull
  public String getLogs() {
    return logs;
  }
  public void setLogs(String logs) {
    this.logs = logs;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("image")
  @NotNull
  @Valid
  public RunStepDetailsToolCallsCodeOutputImageObjectImage getImage() {
    return image;
  }
  public void setImage(RunStepDetailsToolCallsCodeOutputImageObjectImage image) {
    this.image = image;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

