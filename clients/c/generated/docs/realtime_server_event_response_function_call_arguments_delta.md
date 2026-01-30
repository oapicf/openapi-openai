# realtime_server_event_response_function_call_arguments_delta_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **char \*** | The unique ID of the server event. | 
**type** | **openai_api_realtime_server_event_response_function_call_arguments_delta_TYPE_e** | The event type, must be &#x60;response.function_call_arguments.delta&#x60;.  | 
**response_id** | **char \*** | The ID of the response. | 
**item_id** | **char \*** | The ID of the function call item. | 
**output_index** | **int** | The index of the output item in the response. | 
**call_id** | **char \*** | The ID of the function call. | 
**delta** | **char \*** | The arguments delta as a JSON string. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


