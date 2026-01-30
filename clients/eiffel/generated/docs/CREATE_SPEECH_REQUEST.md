# CREATE_SPEECH_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | [**CREATE_SPEECH_REQUEST_MODEL**](CreateSpeechRequest_model.md) |  | [default to null]
**input** | [**STRING_32**](STRING_32.md) | The text to generate audio for. The maximum length is 4096 characters. | [default to null]
**voice** | [**STRING_32**](STRING_32.md) | The voice to use when generating the audio. Supported voices are &#x60;alloy&#x60;, &#x60;echo&#x60;, &#x60;fable&#x60;, &#x60;onyx&#x60;, &#x60;nova&#x60;, and &#x60;shimmer&#x60;. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options). | [default to null]
**response_format** | [**STRING_32**](STRING_32.md) | The format to audio in. Supported formats are &#x60;mp3&#x60;, &#x60;opus&#x60;, &#x60;aac&#x60;, &#x60;flac&#x60;, &#x60;wav&#x60;, and &#x60;pcm&#x60;. | [optional] [default to mp3]
**speed** | **REAL_32** | The speed of the generated audio. Select a value from &#x60;0.25&#x60; to &#x60;4.0&#x60;. &#x60;1.0&#x60; is the default. | [optional] [default to 1]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


