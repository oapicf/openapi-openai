package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.FineTuneDPOMethodHyperparametersBatchSize;
import org.openapitools.model.FineTuneDPOMethodHyperparametersLearningRateMultiplier;
import org.openapitools.model.FineTuneDPOMethodHyperparametersNEpochs;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The hyperparameters used for the fine-tuning job.
 */
@ApiModel(description="The hyperparameters used for the fine-tuning job.")

public class FineTuneSupervisedMethodHyperparameters  {
  
  @ApiModelProperty(value = "")
  @Valid
  private FineTuneDPOMethodHyperparametersBatchSize batchSize = auto;

  @ApiModelProperty(value = "")
  @Valid
  private FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier = auto;

  @ApiModelProperty(value = "")
  @Valid
  private FineTuneDPOMethodHyperparametersNEpochs nEpochs = auto;
 /**
  * Get batchSize
  * @return batchSize
  */
  @JsonProperty("batch_size")
  public FineTuneDPOMethodHyperparametersBatchSize getBatchSize() {
    return batchSize;
  }

  /**
   * Sets the <code>batchSize</code> property.
   */
 public void setBatchSize(FineTuneDPOMethodHyperparametersBatchSize batchSize) {
    this.batchSize = batchSize;
  }

  /**
   * Sets the <code>batchSize</code> property.
   */
  public FineTuneSupervisedMethodHyperparameters batchSize(FineTuneDPOMethodHyperparametersBatchSize batchSize) {
    this.batchSize = batchSize;
    return this;
  }

 /**
  * Get learningRateMultiplier
  * @return learningRateMultiplier
  */
  @JsonProperty("learning_rate_multiplier")
  public FineTuneDPOMethodHyperparametersLearningRateMultiplier getLearningRateMultiplier() {
    return learningRateMultiplier;
  }

  /**
   * Sets the <code>learningRateMultiplier</code> property.
   */
 public void setLearningRateMultiplier(FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
  }

  /**
   * Sets the <code>learningRateMultiplier</code> property.
   */
  public FineTuneSupervisedMethodHyperparameters learningRateMultiplier(FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
    return this;
  }

 /**
  * Get nEpochs
  * @return nEpochs
  */
  @JsonProperty("n_epochs")
  public FineTuneDPOMethodHyperparametersNEpochs getnEpochs() {
    return nEpochs;
  }

  /**
   * Sets the <code>nEpochs</code> property.
   */
 public void setnEpochs(FineTuneDPOMethodHyperparametersNEpochs nEpochs) {
    this.nEpochs = nEpochs;
  }

  /**
   * Sets the <code>nEpochs</code> property.
   */
  public FineTuneSupervisedMethodHyperparameters nEpochs(FineTuneDPOMethodHyperparametersNEpochs nEpochs) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

