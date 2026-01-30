
# User

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | The object type, which is always &#x60;organization.user&#x60; |  |
| **id** | **kotlin.String** | The identifier, which can be referenced in API endpoints |  |
| **name** | **kotlin.String** | The name of the user |  |
| **email** | **kotlin.String** | The email address of the user |  |
| **role** | [**inline**](#Role) | &#x60;owner&#x60; or &#x60;reader&#x60; |  |
| **addedAt** | **kotlin.Int** | The Unix timestamp (in seconds) of when the user was added. |  |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | organization.user |


<a id="Role"></a>
## Enum: role
| Name | Value |
| ---- | ----- |
| role | owner, reader |



