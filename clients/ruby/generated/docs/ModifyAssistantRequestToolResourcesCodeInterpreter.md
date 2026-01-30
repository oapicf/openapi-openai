# OpenApiOpenAIClient::ModifyAssistantRequestToolResourcesCodeInterpreter

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **file_ids** | **Array&lt;String&gt;** | Overrides the list of [file](/docs/api-reference/files) IDs made available to the &#x60;code_interpreter&#x60; tool. There can be a maximum of 20 files associated with the tool.  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ModifyAssistantRequestToolResourcesCodeInterpreter.new(
  file_ids: null
)
```

