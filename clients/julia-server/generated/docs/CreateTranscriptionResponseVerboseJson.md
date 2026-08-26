# CreateTranscriptionResponseVerboseJson


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`language`** | **`String`** | The language of the input audio. | [default to nothing]
**`duration`** | **`String`** | The duration of the input audio. | [default to nothing]
**`text`** | **`String`** | The transcribed text. | [default to nothing]
**`words`** | [**`Vector{TranscriptionWord}`**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. | [optional] [default to nothing]
**`segments`** | [**`Vector{TranscriptionSegment}`**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


