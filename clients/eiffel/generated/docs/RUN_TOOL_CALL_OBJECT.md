# RUN_TOOL_CALL_OBJECT

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint. | [default to null]
**type** | [**STRING_32**](STRING_32.md) | The type of tool call the output is required for. For now, this is always &#x60;function&#x60;. | [default to null]
**function** | [**RUN_TOOL_CALL_OBJECT_FUNCTION**](RunToolCallObject_function.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


