# OpenApiOpenAIClient::CreateTranslationResponseVerboseJson

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **language** | **String** | The language of the output translation (always &#x60;english&#x60;). |  |
| **duration** | **String** | The duration of the input audio. |  |
| **text** | **String** | The translated text. |  |
| **segments** | [**Array&lt;TranscriptionSegment&gt;**](TranscriptionSegment.md) | Segments of the translated text and their corresponding details. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateTranslationResponseVerboseJson.new(
  language: null,
  duration: null,
  text: null,
  segments: null
)
```
