# REALTIME_CONVERSATION_ITEM_CONTENT_INNER

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**STRING_32**](STRING_32.md) | The content type (&#x60;input_text&#x60;, &#x60;input_audio&#x60;, &#x60;item_reference&#x60;, &#x60;text&#x60;).  | [optional] [default to null]
**text** | [**STRING_32**](STRING_32.md) | The text content, used for &#x60;input_text&#x60; and &#x60;text&#x60; content types.  | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) | ID of a previous conversation item to reference (for &#x60;item_reference&#x60; content types in &#x60;response.create&#x60; events). These can reference both client and server created items.  | [optional] [default to null]
**audio** | [**STRING_32**](STRING_32.md) | Base64-encoded audio bytes, used for &#x60;input_audio&#x60; content type.  | [optional] [default to null]
**transcript** | [**STRING_32**](STRING_32.md) | The transcript of the audio, used for &#x60;input_audio&#x60; content type.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


