# WWW::OpenAPIClient::Object::FineTuningJobCheckpoint

## Load the model package
```perl
use WWW::OpenAPIClient::Object::FineTuningJobCheckpoint;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The checkpoint identifier, which can be referenced in the API endpoints. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the checkpoint was created. | 
**fine_tuned_model_checkpoint** | **string** | The name of the fine-tuned checkpoint model that is created. | 
**step_number** | **int** | The step number that the checkpoint was created at. | 
**metrics** | [**FineTuningJobCheckpointMetrics**](FineTuningJobCheckpointMetrics.md) |  | 
**fine_tuning_job_id** | **string** | The name of the fine-tuning job that this checkpoint was created from. | 
**object** | **string** | The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


