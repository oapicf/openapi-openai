# fine_tuning_job_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **char \*** | The object identifier, which can be referenced in the API endpoints. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | 
**error** | [**fine_tuning_job_error_t**](fine_tuning_job_error.md) \* |  | 
**fine_tuned_model** | **char \*** | The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. | 
**finished_at** | **int** | The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. | 
**hyperparameters** | [**fine_tuning_job_hyperparameters_t**](fine_tuning_job_hyperparameters.md) \* |  | 
**model** | **char \*** | The base model that is being fine-tuned. | 
**object** | **openai_api_fine_tuning_job_OBJECT_e** | The object type, which is always \&quot;fine_tuning.job\&quot;. | 
**organization_id** | **char \*** | The organization that owns the fine-tuning job. | 
**result_files** | **list_t \*** | The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**status** | **openai_api_fine_tuning_job_STATUS_e** | The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;. | 
**trained_tokens** | **int** | The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. | 
**training_file** | **char \*** | The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**validation_file** | **char \*** | The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**integrations** | [**list_t**](fine_tuning_job_integrations_inner.md) \* | A list of integrations to enable for this fine-tuning job. | [optional] 
**seed** | **int** | The seed used for the fine-tuning job. | 
**estimated_finish** | **int** | The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running. | [optional] 
**method** | [**fine_tune_method_t**](fine_tune_method.md) \* |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


