# CreateFineTuneRequestModel

The name of the base model to fine-tune. You can select one of \"ada\", \"babbage\", \"curie\", \"davinci\", or a fine-tuned model created after 2022-04-21. To learn more about these models, see the [Models](https://platform.openai.com/docs/models) documentation. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

## Example

```python
from openapiopenai.models.create_fine_tune_request_model import CreateFineTuneRequestModel

# TODO update the JSON string below
json = "{}"
# create an instance of CreateFineTuneRequestModel from a JSON string
create_fine_tune_request_model_instance = CreateFineTuneRequestModel.from_json(json)
# print the JSON string representation of the object
print(CreateFineTuneRequestModel.to_json())

# convert the object into a dict
create_fine_tune_request_model_dict = create_fine_tune_request_model_instance.to_dict()
# create an instance of CreateFineTuneRequestModel from a dict
create_fine_tune_request_model_form_dict = create_fine_tune_request_model.from_dict(create_fine_tune_request_model_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


