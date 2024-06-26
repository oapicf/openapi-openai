/**
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

package org.openapitools.client.model;

import org.openapitools.client.model.RunStepDetailsToolCallsCodeOutputImageObject;
import org.openapitools.client.model.RunStepDetailsToolCallsCodeOutputImageObjectImage;
import org.openapitools.client.model.RunStepDetailsToolCallsCodeOutputLogsObject;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
  
  public enum TypeEnum {
     logs,  image, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("logs")
  private String logs = null;
  @SerializedName("image")
  private RunStepDetailsToolCallsCodeOutputImageObjectImage image = null;

  /**
   * Always `logs`.
   **/
  @ApiModelProperty(required = true, value = "Always `logs`.")
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
  public String getLogs() {
    return logs;
  }
  public void setLogs(String logs) {
    this.logs = logs;
  }

  /**
   **/
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
    return (this.type == null ? runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.type == null : this.type.equals(runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.type)) &&
        (this.logs == null ? runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.logs == null : this.logs.equals(runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.logs)) &&
        (this.image == null ? runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.image == null : this.image.equals(runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.image));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.logs == null ? 0: this.logs.hashCode());
    result = 31 * result + (this.image == null ? 0: this.image.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  logs: ").append(logs).append("\n");
    sb.append("  image: ").append(image).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
