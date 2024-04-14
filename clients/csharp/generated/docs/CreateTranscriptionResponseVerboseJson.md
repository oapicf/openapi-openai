# Org.OpenAPITools.Model.CreateTranscriptionResponseVerboseJson
Represents a verbose json transcription response returned by model, based on the provided input.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Language** | **string** | The language of the input audio. | 
**Duration** | **string** | The duration of the input audio. | 
**Text** | **string** | The transcribed text. | 
**Words** | [**List&lt;TranscriptionWord&gt;**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. | [optional] 
**Segments** | [**List&lt;TranscriptionSegment&gt;**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

