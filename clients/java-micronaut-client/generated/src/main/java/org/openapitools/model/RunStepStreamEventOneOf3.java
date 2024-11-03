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
import org.openapitools.model.RunStepObject;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Occurs when a [run step](/docs/api-reference/runs/step-object) is completed.
 */
@JsonPropertyOrder({
  RunStepStreamEventOneOf3.JSON_PROPERTY_EVENT,
  RunStepStreamEventOneOf3.JSON_PROPERTY_DATA
})
@JsonTypeName("RunStepStreamEvent_oneOf_3")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-03T11:06:40.431829781Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class RunStepStreamEventOneOf3 {
    /**
     * Gets or Sets event
     */
    public enum EventEnum {
        THREAD_RUN_STEP_COMPLETED("thread.run.step.completed");

        private String value;

        EventEnum(String value) {
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
        public static EventEnum fromValue(String value) {
            for (EventEnum b : EventEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_EVENT = "event";
    private EventEnum event;

    public static final String JSON_PROPERTY_DATA = "data";
    private RunStepObject data;

    public RunStepStreamEventOneOf3(EventEnum event, RunStepObject data) {
        this.event = event;
        this.data = data;
    }

    public RunStepStreamEventOneOf3 event(EventEnum event) {
        this.event = event;
        return this;
    }

    /**
     * Get event
     * @return event
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_EVENT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public EventEnum getEvent() {
        return event;
    }

    @JsonProperty(JSON_PROPERTY_EVENT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEvent(EventEnum event) {
        this.event = event;
    }

    public RunStepStreamEventOneOf3 data(RunStepObject data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     * @return data
     */
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public RunStepObject getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setData(RunStepObject data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunStepStreamEventOneOf3 runStepStreamEventOneOf3 = (RunStepStreamEventOneOf3) o;
        return Objects.equals(this.event, runStepStreamEventOneOf3.event) &&
            Objects.equals(this.data, runStepStreamEventOneOf3.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(event, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepStreamEventOneOf3 {\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

