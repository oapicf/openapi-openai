package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RunStepDetailsMessageCreationObjectMessageCreation;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Details of the message creation by the run step.
 */
@ApiModel(description="Details of the message creation by the run step.")

public class RunStepDetailsMessageCreationObject  {
  
public enum TypeEnum {

    @JsonProperty("message_creation") MESSAGE_CREATION(String.valueOf("message_creation"));

    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Always `message_creation`.
  */
  @ApiModelProperty(required = true, value = "Always `message_creation`.")
  private TypeEnum type;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private RunStepDetailsMessageCreationObjectMessageCreation messageCreation;
 /**
  * Always &#x60;message_creation&#x60;.
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type == null ? null : type.value();
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public RunStepDetailsMessageCreationObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * Get messageCreation
  * @return messageCreation
  */
  @JsonProperty("message_creation")
  @NotNull
  public RunStepDetailsMessageCreationObjectMessageCreation getMessageCreation() {
    return messageCreation;
  }

  /**
   * Sets the <code>messageCreation</code> property.
   */
 public void setMessageCreation(RunStepDetailsMessageCreationObjectMessageCreation messageCreation) {
    this.messageCreation = messageCreation;
  }

  /**
   * Sets the <code>messageCreation</code> property.
   */
  public RunStepDetailsMessageCreationObject messageCreation(RunStepDetailsMessageCreationObjectMessageCreation messageCreation) {
    this.messageCreation = messageCreation;
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
    RunStepDetailsMessageCreationObject runStepDetailsMessageCreationObject = (RunStepDetailsMessageCreationObject) o;
    return Objects.equals(this.type, runStepDetailsMessageCreationObject.type) &&
        Objects.equals(this.messageCreation, runStepDetailsMessageCreationObject.messageCreation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, messageCreation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsMessageCreationObject {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    messageCreation: ").append(toIndentedString(messageCreation)).append("\n");
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

