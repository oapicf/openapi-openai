# openapi::CreateSpeechRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | [**CreateSpeechRequestModel**](CreateSpeechRequest_model.md) |  | 
**input** | **character** | The text to generate audio for. The maximum length is 4096 characters. | [Max. length: 4096] 
**voice** | **character** | The voice to use when generating the audio. Supported voices are &#x60;alloy&#x60;, &#x60;echo&#x60;, &#x60;fable&#x60;, &#x60;onyx&#x60;, &#x60;nova&#x60;, and &#x60;shimmer&#x60;. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options). | [Enum: [alloy, echo, fable, onyx, nova, shimmer]] 
**response_format** | **character** | The format to audio in. Supported formats are &#x60;mp3&#x60;, &#x60;opus&#x60;, &#x60;aac&#x60;, &#x60;flac&#x60;, &#x60;wav&#x60;, and &#x60;pcm&#x60;. | [optional] [default to &quot;mp3&quot;] [Enum: [mp3, opus, aac, flac, wav, pcm]] 
**speed** | **numeric** | The speed of the generated audio. Select a value from &#x60;0.25&#x60; to &#x60;4.0&#x60;. &#x60;1.0&#x60; is the default. | [optional] [default to 1.0] [Max: 4.0] [Min: 0.25] 


