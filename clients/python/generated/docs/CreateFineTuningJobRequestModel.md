# CreateFineTuningJobRequestModel

The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning#which-models-can-be-fine-tuned). 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

## Example

```python
from openapiopenai.models.create_fine_tuning_job_request_model import CreateFineTuningJobRequestModel

# TODO update the JSON string below
json = "{}"
# create an instance of CreateFineTuningJobRequestModel from a JSON string
create_fine_tuning_job_request_model_instance = CreateFineTuningJobRequestModel.from_json(json)
# print the JSON string representation of the object
print(CreateFineTuningJobRequestModel.to_json())

# convert the object into a dict
create_fine_tuning_job_request_model_dict = create_fine_tuning_job_request_model_instance.to_dict()
# create an instance of CreateFineTuningJobRequestModel from a dict
create_fine_tuning_job_request_model_from_dict = CreateFineTuningJobRequestModel.from_dict(create_fine_tuning_job_request_model_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


