# openapi::CreateTranscriptionResponseVerboseJson

Represents a verbose json transcription response returned by model, based on the provided input.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**language** | **character** | The language of the input audio. | 
**duration** | **character** | The duration of the input audio. | 
**text** | **character** | The transcribed text. | 
**words** | [**array[TranscriptionWord]**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. | [optional] 
**segments** | [**array[TranscriptionSegment]**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. | [optional] 


