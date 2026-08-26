package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.FineTuneDPOMethodHyperparametersBatchSize;
import org.openapitools.model.FineTuneDPOMethodHyperparametersLearningRateMultiplier;
import org.openapitools.model.FineTuneDPOMethodHyperparametersNEpochs;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The hyperparameters used for the fine-tuning job.
 */

@Schema(name = "FineTuneSupervisedMethod_hyperparameters", description = "The hyperparameters used for the fine-tuning job.")
@JsonTypeName("FineTuneSupervisedMethod_hyperparameters")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T05:22:24.124939009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class FineTuneSupervisedMethodHyperparameters {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable FineTuneDPOMethodHyperparametersBatchSize batchSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable FineTuneDPOMethodHyperparametersNEpochs nEpochs;

  public FineTuneSupervisedMethodHyperparameters batchSize(@Nullable FineTuneDPOMethodHyperparametersBatchSize batchSize) {
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
  public @Nullable FineTuneDPOMethodHyperparametersBatchSize getBatchSize() {
    return batchSize;
  }

  @JsonProperty("batch_size")
  public void setBatchSize(@Nullable FineTuneDPOMethodHyperparametersBatchSize batchSize) {
    this.batchSize = batchSize;
  }

  public FineTuneSupervisedMethodHyperparameters learningRateMultiplier(@Nullable FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier) {
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
  public @Nullable FineTuneDPOMethodHyperparametersLearningRateMultiplier getLearningRateMultiplier() {
    return learningRateMultiplier;
  }

  @JsonProperty("learning_rate_multiplier")
  public void setLearningRateMultiplier(@Nullable FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
  }

  public FineTuneSupervisedMethodHyperparameters nEpochs(@Nullable FineTuneDPOMethodHyperparametersNEpochs nEpochs) {
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
  public @Nullable FineTuneDPOMethodHyperparametersNEpochs getnEpochs() {
    return nEpochs;
  }

  @JsonProperty("n_epochs")
  public void setnEpochs(@Nullable FineTuneDPOMethodHyperparametersNEpochs nEpochs) {
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
    FineTuneSupervisedMethodHyperparameters fineTuneSupervisedMethodHyperparameters = (FineTuneSupervisedMethodHyperparameters) o;
    return Objects.equals(this.batchSize, fineTuneSupervisedMethodHyperparameters.batchSize) &&
        Objects.equals(this.learningRateMultiplier, fineTuneSupervisedMethodHyperparameters.learningRateMultiplier) &&
        Objects.equals(this.nEpochs, fineTuneSupervisedMethodHyperparameters.nEpochs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchSize, learningRateMultiplier, nEpochs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuneSupervisedMethodHyperparameters {\n");
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

