# OpenApiOpenAIClient::RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.openapi_one_of
# =>
# [
#   :'RunStepDetailsToolCallsCodeOutputImageObject',
#   :'RunStepDetailsToolCallsCodeOutputLogsObject'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.build(data)
# => #<RunStepDetailsToolCallsCodeOutputImageObject:0x00007fdd4aab02a0>

OpenApiOpenAIClient::RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `RunStepDetailsToolCallsCodeOutputImageObject`
- `RunStepDetailsToolCallsCodeOutputLogsObject`
- `nil` (if no type matches)

