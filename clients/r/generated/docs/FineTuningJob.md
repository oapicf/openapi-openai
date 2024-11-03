# openapi::FineTuningJob

The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | The object identifier, which can be referenced in the API endpoints. | 
**created_at** | **integer** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | 
**error** | [**FineTuningJobError**](FineTuningJob_error.md) |  | 
**fine_tuned_model** | **character** | The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. | 
**finished_at** | **integer** | The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. | 
**hyperparameters** | [**FineTuningJobHyperparameters**](FineTuningJob_hyperparameters.md) |  | 
**model** | **character** | The base model that is being fine-tuned. | 
**object** | **character** | The object type, which is always \&quot;fine_tuning.job\&quot;. | [Enum: [fine_tuning.job]] 
**organization_id** | **character** | The organization that owns the fine-tuning job. | 
**result_files** | **array[character]** | The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**status** | **character** | The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;. | [Enum: [validating_files, queued, running, succeeded, failed, cancelled]] 
**trained_tokens** | **integer** | The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. | 
**training_file** | **character** | The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**validation_file** | **character** | The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**integrations** | [**array[FineTuningJobIntegrationsInner]**](FineTuningJob_integrations_inner.md) | A list of integrations to enable for this fine-tuning job. | [optional] [Max. items: 5] 
**seed** | **integer** | The seed used for the fine-tuning job. | 


