# RunStepDeltaObjectDeltaStepDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**r#type** | [***models::RunStepDetailsToolCallsObjectType**](RunStepDetailsToolCallsObject_type.md) |  | 
**message_creation** | [***models::RunStepDeltaStepDetailsMessageCreationObjectMessageCreation**](RunStepDeltaStepDetailsMessageCreationObject_message_creation.md) |  | [optional] [default to None]
**tool_calls** | [**Vec<models::RunStepDeltaStepDetailsToolCallsObjectToolCallsInner>**](RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


