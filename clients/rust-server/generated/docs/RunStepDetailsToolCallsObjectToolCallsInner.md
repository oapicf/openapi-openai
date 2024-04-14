# RunStepDetailsToolCallsObjectToolCallsInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of the tool call object. | 
**r#type** | **String** | The type of tool call. This is always going to be `code_interpreter` for this type of tool call. | 
**code_interpreter** | [***models::RunStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDetailsToolCallsCodeObject_code_interpreter.md) |  | 
**retrieval** | [***serde_json::Value**](.md) | For now, this is always going to be an empty object. | 
**function** | [***models::RunStepDetailsToolCallsFunctionObjectFunction**](RunStepDetailsToolCallsFunctionObject_function.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


