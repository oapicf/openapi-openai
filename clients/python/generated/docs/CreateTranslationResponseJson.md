# CreateTranslationResponseJson


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **str** |  | 

## Example

```python
from openapiopenai.models.create_translation_response_json import CreateTranslationResponseJson

# TODO update the JSON string below
json = "{}"
# create an instance of CreateTranslationResponseJson from a JSON string
create_translation_response_json_instance = CreateTranslationResponseJson.from_json(json)
# print the JSON string representation of the object
print(CreateTranslationResponseJson.to_json())

# convert the object into a dict
create_translation_response_json_dict = create_translation_response_json_instance.to_dict()
# create an instance of CreateTranslationResponseJson from a dict
create_translation_response_json_form_dict = create_translation_response_json.from_dict(create_translation_response_json_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


