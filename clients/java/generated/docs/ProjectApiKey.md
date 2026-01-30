

# ProjectApiKey

Represents an individual API key in a project.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;organization.project.api_key&#x60; |  |
|**redactedValue** | **String** | The redacted value of the API key |  |
|**name** | **String** | The name of the API key |  |
|**createdAt** | **Integer** | The Unix timestamp (in seconds) of when the API key was created |  |
|**id** | **String** | The identifier, which can be referenced in API endpoints |  |
|**owner** | [**ProjectApiKeyOwner**](ProjectApiKeyOwner.md) |  |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| ORGANIZATION_PROJECT_API_KEY | &quot;organization.project.api_key&quot; |



