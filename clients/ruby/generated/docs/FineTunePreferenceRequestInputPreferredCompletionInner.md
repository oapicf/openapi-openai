# OpenApiOpenAIClient::FineTunePreferenceRequestInputPreferredCompletionInner

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::FineTunePreferenceRequestInputPreferredCompletionInner.openapi_one_of
# =>
# [
#   :'ChatCompletionRequestAssistantMessage'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::FineTunePreferenceRequestInputPreferredCompletionInner.build(data)
# => #<ChatCompletionRequestAssistantMessage:0x00007fdd4aab02a0>

OpenApiOpenAIClient::FineTunePreferenceRequestInputPreferredCompletionInner.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `ChatCompletionRequestAssistantMessage`
- `nil` (if no type matches)

