# FineTuningJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The object identifier, which can be referenced in the API endpoints. | 
**createdAt** | **int** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | 
**error** | [**OpenAPI\Server\Model\FineTuningJobError**](FineTuningJobError.md) |  | 
**fineTunedModel** | **string** | The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. | 
**finishedAt** | **int** | The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. | 
**hyperparameters** | [**OpenAPI\Server\Model\FineTuningJobHyperparameters**](FineTuningJobHyperparameters.md) |  | 
**model** | **string** | The base model that is being fine-tuned. | 
**object** | **string** | The object type, which is always \&quot;fine_tuning.job\&quot;. | 
**organizationId** | **string** | The organization that owns the fine-tuning job. | 
**resultFiles** | **string** | The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**status** | **string** | The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;. | 
**trainedTokens** | **int** | The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. | 
**trainingFile** | **string** | The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**validationFile** | **string** | The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**integrations** | [**OpenAPI\Server\Model\FineTuningJobIntegrationsInner**](FineTuningJobIntegrationsInner.md) | A list of integrations to enable for this fine-tuning job. | [optional] 
**seed** | **int** | The seed used for the fine-tuning job. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


