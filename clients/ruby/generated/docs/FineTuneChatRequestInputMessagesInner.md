# OpenApiOpenAIClient::FineTuneChatRequestInputMessagesInner

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::FineTuneChatRequestInputMessagesInner.openapi_one_of
# =>
# [
#   :'ChatCompletionRequestFunctionMessage',
#   :'ChatCompletionRequestSystemMessage',
#   :'ChatCompletionRequestToolMessage',
#   :'ChatCompletionRequestUserMessage',
#   :'FineTuneChatCompletionRequestAssistantMessage'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::FineTuneChatRequestInputMessagesInner.build(data)
# => #<ChatCompletionRequestFunctionMessage:0x00007fdd4aab02a0>

OpenApiOpenAIClient::FineTuneChatRequestInputMessagesInner.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `ChatCompletionRequestFunctionMessage`
- `ChatCompletionRequestSystemMessage`
- `ChatCompletionRequestToolMessage`
- `ChatCompletionRequestUserMessage`
- `FineTuneChatCompletionRequestAssistantMessage`
- `nil` (if no type matches)

