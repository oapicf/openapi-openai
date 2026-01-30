package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.FineTuneDPOMethodHyperparametersBatchSize;
import org.openapitools.model.FineTuneDPOMethodHyperparametersLearningRateMultiplier;
import org.openapitools.model.FineTuneDPOMethodHyperparametersNEpochs;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The hyperparameters used for the fine-tuning job.
 */

@Schema(name = "FineTuneSupervisedMethod_hyperparameters", description = "The hyperparameters used for the fine-tuning job.")
@JsonTypeName("FineTuneSupervisedMethod_hyperparameters")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuneSupervisedMethodHyperparameters {

  private FineTuneDPOMethodHyperparametersBatchSize batchSize = auto;

  private FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier = auto;

  private FineTuneDPOMethodHyperparametersNEpochs nEpochs = auto;

  public FineTuneSupervisedMethodHyperparameters batchSize(FineTuneDPOMethodHyperparametersBatchSize batchSize) {
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
  public FineTuneDPOMethodHyperparametersBatchSize getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(FineTuneDPOMethodHyperparametersBatchSize batchSize) {
    this.batchSize = batchSize;
  }

  public FineTuneSupervisedMethodHyperparameters learningRateMultiplier(FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier) {
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
  public FineTuneDPOMethodHyperparametersLearningRateMultiplier getLearningRateMultiplier() {
    return learningRateMultiplier;
  }

  public void setLearningRateMultiplier(FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
  }

  public FineTuneSupervisedMethodHyperparameters nEpochs(FineTuneDPOMethodHyperparametersNEpochs nEpochs) {
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
  public FineTuneDPOMethodHyperparametersNEpochs getnEpochs() {
    return nEpochs;
  }

  public void setnEpochs(FineTuneDPOMethodHyperparametersNEpochs nEpochs) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

