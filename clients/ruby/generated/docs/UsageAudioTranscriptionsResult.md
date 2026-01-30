# OpenApiOpenAIClient::UsageAudioTranscriptionsResult

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** |  |  |
| **seconds** | **Integer** | The number of seconds processed. |  |
| **num_model_requests** | **Integer** | The count of requests made to the model. |  |
| **project_id** | **String** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] |
| **user_id** | **String** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] |
| **api_key_id** | **String** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] |
| **model** | **String** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::UsageAudioTranscriptionsResult.new(
  object: null,
  seconds: null,
  num_model_requests: null,
  project_id: null,
  user_id: null,
  api_key_id: null,
  model: null
)
```

