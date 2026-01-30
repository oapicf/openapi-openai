

# ProjectUser

Represents an individual user in a project.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;organization.project.user&#x60; |  |
|**id** | **String** | The identifier, which can be referenced in API endpoints |  |
|**name** | **String** | The name of the user |  |
|**email** | **String** | The email address of the user |  |
|**role** | [**RoleEnum**](#RoleEnum) | &#x60;owner&#x60; or &#x60;member&#x60; |  |
|**addedAt** | **Integer** | The Unix timestamp (in seconds) of when the project was added. |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| ORGANIZATION_PROJECT_USER | &quot;organization.project.user&quot; |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| OWNER | &quot;owner&quot; |
| MEMBER | &quot;member&quot; |



