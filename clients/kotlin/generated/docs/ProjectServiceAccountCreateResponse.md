
# ProjectServiceAccountCreateResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) |  |  |
| **id** | **kotlin.String** |  |  |
| **name** | **kotlin.String** |  |  |
| **role** | [**inline**](#Role) | Service accounts can only have one role of type &#x60;member&#x60; |  |
| **createdAt** | **kotlin.Int** |  |  |
| **apiKey** | [**ProjectServiceAccountApiKey**](ProjectServiceAccountApiKey.md) |  |  |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | organization.project.service_account |


<a id="Role"></a>
## Enum: role
| Name | Value |
| ---- | ----- |
| role | member |



