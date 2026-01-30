# RealtimeClientEventConversationItemTruncate
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **event\_id** | **String** | Optional client-generated ID used to identify this event. | [optional] [default to null] |
| **type** | **String** | The event type, must be &#x60;conversation.item.truncate&#x60;. | [default to null] |
| **item\_id** | **String** | The ID of the assistant message item to truncate. Only assistant message  items can be truncated.  | [default to null] |
| **content\_index** | **Integer** | The index of the content part to truncate. Set this to 0. | [default to null] |
| **audio\_end\_ms** | **Integer** | Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error.  | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

