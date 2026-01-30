# OpenApiOpenAIClient::UsageCodeInterpreterSessionsResult

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** |  |  |
| **sessions** | **Integer** | The number of code interpreter sessions. |  |
| **project_id** | **String** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::UsageCodeInterpreterSessionsResult.new(
  object: null,
  sessions: null,
  project_id: null
)
```

