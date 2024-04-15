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
import org.openapitools.model.RunStepDetailsMessageCreationObjectMessageCreation;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Details of the message creation by the run step.
 */
@JsonPropertyOrder({
  RunStepDetailsMessageCreationObject.JSON_PROPERTY_TYPE,
  RunStepDetailsMessageCreationObject.JSON_PROPERTY_MESSAGE_CREATION
})
@JsonTypeName("RunStepDetailsMessageCreationObject")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-04-14T13:37:52.123317469Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class RunStepDetailsMessageCreationObject {
    /**
     * Always &#x60;message_creation&#x60;.
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_TYPE = "type";
    private TypeEnum type;

    public static final String JSON_PROPERTY_MESSAGE_CREATION = "message_creation";
    private RunStepDetailsMessageCreationObjectMessageCreation messageCreation;

    public RunStepDetailsMessageCreationObject(TypeEnum type, RunStepDetailsMessageCreationObjectMessageCreation messageCreation) {
        this.type = type;
        this.messageCreation = messageCreation;
    }

    public RunStepDetailsMessageCreationObject type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Always &#x60;message_creation&#x60;.
     * @return type
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public TypeEnum getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(TypeEnum type) {
        this.type = type;
    }

    public RunStepDetailsMessageCreationObject messageCreation(RunStepDetailsMessageCreationObjectMessageCreation messageCreation) {
        this.messageCreation = messageCreation;
        return this;
    }

    /**
     * Get messageCreation
     * @return messageCreation
     **/
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_MESSAGE_CREATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public RunStepDetailsMessageCreationObjectMessageCreation getMessageCreation() {
        return messageCreation;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGE_CREATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setMessageCreation(RunStepDetailsMessageCreationObjectMessageCreation messageCreation) {
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
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
