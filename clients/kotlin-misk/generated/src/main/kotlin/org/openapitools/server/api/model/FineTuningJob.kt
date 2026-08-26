package org.openapitools.server.api.model

import org.openapitools.server.api.model.FineTuneMethod
import org.openapitools.server.api.model.FineTuningJobError
import org.openapitools.server.api.model.FineTuningJobHyperparameters
import org.openapitools.server.api.model.FineTuningJobIntegrationsInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FineTuningJob(
    /** The object identifier, which can be referenced in the API endpoints. */
    val id: kotlin.String,
    /** The Unix timestamp (in seconds) for when the fine-tuning job was created. */
    val createdAt: kotlin.Int,
    val error: FineTuningJobError,
    /** The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. */
    val fineTunedModel: kotlin.String,
    /** The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. */
    val finishedAt: kotlin.Int,
    val hyperparameters: FineTuningJobHyperparameters,
    /** The base model that is being fine-tuned. */
    val model: kotlin.String,
    /** The object type, which is always \&quot;fine_tuning.job\&quot;. */
    val `object`: kotlin.String,
    /** The organization that owns the fine-tuning job. */
    val organizationId: kotlin.String,
    /** The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). */
    val resultFiles: kotlin.collections.List<kotlin.String>,
    /** The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;. */
    val status: kotlin.String,
    /** The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. */
    val trainedTokens: kotlin.Int,
    /** The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). */
    val trainingFile: kotlin.String,
    /** The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). */
    val validationFile: kotlin.String,
    /** The seed used for the fine-tuning job. */
    val seed: kotlin.Int,
    /** A list of integrations to enable for this fine-tuning job. */
    val integrations: kotlin.collections.List<FineTuningJobIntegrationsInner>? = null,
    /** The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running. */
    val estimatedFinish: kotlin.Int? = null,
    val method: FineTuneMethod? = null
)
