# FineTuningJobCheckpointMetrics

Metrics at the step number during the fine-tuning job.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**step** | **float** |  | [optional] 
**train_loss** | **float** |  | [optional] 
**train_mean_token_accuracy** | **float** |  | [optional] 
**valid_loss** | **float** |  | [optional] 
**valid_mean_token_accuracy** | **float** |  | [optional] 
**full_valid_loss** | **float** |  | [optional] 
**full_valid_mean_token_accuracy** | **float** |  | [optional] 

## Example

```python
from openapiopenai.models.fine_tuning_job_checkpoint_metrics import FineTuningJobCheckpointMetrics

# TODO update the JSON string below
json = "{}"
# create an instance of FineTuningJobCheckpointMetrics from a JSON string
fine_tuning_job_checkpoint_metrics_instance = FineTuningJobCheckpointMetrics.from_json(json)
# print the JSON string representation of the object
print(FineTuningJobCheckpointMetrics.to_json())

# convert the object into a dict
fine_tuning_job_checkpoint_metrics_dict = fine_tuning_job_checkpoint_metrics_instance.to_dict()
# create an instance of FineTuningJobCheckpointMetrics from a dict
fine_tuning_job_checkpoint_metrics_form_dict = fine_tuning_job_checkpoint_metrics.from_dict(fine_tuning_job_checkpoint_metrics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


