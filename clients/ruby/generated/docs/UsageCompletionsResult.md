# OpenApiOpenAIClient::UsageCompletionsResult

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** |  |  |
| **input_tokens** | **Integer** | The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens. |  |
| **input_cached_tokens** | **Integer** | The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. | [optional] |
| **output_tokens** | **Integer** | The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. |  |
| **input_audio_tokens** | **Integer** | The aggregated number of audio input tokens used, including cached tokens. | [optional] |
| **output_audio_tokens** | **Integer** | The aggregated number of audio output tokens used. | [optional] |
| **num_model_requests** | **Integer** | The count of requests made to the model. |  |
| **project_id** | **String** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] |
| **user_id** | **String** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] |
| **api_key_id** | **String** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] |
| **model** | **String** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] |
| **batch** | **Boolean** | When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::UsageCompletionsResult.new(
  object: null,
  input_tokens: null,
  input_cached_tokens: null,
  output_tokens: null,
  input_audio_tokens: null,
  output_audio_tokens: null,
  num_model_requests: null,
  project_id: null,
  user_id: null,
  api_key_id: null,
  model: null,
  batch: null
)
```

