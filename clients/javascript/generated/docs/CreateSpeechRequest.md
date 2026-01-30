# OpenapiOpenai.CreateSpeechRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | [**CreateSpeechRequestModel**](CreateSpeechRequestModel.md) |  | 
**input** | **String** | The text to generate audio for. The maximum length is 4096 characters. | 
**voice** | **String** | The voice to use when generating the audio. Supported voices are &#x60;alloy&#x60;, &#x60;echo&#x60;, &#x60;fable&#x60;, &#x60;onyx&#x60;, &#x60;nova&#x60;, and &#x60;shimmer&#x60;. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options). | 
**responseFormat** | **String** | The format to audio in. Supported formats are &#x60;mp3&#x60;, &#x60;opus&#x60;, &#x60;aac&#x60;, &#x60;flac&#x60;, &#x60;wav&#x60;, and &#x60;pcm&#x60;. | [optional] [default to &#39;mp3&#39;]
**speed** | **Number** | The speed of the generated audio. Select a value from &#x60;0.25&#x60; to &#x60;4.0&#x60;. &#x60;1.0&#x60; is the default. | [optional] [default to 1]



## Enum: VoiceEnum


* `alloy` (value: `"alloy"`)

* `echo` (value: `"echo"`)

* `fable` (value: `"fable"`)

* `onyx` (value: `"onyx"`)

* `nova` (value: `"nova"`)

* `shimmer` (value: `"shimmer"`)





## Enum: ResponseFormatEnum


* `mp3` (value: `"mp3"`)

* `opus` (value: `"opus"`)

* `aac` (value: `"aac"`)

* `flac` (value: `"flac"`)

* `wav` (value: `"wav"`)

* `pcm` (value: `"pcm"`)




