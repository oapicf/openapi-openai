# TruncationObject

Controls for how a thread will be truncated prior to the run. Use this to control the intial context window of the run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The truncation strategy to use for the thread. The default is &#x60;auto&#x60;. If set to &#x60;last_messages&#x60;, the thread will be truncated to the n most recent messages in the thread. When set to &#x60;auto&#x60;, messages in the middle of the thread will be dropped to fit the context length of the model, &#x60;max_prompt_tokens&#x60;. | 
**last_messages** | **int** | The number of most recent messages from the thread when constructing the context for the run. | [optional] 

## Example

```python
from openapiopenai.models.truncation_object import TruncationObject

# TODO update the JSON string below
json = "{}"
# create an instance of TruncationObject from a JSON string
truncation_object_instance = TruncationObject.from_json(json)
# print the JSON string representation of the object
print(TruncationObject.to_json())

# convert the object into a dict
truncation_object_dict = truncation_object_instance.to_dict()
# create an instance of TruncationObject from a dict
truncation_object_from_dict = TruncationObject.from_dict(truncation_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


