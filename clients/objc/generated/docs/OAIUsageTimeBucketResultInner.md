# OAIUsageTimeBucketResultInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **NSString*** |  | 
**inputTokens** | **NSNumber*** | The aggregated number of input tokens used. | 
**inputCachedTokens** | **NSNumber*** | The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. | [optional] 
**outputTokens** | **NSNumber*** | The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. | 
**inputAudioTokens** | **NSNumber*** | The aggregated number of audio input tokens used, including cached tokens. | [optional] 
**outputAudioTokens** | **NSNumber*** | The aggregated number of audio output tokens used. | [optional] 
**numModelRequests** | **NSNumber*** | The count of requests made to the model. | 
**projectId** | **NSString*** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result. | [optional] 
**userId** | **NSString*** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] 
**apiKeyId** | **NSString*** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] 
**model** | **NSString*** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] 
**batch** | **NSNumber*** | When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not. | [optional] 
**images** | **NSNumber*** | The number of images processed. | 
**source** | **NSString*** | When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;. | [optional] 
**size** | **NSString*** | When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result. | [optional] 
**characters** | **NSNumber*** | The number of characters processed. | 
**seconds** | **NSNumber*** | The number of seconds processed. | 
**usageBytes** | **NSNumber*** | The vector stores usage in bytes. | 
**sessions** | **NSNumber*** | The number of code interpreter sessions. | 
**amount** | [**OAICostsResultAmount***](OAICostsResultAmount.md) |  | [optional] 
**lineItem** | **NSString*** | When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


