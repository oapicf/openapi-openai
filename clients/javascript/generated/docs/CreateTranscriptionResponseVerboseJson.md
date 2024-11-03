# OpenapiOpenai.CreateTranscriptionResponseVerboseJson

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**language** | **String** | The language of the input audio. | 
**duration** | **String** | The duration of the input audio. | 
**text** | **String** | The transcribed text. | 
**words** | [**[TranscriptionWord]**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. | [optional] 
**segments** | [**[TranscriptionSegment]**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. | [optional] 


