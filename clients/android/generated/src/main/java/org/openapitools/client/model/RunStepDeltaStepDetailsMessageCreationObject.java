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

import org.openapitools.client.model.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Details of the message creation by the run step.
 **/
@ApiModel(description = "Details of the message creation by the run step.")
public class RunStepDeltaStepDetailsMessageCreationObject {
  
  public enum TypeEnum {
     message_creation, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("message_creation")
  private RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation = null;

  /**
   * Always `message_creation`.
   **/
  @ApiModelProperty(required = true, value = "Always `message_creation`.")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public RunStepDeltaStepDetailsMessageCreationObjectMessageCreation getMessageCreation() {
    return messageCreation;
  }
  public void setMessageCreation(RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation) {
    this.messageCreation = messageCreation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDeltaStepDetailsMessageCreationObject runStepDeltaStepDetailsMessageCreationObject = (RunStepDeltaStepDetailsMessageCreationObject) o;
    return (this.type == null ? runStepDeltaStepDetailsMessageCreationObject.type == null : this.type.equals(runStepDeltaStepDetailsMessageCreationObject.type)) &&
        (this.messageCreation == null ? runStepDeltaStepDetailsMessageCreationObject.messageCreation == null : this.messageCreation.equals(runStepDeltaStepDetailsMessageCreationObject.messageCreation));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.messageCreation == null ? 0: this.messageCreation.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsMessageCreationObject {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  messageCreation: ").append(messageCreation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
