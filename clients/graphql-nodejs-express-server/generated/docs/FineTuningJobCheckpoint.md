# FineTuningJobCheckpoint

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **String!** | The checkpoint identifier, which can be referenced in the API endpoints. | [default to null]
**createdAt** | **Int!** | The Unix timestamp (in seconds) for when the checkpoint was created. | [default to null]
**fineTunedModelCheckpoint** | **String!** | The name of the fine-tuned checkpoint model that is created. | [default to null]
**stepNumber** | **Int!** | The step number that the checkpoint was created at. | [default to null]
**metrics** | [***FineTuningJobCheckpointMetrics**](FineTuningJobCheckpoint_metrics.md) |  | [default to null]
**fineTuningJobId** | **String!** | The name of the fine-tuning job that this checkpoint was created from. | [default to null]
**object** | **String!** | The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


