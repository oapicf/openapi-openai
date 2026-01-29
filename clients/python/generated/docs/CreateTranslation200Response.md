# CreateTranslation200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **str** | The translated text. | 
**language** | **str** | The language of the output translation (always &#x60;english&#x60;). | 
**duration** | **str** | The duration of the input audio. | 
**segments** | [**List[TranscriptionSegment]**](TranscriptionSegment.md) | Segments of the translated text and their corresponding details. | [optional] 

## Example

```python
from openapiopenai.models.create_translation200_response import CreateTranslation200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CreateTranslation200Response from a JSON string
create_translation200_response_instance = CreateTranslation200Response.from_json(json)
# print the JSON string representation of the object
print(CreateTranslation200Response.to_json())

# convert the object into a dict
create_translation200_response_dict = create_translation200_response_instance.to_dict()
# create an instance of CreateTranslation200Response from a dict
create_translation200_response_from_dict = CreateTranslation200Response.from_dict(create_translation200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


