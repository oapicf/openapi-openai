

# RealtimeServerEventResponseContentPartDonePart

The content part that is done.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The content type (\&quot;text\&quot;, \&quot;audio\&quot;). |  [optional] |
|**text** | **String** | The text content (if type is \&quot;text\&quot;). |  [optional] |
|**audio** | **String** | Base64-encoded audio data (if type is \&quot;audio\&quot;). |  [optional] |
|**transcript** | **String** | The transcript of the audio (if type is \&quot;audio\&quot;). |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AUDIO | &quot;audio&quot; |
| TEXT | &quot;text&quot; |



