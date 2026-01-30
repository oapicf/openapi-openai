# ResponseFormatJsonSchema


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of response format being defined: &#x60;json_schema&#x60; | 
**json_schema** | [**ResponseFormatJsonSchemaJsonSchema**](ResponseFormatJsonSchemaJsonSchema.md) |  | 

## Example

```python
from openapiopenai.models.response_format_json_schema import ResponseFormatJsonSchema

# TODO update the JSON string below
json = "{}"
# create an instance of ResponseFormatJsonSchema from a JSON string
response_format_json_schema_instance = ResponseFormatJsonSchema.from_json(json)
# print the JSON string representation of the object
print(ResponseFormatJsonSchema.to_json())

# convert the object into a dict
response_format_json_schema_dict = response_format_json_schema_instance.to_dict()
# create an instance of ResponseFormatJsonSchema from a dict
response_format_json_schema_from_dict = ResponseFormatJsonSchema.from_dict(response_format_json_schema_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


