# RealtimeConversationItemContentInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**r#type** | Option<**String**> | The content type (`input_text`, `input_audio`, `item_reference`, `text`).  | [optional]
**text** | Option<**String**> | The text content, used for `input_text` and `text` content types.  | [optional]
**id** | Option<**String**> | ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items.  | [optional]
**audio** | Option<**String**> | Base64-encoded audio bytes, used for `input_audio` content type.  | [optional]
**transcript** | Option<**String**> | The transcript of the audio, used for `input_audio` content type.  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


