# CreateModerationResponse

Represents if a given text input is potentially harmful.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The unique identifier for the moderation request. | 
**model** | **str** | The model used to generate the moderation results. | 
**results** | [**List[CreateModerationResponseResultsInner]**](CreateModerationResponseResultsInner.md) | A list of moderation objects. | 

## Example

```python
from openapiopenai.models.create_moderation_response import CreateModerationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateModerationResponse from a JSON string
create_moderation_response_instance = CreateModerationResponse.from_json(json)
# print the JSON string representation of the object
print(CreateModerationResponse.to_json())

# convert the object into a dict
create_moderation_response_dict = create_moderation_response_instance.to_dict()
# create an instance of CreateModerationResponse from a dict
create_moderation_response_from_dict = CreateModerationResponse.from_dict(create_moderation_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


