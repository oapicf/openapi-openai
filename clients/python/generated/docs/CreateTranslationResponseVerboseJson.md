# CreateTranslationResponseVerboseJson


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**language** | **str** | The language of the output translation (always &#x60;english&#x60;). | 
**duration** | **str** | The duration of the input audio. | 
**text** | **str** | The translated text. | 
**segments** | [**List[TranscriptionSegment]**](TranscriptionSegment.md) | Segments of the translated text and their corresponding details. | [optional] 

## Example

```python
from openapiopenai.models.create_translation_response_verbose_json import CreateTranslationResponseVerboseJson

# TODO update the JSON string below
json = "{}"
# create an instance of CreateTranslationResponseVerboseJson from a JSON string
create_translation_response_verbose_json_instance = CreateTranslationResponseVerboseJson.from_json(json)
# print the JSON string representation of the object
print(CreateTranslationResponseVerboseJson.to_json())

# convert the object into a dict
create_translation_response_verbose_json_dict = create_translation_response_verbose_json_instance.to_dict()
# create an instance of CreateTranslationResponseVerboseJson from a dict
create_translation_response_verbose_json_from_dict = CreateTranslationResponseVerboseJson.from_dict(create_translation_response_verbose_json_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


