# OAIFineTuningJobCheckpoint

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSString*** | The checkpoint identifier, which can be referenced in the API endpoints. | 
**createdAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the checkpoint was created. | 
**fineTunedModelCheckpoint** | **NSString*** | The name of the fine-tuned checkpoint model that is created. | 
**stepNumber** | **NSNumber*** | The step number that the checkpoint was created at. | 
**metrics** | [**OAIFineTuningJobCheckpointMetrics***](OAIFineTuningJobCheckpointMetrics.md) |  | 
**fineTuningJobId** | **NSString*** | The name of the fine-tuning job that this checkpoint was created from. | 
**object** | **NSString*** | The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


