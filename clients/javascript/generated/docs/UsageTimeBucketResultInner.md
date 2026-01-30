# OpenapiOpenai.UsageTimeBucketResultInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** |  | 
**inputTokens** | **Number** | The aggregated number of input tokens used. | 
**inputCachedTokens** | **Number** | The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. | [optional] 
**outputTokens** | **Number** | The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. | 
**inputAudioTokens** | **Number** | The aggregated number of audio input tokens used, including cached tokens. | [optional] 
**outputAudioTokens** | **Number** | The aggregated number of audio output tokens used. | [optional] 
**numModelRequests** | **Number** | The count of requests made to the model. | 
**projectId** | **String** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result. | [optional] 
**userId** | **String** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] 
**apiKeyId** | **String** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] 
**model** | **String** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] 
**batch** | **Boolean** | When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not. | [optional] 
**images** | **Number** | The number of images processed. | 
**source** | **String** | When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;. | [optional] 
**size** | **String** | When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result. | [optional] 
**characters** | **Number** | The number of characters processed. | 
**seconds** | **Number** | The number of seconds processed. | 
**usageBytes** | **Number** | The vector stores usage in bytes. | 
**sessions** | **Number** | The number of code interpreter sessions. | 
**amount** | [**CostsResultAmount**](CostsResultAmount.md) |  | [optional] 
**lineItem** | **String** | When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result. | [optional] 



## Enum: ObjectEnum


* `organization.costs.result` (value: `"organization.costs.result"`)




