# realtime_server_event_response_output_item_done_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **char \*** | The unique ID of the server event. | 
**type** | **openai_api_realtime_server_event_response_output_item_done_TYPE_e** | The event type, must be &#x60;response.output_item.done&#x60;. | 
**response_id** | **char \*** | The ID of the Response to which the item belongs. | 
**output_index** | **int** | The index of the output item in the Response. | 
**item** | [**realtime_conversation_item_t**](realtime_conversation_item.md) \* |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


