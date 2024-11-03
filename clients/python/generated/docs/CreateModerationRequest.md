# CreateModerationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input** | [**CreateModerationRequestInput**](CreateModerationRequestInput.md) |  | 
**model** | [**CreateModerationRequestModel**](CreateModerationRequestModel.md) |  | [optional] 

## Example

```python
from openapiopenai.models.create_moderation_request import CreateModerationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateModerationRequest from a JSON string
create_moderation_request_instance = CreateModerationRequest.from_json(json)
# print the JSON string representation of the object
print(CreateModerationRequest.to_json())

# convert the object into a dict
create_moderation_request_dict = create_moderation_request_instance.to_dict()
# create an instance of CreateModerationRequest from a dict
create_moderation_request_from_dict = CreateModerationRequest.from_dict(create_moderation_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


