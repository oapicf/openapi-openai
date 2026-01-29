
# FineTuningJobCheckpoint

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The checkpoint identifier, which can be referenced in the API endpoints. |  |
| **createdAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the checkpoint was created. |  |
| **fineTunedModelCheckpoint** | **kotlin.String** | The name of the fine-tuned checkpoint model that is created. |  |
| **stepNumber** | **kotlin.Int** | The step number that the checkpoint was created at. |  |
| **metrics** | [**FineTuningJobCheckpointMetrics**](FineTuningJobCheckpointMetrics.md) |  |  |
| **fineTuningJobId** | **kotlin.String** | The name of the fine-tuning job that this checkpoint was created from. |  |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;. |  |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | fine_tuning.job.checkpoint |



