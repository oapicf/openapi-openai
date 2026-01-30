
# RealtimeConversationItemContentInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | The content type (&#x60;input_text&#x60;, &#x60;input_audio&#x60;, &#x60;item_reference&#x60;, &#x60;text&#x60;).  |  [optional] |
| **text** | **kotlin.String** | The text content, used for &#x60;input_text&#x60; and &#x60;text&#x60; content types.  |  [optional] |
| **id** | **kotlin.String** | ID of a previous conversation item to reference (for &#x60;item_reference&#x60; content types in &#x60;response.create&#x60; events). These can reference both client and server created items.  |  [optional] |
| **audio** | **kotlin.String** | Base64-encoded audio bytes, used for &#x60;input_audio&#x60; content type.  |  [optional] |
| **transcript** | **kotlin.String** | The transcript of the audio, used for &#x60;input_audio&#x60; content type.  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | input_audio, input_text, item_reference, text |



