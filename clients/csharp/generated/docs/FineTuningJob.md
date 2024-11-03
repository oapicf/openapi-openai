# Org.OpenAPITools.Model.FineTuningJob
The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The object identifier, which can be referenced in the API endpoints. | 
**CreatedAt** | **int** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | 
**Error** | [**FineTuningJobError**](FineTuningJobError.md) |  | 
**FineTunedModel** | **string** | The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. | 
**FinishedAt** | **int?** | The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. | 
**Hyperparameters** | [**FineTuningJobHyperparameters**](FineTuningJobHyperparameters.md) |  | 
**Model** | **string** | The base model that is being fine-tuned. | 
**Object** | **string** | The object type, which is always \&quot;fine_tuning.job\&quot;. | 
**OrganizationId** | **string** | The organization that owns the fine-tuning job. | 
**ResultFiles** | **List&lt;string&gt;** | The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**Status** | **string** | The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;. | 
**TrainedTokens** | **int?** | The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. | 
**TrainingFile** | **string** | The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**ValidationFile** | **string** | The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**Integrations** | [**List&lt;FineTuningJobIntegrationsInner&gt;**](FineTuningJobIntegrationsInner.md) | A list of integrations to enable for this fine-tuning job. | [optional] 
**Seed** | **int** | The seed used for the fine-tuning job. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

