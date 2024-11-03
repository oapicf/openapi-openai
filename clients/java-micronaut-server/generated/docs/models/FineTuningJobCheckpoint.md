

# FineTuningJobCheckpoint

The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. 

The class is defined in **[FineTuningJobCheckpoint.java](../../src/main/java/org/openapitools/model/FineTuningJobCheckpoint.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` | The checkpoint identifier, which can be referenced in the API endpoints. | 
**createdAt** | `Integer` | The Unix timestamp (in seconds) for when the checkpoint was created. | 
**fineTunedModelCheckpoint** | `String` | The name of the fine-tuned checkpoint model that is created. | 
**stepNumber** | `Integer` | The step number that the checkpoint was created at. | 
**metrics** | [`FineTuningJobCheckpointMetrics`](FineTuningJobCheckpointMetrics.md) |  | 
**fineTuningJobId** | `String` | The name of the fine-tuning job that this checkpoint was created from. | 
**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;. | 







## ObjectEnum

Name | Value
---- | -----
FINE_TUNING_JOB_CHECKPOINT | `"fine_tuning.job.checkpoint"`


