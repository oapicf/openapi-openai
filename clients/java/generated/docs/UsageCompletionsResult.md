

# UsageCompletionsResult

The aggregated completions usage details of the specific time bucket.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | [**ObjectEnum**](#ObjectEnum) |  |  |
|**inputTokens** | **Integer** | The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens. |  |
|**inputCachedTokens** | **Integer** | The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. |  [optional] |
|**outputTokens** | **Integer** | The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. |  |
|**inputAudioTokens** | **Integer** | The aggregated number of audio input tokens used, including cached tokens. |  [optional] |
|**outputAudioTokens** | **Integer** | The aggregated number of audio output tokens used. |  [optional] |
|**numModelRequests** | **Integer** | The count of requests made to the model. |  |
|**projectId** | **String** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. |  [optional] |
|**userId** | **String** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. |  [optional] |
|**apiKeyId** | **String** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. |  [optional] |
|**model** | **String** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. |  [optional] |
|**batch** | **Boolean** | When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not. |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| ORGANIZATION_USAGE_COMPLETIONS_RESULT | &quot;organization.usage.completions.result&quot; |



