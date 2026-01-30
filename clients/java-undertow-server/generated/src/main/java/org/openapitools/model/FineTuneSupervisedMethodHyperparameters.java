/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FineTuneDPOMethodHyperparametersBatchSize;
import org.openapitools.model.FineTuneDPOMethodHyperparametersLearningRateMultiplier;
import org.openapitools.model.FineTuneDPOMethodHyperparametersNEpochs;



/**
 * The hyperparameters used for the fine-tuning job.
 */

@ApiModel(description = "The hyperparameters used for the fine-tuning job.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuneSupervisedMethodHyperparameters   {
  
  private FineTuneDPOMethodHyperparametersBatchSize batchSize = auto;
  private FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier = auto;
  private FineTuneDPOMethodHyperparametersNEpochs nEpochs = auto;

  /**
   */
  public FineTuneSupervisedMethodHyperparameters batchSize(FineTuneDPOMethodHyperparametersBatchSize batchSize) {
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
   */
  public FineTuneSupervisedMethodHyperparameters learningRateMultiplier(FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier) {
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
   */
  public FineTuneSupervisedMethodHyperparameters nEpochs(FineTuneDPOMethodHyperparametersNEpochs nEpochs) {
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
    FineTuneSupervisedMethodHyperparameters fineTuneSupervisedMethodHyperparameters = (FineTuneSupervisedMethodHyperparameters) o;
    return Objects.equals(batchSize, fineTuneSupervisedMethodHyperparameters.batchSize) &&
        Objects.equals(learningRateMultiplier, fineTuneSupervisedMethodHyperparameters.learningRateMultiplier) &&
        Objects.equals(nEpochs, fineTuneSupervisedMethodHyperparameters.nEpochs);
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

