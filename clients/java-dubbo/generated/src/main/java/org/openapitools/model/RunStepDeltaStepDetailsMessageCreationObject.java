package org.openapitools.model;

import org.openapitools.model.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Details of the message creation by the run step.
 */
public class RunStepDeltaStepDetailsMessageCreationObject implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Always &#x60;message_creation&#x60;.
   */
  @JsonProperty("type")
  private String type;

  @JsonProperty("message_creation")
  private RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation;

  /**
   * Always &#x60;message_creation&#x60;.
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * 
   * @return messageCreation
   */
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
    return Objects.equals(this.type, runStepDeltaStepDetailsMessageCreationObject.type) &&
        Objects.equals(this.messageCreation, runStepDeltaStepDetailsMessageCreationObject.messageCreation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, messageCreation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsMessageCreationObject {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    messageCreation: ").append(toIndentedString(messageCreation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
