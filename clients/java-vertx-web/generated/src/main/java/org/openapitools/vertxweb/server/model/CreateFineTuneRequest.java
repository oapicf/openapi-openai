package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CreateFineTuneRequestModel;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateFineTuneRequest   {
  
  private String trainingFile;
  private String validationFile;
  private CreateFineTuneRequestModel model = curie;
  private Integer nEpochs = 4;
  private Integer batchSize;
  private BigDecimal learningRateMultiplier;
  private BigDecimal promptLossWeight = new BigDecimal("0.01");
  private Boolean computeClassificationMetrics = false;
  private Integer classificationNClasses;
  private String classificationPositiveClass;
  private List<BigDecimal> classificationBetas;
  private String suffix;

  public CreateFineTuneRequest () {

  }

  public CreateFineTuneRequest (String trainingFile, String validationFile, CreateFineTuneRequestModel model, Integer nEpochs, Integer batchSize, BigDecimal learningRateMultiplier, BigDecimal promptLossWeight, Boolean computeClassificationMetrics, Integer classificationNClasses, String classificationPositiveClass, List<BigDecimal> classificationBetas, String suffix) {
    this.trainingFile = trainingFile;
    this.validationFile = validationFile;
    this.model = model;
    this.nEpochs = nEpochs;
    this.batchSize = batchSize;
    this.learningRateMultiplier = learningRateMultiplier;
    this.promptLossWeight = promptLossWeight;
    this.computeClassificationMetrics = computeClassificationMetrics;
    this.classificationNClasses = classificationNClasses;
    this.classificationPositiveClass = classificationPositiveClass;
    this.classificationBetas = classificationBetas;
    this.suffix = suffix;
  }

    
  @JsonProperty("training_file")
  public String getTrainingFile() {
    return trainingFile;
  }
  public void setTrainingFile(String trainingFile) {
    this.trainingFile = trainingFile;
  }

    
  @JsonProperty("validation_file")
  public String getValidationFile() {
    return validationFile;
  }
  public void setValidationFile(String validationFile) {
    this.validationFile = validationFile;
  }

    
  @JsonProperty("model")
  public CreateFineTuneRequestModel getModel() {
    return model;
  }
  public void setModel(CreateFineTuneRequestModel model) {
    this.model = model;
  }

    
  @JsonProperty("n_epochs")
  public Integer getnEpochs() {
    return nEpochs;
  }
  public void setnEpochs(Integer nEpochs) {
    this.nEpochs = nEpochs;
  }

    
  @JsonProperty("batch_size")
  public Integer getBatchSize() {
    return batchSize;
  }
  public void setBatchSize(Integer batchSize) {
    this.batchSize = batchSize;
  }

    
  @JsonProperty("learning_rate_multiplier")
  public BigDecimal getLearningRateMultiplier() {
    return learningRateMultiplier;
  }
  public void setLearningRateMultiplier(BigDecimal learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
  }

    
  @JsonProperty("prompt_loss_weight")
  public BigDecimal getPromptLossWeight() {
    return promptLossWeight;
  }
  public void setPromptLossWeight(BigDecimal promptLossWeight) {
    this.promptLossWeight = promptLossWeight;
  }

    
  @JsonProperty("compute_classification_metrics")
  public Boolean getComputeClassificationMetrics() {
    return computeClassificationMetrics;
  }
  public void setComputeClassificationMetrics(Boolean computeClassificationMetrics) {
    this.computeClassificationMetrics = computeClassificationMetrics;
  }

    
  @JsonProperty("classification_n_classes")
  public Integer getClassificationNClasses() {
    return classificationNClasses;
  }
  public void setClassificationNClasses(Integer classificationNClasses) {
    this.classificationNClasses = classificationNClasses;
  }

    
  @JsonProperty("classification_positive_class")
  public String getClassificationPositiveClass() {
    return classificationPositiveClass;
  }
  public void setClassificationPositiveClass(String classificationPositiveClass) {
    this.classificationPositiveClass = classificationPositiveClass;
  }

    
  @JsonProperty("classification_betas")
  public List<BigDecimal> getClassificationBetas() {
    return classificationBetas;
  }
  public void setClassificationBetas(List<BigDecimal> classificationBetas) {
    this.classificationBetas = classificationBetas;
  }

    
  @JsonProperty("suffix")
  public String getSuffix() {
    return suffix;
  }
  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFineTuneRequest createFineTuneRequest = (CreateFineTuneRequest) o;
    return Objects.equals(trainingFile, createFineTuneRequest.trainingFile) &&
        Objects.equals(validationFile, createFineTuneRequest.validationFile) &&
        Objects.equals(model, createFineTuneRequest.model) &&
        Objects.equals(nEpochs, createFineTuneRequest.nEpochs) &&
        Objects.equals(batchSize, createFineTuneRequest.batchSize) &&
        Objects.equals(learningRateMultiplier, createFineTuneRequest.learningRateMultiplier) &&
        Objects.equals(promptLossWeight, createFineTuneRequest.promptLossWeight) &&
        Objects.equals(computeClassificationMetrics, createFineTuneRequest.computeClassificationMetrics) &&
        Objects.equals(classificationNClasses, createFineTuneRequest.classificationNClasses) &&
        Objects.equals(classificationPositiveClass, createFineTuneRequest.classificationPositiveClass) &&
        Objects.equals(classificationBetas, createFineTuneRequest.classificationBetas) &&
        Objects.equals(suffix, createFineTuneRequest.suffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trainingFile, validationFile, model, nEpochs, batchSize, learningRateMultiplier, promptLossWeight, computeClassificationMetrics, classificationNClasses, classificationPositiveClass, classificationBetas, suffix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFineTuneRequest {\n");
    
    sb.append("    trainingFile: ").append(toIndentedString(trainingFile)).append("\n");
    sb.append("    validationFile: ").append(toIndentedString(validationFile)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    nEpochs: ").append(toIndentedString(nEpochs)).append("\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    learningRateMultiplier: ").append(toIndentedString(learningRateMultiplier)).append("\n");
    sb.append("    promptLossWeight: ").append(toIndentedString(promptLossWeight)).append("\n");
    sb.append("    computeClassificationMetrics: ").append(toIndentedString(computeClassificationMetrics)).append("\n");
    sb.append("    classificationNClasses: ").append(toIndentedString(classificationNClasses)).append("\n");
    sb.append("    classificationPositiveClass: ").append(toIndentedString(classificationPositiveClass)).append("\n");
    sb.append("    classificationBetas: ").append(toIndentedString(classificationBetas)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
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
