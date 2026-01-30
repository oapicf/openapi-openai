# OpenApiOpenAIClient::RealtimeServerEventResponseContentPartAddedPart

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** | The content type (\&quot;text\&quot;, \&quot;audio\&quot;). | [optional] |
| **text** | **String** | The text content (if type is \&quot;text\&quot;). | [optional] |
| **audio** | **String** | Base64-encoded audio data (if type is \&quot;audio\&quot;). | [optional] |
| **transcript** | **String** | The transcript of the audio (if type is \&quot;audio\&quot;). | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RealtimeServerEventResponseContentPartAddedPart.new(
  type: null,
  text: null,
  audio: null,
  transcript: null
)
```

