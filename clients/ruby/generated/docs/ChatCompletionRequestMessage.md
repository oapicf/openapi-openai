# OpenApiOpenAIClient::ChatCompletionRequestMessage

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::ChatCompletionRequestMessage.openapi_one_of
# =>
# [
#   :'ChatCompletionRequestAssistantMessage',
#   :'ChatCompletionRequestDeveloperMessage',
#   :'ChatCompletionRequestFunctionMessage',
#   :'ChatCompletionRequestSystemMessage',
#   :'ChatCompletionRequestToolMessage',
#   :'ChatCompletionRequestUserMessage'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::ChatCompletionRequestMessage.build(data)
# => #<ChatCompletionRequestAssistantMessage:0x00007fdd4aab02a0>

OpenApiOpenAIClient::ChatCompletionRequestMessage.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `ChatCompletionRequestAssistantMessage`
- `ChatCompletionRequestDeveloperMessage`
- `ChatCompletionRequestFunctionMessage`
- `ChatCompletionRequestSystemMessage`
- `ChatCompletionRequestToolMessage`
- `ChatCompletionRequestUserMessage`
- `nil` (if no type matches)

