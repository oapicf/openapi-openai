# OpenApiOpenAIClient::ModifyThreadRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **tool_resources** | [**ModifyThreadRequestToolResources**](ModifyThreadRequestToolResources.md) |  | [optional] |
| **metadata** | **Object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ModifyThreadRequest.new(
  tool_resources: null,
  metadata: null
)
```

