# CreateCompletionRequestStop

Up to 4 sequences where the API will stop generating further tokens. The returned text will not contain the stop sequence. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

## Example

```python
from openapiopenai.models.create_completion_request_stop import CreateCompletionRequestStop

# TODO update the JSON string below
json = "{}"
# create an instance of CreateCompletionRequestStop from a JSON string
create_completion_request_stop_instance = CreateCompletionRequestStop.from_json(json)
# print the JSON string representation of the object
print(CreateCompletionRequestStop.to_json())

# convert the object into a dict
create_completion_request_stop_dict = create_completion_request_stop_instance.to_dict()
# create an instance of CreateCompletionRequestStop from a dict
create_completion_request_stop_form_dict = create_completion_request_stop.from_dict(create_completion_request_stop_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


