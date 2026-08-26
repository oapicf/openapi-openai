

# InviteRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | Send an email to this address |  |
|**role** | [**RoleEnum**](#RoleEnum) | &#x60;owner&#x60; or &#x60;reader&#x60; |  |
|**projects** | [**List&lt;InviteRequestProjectsInner&gt;**](InviteRequestProjectsInner.md) | An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior. |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| READER | &quot;reader&quot; |
| OWNER | &quot;owner&quot; |



