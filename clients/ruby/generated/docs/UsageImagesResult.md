# OpenApiOpenAIClient::UsageImagesResult

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** |  |  |
| **images** | **Integer** | The number of images processed. |  |
| **num_model_requests** | **Integer** | The count of requests made to the model. |  |
| **source** | **String** | When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;. | [optional] |
| **size** | **String** | When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result. | [optional] |
| **project_id** | **String** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] |
| **user_id** | **String** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] |
| **api_key_id** | **String** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] |
| **model** | **String** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::UsageImagesResult.new(
  object: null,
  images: null,
  num_model_requests: null,
  source: null,
  size: null,
  project_id: null,
  user_id: null,
  api_key_id: null,
  model: null
)
```

