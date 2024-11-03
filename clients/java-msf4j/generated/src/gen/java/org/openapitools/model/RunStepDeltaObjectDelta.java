package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepDeltaObjectDeltaStepDetails;

/**
 * The delta containing the fields that have changed on the run step.
 */
@ApiModel(description = "The delta containing the fields that have changed on the run step.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-03T11:07:10.127704480Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RunStepDeltaObjectDelta   {
  @JsonProperty("step_details")
  private RunStepDeltaObjectDeltaStepDetails stepDetails;

  public RunStepDeltaObjectDelta stepDetails(RunStepDeltaObjectDeltaStepDetails stepDetails) {
    this.stepDetails = stepDetails;
    return this;
  }

   /**
   * Get stepDetails
   * @return stepDetails
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

