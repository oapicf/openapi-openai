package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.CreateFineTuningJobRequestHyperparametersBatchSize;
import org.openapitools.model.CreateFineTuningJobRequestHyperparametersLearningRateMultiplier;
import org.openapitools.model.CreateFineTuningJobRequestHyperparametersNEpochs;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The hyperparameters used for the fine-tuning job.
 */
@ApiModel(description="The hyperparameters used for the fine-tuning job.")

public class CreateFineTuningJobRequestHyperparameters  {
  
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
  public CreateFineTuningJobRequestHyperparameters batchSize(CreateFineTuningJobRequestHyperparametersBatchSize batchSize) {
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
  public CreateFineTuningJobRequestHyperparameters learningRateMultiplier(CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier) {
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
  public CreateFineTuningJobRequestHyperparameters nEpochs(CreateFineTuningJobRequestHyperparametersNEpochs nEpochs) {
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
    CreateFineTuningJobRequestHyperparameters createFineTuningJobRequestHyperparameters = (CreateFineTuningJobRequestHyperparameters) o;
    return Objects.equals(this.batchSize, createFineTuningJobRequestHyperparameters.batchSize) &&
        Objects.equals(this.learningRateMultiplier, createFineTuningJobRequestHyperparameters.learningRateMultiplier) &&
        Objects.equals(this.nEpochs, createFineTuningJobRequestHyperparameters.nEpochs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchSize, learningRateMultiplier, nEpochs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFineTuningJobRequestHyperparameters {\n");
    
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

