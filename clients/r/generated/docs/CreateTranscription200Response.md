# openapi::CreateTranscription200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **character** | The transcribed text. | 
**language** | **character** | The language of the input audio. | 
**duration** | **character** | The duration of the input audio. | 
**words** | [**array[TranscriptionWord]**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. | [optional] 
**segments** | [**array[TranscriptionSegment]**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. | [optional] 


