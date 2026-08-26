package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RunStepDetailsMessageCreationObjectMessageCreation;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Details of the message creation by the run step.
 */
public class RunStepDetailsMessageCreationObject   {


    /**
    * Always `message_creation`.
    */
    public enum TypeEnum {
        MESSAGE_CREATION("message_creation");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private TypeEnum type;
    private RunStepDetailsMessageCreationObjectMessageCreation messageCreation;

    /**
     * Default constructor.
     */
    public RunStepDetailsMessageCreationObject() {
    // JSON-B / Jackson
    }

    /**
     * Create RunStepDetailsMessageCreationObject.
     *
     * @param type Always &#x60;message_creation&#x60;.
     * @param messageCreation messageCreation
     */
    public RunStepDetailsMessageCreationObject(
        TypeEnum type, 
        RunStepDetailsMessageCreationObjectMessageCreation messageCreation
    ) {
        this.type = type;
        this.messageCreation = messageCreation;
    }



    /**
     * Always `message_creation`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Get messageCreation
     * @return messageCreation
     */
    public RunStepDetailsMessageCreationObjectMessageCreation getMessageCreation() {
        return messageCreation;
    }

    public void setMessageCreation(RunStepDetailsMessageCreationObjectMessageCreation messageCreation) {
        this.messageCreation = messageCreation;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

