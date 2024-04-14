/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepDetailsToolCallsCodeOutputImageObject;
import org.openapitools.model.RunStepDetailsToolCallsCodeOutputImageObjectImage;
import org.openapitools.model.RunStepDetailsToolCallsCodeOutputLogsObject;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
 */
@JsonPropertyOrder({
  RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.JSON_PROPERTY_TYPE,
  RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.JSON_PROPERTY_LOGS,
  RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.JSON_PROPERTY_IMAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-04-14T13:41:38.036864137Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

  public static final String JSON_PROPERTY_TYPE = "type";
  @JsonProperty(JSON_PROPERTY_TYPE)
  private TypeEnum type;

  public static final String JSON_PROPERTY_LOGS = "logs";
  @JsonProperty(JSON_PROPERTY_LOGS)
  private String logs;

  public static final String JSON_PROPERTY_IMAGE = "image";
  @JsonProperty(JSON_PROPERTY_IMAGE)
  private RunStepDetailsToolCallsCodeOutputImageObjectImage image;

  public RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Always &#x60;logs&#x60;.
   * @return type
   **/
  @JsonProperty(value = "type")
  @ApiModelProperty(required = true, value = "Always `logs`.")
  @NotNull 
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
   **/
  @JsonProperty(value = "logs")
  @ApiModelProperty(required = true, value = "The text output from the Code Interpreter tool call.")
  @NotNull 
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
   **/
  @JsonProperty(value = "image")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
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

