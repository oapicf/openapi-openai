package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-03T11:08:49.636855747Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RunStepDeltaStepDetailsMessageCreationObjectMessageCreation   {
  
  private String messageId;

  /**
   * The ID of the message that was created by this run step.
   **/
  
  @ApiModelProperty(value = "The ID of the message that was created by this run step.")
  @JsonProperty("message_id")
  public String getMessageId() {
    return messageId;
  }
  public void setMessageId(String messageId) {
    this.messageId = messageId;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

