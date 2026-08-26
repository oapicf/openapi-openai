package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.FineTuneDPOMethodHyperparametersBatchSize;
import org.openapitools.model.FineTuneDPOMethodHyperparametersBeta;
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

@Schema(name = "FineTuneDPOMethod_hyperparameters", description = "The hyperparameters used for the fine-tuning job.")
@JsonTypeName("FineTuneDPOMethod_hyperparameters")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T05:22:24.124939009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class FineTuneDPOMethodHyperparameters {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable FineTuneDPOMethodHyperparametersBeta beta;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable FineTuneDPOMethodHyperparametersBatchSize batchSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable FineTuneDPOMethodHyperparametersNEpochs nEpochs;

  public FineTuneDPOMethodHyperparameters beta(@Nullable FineTuneDPOMethodHyperparametersBeta beta) {
    this.beta = beta;
    return this;
  }

  /**
   * Get beta
   * @return beta
   */
  @Valid 
  @Schema(name = "beta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("beta")
  public @Nullable FineTuneDPOMethodHyperparametersBeta getBeta() {
    return beta;
  }

  @JsonProperty("beta")
  public void setBeta(@Nullable FineTuneDPOMethodHyperparametersBeta beta) {
    this.beta = beta;
  }

  public FineTuneDPOMethodHyperparameters batchSize(@Nullable FineTuneDPOMethodHyperparametersBatchSize batchSize) {
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

  public FineTuneDPOMethodHyperparameters learningRateMultiplier(@Nullable FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier) {
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

  public FineTuneDPOMethodHyperparameters nEpochs(@Nullable FineTuneDPOMethodHyperparametersNEpochs nEpochs) {
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
    FineTuneDPOMethodHyperparameters fineTuneDPOMethodHyperparameters = (FineTuneDPOMethodHyperparameters) o;
    return Objects.equals(this.beta, fineTuneDPOMethodHyperparameters.beta) &&
        Objects.equals(this.batchSize, fineTuneDPOMethodHyperparameters.batchSize) &&
        Objects.equals(this.learningRateMultiplier, fineTuneDPOMethodHyperparameters.learningRateMultiplier) &&
        Objects.equals(this.nEpochs, fineTuneDPOMethodHyperparameters.nEpochs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beta, batchSize, learningRateMultiplier, nEpochs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuneDPOMethodHyperparameters {\n");
    sb.append("    beta: ").append(toIndentedString(beta)).append("\n");
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

