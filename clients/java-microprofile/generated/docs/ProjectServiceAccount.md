

# ProjectServiceAccount

Represents an individual service account in a project.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;organization.project.service_account&#x60; |  |
|**id** | **String** | The identifier, which can be referenced in API endpoints |  |
|**name** | **String** | The name of the service account |  |
|**role** | [**RoleEnum**](#RoleEnum) | &#x60;owner&#x60; or &#x60;member&#x60; |  |
|**createdAt** | **Integer** | The Unix timestamp (in seconds) of when the service account was created |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| ORGANIZATION_PROJECT_SERVICE_ACCOUNT | &quot;organization.project.service_account&quot; |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| OWNER | &quot;owner&quot; |
| MEMBER | &quot;member&quot; |



