package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CreateFineTuneRequestModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CreateFineTuneRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-16T01:12:49.513446343Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateFineTuneRequest   {
  @JsonProperty("training_file")
  private String trainingFile;

  @JsonProperty("validation_file")
  private String validationFile;

  @JsonProperty("model")
  private CreateFineTuneRequestModel model = curie;

  @JsonProperty("n_epochs")
  private Integer nEpochs = 4;

  @JsonProperty("batch_size")
  private Integer batchSize;

  @JsonProperty("learning_rate_multiplier")
  private BigDecimal learningRateMultiplier;

  @JsonProperty("prompt_loss_weight")
  private BigDecimal promptLossWeight = new BigDecimal("0.01");

  @JsonProperty("compute_classification_metrics")
  private Boolean computeClassificationMetrics = false;

  @JsonProperty("classification_n_classes")
  private Integer classificationNClasses;

  @JsonProperty("classification_positive_class")
  private String classificationPositiveClass;

  @JsonProperty("classification_betas")
  
  private List<BigDecimal> classificationBetas = null;

  @JsonProperty("suffix")
  private String suffix;

  public CreateFineTuneRequest trainingFile(String trainingFile) {
    this.trainingFile = trainingFile;
    return this;
  }

   /**
   * The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. 
   * @return trainingFile
  **/
  @ApiModelProperty(example = "file-ajSREls59WBbvgSzJSVWxMCB", required = true, value = "The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. ")
  public String getTrainingFile() {
    return trainingFile;
  }

  public void setTrainingFile(String trainingFile) {
    this.trainingFile = trainingFile;
  }

  public CreateFineTuneRequest validationFile(String validationFile) {
    this.validationFile = validationFile;
    return this;
  }

   /**
   * The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. 
   * @return validationFile
  **/
  @ApiModelProperty(example = "file-XjSREls59WBbvgSzJSVWxMCa", value = "The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. ")
  public String getValidationFile() {
    return validationFile;
  }

  public void setValidationFile(String validationFile) {
    this.validationFile = validationFile;
  }

  public CreateFineTuneRequest model(CreateFineTuneRequestModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(value = "")
  public CreateFineTuneRequestModel getModel() {
    return model;
  }

  public void setModel(CreateFineTuneRequestModel model) {
    this.model = model;
  }

  public CreateFineTuneRequest nEpochs(Integer nEpochs) {
    this.nEpochs = nEpochs;
    return this;
  }

   /**
   * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
   * @return nEpochs
  **/
  @ApiModelProperty(value = "The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. ")
  public Integer getnEpochs() {
    return nEpochs;
  }

  public void setnEpochs(Integer nEpochs) {
    this.nEpochs = nEpochs;
  }

  public CreateFineTuneRequest batchSize(Integer batchSize) {
    this.batchSize = batchSize;
    return this;
  }

   /**
   * The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we've found that larger batch sizes tend to work better for larger datasets. 
   * @return batchSize
  **/
  @ApiModelProperty(value = "The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we've found that larger batch sizes tend to work better for larger datasets. ")
  public Integer getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(Integer batchSize) {
    this.batchSize = batchSize;
  }

  public CreateFineTuneRequest learningRateMultiplier(BigDecimal learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
    return this;
  }

   /**
   * The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final `batch_size` (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results. 
   * @return learningRateMultiplier
  **/
  @ApiModelProperty(value = "The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final `batch_size` (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results. ")
  public BigDecimal getLearningRateMultiplier() {
    return learningRateMultiplier;
  }

  public void setLearningRateMultiplier(BigDecimal learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
  }

  public CreateFineTuneRequest promptLossWeight(BigDecimal promptLossWeight) {
    this.promptLossWeight = promptLossWeight;
    return this;
  }

   /**
   * The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt. 
   * @return promptLossWeight
  **/
  @ApiModelProperty(value = "The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt. ")
  public BigDecimal getPromptLossWeight() {
    return promptLossWeight;
  }

  public void setPromptLossWeight(BigDecimal promptLossWeight) {
    this.promptLossWeight = promptLossWeight;
  }

  public CreateFineTuneRequest computeClassificationMetrics(Boolean computeClassificationMetrics) {
    this.computeClassificationMetrics = computeClassificationMetrics;
    return this;
  }

   /**
   * If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a `validation_file`. Additionally, you must specify `classification_n_classes` for multiclass classification or `classification_positive_class` for binary classification. 
   * @return computeClassificationMetrics
  **/
  @ApiModelProperty(value = "If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a `validation_file`. Additionally, you must specify `classification_n_classes` for multiclass classification or `classification_positive_class` for binary classification. ")
  public Boolean getComputeClassificationMetrics() {
    return computeClassificationMetrics;
  }

  public void setComputeClassificationMetrics(Boolean computeClassificationMetrics) {
    this.computeClassificationMetrics = computeClassificationMetrics;
  }

  public CreateFineTuneRequest classificationNClasses(Integer classificationNClasses) {
    this.classificationNClasses = classificationNClasses;
    return this;
  }

   /**
   * The number of classes in a classification task.  This parameter is required for multiclass classification. 
   * @return classificationNClasses
  **/
  @ApiModelProperty(value = "The number of classes in a classification task.  This parameter is required for multiclass classification. ")
  public Integer getClassificationNClasses() {
    return classificationNClasses;
  }

  public void setClassificationNClasses(Integer classificationNClasses) {
    this.classificationNClasses = classificationNClasses;
  }

  public CreateFineTuneRequest classificationPositiveClass(String classificationPositiveClass) {
    this.classificationPositiveClass = classificationPositiveClass;
    return this;
  }

   /**
   * The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification. 
   * @return classificationPositiveClass
  **/
  @ApiModelProperty(value = "The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification. ")
  public String getClassificationPositiveClass() {
    return classificationPositiveClass;
  }

  public void setClassificationPositiveClass(String classificationPositiveClass) {
    this.classificationPositiveClass = classificationPositiveClass;
  }

  public CreateFineTuneRequest classificationBetas(List<BigDecimal> classificationBetas) {
    this.classificationBetas = classificationBetas;
    return this;
  }

  public CreateFineTuneRequest addClassificationBetasItem(BigDecimal classificationBetasItem) {
    if (this.classificationBetas == null) {
      this.classificationBetas = new ArrayList<>();
    }
    this.classificationBetas.add(classificationBetasItem);
    return this;
  }

   /**
   * If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall. 
   * @return classificationBetas
  **/
  @ApiModelProperty(example = "[0.6,1,1.5,2]", value = "If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall. ")
  public List<BigDecimal> getClassificationBetas() {
    return classificationBetas;
  }

  public void setClassificationBetas(List<BigDecimal> classificationBetas) {
    this.classificationBetas = classificationBetas;
  }

  public CreateFineTuneRequest suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ada:ft-your-org:custom-model-name-2022-02-15-04-21-04`. 
   * @return suffix
  **/
  @ApiModelProperty(value = "A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ada:ft-your-org:custom-model-name-2022-02-15-04-21-04`. ")
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
    return Objects.equals(this.trainingFile, createFineTuneRequest.trainingFile) &&
        Objects.equals(this.validationFile, createFineTuneRequest.validationFile) &&
        Objects.equals(this.model, createFineTuneRequest.model) &&
        Objects.equals(this.nEpochs, createFineTuneRequest.nEpochs) &&
        Objects.equals(this.batchSize, createFineTuneRequest.batchSize) &&
        Objects.equals(this.learningRateMultiplier, createFineTuneRequest.learningRateMultiplier) &&
        Objects.equals(this.promptLossWeight, createFineTuneRequest.promptLossWeight) &&
        Objects.equals(this.computeClassificationMetrics, createFineTuneRequest.computeClassificationMetrics) &&
        Objects.equals(this.classificationNClasses, createFineTuneRequest.classificationNClasses) &&
        Objects.equals(this.classificationPositiveClass, createFineTuneRequest.classificationPositiveClass) &&
        Objects.equals(this.classificationBetas, createFineTuneRequest.classificationBetas) &&
        Objects.equals(this.suffix, createFineTuneRequest.suffix);
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

