# OAIUsageCompletionsResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **NSString*** |  | 
**inputTokens** | **NSNumber*** | The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens. | 
**inputCachedTokens** | **NSNumber*** | The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. | [optional] 
**outputTokens** | **NSNumber*** | The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. | 
**inputAudioTokens** | **NSNumber*** | The aggregated number of audio input tokens used, including cached tokens. | [optional] 
**outputAudioTokens** | **NSNumber*** | The aggregated number of audio output tokens used. | [optional] 
**numModelRequests** | **NSNumber*** | The count of requests made to the model. | 
**projectId** | **NSString*** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] 
**userId** | **NSString*** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] 
**apiKeyId** | **NSString*** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] 
**model** | **NSString*** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] 
**batch** | **NSNumber*** | When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


