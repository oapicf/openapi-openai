

# RealtimeConversationItemContentInner

The class is defined in **[RealtimeConversationItemContentInner.java](../../src/main/java/org/openapitools/model/RealtimeConversationItemContentInner.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The content type (&#x60;input_text&#x60;, &#x60;input_audio&#x60;, &#x60;item_reference&#x60;, &#x60;text&#x60;).  |  [optional property]
**text** | `String` | The text content, used for &#x60;input_text&#x60; and &#x60;text&#x60; content types.  |  [optional property]
**id** | `String` | ID of a previous conversation item to reference (for &#x60;item_reference&#x60; content types in &#x60;response.create&#x60; events). These can reference both client and server created items.  |  [optional property]
**audio** | `String` | Base64-encoded audio bytes, used for &#x60;input_audio&#x60; content type.  |  [optional property]
**transcript** | `String` | The transcript of the audio, used for &#x60;input_audio&#x60; content type.  |  [optional property]

## TypeEnum

Name | Value
---- | -----
INPUT_AUDIO | `"input_audio"`
INPUT_TEXT | `"input_text"`
ITEM_REFERENCE | `"item_reference"`
TEXT | `"text"`






