# CreateSpeechRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | [**models::CreateSpeechRequestModel**](CreateSpeechRequest_model.md) |  | 
**input** | **String** | The text to generate audio for. The maximum length is 4096 characters. | 
**voice** | **String** | The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options). | 
**response_format** | Option<**String**> | The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`. | [optional][default to Mp3]
**speed** | Option<**f64**> | The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default. | [optional][default to 1]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


