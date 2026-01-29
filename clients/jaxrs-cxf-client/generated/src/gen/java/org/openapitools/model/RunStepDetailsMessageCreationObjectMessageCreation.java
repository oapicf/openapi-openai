package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RunStepDetailsMessageCreationObjectMessageCreation  {
  
 /**
  * The ID of the message that was created by this run step.
  */
  @ApiModelProperty(required = true, value = "The ID of the message that was created by this run step.")

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

  public RunStepDetailsMessageCreationObjectMessageCreation messageId(String messageId) {
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
    RunStepDetailsMessageCreationObjectMessageCreation runStepDetailsMessageCreationObjectMessageCreation = (RunStepDetailsMessageCreationObjectMessageCreation) o;
    return Objects.equals(this.messageId, runStepDetailsMessageCreationObjectMessageCreation.messageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsMessageCreationObjectMessageCreation {\n");
    
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

