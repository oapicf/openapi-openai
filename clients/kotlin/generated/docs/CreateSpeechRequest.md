
# CreateSpeechRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **model** | [**CreateSpeechRequestModel**](CreateSpeechRequestModel.md) |  |  |
| **input** | **kotlin.String** | The text to generate audio for. The maximum length is 4096 characters. |  |
| **voice** | [**inline**](#Voice) | The voice to use when generating the audio. Supported voices are &#x60;alloy&#x60;, &#x60;echo&#x60;, &#x60;fable&#x60;, &#x60;onyx&#x60;, &#x60;nova&#x60;, and &#x60;shimmer&#x60;. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options). |  |
| **responseFormat** | [**inline**](#ResponseFormat) | The format to audio in. Supported formats are &#x60;mp3&#x60;, &#x60;opus&#x60;, &#x60;aac&#x60;, &#x60;flac&#x60;, &#x60;wav&#x60;, and &#x60;pcm&#x60;. |  [optional] |
| **speed** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The speed of the generated audio. Select a value from &#x60;0.25&#x60; to &#x60;4.0&#x60;. &#x60;1.0&#x60; is the default. |  [optional] |


<a id="Voice"></a>
## Enum: voice
| Name | Value |
| ---- | ----- |
| voice | alloy, echo, fable, onyx, nova, shimmer |


<a id="ResponseFormat"></a>
## Enum: response_format
| Name | Value |
| ---- | ----- |
| responseFormat | mp3, opus, aac, flac, wav, pcm |



