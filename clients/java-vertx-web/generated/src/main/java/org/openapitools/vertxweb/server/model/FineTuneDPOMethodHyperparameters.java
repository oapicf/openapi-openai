package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.FineTuneDPOMethodHyperparametersBatchSize;
import org.openapitools.vertxweb.server.model.FineTuneDPOMethodHyperparametersBeta;
import org.openapitools.vertxweb.server.model.FineTuneDPOMethodHyperparametersLearningRateMultiplier;
import org.openapitools.vertxweb.server.model.FineTuneDPOMethodHyperparametersNEpochs;

/**
 * The hyperparameters used for the fine-tuning job.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FineTuneDPOMethodHyperparameters   {
  
  private FineTuneDPOMethodHyperparametersBeta beta = auto;
  private FineTuneDPOMethodHyperparametersBatchSize batchSize = auto;
  private FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier = auto;
  private FineTuneDPOMethodHyperparametersNEpochs nEpochs = auto;

  public FineTuneDPOMethodHyperparameters () {

  }

  public FineTuneDPOMethodHyperparameters (FineTuneDPOMethodHyperparametersBeta beta, FineTuneDPOMethodHyperparametersBatchSize batchSize, FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier, FineTuneDPOMethodHyperparametersNEpochs nEpochs) {
    this.beta = beta;
    this.batchSize = batchSize;
    this.learningRateMultiplier = learningRateMultiplier;
    this.nEpochs = nEpochs;
  }

    
  @JsonProperty("beta")
  public FineTuneDPOMethodHyperparametersBeta getBeta() {
    return beta;
  }
  public void setBeta(FineTuneDPOMethodHyperparametersBeta beta) {
    this.beta = beta;
  }

    
  @JsonProperty("batch_size")
  public FineTuneDPOMethodHyperparametersBatchSize getBatchSize() {
    return batchSize;
  }
  public void setBatchSize(FineTuneDPOMethodHyperparametersBatchSize batchSize) {
    this.batchSize = batchSize;
  }

    
  @JsonProperty("learning_rate_multiplier")
  public FineTuneDPOMethodHyperparametersLearningRateMultiplier getLearningRateMultiplier() {
    return learningRateMultiplier;
  }
  public void setLearningRateMultiplier(FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
  }

    
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
    FineTuneDPOMethodHyperparameters fineTuneDPOMethodHyperparameters = (FineTuneDPOMethodHyperparameters) o;
    return Objects.equals(beta, fineTuneDPOMethodHyperparameters.beta) &&
        Objects.equals(batchSize, fineTuneDPOMethodHyperparameters.batchSize) &&
        Objects.equals(learningRateMultiplier, fineTuneDPOMethodHyperparameters.learningRateMultiplier) &&
        Objects.equals(nEpochs, fineTuneDPOMethodHyperparameters.nEpochs);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
