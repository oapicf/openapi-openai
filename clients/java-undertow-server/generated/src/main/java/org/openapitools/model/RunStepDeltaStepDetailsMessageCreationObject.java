/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation;



/**
 * Details of the message creation by the run step.
 */

@ApiModel(description = "Details of the message creation by the run step.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDeltaStepDetailsMessageCreationObject   {
  


  public enum TypeEnum {
    MESSAGE_CREATION("message_creation");

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
  private RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation;

  /**
   * Always `message_creation`.
   */
  public RunStepDeltaStepDetailsMessageCreationObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Always `message_creation`.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   */
  public RunStepDeltaStepDetailsMessageCreationObject messageCreation(RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation) {
    this.messageCreation = messageCreation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("message_creation")
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
    return Objects.equals(type, runStepDeltaStepDetailsMessageCreationObject.type) &&
        Objects.equals(messageCreation, runStepDeltaStepDetailsMessageCreationObject.messageCreation);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

