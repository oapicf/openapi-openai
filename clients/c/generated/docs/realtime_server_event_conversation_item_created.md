# realtime_server_event_conversation_item_created_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **char \*** | The unique ID of the server event. | 
**type** | **openai_api_realtime_server_event_conversation_item_created_TYPE_e** | The event type, must be &#x60;conversation.item.created&#x60;. | 
**previous_item_id** | **char \*** | The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation.  | 
**item** | [**realtime_conversation_item_t**](realtime_conversation_item.md) \* |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


