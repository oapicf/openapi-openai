# RealtimeConversationItemContentInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**r#type** | [***models::RealtimeConversationItemContentInnerType**](RealtimeConversationItem_content_inner_type.md) |  | [optional] [default to None]
**text** | **String** | The text content, used for `input_text` and `text` content types.  | [optional] [default to None]
**id** | **String** | ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items.  | [optional] [default to None]
**audio** | **String** | Base64-encoded audio bytes, used for `input_audio` content type.  | [optional] [default to None]
**transcript** | **String** | The transcript of the audio, used for `input_audio` content type.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


