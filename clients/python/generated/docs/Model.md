# Model

Describes an OpenAI model offering that can be used with the API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The model identifier, which can be referenced in the API endpoints. | 
**created** | **int** | The Unix timestamp (in seconds) when the model was created. | 
**object** | **str** | The object type, which is always \&quot;model\&quot;. | 
**owned_by** | **str** | The organization that owns the model. | 

## Example

```python
from openapiopenai.models.model import Model

# TODO update the JSON string below
json = "{}"
# create an instance of Model from a JSON string
model_instance = Model.from_json(json)
# print the JSON string representation of the object
print(Model.to_json())

# convert the object into a dict
model_dict = model_instance.to_dict()
# create an instance of Model from a dict
model_form_dict = model.from_dict(model_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


