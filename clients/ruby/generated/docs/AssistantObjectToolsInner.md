# OpenApiOpenAIClient::AssistantObjectToolsInner

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::AssistantObjectToolsInner.openapi_one_of
# =>
# [
#   :'AssistantToolsCode',
#   :'AssistantToolsFunction',
#   :'AssistantToolsRetrieval'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::AssistantObjectToolsInner.build(data)
# => #<AssistantToolsCode:0x00007fdd4aab02a0>

OpenApiOpenAIClient::AssistantObjectToolsInner.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `AssistantToolsCode`
- `AssistantToolsFunction`
- `AssistantToolsRetrieval`
- `nil` (if no type matches)

