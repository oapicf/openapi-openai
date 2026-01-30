

# UsageImagesResult

The aggregated images usage details of the specific time bucket.

The class is defined in **[UsageImagesResult.java](../../src/main/java/org/openapitools/model/UsageImagesResult.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_object** | [**ObjectEnum**](#ObjectEnum) |  | 
**images** | `Integer` | The number of images processed. | 
**numModelRequests** | `Integer` | The count of requests made to the model. | 
**source** | `String` | When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;. |  [optional property]
**size** | `String` | When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result. |  [optional property]
**projectId** | `String` | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. |  [optional property]
**userId** | `String` | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. |  [optional property]
**apiKeyId** | `String` | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. |  [optional property]
**model** | `String` | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. |  [optional property]

## ObjectEnum

Name | Value
---- | -----
ORGANIZATION_USAGE_IMAGES_RESULT | `"organization.usage.images.result"`










