package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Metrics at the step number during the fine-tuning job.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T10:45:28.938980301Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuningJobCheckpointMetrics   {
  
  private BigDecimal step;
  private BigDecimal trainLoss;
  private BigDecimal trainMeanTokenAccuracy;
  private BigDecimal validLoss;
  private BigDecimal validMeanTokenAccuracy;
  private BigDecimal fullValidLoss;
  private BigDecimal fullValidMeanTokenAccuracy;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("step")
  @Valid
  public BigDecimal getStep() {
    return step;
  }
  public void setStep(BigDecimal step) {
    this.step = step;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("train_loss")
  @Valid
  public BigDecimal getTrainLoss() {
    return trainLoss;
  }
  public void setTrainLoss(BigDecimal trainLoss) {
    this.trainLoss = trainLoss;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("train_mean_token_accuracy")
  @Valid
  public BigDecimal getTrainMeanTokenAccuracy() {
    return trainMeanTokenAccuracy;
  }
  public void setTrainMeanTokenAccuracy(BigDecimal trainMeanTokenAccuracy) {
    this.trainMeanTokenAccuracy = trainMeanTokenAccuracy;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid_loss")
  @Valid
  public BigDecimal getValidLoss() {
    return validLoss;
  }
  public void setValidLoss(BigDecimal validLoss) {
    this.validLoss = validLoss;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid_mean_token_accuracy")
  @Valid
  public BigDecimal getValidMeanTokenAccuracy() {
    return validMeanTokenAccuracy;
  }
  public void setValidMeanTokenAccuracy(BigDecimal validMeanTokenAccuracy) {
    this.validMeanTokenAccuracy = validMeanTokenAccuracy;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("full_valid_loss")
  @Valid
  public BigDecimal getFullValidLoss() {
    return fullValidLoss;
  }
  public void setFullValidLoss(BigDecimal fullValidLoss) {
    this.fullValidLoss = fullValidLoss;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("full_valid_mean_token_accuracy")
  @Valid
  public BigDecimal getFullValidMeanTokenAccuracy() {
    return fullValidMeanTokenAccuracy;
  }
  public void setFullValidMeanTokenAccuracy(BigDecimal fullValidMeanTokenAccuracy) {
    this.fullValidMeanTokenAccuracy = fullValidMeanTokenAccuracy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics = (FineTuningJobCheckpointMetrics) o;
    return Objects.equals(this.step, fineTuningJobCheckpointMetrics.step) &&
        Objects.equals(this.trainLoss, fineTuningJobCheckpointMetrics.trainLoss) &&
        Objects.equals(this.trainMeanTokenAccuracy, fineTuningJobCheckpointMetrics.trainMeanTokenAccuracy) &&
        Objects.equals(this.validLoss, fineTuningJobCheckpointMetrics.validLoss) &&
        Objects.equals(this.validMeanTokenAccuracy, fineTuningJobCheckpointMetrics.validMeanTokenAccuracy) &&
        Objects.equals(this.fullValidLoss, fineTuningJobCheckpointMetrics.fullValidLoss) &&
        Objects.equals(this.fullValidMeanTokenAccuracy, fineTuningJobCheckpointMetrics.fullValidMeanTokenAccuracy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(step, trainLoss, trainMeanTokenAccuracy, validLoss, validMeanTokenAccuracy, fullValidLoss, fullValidMeanTokenAccuracy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuningJobCheckpointMetrics {\n");
    
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    trainLoss: ").append(toIndentedString(trainLoss)).append("\n");
    sb.append("    trainMeanTokenAccuracy: ").append(toIndentedString(trainMeanTokenAccuracy)).append("\n");
    sb.append("    validLoss: ").append(toIndentedString(validLoss)).append("\n");
    sb.append("    validMeanTokenAccuracy: ").append(toIndentedString(validMeanTokenAccuracy)).append("\n");
    sb.append("    fullValidLoss: ").append(toIndentedString(fullValidLoss)).append("\n");
    sb.append("    fullValidMeanTokenAccuracy: ").append(toIndentedString(fullValidMeanTokenAccuracy)).append("\n");
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

