# openapi::RunStepDeltaStepDetailsToolCallsFunctionObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **integer** | The index of the tool call in the tool calls array. | 
**id** | **character** | The ID of the tool call object. | [optional] 
**type** | **character** | The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call. | [Enum: [function]] 
**function** | [**RunStepDeltaStepDetailsToolCallsFunctionObjectFunction**](RunStepDeltaStepDetailsToolCallsFunctionObject_function.md) |  | [optional] 


