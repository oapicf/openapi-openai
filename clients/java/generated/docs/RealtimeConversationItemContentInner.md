

# RealtimeConversationItemContentInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The content type (&#x60;input_text&#x60;, &#x60;input_audio&#x60;, &#x60;item_reference&#x60;, &#x60;text&#x60;).  |  [optional] |
|**text** | **String** | The text content, used for &#x60;input_text&#x60; and &#x60;text&#x60; content types.  |  [optional] |
|**id** | **String** | ID of a previous conversation item to reference (for &#x60;item_reference&#x60; content types in &#x60;response.create&#x60; events). These can reference both client and server created items.  |  [optional] |
|**audio** | **String** | Base64-encoded audio bytes, used for &#x60;input_audio&#x60; content type.  |  [optional] |
|**transcript** | **String** | The transcript of the audio, used for &#x60;input_audio&#x60; content type.  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INPUT_AUDIO | &quot;input_audio&quot; |
| INPUT_TEXT | &quot;input_text&quot; |
| ITEM_REFERENCE | &quot;item_reference&quot; |
| TEXT | &quot;text&quot; |



