# ResponseFormatText


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of response format being defined: &#x60;text&#x60; | 

## Example

```python
from openapiopenai.models.response_format_text import ResponseFormatText

# TODO update the JSON string below
json = "{}"
# create an instance of ResponseFormatText from a JSON string
response_format_text_instance = ResponseFormatText.from_json(json)
# print the JSON string representation of the object
print(ResponseFormatText.to_json())

# convert the object into a dict
response_format_text_dict = response_format_text_instance.to_dict()
# create an instance of ResponseFormatText from a dict
response_format_text_from_dict = ResponseFormatText.from_dict(response_format_text_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


