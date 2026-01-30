
# FineTuningJob

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The object identifier, which can be referenced in the API endpoints. |  |
| **createdAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the fine-tuning job was created. |  |
| **error** | [**FineTuningJobError**](FineTuningJobError.md) |  |  |
| **fineTunedModel** | **kotlin.String** | The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. |  |
| **finishedAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. |  |
| **hyperparameters** | [**FineTuningJobHyperparameters**](FineTuningJobHyperparameters.md) |  |  |
| **model** | **kotlin.String** | The base model that is being fine-tuned. |  |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | The object type, which is always \&quot;fine_tuning.job\&quot;. |  |
| **organizationId** | **kotlin.String** | The organization that owns the fine-tuning job. |  |
| **resultFiles** | **kotlin.collections.List&lt;kotlin.String&gt;** | The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). |  |
| **status** | [**inline**](#Status) | The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;. |  |
| **trainedTokens** | **kotlin.Int** | The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. |  |
| **trainingFile** | **kotlin.String** | The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). |  |
| **validationFile** | **kotlin.String** | The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). |  |
| **seed** | **kotlin.Int** | The seed used for the fine-tuning job. |  |
| **integrations** | [**kotlin.collections.List&lt;FineTuningJobIntegrationsInner&gt;**](FineTuningJobIntegrationsInner.md) | A list of integrations to enable for this fine-tuning job. |  [optional] |
| **estimatedFinish** | **kotlin.Int** | The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running. |  [optional] |
| **method** | [**FineTuneMethod**](FineTuneMethod.md) |  |  [optional] |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | fine_tuning.job |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | validating_files, queued, running, succeeded, failed, cancelled |



