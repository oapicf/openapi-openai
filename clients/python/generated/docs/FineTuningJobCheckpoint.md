# FineTuningJobCheckpoint

The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The checkpoint identifier, which can be referenced in the API endpoints. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the checkpoint was created. | 
**fine_tuned_model_checkpoint** | **str** | The name of the fine-tuned checkpoint model that is created. | 
**step_number** | **int** | The step number that the checkpoint was created at. | 
**metrics** | [**FineTuningJobCheckpointMetrics**](FineTuningJobCheckpointMetrics.md) |  | 
**fine_tuning_job_id** | **str** | The name of the fine-tuning job that this checkpoint was created from. | 
**object** | **str** | The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;. | 

## Example

```python
from openapiopenai.models.fine_tuning_job_checkpoint import FineTuningJobCheckpoint

# TODO update the JSON string below
json = "{}"
# create an instance of FineTuningJobCheckpoint from a JSON string
fine_tuning_job_checkpoint_instance = FineTuningJobCheckpoint.from_json(json)
# print the JSON string representation of the object
print(FineTuningJobCheckpoint.to_json())

# convert the object into a dict
fine_tuning_job_checkpoint_dict = fine_tuning_job_checkpoint_instance.to_dict()
# create an instance of FineTuningJobCheckpoint from a dict
fine_tuning_job_checkpoint_from_dict = FineTuningJobCheckpoint.from_dict(fine_tuning_job_checkpoint_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


