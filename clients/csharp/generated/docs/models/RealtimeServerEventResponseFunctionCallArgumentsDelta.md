# Org.OpenAPITools.Model.RealtimeServerEventResponseFunctionCallArgumentsDelta
Returned when the model-generated function call arguments are updated. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;response.function_call_arguments.delta&#x60;.  | 
**ResponseId** | **string** | The ID of the response. | 
**ItemId** | **string** | The ID of the function call item. | 
**OutputIndex** | **int** | The index of the output item in the response. | 
**CallId** | **string** | The ID of the function call. | 
**Delta** | **string** | The arguments delta as a JSON string. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

