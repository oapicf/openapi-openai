# OpenapiOpenai.UsageEmbeddingsResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** |  | 
**inputTokens** | **Number** | The aggregated number of input tokens used. | 
**numModelRequests** | **Number** | The count of requests made to the model. | 
**projectId** | **String** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] 
**userId** | **String** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] 
**apiKeyId** | **String** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] 
**model** | **String** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] 



## Enum: ObjectEnum


* `organization.usage.embeddings.result` (value: `"organization.usage.embeddings.result"`)




