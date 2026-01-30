package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CreateFineTuningJobRequestHyperparametersBatchSize;
import org.openapitools.model.CreateFineTuningJobRequestHyperparametersLearningRateMultiplier;
import org.openapitools.model.CreateFineTuningJobRequestHyperparametersNEpochs;

/**
 * The hyperparameters used for the fine-tuning job. This value will only be returned when running &#x60;supervised&#x60; jobs.
 */
@ApiModel(description = "The hyperparameters used for the fine-tuning job. This value will only be returned when running `supervised` jobs.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuningJobHyperparameters   {
  @JsonProperty("batch_size")
  private CreateFineTuningJobRequestHyperparametersBatchSize batchSize = auto;

  @JsonProperty("learning_rate_multiplier")
  private CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier = auto;

  @JsonProperty("n_epochs")
  private CreateFineTuningJobRequestHyperparametersNEpochs nEpochs = auto;

  public FineTuningJobHyperparameters batchSize(CreateFineTuningJobRequestHyperparametersBatchSize batchSize) {
    this.batchSize = batchSize;
    return this;
  }

   /**
   * Get batchSize
   * @return batchSize
  **/
  @ApiModelProperty(value = "")
  public CreateFineTuningJobRequestHyperparametersBatchSize getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(CreateFineTuningJobRequestHyperparametersBatchSize batchSize) {
    this.batchSize = batchSize;
  }

  public FineTuningJobHyperparameters learningRateMultiplier(CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
    return this;
  }

   /**
   * Get learningRateMultiplier
   * @return learningRateMultiplier
  **/
  @ApiModelProperty(value = "")
  public CreateFineTuningJobRequestHyperparametersLearningRateMultiplier getLearningRateMultiplier() {
    return learningRateMultiplier;
  }

  public void setLearningRateMultiplier(CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
  }

  public FineTuningJobHyperparameters nEpochs(CreateFineTuningJobRequestHyperparametersNEpochs nEpochs) {
    this.nEpochs = nEpochs;
    return this;
  }

   /**
   * Get nEpochs
   * @return nEpochs
  **/
  @ApiModelProperty(value = "")
  public CreateFineTuningJobRequestHyperparametersNEpochs getnEpochs() {
    return nEpochs;
  }

  public void setnEpochs(CreateFineTuningJobRequestHyperparametersNEpochs nEpochs) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

