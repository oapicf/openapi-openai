package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.CreateFineTuningJobRequestHyperparametersBatchSize;
import org.openapitools.server.api.model.CreateFineTuningJobRequestHyperparametersLearningRateMultiplier;
import org.openapitools.server.api.model.CreateFineTuningJobRequestHyperparametersNEpochs;

/**
 * The hyperparameters used for the fine-tuning job.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateFineTuningJobRequestHyperparameters   {
  
  private CreateFineTuningJobRequestHyperparametersBatchSize batchSize = auto;
  private CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier = auto;
  private CreateFineTuningJobRequestHyperparametersNEpochs nEpochs = auto;

  public CreateFineTuningJobRequestHyperparameters () {

  }

  public CreateFineTuningJobRequestHyperparameters (CreateFineTuningJobRequestHyperparametersBatchSize batchSize, CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier, CreateFineTuningJobRequestHyperparametersNEpochs nEpochs) {
    this.batchSize = batchSize;
    this.learningRateMultiplier = learningRateMultiplier;
    this.nEpochs = nEpochs;
  }

    
  @JsonProperty("batch_size")
  public CreateFineTuningJobRequestHyperparametersBatchSize getBatchSize() {
    return batchSize;
  }
  public void setBatchSize(CreateFineTuningJobRequestHyperparametersBatchSize batchSize) {
    this.batchSize = batchSize;
  }

    
  @JsonProperty("learning_rate_multiplier")
  public CreateFineTuningJobRequestHyperparametersLearningRateMultiplier getLearningRateMultiplier() {
    return learningRateMultiplier;
  }
  public void setLearningRateMultiplier(CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
  }

    
  @JsonProperty("n_epochs")
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
    return Objects.equals(batchSize, createFineTuningJobRequestHyperparameters.batchSize) &&
        Objects.equals(learningRateMultiplier, createFineTuningJobRequestHyperparameters.learningRateMultiplier) &&
        Objects.equals(nEpochs, createFineTuningJobRequestHyperparameters.nEpochs);
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
