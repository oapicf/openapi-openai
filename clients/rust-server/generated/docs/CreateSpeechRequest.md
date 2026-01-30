# CreateSpeechRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | [***models::CreateSpeechRequestModel**](CreateSpeechRequest_model.md) |  | 
**input** | **String** | The text to generate audio for. The maximum length is 4096 characters. | 
**voice** | [***models::CreateSpeechRequestVoice**](CreateSpeechRequest_voice.md) |  | 
**response_format** | [***models::CreateSpeechRequestResponseFormat**](CreateSpeechRequest_response_format.md) |  | [optional] [default to None]
**speed** | **f64** | The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default. | [optional] [default to Some(1)]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


