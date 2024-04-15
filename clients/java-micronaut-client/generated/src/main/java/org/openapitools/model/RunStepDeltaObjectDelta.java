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
import org.openapitools.model.RunStepDeltaObjectDeltaStepDetails;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * The delta containing the fields that have changed on the run step.
 */
@JsonPropertyOrder({
  RunStepDeltaObjectDelta.JSON_PROPERTY_STEP_DETAILS
})
@JsonTypeName("RunStepDeltaObject_delta")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-04-14T13:37:52.123317469Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class RunStepDeltaObjectDelta {
    public static final String JSON_PROPERTY_STEP_DETAILS = "step_details";
    private RunStepDeltaObjectDeltaStepDetails stepDetails;

    public RunStepDeltaObjectDelta() {
    }

    public RunStepDeltaObjectDelta stepDetails(RunStepDeltaObjectDeltaStepDetails stepDetails) {
        this.stepDetails = stepDetails;
        return this;
    }

    /**
     * Get stepDetails
     * @return stepDetails
     **/
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_STEP_DETAILS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RunStepDeltaObjectDeltaStepDetails getStepDetails() {
        return stepDetails;
    }

    @JsonProperty(JSON_PROPERTY_STEP_DETAILS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStepDetails(RunStepDeltaObjectDeltaStepDetails stepDetails) {
        this.stepDetails = stepDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunStepDeltaObjectDelta runStepDeltaObjectDelta = (RunStepDeltaObjectDelta) o;
        return Objects.equals(this.stepDetails, runStepDeltaObjectDelta.stepDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stepDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDeltaObjectDelta {\n");
        sb.append("    stepDetails: ").append(toIndentedString(stepDetails)).append("\n");
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
