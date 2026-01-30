# realtime_client_event_conversation_item_create_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **char \*** | Optional client-generated ID used to identify this event. | [optional] 
**type** | **openai_api_realtime_client_event_conversation_item_create_TYPE_e** | The event type, must be &#x60;conversation.item.create&#x60;. | 
**previous_item_id** | **char \*** | The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added.  | [optional] 
**item** | [**realtime_conversation_item_t**](realtime_conversation_item.md) \* |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


