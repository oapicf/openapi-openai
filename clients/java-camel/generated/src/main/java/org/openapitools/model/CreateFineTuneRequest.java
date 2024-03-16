package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateFineTuneRequestModel;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateFineTuneRequest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-16T01:13:12.257183065Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateFineTuneRequest {

  private String trainingFile;

  private JsonNullable<String> validationFile = JsonNullable.<String>undefined();

  private JsonNullable<CreateFineTuneRequestModel> model = JsonNullable.<CreateFineTuneRequestModel>undefined();

  private JsonNullable<Integer> nEpochs = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> batchSize = JsonNullable.<Integer>undefined();

  private JsonNullable<BigDecimal> learningRateMultiplier = JsonNullable.<BigDecimal>undefined();

  private JsonNullable<BigDecimal> promptLossWeight = JsonNullable.<BigDecimal>undefined();

  private JsonNullable<Boolean> computeClassificationMetrics = JsonNullable.<Boolean>undefined();

  private JsonNullable<Integer> classificationNClasses = JsonNullable.<Integer>undefined();

  private JsonNullable<String> classificationPositiveClass = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<BigDecimal>> classificationBetas = JsonNullable.<List<BigDecimal>>undefined();

  private JsonNullable<@Size(min = 1, max = 40) String> suffix = JsonNullable.<String>undefined();

  public CreateFineTuneRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateFineTuneRequest(String trainingFile) {
    this.trainingFile = trainingFile;
  }

  public CreateFineTuneRequest trainingFile(String trainingFile) {
    this.trainingFile = trainingFile;
    return this;
  }

  /**
   * The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. 
   * @return trainingFile
  */
  @NotNull 
  @Schema(name = "training_file", example = "file-ajSREls59WBbvgSzJSVWxMCB", description = "The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("training_file")
  public String getTrainingFile() {
    return trainingFile;
  }

  public void setTrainingFile(String trainingFile) {
    this.trainingFile = trainingFile;
  }

  public CreateFineTuneRequest validationFile(String validationFile) {
    this.validationFile = JsonNullable.of(validationFile);
    return this;
  }

  /**
   * The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. 
   * @return validationFile
  */
  
  @Schema(name = "validation_file", example = "file-XjSREls59WBbvgSzJSVWxMCa", description = "The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validation_file")
  public JsonNullable<String> getValidationFile() {
    return validationFile;
  }

  public void setValidationFile(JsonNullable<String> validationFile) {
    this.validationFile = validationFile;
  }

  public CreateFineTuneRequest model(CreateFineTuneRequestModel model) {
    this.model = JsonNullable.of(model);
    return this;
  }

  /**
   * Get model
   * @return model
  */
  @Valid 
  @Schema(name = "model", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("model")
  public JsonNullable<CreateFineTuneRequestModel> getModel() {
    return model;
  }

  public void setModel(JsonNullable<CreateFineTuneRequestModel> model) {
    this.model = model;
  }

  public CreateFineTuneRequest nEpochs(Integer nEpochs) {
    this.nEpochs = JsonNullable.of(nEpochs);
    return this;
  }

  /**
   * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
   * @return nEpochs
  */
  
  @Schema(name = "n_epochs", description = "The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("n_epochs")
  public JsonNullable<Integer> getnEpochs() {
    return nEpochs;
  }

  public void setnEpochs(JsonNullable<Integer> nEpochs) {
    this.nEpochs = nEpochs;
  }

  public CreateFineTuneRequest batchSize(Integer batchSize) {
    this.batchSize = JsonNullable.of(batchSize);
    return this;
  }

  /**
   * The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we've found that larger batch sizes tend to work better for larger datasets. 
   * @return batchSize
  */
  
  @Schema(name = "batch_size", description = "The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we've found that larger batch sizes tend to work better for larger datasets. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batch_size")
  public JsonNullable<Integer> getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(JsonNullable<Integer> batchSize) {
    this.batchSize = batchSize;
  }

  public CreateFineTuneRequest learningRateMultiplier(BigDecimal learningRateMultiplier) {
    this.learningRateMultiplier = JsonNullable.of(learningRateMultiplier);
    return this;
  }

  /**
   * The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final `batch_size` (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results. 
   * @return learningRateMultiplier
  */
  @Valid 
  @Schema(name = "learning_rate_multiplier", description = "The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final `batch_size` (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("learning_rate_multiplier")
  public JsonNullable<BigDecimal> getLearningRateMultiplier() {
    return learningRateMultiplier;
  }

  public void setLearningRateMultiplier(JsonNullable<BigDecimal> learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
  }

  public CreateFineTuneRequest promptLossWeight(BigDecimal promptLossWeight) {
    this.promptLossWeight = JsonNullable.of(promptLossWeight);
    return this;
  }

  /**
   * The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt. 
   * @return promptLossWeight
  */
  @Valid 
  @Schema(name = "prompt_loss_weight", description = "The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prompt_loss_weight")
  public JsonNullable<BigDecimal> getPromptLossWeight() {
    return promptLossWeight;
  }

  public void setPromptLossWeight(JsonNullable<BigDecimal> promptLossWeight) {
    this.promptLossWeight = promptLossWeight;
  }

  public CreateFineTuneRequest computeClassificationMetrics(Boolean computeClassificationMetrics) {
    this.computeClassificationMetrics = JsonNullable.of(computeClassificationMetrics);
    return this;
  }

  /**
   * If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a `validation_file`. Additionally, you must specify `classification_n_classes` for multiclass classification or `classification_positive_class` for binary classification. 
   * @return computeClassificationMetrics
  */
  
  @Schema(name = "compute_classification_metrics", description = "If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a `validation_file`. Additionally, you must specify `classification_n_classes` for multiclass classification or `classification_positive_class` for binary classification. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compute_classification_metrics")
  public JsonNullable<Boolean> getComputeClassificationMetrics() {
    return computeClassificationMetrics;
  }

  public void setComputeClassificationMetrics(JsonNullable<Boolean> computeClassificationMetrics) {
    this.computeClassificationMetrics = computeClassificationMetrics;
  }

  public CreateFineTuneRequest classificationNClasses(Integer classificationNClasses) {
    this.classificationNClasses = JsonNullable.of(classificationNClasses);
    return this;
  }

  /**
   * The number of classes in a classification task.  This parameter is required for multiclass classification. 
   * @return classificationNClasses
  */
  
  @Schema(name = "classification_n_classes", description = "The number of classes in a classification task.  This parameter is required for multiclass classification. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("classification_n_classes")
  public JsonNullable<Integer> getClassificationNClasses() {
    return classificationNClasses;
  }

  public void setClassificationNClasses(JsonNullable<Integer> classificationNClasses) {
    this.classificationNClasses = classificationNClasses;
  }

  public CreateFineTuneRequest classificationPositiveClass(String classificationPositiveClass) {
    this.classificationPositiveClass = JsonNullable.of(classificationPositiveClass);
    return this;
  }

  /**
   * The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification. 
   * @return classificationPositiveClass
  */
  
  @Schema(name = "classification_positive_class", description = "The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("classification_positive_class")
  public JsonNullable<String> getClassificationPositiveClass() {
    return classificationPositiveClass;
  }

  public void setClassificationPositiveClass(JsonNullable<String> classificationPositiveClass) {
    this.classificationPositiveClass = classificationPositiveClass;
  }

  public CreateFineTuneRequest classificationBetas(List<BigDecimal> classificationBetas) {
    this.classificationBetas = JsonNullable.of(classificationBetas);
    return this;
  }

  public CreateFineTuneRequest addClassificationBetasItem(BigDecimal classificationBetasItem) {
    if (this.classificationBetas == null || !this.classificationBetas.isPresent()) {
      this.classificationBetas = JsonNullable.of(new ArrayList<>());
    }
    this.classificationBetas.get().add(classificationBetasItem);
    return this;
  }

  /**
   * If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall. 
   * @return classificationBetas
  */
  @Valid 
  @Schema(name = "classification_betas", example = "[0.6,1,1.5,2]", description = "If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("classification_betas")
  public JsonNullable<List<BigDecimal>> getClassificationBetas() {
    return classificationBetas;
  }

  public void setClassificationBetas(JsonNullable<List<BigDecimal>> classificationBetas) {
    this.classificationBetas = classificationBetas;
  }

  public CreateFineTuneRequest suffix(String suffix) {
    this.suffix = JsonNullable.of(suffix);
    return this;
  }

  /**
   * A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ada:ft-your-org:custom-model-name-2022-02-15-04-21-04`. 
   * @return suffix
  */
  @Size(min = 1, max = 40) 
  @Schema(name = "suffix", description = "A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ada:ft-your-org:custom-model-name-2022-02-15-04-21-04`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suffix")
  public JsonNullable<@Size(min = 1, max = 40) String> getSuffix() {
    return suffix;
  }

  public void setSuffix(JsonNullable<String> suffix) {
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
        equalsNullable(this.validationFile, createFineTuneRequest.validationFile) &&
        equalsNullable(this.model, createFineTuneRequest.model) &&
        equalsNullable(this.nEpochs, createFineTuneRequest.nEpochs) &&
        equalsNullable(this.batchSize, createFineTuneRequest.batchSize) &&
        equalsNullable(this.learningRateMultiplier, createFineTuneRequest.learningRateMultiplier) &&
        equalsNullable(this.promptLossWeight, createFineTuneRequest.promptLossWeight) &&
        equalsNullable(this.computeClassificationMetrics, createFineTuneRequest.computeClassificationMetrics) &&
        equalsNullable(this.classificationNClasses, createFineTuneRequest.classificationNClasses) &&
        equalsNullable(this.classificationPositiveClass, createFineTuneRequest.classificationPositiveClass) &&
        equalsNullable(this.classificationBetas, createFineTuneRequest.classificationBetas) &&
        equalsNullable(this.suffix, createFineTuneRequest.suffix);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(trainingFile, hashCodeNullable(validationFile), hashCodeNullable(model), hashCodeNullable(nEpochs), hashCodeNullable(batchSize), hashCodeNullable(learningRateMultiplier), hashCodeNullable(promptLossWeight), hashCodeNullable(computeClassificationMetrics), hashCodeNullable(classificationNClasses), hashCodeNullable(classificationPositiveClass), hashCodeNullable(classificationBetas), hashCodeNullable(suffix));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

