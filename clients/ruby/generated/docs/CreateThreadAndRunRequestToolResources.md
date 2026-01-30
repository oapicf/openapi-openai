# OpenApiOpenAIClient::CreateThreadAndRunRequestToolResources

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **code_interpreter** | [**CreateAssistantRequestToolResourcesCodeInterpreter**](CreateAssistantRequestToolResourcesCodeInterpreter.md) |  | [optional] |
| **file_search** | [**AssistantObjectToolResourcesFileSearch**](AssistantObjectToolResourcesFileSearch.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateThreadAndRunRequestToolResources.new(
  code_interpreter: null,
  file_search: null
)
```

