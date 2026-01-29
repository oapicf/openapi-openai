# OpenapiOpenai.CreateTranscription200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **String** | The transcribed text. | 
**language** | **String** | The language of the input audio. | 
**duration** | **String** | The duration of the input audio. | 
**words** | [**[TranscriptionWord]**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. | [optional] 
**segments** | [**[TranscriptionSegment]**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. | [optional] 


