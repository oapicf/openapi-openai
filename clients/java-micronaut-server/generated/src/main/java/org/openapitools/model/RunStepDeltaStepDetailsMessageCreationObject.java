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
import org.openapitools.model.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Details of the message creation by the run step.
 */
@Schema(name = "RunStepDeltaStepDetailsMessageCreationObject", description = "Details of the message creation by the run step.")
@JsonPropertyOrder({
  RunStepDeltaStepDetailsMessageCreationObject.JSON_PROPERTY_TYPE,
  RunStepDeltaStepDetailsMessageCreationObject.JSON_PROPERTY_MESSAGE_CREATION
})
@JsonTypeName("RunStepDeltaStepDetailsMessageCreationObject")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-03T11:06:54.019288922Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class RunStepDeltaStepDetailsMessageCreationObject {
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
    private RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation;

    public RunStepDeltaStepDetailsMessageCreationObject(TypeEnum type) {
        this.type = type;
    }

    public RunStepDeltaStepDetailsMessageCreationObject type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Always &#x60;message_creation&#x60;.
     * @return type
     */
    @NotNull
    @Schema(name = "type", description = "Always `message_creation`.", requiredMode = Schema.RequiredMode.REQUIRED)
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

    public RunStepDeltaStepDetailsMessageCreationObject messageCreation(RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation) {
        this.messageCreation = messageCreation;
        return this;
    }

    /**
     * Get messageCreation
     * @return messageCreation
     */
    @Valid
    @Nullable
    @Schema(name = "message_creation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_MESSAGE_CREATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RunStepDeltaStepDetailsMessageCreationObjectMessageCreation getMessageCreation() {
        return messageCreation;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGE_CREATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

