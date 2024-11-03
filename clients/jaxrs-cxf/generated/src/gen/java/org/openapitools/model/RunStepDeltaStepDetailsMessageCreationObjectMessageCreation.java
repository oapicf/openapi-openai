package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RunStepDeltaStepDetailsMessageCreationObjectMessageCreation  {
  
  @ApiModelProperty(value = "The ID of the message that was created by this run step.")
 /**
   * The ID of the message that was created by this run step.
  **/
  private String messageId;
 /**
   * The ID of the message that was created by this run step.
   * @return messageId
  **/
  @JsonProperty("message_id")
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageId(String messageId) {
    this.messageId = messageId;
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
    RunStepDeltaStepDetailsMessageCreationObjectMessageCreation runStepDeltaStepDetailsMessageCreationObjectMessageCreation = (RunStepDeltaStepDetailsMessageCreationObjectMessageCreation) o;
    return Objects.equals(this.messageId, runStepDeltaStepDetailsMessageCreationObjectMessageCreation.messageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsMessageCreationObjectMessageCreation {\n");
    
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
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

