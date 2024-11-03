# OpenapiOpenai.RunToolCallObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint. | 
**type** | **String** | The type of tool call the output is required for. For now, this is always &#x60;function&#x60;. | 
**_function** | [**RunToolCallObjectFunction**](RunToolCallObjectFunction.md) |  | 



## Enum: TypeEnum


* `function` (value: `"function"`)




