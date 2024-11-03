# FineTuningJob
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The object identifier, which can be referenced in the API endpoints. | 
**CreatedAt** | **Int32** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | 
**VarError** | [**FineTuningJobError**](FineTuningJobError.md) |  | 
**FineTunedModel** | **String** | The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. | 
**FinishedAt** | **Int32** | The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. | 
**Hyperparameters** | [**FineTuningJobHyperparameters**](FineTuningJobHyperparameters.md) |  | 
**Model** | **String** | The base model that is being fine-tuned. | 
**Object** | **String** | The object type, which is always &quot;&quot;fine_tuning.job&quot;&quot;. | 
**OrganizationId** | **String** | The organization that owns the fine-tuning job. | 
**ResultFiles** | **String[]** | The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**Status** | **String** | The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;. | 
**TrainedTokens** | **Int32** | The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. | 
**TrainingFile** | **String** | The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**ValidationFile** | **String** | The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**Integrations** | [**FineTuningJobIntegrationsInner[]**](FineTuningJobIntegrationsInner.md) | A list of integrations to enable for this fine-tuning job. | [optional] 
**Seed** | **Int32** | The seed used for the fine-tuning job. | 

## Examples

- Prepare the resource
```powershell
$FineTuningJob = Initialize-PSOpenAPIToolsFineTuningJob  -Id null `
 -CreatedAt null `
 -VarError null `
 -FineTunedModel null `
 -FinishedAt null `
 -Hyperparameters null `
 -Model null `
 -Object null `
 -OrganizationId null `
 -ResultFiles null `
 -Status null `
 -TrainedTokens null `
 -TrainingFile null `
 -ValidationFile null `
 -Integrations null `
 -Seed null
```

- Convert the resource to JSON
```powershell
$FineTuningJob | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

