/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The hyperparameters used for the fine-tuning job.
 */
@ApiModel(description = "The hyperparameters used for the fine-tuning job.")
@JsonPropertyOrder({
  CreateFineTuningJobRequestHyperparameters.JSON_PROPERTY_BATCH_SIZE,
  CreateFineTuningJobRequestHyperparameters.JSON_PROPERTY_LEARNING_RATE_MULTIPLIER,
  CreateFineTuningJobRequestHyperparameters.JSON_PROPERTY_N_EPOCHS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-04-14T13:41:38.036864137Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateFineTuningJobRequestHyperparameters   {
  public static final String JSON_PROPERTY_BATCH_SIZE = "batch_size";
  @JsonProperty(JSON_PROPERTY_BATCH_SIZE)
  private CreateFineTuningJobRequestHyperparametersBatchSize batchSize = auto;

  public static final String JSON_PROPERTY_LEARNING_RATE_MULTIPLIER = "learning_rate_multiplier";
  @JsonProperty(JSON_PROPERTY_LEARNING_RATE_MULTIPLIER)
  private CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier = auto;

  public static final String JSON_PROPERTY_N_EPOCHS = "n_epochs";
  @JsonProperty(JSON_PROPERTY_N_EPOCHS)
  private CreateFineTuningJobRequestHyperparametersNEpochs nEpochs = auto;

  public CreateFineTuningJobRequestHyperparameters batchSize(CreateFineTuningJobRequestHyperparametersBatchSize batchSize) {
    this.batchSize = batchSize;
    return this;
  }

  /**
   * Get batchSize
   * @return batchSize
   **/
  @JsonProperty(value = "batch_size")
  @ApiModelProperty(value = "")
  @Valid 
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
  @JsonProperty(value = "learning_rate_multiplier")
  @ApiModelProperty(value = "")
  @Valid 
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
  @JsonProperty(value = "n_epochs")
  @ApiModelProperty(value = "")
  @Valid 
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
