# RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **index** | **Integer** | The index of the tool call in the tool calls array. | [default to null] |
| **id** | **String** | The ID of the tool call object. | [optional] [default to null] |
| **type** | **String** | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | [default to null] |
| **code\_interpreter** | [**RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter**](RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter.md) |  | [optional] [default to null] |
| **file\_search** | [**Object**](.md) | For now, this is always going to be an empty object. | [default to null] |
| **function** | [**RunStepDeltaStepDetailsToolCallsFunctionObject_function**](RunStepDeltaStepDetailsToolCallsFunctionObject_function.md) |  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

