# realtime_server_event_response_text_delta_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **char \*** | The unique ID of the server event. | 
**type** | **openai_api_realtime_server_event_response_text_delta_TYPE_e** | The event type, must be &#x60;response.text.delta&#x60;. | 
**response_id** | **char \*** | The ID of the response. | 
**item_id** | **char \*** | The ID of the item. | 
**output_index** | **int** | The index of the output item in the response. | 
**content_index** | **int** | The index of the content part in the item&#39;s content array. | 
**delta** | **char \*** | The text delta. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


