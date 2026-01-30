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
 * The hyperparameters used for the fine-tuning job. This value is now deprecated in favor of &#x60;method&#x60;, and should be passed in under the &#x60;method&#x60; parameter. 
 */
@ApiModel(description = "The hyperparameters used for the fine-tuning job. This value is now deprecated in favor of `method`, and should be passed in under the `method` parameter. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateFineTuningJobRequestHyperparameters   {
  @JsonProperty("batch_size")
  private CreateFineTuningJobRequestHyperparametersBatchSize batchSize = auto;

  @JsonProperty("learning_rate_multiplier")
  private CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier = auto;

  @JsonProperty("n_epochs")
  private CreateFineTuningJobRequestHyperparametersNEpochs nEpochs = auto;

  public CreateFineTuningJobRequestHyperparameters batchSize(CreateFineTuningJobRequestHyperparametersBatchSize batchSize) {
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

  public CreateFineTuningJobRequestHyperparameters learningRateMultiplier(CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier) {
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

  public CreateFineTuningJobRequestHyperparameters nEpochs(CreateFineTuningJobRequestHyperparametersNEpochs nEpochs) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

