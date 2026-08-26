# RealtimeClientEventConversationItemCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **String** | Optional client-generated ID used to identify this event. | [optional] [default to None]
**r#type** | [***models::RealtimeClientEventConversationItemCreateType**](RealtimeClientEventConversationItemCreate_type.md) |  | 
**previous_item_id** | **String** | The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added.  | [optional] [default to None]
**item** | [***models::RealtimeConversationItem**](RealtimeConversationItem.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


