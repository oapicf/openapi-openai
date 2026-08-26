package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.CreateFineTuningJobRequestHyperparametersBatchSize;
import org.openapitools.model.CreateFineTuningJobRequestHyperparametersLearningRateMultiplier;
import org.openapitools.model.CreateFineTuningJobRequestHyperparametersNEpochs;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The hyperparameters used for the fine-tuning job. This value will only be returned when running &#x60;supervised&#x60; jobs.
 */

@Schema(name = "FineTuningJob_hyperparameters", description = "The hyperparameters used for the fine-tuning job. This value will only be returned when running `supervised` jobs.")
@JsonTypeName("FineTuningJob_hyperparameters")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T05:22:24.124939009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class FineTuningJobHyperparameters {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CreateFineTuningJobRequestHyperparametersBatchSize batchSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CreateFineTuningJobRequestHyperparametersNEpochs nEpochs;

  public FineTuningJobHyperparameters batchSize(@Nullable CreateFineTuningJobRequestHyperparametersBatchSize batchSize) {
    this.batchSize = batchSize;
    return this;
  }

  /**
   * Get batchSize
   * @return batchSize
   */
  @Valid 
  @Schema(name = "batch_size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batch_size")
  public @Nullable CreateFineTuningJobRequestHyperparametersBatchSize getBatchSize() {
    return batchSize;
  }

  @JsonProperty("batch_size")
  public void setBatchSize(@Nullable CreateFineTuningJobRequestHyperparametersBatchSize batchSize) {
    this.batchSize = batchSize;
  }

  public FineTuningJobHyperparameters learningRateMultiplier(@Nullable CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
    return this;
  }

  /**
   * Get learningRateMultiplier
   * @return learningRateMultiplier
   */
  @Valid 
  @Schema(name = "learning_rate_multiplier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("learning_rate_multiplier")
  public @Nullable CreateFineTuningJobRequestHyperparametersLearningRateMultiplier getLearningRateMultiplier() {
    return learningRateMultiplier;
  }

  @JsonProperty("learning_rate_multiplier")
  public void setLearningRateMultiplier(@Nullable CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
  }

  public FineTuningJobHyperparameters nEpochs(@Nullable CreateFineTuningJobRequestHyperparametersNEpochs nEpochs) {
    this.nEpochs = nEpochs;
    return this;
  }

  /**
   * Get nEpochs
   * @return nEpochs
   */
  @Valid 
  @Schema(name = "n_epochs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("n_epochs")
  public @Nullable CreateFineTuningJobRequestHyperparametersNEpochs getnEpochs() {
    return nEpochs;
  }

  @JsonProperty("n_epochs")
  public void setnEpochs(@Nullable CreateFineTuningJobRequestHyperparametersNEpochs nEpochs) {
    this.nEpochs = nEpochs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTuningJobHyperparameters fineTuningJobHyperparameters = (FineTuningJobHyperparameters) o;
    return Objects.equals(this.batchSize, fineTuningJobHyperparameters.batchSize) &&
        Objects.equals(this.learningRateMultiplier, fineTuningJobHyperparameters.learningRateMultiplier) &&
        Objects.equals(this.nEpochs, fineTuningJobHyperparameters.nEpochs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchSize, learningRateMultiplier, nEpochs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuningJobHyperparameters {\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    learningRateMultiplier: ").append(toIndentedString(learningRateMultiplier)).append("\n");
    sb.append("    nEpochs: ").append(toIndentedString(nEpochs)).append("\n");
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

