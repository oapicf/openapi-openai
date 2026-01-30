# UsageCompletionsResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **string** |  | 
**inputTokens** | **int** | The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens. | 
**inputCachedTokens** | **int** | The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. | [optional] 
**outputTokens** | **int** | The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. | 
**inputAudioTokens** | **int** | The aggregated number of audio input tokens used, including cached tokens. | [optional] 
**outputAudioTokens** | **int** | The aggregated number of audio output tokens used. | [optional] 
**numModelRequests** | **int** | The count of requests made to the model. | 
**projectId** | **string** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] 
**userId** | **string** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] 
**apiKeyId** | **string** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] 
**model** | **string** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] 
**batch** | **bool** | When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


