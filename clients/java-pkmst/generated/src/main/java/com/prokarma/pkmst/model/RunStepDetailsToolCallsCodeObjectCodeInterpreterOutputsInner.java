package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.RunStepDetailsToolCallsCodeOutputImageObject;
import com.prokarma.pkmst.model.RunStepDetailsToolCallsCodeOutputImageObjectImage;
import com.prokarma.pkmst.model.RunStepDetailsToolCallsCodeOutputLogsObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner   {
  /**
   * Always `logs`.
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

  @JsonProperty("logs")
  private String logs;

  @JsonProperty("image")
  private RunStepDetailsToolCallsCodeOutputImageObjectImage image;

  public RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Always `logs`.
   * @return type
   */
  @ApiModelProperty(required = true, value = "Always `logs`.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner logs(String logs) {
    this.logs = logs;
    return this;
  }

  /**
   * The text output from the Code Interpreter tool call.
   * @return logs
   */
  @ApiModelProperty(required = true, value = "The text output from the Code Interpreter tool call.")
  public String getLogs() {
    return logs;
  }

  public void setLogs(String logs) {
    this.logs = logs;
  }

  public RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner image(RunStepDetailsToolCallsCodeOutputImageObjectImage image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @ApiModelProperty(required = true, value = "")
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

