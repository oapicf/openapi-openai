package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.RunStepDeltaObjectDeltaStepDetails;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The delta containing the fields that have changed on the run step.
 */

@Schema(name = "RunStepDeltaObject_delta", description = "The delta containing the fields that have changed on the run step.")
@JsonTypeName("RunStepDeltaObject_delta")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T05:22:24.124939009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class RunStepDeltaObjectDelta {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable RunStepDeltaObjectDeltaStepDetails stepDetails;

  public RunStepDeltaObjectDelta stepDetails(@Nullable RunStepDeltaObjectDeltaStepDetails stepDetails) {
    this.stepDetails = stepDetails;
    return this;
  }

  /**
   * Get stepDetails
   * @return stepDetails
   */
  @Valid 
  @Schema(name = "step_details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("step_details")
  public @Nullable RunStepDeltaObjectDeltaStepDetails getStepDetails() {
    return stepDetails;
  }

  @JsonProperty("step_details")
  public void setStepDetails(@Nullable RunStepDeltaObjectDeltaStepDetails stepDetails) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

