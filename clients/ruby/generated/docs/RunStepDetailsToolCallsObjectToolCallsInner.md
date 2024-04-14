# OpenApiOpenAIClient::RunStepDetailsToolCallsObjectToolCallsInner

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::RunStepDetailsToolCallsObjectToolCallsInner.openapi_one_of
# =>
# [
#   :'RunStepDetailsToolCallsCodeObject',
#   :'RunStepDetailsToolCallsFunctionObject',
#   :'RunStepDetailsToolCallsRetrievalObject'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::RunStepDetailsToolCallsObjectToolCallsInner.build(data)
# => #<RunStepDetailsToolCallsCodeObject:0x00007fdd4aab02a0>

OpenApiOpenAIClient::RunStepDetailsToolCallsObjectToolCallsInner.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `RunStepDetailsToolCallsCodeObject`
- `RunStepDetailsToolCallsFunctionObject`
- `RunStepDetailsToolCallsRetrievalObject`
- `nil` (if no type matches)

