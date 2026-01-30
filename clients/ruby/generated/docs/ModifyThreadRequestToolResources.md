# OpenApiOpenAIClient::ModifyThreadRequestToolResources

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **code_interpreter** | [**CreateAssistantRequestToolResourcesCodeInterpreter**](CreateAssistantRequestToolResourcesCodeInterpreter.md) |  | [optional] |
| **file_search** | [**ModifyThreadRequestToolResourcesFileSearch**](ModifyThreadRequestToolResourcesFileSearch.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ModifyThreadRequestToolResources.new(
  code_interpreter: null,
  file_search: null
)
```

