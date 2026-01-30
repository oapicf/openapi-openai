package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.CreateFineTuningJobRequestHyperparametersBatchSize;
import org.openapitools.model.CreateFineTuningJobRequestHyperparametersLearningRateMultiplier;
import org.openapitools.model.CreateFineTuningJobRequestHyperparametersNEpochs;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The hyperparameters used for the fine-tuning job. This value will only be returned when running `supervised` jobs.
 */
@ApiModel(description="The hyperparameters used for the fine-tuning job. This value will only be returned when running `supervised` jobs.")

public class FineTuningJobHyperparameters  {
  
  @ApiModelProperty(value = "")
  @Valid
  private CreateFineTuningJobRequestHyperparametersBatchSize batchSize = auto;

  @ApiModelProperty(value = "")
  @Valid
  private CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier = auto;

  @ApiModelProperty(value = "")
  @Valid
  private CreateFineTuningJobRequestHyperparametersNEpochs nEpochs = auto;
 /**
  * Get batchSize
  * @return batchSize
  */
  @JsonProperty("batch_size")
  public CreateFineTuningJobRequestHyperparametersBatchSize getBatchSize() {
    return batchSize;
  }

  /**
   * Sets the <code>batchSize</code> property.
   */
 public void setBatchSize(CreateFineTuningJobRequestHyperparametersBatchSize batchSize) {
    this.batchSize = batchSize;
  }

  /**
   * Sets the <code>batchSize</code> property.
   */
  public FineTuningJobHyperparameters batchSize(CreateFineTuningJobRequestHyperparametersBatchSize batchSize) {
    this.batchSize = batchSize;
    return this;
  }

 /**
  * Get learningRateMultiplier
  * @return learningRateMultiplier
  */
  @JsonProperty("learning_rate_multiplier")
  public CreateFineTuningJobRequestHyperparametersLearningRateMultiplier getLearningRateMultiplier() {
    return learningRateMultiplier;
  }

  /**
   * Sets the <code>learningRateMultiplier</code> property.
   */
 public void setLearningRateMultiplier(CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
  }

  /**
   * Sets the <code>learningRateMultiplier</code> property.
   */
  public FineTuningJobHyperparameters learningRateMultiplier(CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
    return this;
  }

 /**
  * Get nEpochs
  * @return nEpochs
  */
  @JsonProperty("n_epochs")
  public CreateFineTuningJobRequestHyperparametersNEpochs getnEpochs() {
    return nEpochs;
  }

  /**
   * Sets the <code>nEpochs</code> property.
   */
 public void setnEpochs(CreateFineTuningJobRequestHyperparametersNEpochs nEpochs) {
    this.nEpochs = nEpochs;
  }

  /**
   * Sets the <code>nEpochs</code> property.
   */
  public FineTuningJobHyperparameters nEpochs(CreateFineTuningJobRequestHyperparametersNEpochs nEpochs) {
    this.nEpochs = nEpochs;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

