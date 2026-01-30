# Org.OpenAPITools.Model.RealtimeClientEventConversationItemCreate
Add a new Item to the Conversation's context, including messages, function  calls, and function call responses. This event can be used both to populate a  \"history\" of the conversation and to add new items mid-stream, but has the  current limitation that it cannot populate assistant audio messages.  If successful, the server will respond with a `conversation.item.created`  event, otherwise an `error` event will be sent. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | The event type, must be &#x60;conversation.item.create&#x60;. | 
**Item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  | 
**EventId** | **string** | Optional client-generated ID used to identify this event. | [optional] 
**PreviousItemId** | **string** | The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added.  | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

