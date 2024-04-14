/*
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

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RunStepDetailsMessageCreationObjectMessageCreation
 */
@JsonPropertyOrder({
  RunStepDetailsMessageCreationObjectMessageCreation.JSON_PROPERTY_MESSAGE_ID
})
@JsonTypeName("RunStepDetailsMessageCreationObject_message_creation")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-04-14T13:38:24.957235058Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class RunStepDetailsMessageCreationObjectMessageCreation {
    public static final String JSON_PROPERTY_MESSAGE_ID = "message_id";
    private String messageId;

    public RunStepDetailsMessageCreationObjectMessageCreation(String messageId) {
        this.messageId = messageId;
    }

    public RunStepDetailsMessageCreationObjectMessageCreation messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * The ID of the message that was created by this run step.
     * @return messageId
     **/
    @NotNull
    @Schema(name = "message_id", description = "The ID of the message that was created by this run step.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getMessageId() {
        return messageId;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

