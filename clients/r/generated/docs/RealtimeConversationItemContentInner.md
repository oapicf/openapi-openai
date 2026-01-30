# openapi::RealtimeConversationItemContentInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **character** | The content type (&#x60;input_text&#x60;, &#x60;input_audio&#x60;, &#x60;item_reference&#x60;, &#x60;text&#x60;).  | [optional] [Enum: [input_audio, input_text, item_reference, text]] 
**text** | **character** | The text content, used for &#x60;input_text&#x60; and &#x60;text&#x60; content types.  | [optional] 
**id** | **character** | ID of a previous conversation item to reference (for &#x60;item_reference&#x60; content types in &#x60;response.create&#x60; events). These can reference both client and server created items.  | [optional] 
**audio** | **character** | Base64-encoded audio bytes, used for &#x60;input_audio&#x60; content type.  | [optional] 
**transcript** | **character** | The transcript of the audio, used for &#x60;input_audio&#x60; content type.  | [optional] 


