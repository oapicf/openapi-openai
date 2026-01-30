# OpenApiOpenAIClient::ChatCompletionRequestUserMessageContentPart

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::ChatCompletionRequestUserMessageContentPart.openapi_one_of
# =>
# [
#   :'ChatCompletionRequestMessageContentPartAudio',
#   :'ChatCompletionRequestMessageContentPartImage',
#   :'ChatCompletionRequestMessageContentPartText'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::ChatCompletionRequestUserMessageContentPart.build(data)
# => #<ChatCompletionRequestMessageContentPartAudio:0x00007fdd4aab02a0>

OpenApiOpenAIClient::ChatCompletionRequestUserMessageContentPart.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `ChatCompletionRequestMessageContentPartAudio`
- `ChatCompletionRequestMessageContentPartImage`
- `ChatCompletionRequestMessageContentPartText`
- `nil` (if no type matches)

