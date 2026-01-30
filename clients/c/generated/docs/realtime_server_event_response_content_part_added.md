# realtime_server_event_response_content_part_added_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **char \*** | The unique ID of the server event. | 
**type** | **openai_api_realtime_server_event_response_content_part_added_TYPE_e** | The event type, must be &#x60;response.content_part.added&#x60;. | 
**response_id** | **char \*** | The ID of the response. | 
**item_id** | **char \*** | The ID of the item to which the content part was added. | 
**output_index** | **int** | The index of the output item in the response. | 
**content_index** | **int** | The index of the content part in the item&#39;s content array. | 
**part** | [**realtime_server_event_response_content_part_added_part_t**](realtime_server_event_response_content_part_added_part.md) \* |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


