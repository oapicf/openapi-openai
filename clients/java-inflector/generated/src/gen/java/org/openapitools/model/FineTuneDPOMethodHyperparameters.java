package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FineTuneDPOMethodHyperparametersBatchSize;
import org.openapitools.model.FineTuneDPOMethodHyperparametersBeta;
import org.openapitools.model.FineTuneDPOMethodHyperparametersLearningRateMultiplier;
import org.openapitools.model.FineTuneDPOMethodHyperparametersNEpochs;



/**
 * The hyperparameters used for the fine-tuning job.
 **/

@ApiModel(description = "The hyperparameters used for the fine-tuning job.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuneDPOMethodHyperparameters   {
  @JsonProperty("beta")
  private FineTuneDPOMethodHyperparametersBeta beta = auto;

  @JsonProperty("batch_size")
  private FineTuneDPOMethodHyperparametersBatchSize batchSize = auto;

  @JsonProperty("learning_rate_multiplier")
  private FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier = auto;

  @JsonProperty("n_epochs")
  private FineTuneDPOMethodHyperparametersNEpochs nEpochs = auto;

  /**
   **/
  public FineTuneDPOMethodHyperparameters beta(FineTuneDPOMethodHyperparametersBeta beta) {
    this.beta = beta;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("beta")
  public FineTuneDPOMethodHyperparametersBeta getBeta() {
    return beta;
  }
  public void setBeta(FineTuneDPOMethodHyperparametersBeta beta) {
    this.beta = beta;
  }

  /**
   **/
  public FineTuneDPOMethodHyperparameters batchSize(FineTuneDPOMethodHyperparametersBatchSize batchSize) {
    this.batchSize = batchSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("batch_size")
  public FineTuneDPOMethodHyperparametersBatchSize getBatchSize() {
    return batchSize;
  }
  public void setBatchSize(FineTuneDPOMethodHyperparametersBatchSize batchSize) {
    this.batchSize = batchSize;
  }

  /**
   **/
  public FineTuneDPOMethodHyperparameters learningRateMultiplier(FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("learning_rate_multiplier")
  public FineTuneDPOMethodHyperparametersLearningRateMultiplier getLearningRateMultiplier() {
    return learningRateMultiplier;
  }
  public void setLearningRateMultiplier(FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
  }

  /**
   **/
  public FineTuneDPOMethodHyperparameters nEpochs(FineTuneDPOMethodHyperparametersNEpochs nEpochs) {
    this.nEpochs = nEpochs;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

