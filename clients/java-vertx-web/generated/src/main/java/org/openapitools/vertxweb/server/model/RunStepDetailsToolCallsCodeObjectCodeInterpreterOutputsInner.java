package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.RunStepDetailsToolCallsCodeOutputImageObject;
import org.openapitools.vertxweb.server.model.RunStepDetailsToolCallsCodeOutputImageObjectImage;
import org.openapitools.vertxweb.server.model.RunStepDetailsToolCallsCodeOutputLogsObject;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner   {
  


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
      return value;
    }
  }

  private TypeEnum type;
  private String logs;
  private RunStepDetailsToolCallsCodeOutputImageObjectImage image;

  public RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner () {

  }

  public RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner (TypeEnum type, String logs, RunStepDetailsToolCallsCodeOutputImageObjectImage image) {
    this.type = type;
    this.logs = logs;
    this.image = image;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("logs")
  public String getLogs() {
    return logs;
  }
  public void setLogs(String logs) {
    this.logs = logs;
  }

    
  @JsonProperty("image")
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
    return Objects.equals(type, runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.type) &&
        Objects.equals(logs, runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.logs) &&
        Objects.equals(image, runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.image);
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
