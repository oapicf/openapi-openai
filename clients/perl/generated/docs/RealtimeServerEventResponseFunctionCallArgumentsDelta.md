# WWW::OpenAPIClient::Object::RealtimeServerEventResponseFunctionCallArgumentsDelta

## Load the model package
```perl
use WWW::OpenAPIClient::Object::RealtimeServerEventResponseFunctionCallArgumentsDelta;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | The unique ID of the server event. | 
**type** | **string** | The event type, must be &#x60;response.function_call_arguments.delta&#x60;.  | 
**response_id** | **string** | The ID of the response. | 
**item_id** | **string** | The ID of the function call item. | 
**output_index** | **int** | The index of the output item in the response. | 
**call_id** | **string** | The ID of the function call. | 
**delta** | **string** | The arguments delta as a JSON string. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


