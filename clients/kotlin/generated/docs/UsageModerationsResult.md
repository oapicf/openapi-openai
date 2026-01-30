
# UsageModerationsResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) |  |  |
| **inputTokens** | **kotlin.Int** | The aggregated number of input tokens used. |  |
| **numModelRequests** | **kotlin.Int** | The count of requests made to the model. |  |
| **projectId** | **kotlin.String** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. |  [optional] |
| **userId** | **kotlin.String** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. |  [optional] |
| **apiKeyId** | **kotlin.String** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. |  [optional] |
| **model** | **kotlin.String** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. |  [optional] |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | organization.usage.moderations.result |



