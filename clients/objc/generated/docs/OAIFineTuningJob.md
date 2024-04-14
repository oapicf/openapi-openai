# OAIFineTuningJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSString*** | The object identifier, which can be referenced in the API endpoints. | 
**createdAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | 
**error** | [**OAIFineTuningJobError***](OAIFineTuningJobError.md) |  | 
**fineTunedModel** | **NSString*** | The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. | 
**finishedAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. | 
**hyperparameters** | [**OAIFineTuningJobHyperparameters***](OAIFineTuningJobHyperparameters.md) |  | 
**model** | **NSString*** | The base model that is being fine-tuned. | 
**object** | **NSString*** | The object type, which is always \&quot;fine_tuning.job\&quot;. | 
**organizationId** | **NSString*** | The organization that owns the fine-tuning job. | 
**resultFiles** | **NSArray&lt;NSString*&gt;*** | The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**status** | **NSString*** | The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;. | 
**trainedTokens** | **NSNumber*** | The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. | 
**trainingFile** | **NSString*** | The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**validationFile** | **NSString*** | The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**integrations** | [**NSArray&lt;OAIFineTuningJobIntegrationsInner&gt;***](OAIFineTuningJobIntegrationsInner.md) | A list of integrations to enable for this fine-tuning job. | [optional] 
**seed** | **NSNumber*** | The seed used for the fine-tuning job. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


