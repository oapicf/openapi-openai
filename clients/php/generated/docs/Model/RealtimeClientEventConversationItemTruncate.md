# # RealtimeClientEventConversationItemTruncate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | Optional client-generated ID used to identify this event. | [optional]
**type** | **string** | The event type, must be &#x60;conversation.item.truncate&#x60;. |
**item_id** | **string** | The ID of the assistant message item to truncate. Only assistant message  items can be truncated. |
**content_index** | **int** | The index of the content part to truncate. Set this to 0. |
**audio_end_ms** | **int** | Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
