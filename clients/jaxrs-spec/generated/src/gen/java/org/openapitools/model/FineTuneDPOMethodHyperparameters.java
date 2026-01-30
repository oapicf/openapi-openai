package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FineTuneDPOMethodHyperparametersBatchSize;
import org.openapitools.model.FineTuneDPOMethodHyperparametersBeta;
import org.openapitools.model.FineTuneDPOMethodHyperparametersLearningRateMultiplier;
import org.openapitools.model.FineTuneDPOMethodHyperparametersNEpochs;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The hyperparameters used for the fine-tuning job.
 **/
@ApiModel(description = "The hyperparameters used for the fine-tuning job.")
@JsonTypeName("FineTuneDPOMethod_hyperparameters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuneDPOMethodHyperparameters   {
  private FineTuneDPOMethodHyperparametersBeta beta = auto;
  private FineTuneDPOMethodHyperparametersBatchSize batchSize = auto;
  private FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier = auto;
  private FineTuneDPOMethodHyperparametersNEpochs nEpochs = auto;

  public FineTuneDPOMethodHyperparameters() {
  }

  /**
   **/
  public FineTuneDPOMethodHyperparameters beta(FineTuneDPOMethodHyperparametersBeta beta) {
    this.beta = beta;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("beta")
  @Valid public FineTuneDPOMethodHyperparametersBeta getBeta() {
    return beta;
  }

  @JsonProperty("beta")
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
  @Valid public FineTuneDPOMethodHyperparametersBatchSize getBatchSize() {
    return batchSize;
  }

  @JsonProperty("batch_size")
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
  @Valid public FineTuneDPOMethodHyperparametersLearningRateMultiplier getLearningRateMultiplier() {
    return learningRateMultiplier;
  }

  @JsonProperty("learning_rate_multiplier")
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
  @Valid public FineTuneDPOMethodHyperparametersNEpochs getnEpochs() {
    return nEpochs;
  }

  @JsonProperty("n_epochs")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

