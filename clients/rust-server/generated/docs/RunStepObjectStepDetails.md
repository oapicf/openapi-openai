# RunStepObjectStepDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**r#type** | **String** | Always `message_creation`. | 
**message_creation** | [***models::RunStepDetailsMessageCreationObjectMessageCreation**](RunStepDetailsMessageCreationObject_message_creation.md) |  | 
**tool_calls** | [**Vec<models::RunStepDetailsToolCallsObjectToolCallsInner>**](RunStepDetailsToolCallsObject_tool_calls_inner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


