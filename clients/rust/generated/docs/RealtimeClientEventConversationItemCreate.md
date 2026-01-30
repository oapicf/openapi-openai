# RealtimeClientEventConversationItemCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | Option<**String**> | Optional client-generated ID used to identify this event. | [optional]
**r#type** | **String** | The event type, must be `conversation.item.create`. | 
**previous_item_id** | Option<**String**> | The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added.  | [optional]
**item** | [**models::RealtimeConversationItem**](RealtimeConversationItem.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


