# # FineTuningJob

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The object identifier, which can be referenced in the API endpoints. |
**created_at** | **int** | The Unix timestamp (in seconds) for when the fine-tuning job was created. |
**error** | [**\OpenAPI\Client\Model\FineTuningJobError**](FineTuningJobError.md) |  |
**fine_tuned_model** | **string** | The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. |
**finished_at** | **int** | The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. |
**hyperparameters** | [**\OpenAPI\Client\Model\FineTuningJobHyperparameters**](FineTuningJobHyperparameters.md) |  |
**model** | **string** | The base model that is being fine-tuned. |
**object** | **string** | The object type, which is always \&quot;fine_tuning.job\&quot;. |
**organization_id** | **string** | The organization that owns the fine-tuning job. |
**result_files** | **string[]** | The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). |
**status** | **string** | The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;. |
**trained_tokens** | **int** | The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. |
**training_file** | **string** | The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). |
**validation_file** | **string** | The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). |
**integrations** | [**\OpenAPI\Client\Model\FineTuningJobIntegrationsInner[]**](FineTuningJobIntegrationsInner.md) | A list of integrations to enable for this fine-tuning job. | [optional]
**seed** | **int** | The seed used for the fine-tuning job. |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
