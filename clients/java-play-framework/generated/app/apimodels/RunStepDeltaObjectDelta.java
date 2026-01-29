package apimodels;

import apimodels.RunStepDeltaObjectDeltaStepDetails;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The delta containing the fields that have changed on the run step.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T10:45:05.350526304Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RunStepDeltaObjectDelta   {
  @JsonProperty("step_details")
  @Valid

  private RunStepDeltaObjectDeltaStepDetails stepDetails;

  public RunStepDeltaObjectDelta stepDetails(RunStepDeltaObjectDeltaStepDetails stepDetails) {
    this.stepDetails = stepDetails;
    return this;
  }

   /**
   * Get stepDetails
   * @return stepDetails
  **/
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
    return Objects.equals(stepDetails, runStepDeltaObjectDelta.stepDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stepDetails);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

