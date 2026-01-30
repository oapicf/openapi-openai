# CreateThreadAndRunRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assistant_id** | **String** | The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. | 
**thread** | Option<[**models::CreateThreadRequest**](CreateThreadRequest.md)> |  | [optional]
**model** | Option<[**models::CreateRunRequestModel**](CreateRunRequest_model.md)> |  | [optional]
**instructions** | Option<**String**> | Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis. | [optional]
**tools** | Option<[**Vec<models::CreateThreadAndRunRequestToolsInner>**](CreateThreadAndRunRequest_tools_inner.md)> | Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis. | [optional]
**tool_resources** | Option<[**models::CreateThreadAndRunRequestToolResources**](CreateThreadAndRunRequest_tool_resources.md)> |  | [optional]
**metadata** | Option<[**serde_json::Value**](.md)> | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional]
**temperature** | Option<**f64**> | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  | [optional][default to 1]
**top_p** | Option<**f64**> | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  | [optional][default to 1]
**stream** | Option<**bool**> | If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message.  | [optional]
**max_prompt_tokens** | Option<**i32**> | The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info.  | [optional]
**max_completion_tokens** | Option<**i32**> | The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info.  | [optional]
**truncation_strategy** | Option<[**models::TruncationObject**](TruncationObject.md)> |  | [optional]
**tool_choice** | Option<[**models::AssistantsApiToolChoiceOption**](AssistantsApiToolChoiceOption.md)> |  | [optional]
**parallel_tool_calls** | Option<**bool**> | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional][default to true]
**response_format** | Option<[**models::AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


