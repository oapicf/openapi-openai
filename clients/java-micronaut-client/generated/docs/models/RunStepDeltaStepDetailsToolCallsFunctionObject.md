

# RunStepDeltaStepDetailsToolCallsFunctionObject

The class is defined in **[RunStepDeltaStepDetailsToolCallsFunctionObject.java](../../src/main/java/org/openapitools/model/RunStepDeltaStepDetailsToolCallsFunctionObject.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | `Integer` | The index of the tool call in the tool calls array. | 
**id** | `String` | The ID of the tool call object. |  [optional property]
**type** | [**TypeEnum**](#TypeEnum) | The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call. | 
**function** | [`RunStepDeltaStepDetailsToolCallsFunctionObjectFunction`](RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.md) |  |  [optional property]



## TypeEnum

Name | Value
---- | -----
FUNCTION | `"function"`



