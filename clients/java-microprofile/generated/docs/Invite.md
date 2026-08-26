

# Invite

Represents an individual `invite` to the organization.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;organization.invite&#x60; |  |
|**id** | **String** | The identifier, which can be referenced in API endpoints |  |
|**email** | **String** | The email address of the individual to whom the invite was sent |  |
|**role** | [**RoleEnum**](#RoleEnum) | &#x60;owner&#x60; or &#x60;reader&#x60; |  |
|**status** | [**StatusEnum**](#StatusEnum) | &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60; |  |
|**invitedAt** | **Integer** | The Unix timestamp (in seconds) of when the invite was sent. |  |
|**expiresAt** | **Integer** | The Unix timestamp (in seconds) of when the invite expires. |  |
|**acceptedAt** | **Integer** | The Unix timestamp (in seconds) of when the invite was accepted. |  [optional] |
|**projects** | [**List&lt;InviteProjectsInner&gt;**](InviteProjectsInner.md) | The projects that were granted membership upon acceptance of the invite. |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| ORGANIZATION_INVITE | &quot;organization.invite&quot; |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| OWNER | &quot;owner&quot; |
| READER | &quot;reader&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;accepted&quot; |
| EXPIRED | &quot;expired&quot; |
| PENDING | &quot;pending&quot; |



