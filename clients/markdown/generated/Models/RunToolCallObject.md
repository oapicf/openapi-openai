# RunToolCallObject
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** | The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint. | [default to null] |
| **type** | **String** | The type of tool call the output is required for. For now, this is always &#x60;function&#x60;. | [default to null] |
| **function** | [**RunToolCallObject_function**](RunToolCallObject_function.md) |  | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

