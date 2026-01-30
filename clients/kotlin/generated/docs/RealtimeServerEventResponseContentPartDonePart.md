
# RealtimeServerEventResponseContentPartDonePart

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | The content type (\&quot;text\&quot;, \&quot;audio\&quot;). |  [optional] |
| **text** | **kotlin.String** | The text content (if type is \&quot;text\&quot;). |  [optional] |
| **audio** | **kotlin.String** | Base64-encoded audio data (if type is \&quot;audio\&quot;). |  [optional] |
| **transcript** | **kotlin.String** | The transcript of the audio (if type is \&quot;audio\&quot;). |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | audio, text |



