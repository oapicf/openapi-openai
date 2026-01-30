

# ProjectServiceAccountCreateResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | [**ObjectEnum**](#ObjectEnum) |  |  |
|**id** | **String** |  |  |
|**name** | **String** |  |  |
|**role** | [**RoleEnum**](#RoleEnum) | Service accounts can only have one role of type &#x60;member&#x60; |  |
|**createdAt** | **Integer** |  |  |
|**apiKey** | [**ProjectServiceAccountApiKey**](ProjectServiceAccountApiKey.md) |  |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| ORGANIZATION_PROJECT_SERVICE_ACCOUNT | &quot;organization.project.service_account&quot; |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| MEMBER | &quot;member&quot; |



