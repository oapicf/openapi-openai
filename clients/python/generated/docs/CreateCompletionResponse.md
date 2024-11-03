# CreateCompletionResponse

Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | A unique identifier for the completion. | 
**choices** | [**List[CreateCompletionResponseChoicesInner]**](CreateCompletionResponseChoicesInner.md) | The list of completion choices the model generated for the input prompt. | 
**created** | **int** | The Unix timestamp (in seconds) of when the completion was created. | 
**model** | **str** | The model used for completion. | 
**system_fingerprint** | **str** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] 
**object** | **str** | The object type, which is always \&quot;text_completion\&quot; | 
**usage** | [**CompletionUsage**](CompletionUsage.md) |  | [optional] 

## Example

```python
from openapiopenai.models.create_completion_response import CreateCompletionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateCompletionResponse from a JSON string
create_completion_response_instance = CreateCompletionResponse.from_json(json)
# print the JSON string representation of the object
print(CreateCompletionResponse.to_json())

# convert the object into a dict
create_completion_response_dict = create_completion_response_instance.to_dict()
# create an instance of CreateCompletionResponse from a dict
create_completion_response_from_dict = CreateCompletionResponse.from_dict(create_completion_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


