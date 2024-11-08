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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Text output from the Code Interpreter tool call as part of a run step.
 */
@JsonPropertyOrder({
  RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.JSON_PROPERTY_INDEX,
  RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.JSON_PROPERTY_TYPE,
  RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.JSON_PROPERTY_LOGS
})
@JsonTypeName("RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-03T11:06:40.431829781Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject {
    public static final String JSON_PROPERTY_INDEX = "index";
    private Integer index;

    /**
     * Always &#x60;logs&#x60;.
     */
    public enum TypeEnum {
        LOGS("logs");

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

    public RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(Integer index, TypeEnum type) {
        this.index = index;
        this.type = type;
    }

    public RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject index(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * The index of the output in the outputs array.
     * @return index
     */
    @NotNull
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

    public RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Always &#x60;logs&#x60;.
     * @return type
     */
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

    public RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject logs(String logs) {
        this.logs = logs;
        return this;
    }

    /**
     * The text output from the Code Interpreter tool call.
     * @return logs
     */
    @Nullable
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject runStepDeltaStepDetailsToolCallsCodeOutputLogsObject = (RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject) o;
        return Objects.equals(this.index, runStepDeltaStepDetailsToolCallsCodeOutputLogsObject.index) &&
            Objects.equals(this.type, runStepDeltaStepDetailsToolCallsCodeOutputLogsObject.type) &&
            Objects.equals(this.logs, runStepDeltaStepDetailsToolCallsCodeOutputLogsObject.logs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, type, logs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject {\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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

