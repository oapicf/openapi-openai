# CreateTranslationResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **str** |  | 

## Example

```python
from openapiopenai.models.create_translation_response import CreateTranslationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateTranslationResponse from a JSON string
create_translation_response_instance = CreateTranslationResponse.from_json(json)
# print the JSON string representation of the object
print(CreateTranslationResponse.to_json())

# convert the object into a dict
create_translation_response_dict = create_translation_response_instance.to_dict()
# create an instance of CreateTranslationResponse from a dict
create_translation_response_form_dict = create_translation_response.from_dict(create_translation_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


