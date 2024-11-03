# FineTuningJobError

For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | A machine-readable error code. | 
**message** | **str** | A human-readable error message. | 
**param** | **str** | The parameter that was invalid, usually &#x60;training_file&#x60; or &#x60;validation_file&#x60;. This field will be null if the failure was not parameter-specific. | 

## Example

```python
from openapiopenai.models.fine_tuning_job_error import FineTuningJobError

# TODO update the JSON string below
json = "{}"
# create an instance of FineTuningJobError from a JSON string
fine_tuning_job_error_instance = FineTuningJobError.from_json(json)
# print the JSON string representation of the object
print(FineTuningJobError.to_json())

# convert the object into a dict
fine_tuning_job_error_dict = fine_tuning_job_error_instance.to_dict()
# create an instance of FineTuningJobError from a dict
fine_tuning_job_error_from_dict = FineTuningJobError.from_dict(fine_tuning_job_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


