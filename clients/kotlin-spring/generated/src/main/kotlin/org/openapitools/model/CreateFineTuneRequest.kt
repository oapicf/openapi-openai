package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CreateFineTuneRequestModel
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param trainingFile The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. 
 * @param validationFile The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. 
 * @param model 
 * @param nEpochs The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
 * @param batchSize The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we've found that larger batch sizes tend to work better for larger datasets. 
 * @param learningRateMultiplier The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final `batch_size` (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results. 
 * @param promptLossWeight The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt. 
 * @param computeClassificationMetrics If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a `validation_file`. Additionally, you must specify `classification_n_classes` for multiclass classification or `classification_positive_class` for binary classification. 
 * @param classificationNClasses The number of classes in a classification task.  This parameter is required for multiclass classification. 
 * @param classificationPositiveClass The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification. 
 * @param classificationBetas If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall. 
 * @param suffix A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ada:ft-your-org:custom-model-name-2022-02-15-04-21-04`. 
 */
data class CreateFineTuneRequest(

    @Schema(example = "file-ajSREls59WBbvgSzJSVWxMCB", required = true, description = "The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. ")
    @get:JsonProperty("training_file", required = true) val trainingFile: kotlin.String,

    @Schema(example = "file-XjSREls59WBbvgSzJSVWxMCa", description = "The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. ")
    @get:JsonProperty("validation_file") val validationFile: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("model") val model: CreateFineTuneRequestModel? = null,

    @Schema(example = "null", description = "The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. ")
    @get:JsonProperty("n_epochs") val nEpochs: kotlin.Int? = 4,

    @Schema(example = "null", description = "The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we've found that larger batch sizes tend to work better for larger datasets. ")
    @get:JsonProperty("batch_size") val batchSize: kotlin.Int? = null,

    @Schema(example = "null", description = "The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final `batch_size` (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results. ")
    @get:JsonProperty("learning_rate_multiplier") val learningRateMultiplier: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt. ")
    @get:JsonProperty("prompt_loss_weight") val promptLossWeight: java.math.BigDecimal? = java.math.BigDecimal("0.01"),

    @Schema(example = "null", description = "If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a `validation_file`. Additionally, you must specify `classification_n_classes` for multiclass classification or `classification_positive_class` for binary classification. ")
    @get:JsonProperty("compute_classification_metrics") val computeClassificationMetrics: kotlin.Boolean? = false,

    @Schema(example = "null", description = "The number of classes in a classification task.  This parameter is required for multiclass classification. ")
    @get:JsonProperty("classification_n_classes") val classificationNClasses: kotlin.Int? = null,

    @Schema(example = "null", description = "The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification. ")
    @get:JsonProperty("classification_positive_class") val classificationPositiveClass: kotlin.String? = null,

    @field:Valid
    @Schema(example = "[0.6,1,1.5,2]", description = "If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall. ")
    @get:JsonProperty("classification_betas") val classificationBetas: kotlin.collections.List<java.math.BigDecimal>? = null,

    @get:Size(min=1,max=40)
    @Schema(example = "null", description = "A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ada:ft-your-org:custom-model-name-2022-02-15-04-21-04`. ")
    @get:JsonProperty("suffix") val suffix: kotlin.String? = null
) {

}

