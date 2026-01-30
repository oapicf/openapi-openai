# CreateRunRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assistant_id** | **str** | The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. | 
**model** | [**CreateRunRequestModel**](CreateRunRequestModel.md) |  | [optional] 
**instructions** | **str** | Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis. | [optional] 
**additional_instructions** | **str** | Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions. | [optional] 
**additional_messages** | [**List[CreateMessageRequest]**](CreateMessageRequest.md) | Adds additional messages to the thread before creating the run. | [optional] 
**tools** | [**List[AssistantObjectToolsInner]**](AssistantObjectToolsInner.md) | Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis. | [optional] 
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 
**temperature** | **float** | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  | [optional] [default to 1]
**top_p** | **float** | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  | [optional] [default to 1]
**stream** | **bool** | If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message.  | [optional] 
**max_prompt_tokens** | **int** | The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info.  | [optional] 
**max_completion_tokens** | **int** | The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info.  | [optional] 
**truncation_strategy** | [**TruncationObject**](TruncationObject.md) |  | [optional] 
**tool_choice** | [**AssistantsApiToolChoiceOption**](AssistantsApiToolChoiceOption.md) |  | [optional] 
**parallel_tool_calls** | **bool** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional] [default to True]
**response_format** | [**AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  | [optional] 

## Example

```python
from openapiopenai.models.create_run_request import CreateRunRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateRunRequest from a JSON string
create_run_request_instance = CreateRunRequest.from_json(json)
# print the JSON string representation of the object
print(CreateRunRequest.to_json())

# convert the object into a dict
create_run_request_dict = create_run_request_instance.to_dict()
# create an instance of CreateRunRequest from a dict
create_run_request_from_dict = CreateRunRequest.from_dict(create_run_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


