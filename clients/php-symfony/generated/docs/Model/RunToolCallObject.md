# RunToolCallObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint. | 
**type** | **string** | The type of tool call the output is required for. For now, this is always &#x60;function&#x60;. | 
**function** | [**OpenAPI\Server\Model\RunToolCallObjectFunction**](RunToolCallObjectFunction.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


