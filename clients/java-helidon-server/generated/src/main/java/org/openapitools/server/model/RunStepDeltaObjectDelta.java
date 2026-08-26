package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.RunStepDeltaObjectDeltaStepDetails;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The delta containing the fields that have changed on the run step.
 */
public class RunStepDeltaObjectDelta   {

    private RunStepDeltaObjectDeltaStepDetails stepDetails;

    /**
     * Default constructor.
     */
    public RunStepDeltaObjectDelta() {
    // JSON-B / Jackson
    }

    /**
     * Create RunStepDeltaObjectDelta.
     *
     * @param stepDetails stepDetails
     */
    public RunStepDeltaObjectDelta(
        RunStepDeltaObjectDeltaStepDetails stepDetails
    ) {
        this.stepDetails = stepDetails;
    }



    /**
     * Get stepDetails
     * @return stepDetails
     */
    public RunStepDeltaObjectDeltaStepDetails getStepDetails() {
        return stepDetails;
    }

    public void setStepDetails(RunStepDeltaObjectDeltaStepDetails stepDetails) {
        this.stepDetails = stepDetails;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

