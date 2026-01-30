package apimodels;

import apimodels.FineTuneDPOMethodHyperparametersBatchSize;
import apimodels.FineTuneDPOMethodHyperparametersBeta;
import apimodels.FineTuneDPOMethodHyperparametersLearningRateMultiplier;
import apimodels.FineTuneDPOMethodHyperparametersNEpochs;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The hyperparameters used for the fine-tuning job.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FineTuneDPOMethodHyperparameters   {
  @JsonProperty("beta")
  @Valid

  private FineTuneDPOMethodHyperparametersBeta beta = auto;

  @JsonProperty("batch_size")
  @Valid

  private FineTuneDPOMethodHyperparametersBatchSize batchSize = auto;

  @JsonProperty("learning_rate_multiplier")
  @Valid

  private FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier = auto;

  @JsonProperty("n_epochs")
  @Valid

  private FineTuneDPOMethodHyperparametersNEpochs nEpochs = auto;

  public FineTuneDPOMethodHyperparameters beta(FineTuneDPOMethodHyperparametersBeta beta) {
    this.beta = beta;
    return this;
  }

   /**
   * Get beta
   * @return beta
  **/
  public FineTuneDPOMethodHyperparametersBeta getBeta() {
    return beta;
  }

  public void setBeta(FineTuneDPOMethodHyperparametersBeta beta) {
    this.beta = beta;
  }

  public FineTuneDPOMethodHyperparameters batchSize(FineTuneDPOMethodHyperparametersBatchSize batchSize) {
    this.batchSize = batchSize;
    return this;
  }

   /**
   * Get batchSize
   * @return batchSize
  **/
  public FineTuneDPOMethodHyperparametersBatchSize getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(FineTuneDPOMethodHyperparametersBatchSize batchSize) {
    this.batchSize = batchSize;
  }

  public FineTuneDPOMethodHyperparameters learningRateMultiplier(FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
    return this;
  }

   /**
   * Get learningRateMultiplier
   * @return learningRateMultiplier
  **/
  public FineTuneDPOMethodHyperparametersLearningRateMultiplier getLearningRateMultiplier() {
    return learningRateMultiplier;
  }

  public void setLearningRateMultiplier(FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
  }

  public FineTuneDPOMethodHyperparameters nEpochs(FineTuneDPOMethodHyperparametersNEpochs nEpochs) {
    this.nEpochs = nEpochs;
    return this;
  }

   /**
   * Get nEpochs
   * @return nEpochs
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

