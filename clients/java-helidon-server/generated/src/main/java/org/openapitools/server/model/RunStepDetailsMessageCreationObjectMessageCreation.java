package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class RunStepDetailsMessageCreationObjectMessageCreation   {

    private String messageId;

    /**
     * Default constructor.
     */
    public RunStepDetailsMessageCreationObjectMessageCreation() {
    // JSON-B / Jackson
    }

    /**
     * Create RunStepDetailsMessageCreationObjectMessageCreation.
     *
     * @param messageId The ID of the message that was created by this run step.
     */
    public RunStepDetailsMessageCreationObjectMessageCreation(
        String messageId
    ) {
        this.messageId = messageId;
    }



    /**
     * The ID of the message that was created by this run step.
     * @return messageId
     */
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

