
# ProjectServiceAccount

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | The object type, which is always &#x60;organization.project.service_account&#x60; |  |
| **id** | **kotlin.String** | The identifier, which can be referenced in API endpoints |  |
| **name** | **kotlin.String** | The name of the service account |  |
| **role** | [**inline**](#Role) | &#x60;owner&#x60; or &#x60;member&#x60; |  |
| **createdAt** | **kotlin.Int** | The Unix timestamp (in seconds) of when the service account was created |  |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | organization.project.service_account |


<a id="Role"></a>
## Enum: role
| Name | Value |
| ---- | ----- |
| role | owner, member |



