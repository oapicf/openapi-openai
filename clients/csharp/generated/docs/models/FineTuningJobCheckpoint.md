# Org.OpenAPITools.Model.FineTuningJobCheckpoint
The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The checkpoint identifier, which can be referenced in the API endpoints. | 
**CreatedAt** | **int** | The Unix timestamp (in seconds) for when the checkpoint was created. | 
**FineTunedModelCheckpoint** | **string** | The name of the fine-tuned checkpoint model that is created. | 
**StepNumber** | **int** | The step number that the checkpoint was created at. | 
**Metrics** | [**FineTuningJobCheckpointMetrics**](FineTuningJobCheckpointMetrics.md) |  | 
**FineTuningJobId** | **string** | The name of the fine-tuning job that this checkpoint was created from. | 
**Object** | **string** | The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

