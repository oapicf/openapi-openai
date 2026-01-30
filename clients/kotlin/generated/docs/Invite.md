
# Invite

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | The object type, which is always &#x60;organization.invite&#x60; |  |
| **id** | **kotlin.String** | The identifier, which can be referenced in API endpoints |  |
| **email** | **kotlin.String** | The email address of the individual to whom the invite was sent |  |
| **role** | [**inline**](#Role) | &#x60;owner&#x60; or &#x60;reader&#x60; |  |
| **status** | [**inline**](#Status) | &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60; |  |
| **invitedAt** | **kotlin.Int** | The Unix timestamp (in seconds) of when the invite was sent. |  |
| **expiresAt** | **kotlin.Int** | The Unix timestamp (in seconds) of when the invite expires. |  |
| **acceptedAt** | **kotlin.Int** | The Unix timestamp (in seconds) of when the invite was accepted. |  [optional] |
| **projects** | [**kotlin.collections.List&lt;InviteProjectsInner&gt;**](InviteProjectsInner.md) | The projects that were granted membership upon acceptance of the invite. |  [optional] |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | organization.invite |


<a id="Role"></a>
## Enum: role
| Name | Value |
| ---- | ----- |
| role | owner, reader |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | accepted, expired, pending |



