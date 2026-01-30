# RealtimeServerEventResponseFunctionCallArgumentsDelta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **String** | The unique ID of the server event. | 
**r#type** | **String** | The event type, must be `response.function_call_arguments.delta`.  | 
**response_id** | **String** | The ID of the response. | 
**item_id** | **String** | The ID of the function call item. | 
**output_index** | **i32** | The index of the output item in the response. | 
**call_id** | **String** | The ID of the function call. | 
**delta** | **String** | The arguments delta as a JSON string. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


