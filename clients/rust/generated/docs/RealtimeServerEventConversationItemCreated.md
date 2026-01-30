# RealtimeServerEventConversationItemCreated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **String** | The unique ID of the server event. | 
**r#type** | **String** | The event type, must be `conversation.item.created`. | 
**previous_item_id** | **String** | The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation.  | 
**item** | [**models::RealtimeConversationItem**](RealtimeConversationItem.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


