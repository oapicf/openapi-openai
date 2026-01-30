

# ProjectServiceAccountCreateResponse

The class is defined in **[ProjectServiceAccountCreateResponse.java](../../src/main/java/org/openapitools/model/ProjectServiceAccountCreateResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_object** | [**ObjectEnum**](#ObjectEnum) |  | 
**id** | `String` |  | 
**name** | `String` |  | 
**role** | [**RoleEnum**](#RoleEnum) | Service accounts can only have one role of type &#x60;member&#x60; | 
**createdAt** | `Integer` |  | 
**apiKey** | [`ProjectServiceAccountApiKey`](ProjectServiceAccountApiKey.md) |  | 

## ObjectEnum

Name | Value
---- | -----
ORGANIZATION_PROJECT_SERVICE_ACCOUNT | `"organization.project.service_account"`



## RoleEnum

Name | Value
---- | -----
MEMBER | `"member"`




