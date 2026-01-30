# openapi::RealtimeServerEventResponseContentPartDonePart

The content part that is done.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **character** | The content type (\&quot;text\&quot;, \&quot;audio\&quot;). | [optional] [Enum: [audio, text]] 
**text** | **character** | The text content (if type is \&quot;text\&quot;). | [optional] 
**audio** | **character** | Base64-encoded audio data (if type is \&quot;audio\&quot;). | [optional] 
**transcript** | **character** | The transcript of the audio (if type is \&quot;audio\&quot;). | [optional] 


