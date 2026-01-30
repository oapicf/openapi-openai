
# UsageImagesResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) |  |  |
| **images** | **kotlin.Int** | The number of images processed. |  |
| **numModelRequests** | **kotlin.Int** | The count of requests made to the model. |  |
| **source** | **kotlin.String** | When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;. |  [optional] |
| **propertySize** | **kotlin.String** | When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result. |  [optional] |
| **projectId** | **kotlin.String** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. |  [optional] |
| **userId** | **kotlin.String** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. |  [optional] |
| **apiKeyId** | **kotlin.String** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. |  [optional] |
| **model** | **kotlin.String** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. |  [optional] |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | organization.usage.images.result |



