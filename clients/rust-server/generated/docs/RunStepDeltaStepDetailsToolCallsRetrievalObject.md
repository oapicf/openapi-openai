# RunStepDeltaStepDetailsToolCallsRetrievalObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **i32** | The index of the tool call in the tool calls array. | 
**id** | **String** | The ID of the tool call object. | [optional] [default to None]
**r#type** | **String** | The type of tool call. This is always going to be `retrieval` for this type of tool call. | 
**retrieval** | [***serde_json::Value**](.md) | For now, this is always going to be an empty object. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


