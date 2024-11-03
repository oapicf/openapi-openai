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
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObject;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
 */
@JsonPropertyOrder({
  RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.JSON_PROPERTY_INDEX,
  RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.JSON_PROPERTY_TYPE,
  RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.JSON_PROPERTY_LOGS,
  RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.JSON_PROPERTY_IMAGE
})
@JsonTypeName("RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-03T11:06:54.019288922Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
    public static final String JSON_PROPERTY_INDEX = "index";
    private Integer index;

    /**
     * Always &#x60;logs&#x60;.
     */
    public enum TypeEnum {
        LOGS("logs"),
        IMAGE("image");

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

    public static final String JSON_PROPERTY_LOGS = "logs";
    private String logs;

    public static final String JSON_PROPERTY_IMAGE = "image";
    private RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage image;

    public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(Integer index, TypeEnum type) {
        this.index = index;
        this.type = type;
    }

    public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner index(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * The index of the output in the outputs array.
     * @return index
     */
    @NotNull
    @Schema(name = "index", description = "The index of the output in the outputs array.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_INDEX)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getIndex() {
        return index;
    }

    @JsonProperty(JSON_PROPERTY_INDEX)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIndex(Integer index) {
        this.index = index;
    }

    public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Always &#x60;logs&#x60;.
     * @return type
     */
    @NotNull
    @Schema(name = "type", description = "Always `logs`.", requiredMode = Schema.RequiredMode.REQUIRED)
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

    public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner logs(String logs) {
        this.logs = logs;
        return this;
    }

    /**
     * The text output from the Code Interpreter tool call.
     * @return logs
     */
    @Nullable
    @Schema(name = "logs", description = "The text output from the Code Interpreter tool call.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_LOGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getLogs() {
        return logs;
    }

    @JsonProperty(JSON_PROPERTY_LOGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLogs(String logs) {
        this.logs = logs;
    }

    public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner image(RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage image) {
        this.image = image;
        return this;
    }

    /**
     * Get image
     * @return image
     */
    @Valid
    @Nullable
    @Schema(name = "image", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_IMAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage getImage() {
        return image;
    }

    @JsonProperty(JSON_PROPERTY_IMAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setImage(RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner = (RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner) o;
        return Objects.equals(this.index, runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.index) &&
            Objects.equals(this.type, runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.type) &&
            Objects.equals(this.logs, runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.logs) &&
            Objects.equals(this.image, runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, type, logs, image);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

