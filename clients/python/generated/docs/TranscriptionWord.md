# TranscriptionWord


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**word** | **str** | The text content of the word. | 
**start** | **float** | Start time of the word in seconds. | 
**end** | **float** | End time of the word in seconds. | 

## Example

```python
from openapiopenai.models.transcription_word import TranscriptionWord

# TODO update the JSON string below
json = "{}"
# create an instance of TranscriptionWord from a JSON string
transcription_word_instance = TranscriptionWord.from_json(json)
# print the JSON string representation of the object
print(TranscriptionWord.to_json())

# convert the object into a dict
transcription_word_dict = transcription_word_instance.to_dict()
# create an instance of TranscriptionWord from a dict
transcription_word_form_dict = transcription_word.from_dict(transcription_word_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


