# OpenApiOpenAIClient::CreateTranscriptionResponseVerboseJson

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **language** | **String** | The language of the input audio. |  |
| **duration** | **String** | The duration of the input audio. |  |
| **text** | **String** | The transcribed text. |  |
| **words** | [**Array&lt;TranscriptionWord&gt;**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. | [optional] |
| **segments** | [**Array&lt;TranscriptionSegment&gt;**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateTranscriptionResponseVerboseJson.new(
  language: null,
  duration: null,
  text: null,
  words: null,
  segments: null
)
```

