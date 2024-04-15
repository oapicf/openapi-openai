/**
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

package org.openapitools.client.model;

import org.openapitools.client.model.RunStepDeltaObjectDeltaStepDetails;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The delta containing the fields that have changed on the run step.
 **/
@ApiModel(description = "The delta containing the fields that have changed on the run step.")
public class RunStepDeltaObjectDelta {
  
  @SerializedName("step_details")
  private RunStepDeltaObjectDeltaStepDetails stepDetails = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public RunStepDeltaObjectDeltaStepDetails getStepDetails() {
    return stepDetails;
  }
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
    return (this.stepDetails == null ? runStepDeltaObjectDelta.stepDetails == null : this.stepDetails.equals(runStepDeltaObjectDelta.stepDetails));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.stepDetails == null ? 0: this.stepDetails.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaObjectDelta {\n");
    
    sb.append("  stepDetails: ").append(stepDetails).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}