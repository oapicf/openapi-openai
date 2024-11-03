# OpenapiOpenai.FineTuningJob

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The object identifier, which can be referenced in the API endpoints. | 
**createdAt** | **Number** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | 
**error** | [**FineTuningJobError**](FineTuningJobError.md) |  | 
**fineTunedModel** | **String** | The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. | 
**finishedAt** | **Number** | The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. | 
**hyperparameters** | [**FineTuningJobHyperparameters**](FineTuningJobHyperparameters.md) |  | 
**model** | **String** | The base model that is being fine-tuned. | 
**object** | **String** | The object type, which is always \&quot;fine_tuning.job\&quot;. | 
**organizationId** | **String** | The organization that owns the fine-tuning job. | 
**resultFiles** | **[String]** | The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**status** | **String** | The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;. | 
**trainedTokens** | **Number** | The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. | 
**trainingFile** | **String** | The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**validationFile** | **String** | The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**integrations** | [**[FineTuningJobIntegrationsInner]**](FineTuningJobIntegrationsInner.md) | A list of integrations to enable for this fine-tuning job. | [optional] 
**seed** | **Number** | The seed used for the fine-tuning job. | 



## Enum: ObjectEnum


* `fine_tuning.job` (value: `"fine_tuning.job"`)





## Enum: StatusEnum


* `validating_files` (value: `"validating_files"`)

* `queued` (value: `"queued"`)

* `running` (value: `"running"`)

* `succeeded` (value: `"succeeded"`)

* `failed` (value: `"failed"`)

* `cancelled` (value: `"cancelled"`)




