# FineTuningJobCheckpoint
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The checkpoint identifier, which can be referenced in the API endpoints. | 
**CreatedAt** | **Int32** | The Unix timestamp (in seconds) for when the checkpoint was created. | 
**FineTunedModelCheckpoint** | **String** | The name of the fine-tuned checkpoint model that is created. | 
**StepNumber** | **Int32** | The step number that the checkpoint was created at. | 
**Metrics** | [**FineTuningJobCheckpointMetrics**](FineTuningJobCheckpointMetrics.md) |  | 
**FineTuningJobId** | **String** | The name of the fine-tuning job that this checkpoint was created from. | 
**Object** | **String** | The object type, which is always &quot;&quot;fine_tuning.job.checkpoint&quot;&quot;. | 

## Examples

- Prepare the resource
```powershell
$FineTuningJobCheckpoint = Initialize-PSOpenAPIToolsFineTuningJobCheckpoint  -Id null `
 -CreatedAt null `
 -FineTunedModelCheckpoint null `
 -StepNumber null `
 -Metrics null `
 -FineTuningJobId null `
 -Object null
```

- Convert the resource to JSON
```powershell
$FineTuningJobCheckpoint | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

