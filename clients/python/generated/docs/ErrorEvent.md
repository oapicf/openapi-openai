# ErrorEvent

Occurs when an [error](/docs/guides/error-codes/api-errors) occurs. This can happen due to an internal server error or a timeout.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**Error**](Error.md) |  | 

## Example

```python
from openapiopenai.models.error_event import ErrorEvent

# TODO update the JSON string below
json = "{}"
# create an instance of ErrorEvent from a JSON string
error_event_instance = ErrorEvent.from_json(json)
# print the JSON string representation of the object
print(ErrorEvent.to_json())

# convert the object into a dict
error_event_dict = error_event_instance.to_dict()
# create an instance of ErrorEvent from a dict
error_event_form_dict = error_event.from_dict(error_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


