package apimodels;

import apimodels.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Details of the message creation by the run step.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RunStepDeltaStepDetailsMessageCreationObject   {
  /**
   * Always `message_creation`.
   */
  public enum TypeEnum {
    MESSAGE_CREATION("message_creation");

    private final String value;

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

  @JsonProperty("type")
  @NotNull

  private TypeEnum type;

  @JsonProperty("message_creation")
  @Valid

  private RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation;

  public RunStepDeltaStepDetailsMessageCreationObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Always `message_creation`.
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RunStepDeltaStepDetailsMessageCreationObject messageCreation(RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation) {
    this.messageCreation = messageCreation;
    return this;
  }

   /**
   * Get messageCreation
   * @return messageCreation
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

