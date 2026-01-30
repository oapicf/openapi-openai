# RealtimeClientEventConversationItemCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String!** | Optional client-generated ID used to identify this event. | [optional] [default to null]
**Type_** | **String!** | The event type, must be &#x60;conversation.item.create&#x60;. | [default to null]
**previousItemId** | **String!** | The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added.  | [optional] [default to null]
**item** | [***RealtimeConversationItem**](RealtimeConversationItem.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


