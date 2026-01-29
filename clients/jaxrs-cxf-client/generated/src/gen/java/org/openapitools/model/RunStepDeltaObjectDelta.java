package org.openapitools.model;

import org.openapitools.model.RunStepDeltaObjectDeltaStepDetails;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The delta containing the fields that have changed on the run step.
 */
@ApiModel(description="The delta containing the fields that have changed on the run step.")

public class RunStepDeltaObjectDelta  {
  
  @ApiModelProperty(value = "")

  private RunStepDeltaObjectDeltaStepDetails stepDetails;
 /**
   * Get stepDetails
   * @return stepDetails
  **/
  @JsonProperty("step_details")
  public RunStepDeltaObjectDeltaStepDetails getStepDetails() {
    return stepDetails;
  }

  public void setStepDetails(RunStepDeltaObjectDeltaStepDetails stepDetails) {
    this.stepDetails = stepDetails;
  }

  public RunStepDeltaObjectDelta stepDetails(RunStepDeltaObjectDeltaStepDetails stepDetails) {
    this.stepDetails = stepDetails;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

