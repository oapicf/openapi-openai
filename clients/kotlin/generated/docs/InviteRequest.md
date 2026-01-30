
# InviteRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **email** | **kotlin.String** | Send an email to this address |  |
| **role** | [**inline**](#Role) | &#x60;owner&#x60; or &#x60;reader&#x60; |  |
| **projects** | [**kotlin.collections.List&lt;InviteRequestProjectsInner&gt;**](InviteRequestProjectsInner.md) | An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior. |  [optional] |


<a id="Role"></a>
## Enum: role
| Name | Value |
| ---- | ----- |
| role | reader, owner |



