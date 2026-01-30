package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.FineTuneSupervisedMethodHyperparameters;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Configuration for the supervised fine-tuning method.
 */

@Schema(name = "FineTuneSupervisedMethod", description = "Configuration for the supervised fine-tuning method.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuneSupervisedMethod {

  private @Nullable FineTuneSupervisedMethodHyperparameters hyperparameters;

  public FineTuneSupervisedMethod hyperparameters(@Nullable FineTuneSupervisedMethodHyperparameters hyperparameters) {
    this.hyperparameters = hyperparameters;
    return this;
  }

  /**
   * Get hyperparameters
   * @return hyperparameters
   */
  @Valid 
  @Schema(name = "hyperparameters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hyperparameters")
  public @Nullable FineTuneSupervisedMethodHyperparameters getHyperparameters() {
    return hyperparameters;
  }

  public void setHyperparameters(@Nullable FineTuneSupervisedMethodHyperparameters hyperparameters) {
    this.hyperparameters = hyperparameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTuneSupervisedMethod fineTuneSupervisedMethod = (FineTuneSupervisedMethod) o;
    return Objects.equals(this.hyperparameters, fineTuneSupervisedMethod.hyperparameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hyperparameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuneSupervisedMethod {\n");
    sb.append("    hyperparameters: ").append(toIndentedString(hyperparameters)).append("\n");
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

