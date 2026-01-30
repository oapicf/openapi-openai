
# UsageCompletionsResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) |  |  |
| **inputTokens** | **kotlin.Int** | The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens. |  |
| **outputTokens** | **kotlin.Int** | The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. |  |
| **numModelRequests** | **kotlin.Int** | The count of requests made to the model. |  |
| **inputCachedTokens** | **kotlin.Int** | The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. |  [optional] |
| **inputAudioTokens** | **kotlin.Int** | The aggregated number of audio input tokens used, including cached tokens. |  [optional] |
| **outputAudioTokens** | **kotlin.Int** | The aggregated number of audio output tokens used. |  [optional] |
| **projectId** | **kotlin.String** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. |  [optional] |
| **userId** | **kotlin.String** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. |  [optional] |
| **apiKeyId** | **kotlin.String** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. |  [optional] |
| **model** | **kotlin.String** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. |  [optional] |
| **batch** | **kotlin.Boolean** | When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not. |  [optional] |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | organization.usage.completions.result |



