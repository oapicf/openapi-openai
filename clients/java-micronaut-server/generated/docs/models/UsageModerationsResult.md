

# UsageModerationsResult

The aggregated moderations usage details of the specific time bucket.

The class is defined in **[UsageModerationsResult.java](../../src/main/java/org/openapitools/model/UsageModerationsResult.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_object** | [**ObjectEnum**](#ObjectEnum) |  | 
**inputTokens** | `Integer` | The aggregated number of input tokens used. | 
**numModelRequests** | `Integer` | The count of requests made to the model. | 
**projectId** | `String` | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. |  [optional property]
**userId** | `String` | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. |  [optional property]
**apiKeyId** | `String` | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. |  [optional property]
**model** | `String` | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. |  [optional property]

## ObjectEnum

Name | Value
---- | -----
ORGANIZATION_USAGE_MODERATIONS_RESULT | `"organization.usage.moderations.result"`








