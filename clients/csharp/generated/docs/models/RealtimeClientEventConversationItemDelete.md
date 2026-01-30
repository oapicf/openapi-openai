# Org.OpenAPITools.Model.RealtimeClientEventConversationItemDelete
Send this event when you want to remove any item from the conversation  history. The server will respond with a `conversation.item.deleted` event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | The event type, must be &#x60;conversation.item.delete&#x60;. | 
**ItemId** | **string** | The ID of the item to delete. | 
**EventId** | **string** | Optional client-generated ID used to identify this event. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

