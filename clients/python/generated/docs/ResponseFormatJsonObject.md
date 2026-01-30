# ResponseFormatJsonObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of response format being defined: &#x60;json_object&#x60; | 

## Example

```python
from openapiopenai.models.response_format_json_object import ResponseFormatJsonObject

# TODO update the JSON string below
json = "{}"
# create an instance of ResponseFormatJsonObject from a JSON string
response_format_json_object_instance = ResponseFormatJsonObject.from_json(json)
# print the JSON string representation of the object
print(ResponseFormatJsonObject.to_json())

# convert the object into a dict
response_format_json_object_dict = response_format_json_object_instance.to_dict()
# create an instance of ResponseFormatJsonObject from a dict
response_format_json_object_from_dict = ResponseFormatJsonObject.from_dict(response_format_json_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


