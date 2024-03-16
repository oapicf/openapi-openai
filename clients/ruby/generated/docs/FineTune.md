# OpenApiOpenAIClient::FineTune

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** |  |  |
| **object** | **String** |  |  |
| **created_at** | **Integer** |  |  |
| **updated_at** | **Integer** |  |  |
| **model** | **String** |  |  |
| **fine_tuned_model** | **String** |  |  |
| **organization_id** | **String** |  |  |
| **status** | **String** |  |  |
| **hyperparams** | **Object** |  |  |
| **training_files** | [**Array&lt;OpenAIFile&gt;**](OpenAIFile.md) |  |  |
| **validation_files** | [**Array&lt;OpenAIFile&gt;**](OpenAIFile.md) |  |  |
| **result_files** | [**Array&lt;OpenAIFile&gt;**](OpenAIFile.md) |  |  |
| **events** | [**Array&lt;FineTuneEvent&gt;**](FineTuneEvent.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::FineTune.new(
  id: null,
  object: null,
  created_at: null,
  updated_at: null,
  model: null,
  fine_tuned_model: null,
  organization_id: null,
  status: null,
  hyperparams: null,
  training_files: null,
  validation_files: null,
  result_files: null,
  events: null
)
```

