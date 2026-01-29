# RunStepDeltaStepDetailsToolCallsObjectToolCallsInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **Int!** | The index of the tool call in the tool calls array. | [default to null]
**Id_** | **String!** | The ID of the tool call object. | [optional] [default to null]
**Type_** | **String!** | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | [default to null]
**codeInterpreter** | [***RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter.md) |  | [optional] [default to null]
**retrieval** | [***TodoObjectMapping**](.md) | For now, this is always going to be an empty object. | [optional] [default to null]
**function** | [***RunStepDeltaStepDetailsToolCallsFunctionObjectFunction**](RunStepDeltaStepDetailsToolCallsFunctionObject_function.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


