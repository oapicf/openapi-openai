# FineTuningJob
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** | The object identifier, which can be referenced in the API endpoints. | [default to null] |
| **created\_at** | **Integer** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | [default to null] |
| **error** | [**FineTuningJob_error**](FineTuningJob_error.md) |  | [default to null] |
| **fine\_tuned\_model** | **String** | The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. | [default to null] |
| **finished\_at** | **Integer** | The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. | [default to null] |
| **hyperparameters** | [**FineTuningJob_hyperparameters**](FineTuningJob_hyperparameters.md) |  | [default to null] |
| **model** | **String** | The base model that is being fine-tuned. | [default to null] |
| **object** | **String** | The object type, which is always \&quot;fine_tuning.job\&quot;. | [default to null] |
| **organization\_id** | **String** | The organization that owns the fine-tuning job. | [default to null] |
| **result\_files** | **List** | The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). | [default to null] |
| **status** | **String** | The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;. | [default to null] |
| **trained\_tokens** | **Integer** | The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. | [default to null] |
| **training\_file** | **String** | The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). | [default to null] |
| **validation\_file** | **String** | The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). | [default to null] |
| **integrations** | [**List**](FineTuningJob_integrations_inner.md) | A list of integrations to enable for this fine-tuning job. | [optional] [default to null] |
| **seed** | **Integer** | The seed used for the fine-tuning job. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

