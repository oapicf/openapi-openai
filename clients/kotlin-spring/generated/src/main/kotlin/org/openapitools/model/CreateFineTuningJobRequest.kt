package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CreateFineTuningJobRequestHyperparameters
import org.openapitools.model.CreateFineTuningJobRequestIntegrationsInner
import org.openapitools.model.CreateFineTuningJobRequestModel
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
 * @param model 
 * @param trainingFile The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
 * @param hyperparameters 
 * @param suffix A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`. 
 * @param validationFile The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
 * @param integrations A list of integrations to enable for your fine-tuning job.
 * @param seed The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
 */
data class CreateFineTuningJobRequest(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("model", required = true) val model: CreateFineTuningJobRequestModel,

    @Schema(example = "file-abc123", required = true, description = "The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. ")
    @get:JsonProperty("training_file", required = true) val trainingFile: kotlin.String,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("hyperparameters") val hyperparameters: CreateFineTuningJobRequestHyperparameters? = null,

    @get:Size(min=1,max=40)
    @Schema(example = "null", description = "A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`. ")
    @get:JsonProperty("suffix") val suffix: kotlin.String? = null,

    @Schema(example = "file-abc123", description = "The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. ")
    @get:JsonProperty("validation_file") val validationFile: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "A list of integrations to enable for your fine-tuning job.")
    @get:JsonProperty("integrations") val integrations: kotlin.collections.List<CreateFineTuningJobRequestIntegrationsInner>? = null,

    @get:Min(0)
    @get:Max(2147483647)
    @Schema(example = "42", description = "The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. ")
    @get:JsonProperty("seed") val seed: kotlin.Int? = null
    ) {

}

