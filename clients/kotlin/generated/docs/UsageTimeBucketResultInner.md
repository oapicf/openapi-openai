
# UsageTimeBucketResultInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) |  |  |
| **inputTokens** | **kotlin.Int** | The aggregated number of input tokens used. |  |
| **outputTokens** | **kotlin.Int** | The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. |  |
| **numModelRequests** | **kotlin.Int** | The count of requests made to the model. |  |
| **images** | **kotlin.Int** | The number of images processed. |  |
| **characters** | **kotlin.Int** | The number of characters processed. |  |
| **seconds** | **kotlin.Int** | The number of seconds processed. |  |
| **usageBytes** | **kotlin.Int** | The vector stores usage in bytes. |  |
| **sessions** | **kotlin.Int** | The number of code interpreter sessions. |  |
| **inputCachedTokens** | **kotlin.Int** | The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. |  [optional] |
| **inputAudioTokens** | **kotlin.Int** | The aggregated number of audio input tokens used, including cached tokens. |  [optional] |
| **outputAudioTokens** | **kotlin.Int** | The aggregated number of audio output tokens used. |  [optional] |
| **projectId** | **kotlin.String** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result. |  [optional] |
| **userId** | **kotlin.String** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. |  [optional] |
| **apiKeyId** | **kotlin.String** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. |  [optional] |
| **model** | **kotlin.String** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. |  [optional] |
| **batch** | **kotlin.Boolean** | When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not. |  [optional] |
| **source** | **kotlin.String** | When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;. |  [optional] |
| **propertySize** | **kotlin.String** | When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result. |  [optional] |
| **amount** | [**CostsResultAmount**](CostsResultAmount.md) |  |  [optional] |
| **lineItem** | **kotlin.String** | When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result. |  [optional] |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | organization.costs.result |



