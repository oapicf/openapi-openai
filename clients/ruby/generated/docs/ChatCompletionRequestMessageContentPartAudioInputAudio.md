# OpenApiOpenAIClient::ChatCompletionRequestMessageContentPartAudioInputAudio

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **data** | **String** | Base64 encoded audio data. |  |
| **format** | **String** | The format of the encoded audio data. Currently supports \&quot;wav\&quot; and \&quot;mp3\&quot;.  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ChatCompletionRequestMessageContentPartAudioInputAudio.new(
  data: null,
  format: null
)
```

