# UsageTimeBucketResultInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String!** |  | [default to null]
**inputTokens** | **Int!** | The aggregated number of input tokens used. | [default to null]
**inputCachedTokens** | **Int!** | The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. | [optional] [default to null]
**outputTokens** | **Int!** | The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. | [default to null]
**inputAudioTokens** | **Int!** | The aggregated number of audio input tokens used, including cached tokens. | [optional] [default to null]
**outputAudioTokens** | **Int!** | The aggregated number of audio output tokens used. | [optional] [default to null]
**numModelRequests** | **Int!** | The count of requests made to the model. | [default to null]
**projectId** | **String** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result. | [optional] [default to null]
**userId** | **String** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] [default to null]
**apiKeyId** | **String** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] [default to null]
**model** | **String** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] [default to null]
**batch** | **Boolean** | When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not. | [optional] [default to null]
**images** | **Int!** | The number of images processed. | [default to null]
**source** | **String** | When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;. | [optional] [default to null]
**size** | **String** | When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result. | [optional] [default to null]
**characters** | **Int!** | The number of characters processed. | [default to null]
**seconds** | **Int!** | The number of seconds processed. | [default to null]
**usageBytes** | **Int!** | The vector stores usage in bytes. | [default to null]
**sessions** | **Int!** | The number of code interpreter sessions. | [default to null]
**amount** | [***CostsResultAmount**](CostsResult_amount.md) |  | [optional] [default to null]
**lineItem** | **String** | When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


