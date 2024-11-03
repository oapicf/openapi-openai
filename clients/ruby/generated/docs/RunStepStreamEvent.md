# OpenApiOpenAIClient::RunStepStreamEvent

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::RunStepStreamEvent.openapi_one_of
# =>
# [
#   :'RunStepStreamEventOneOf',
#   :'RunStepStreamEventOneOf1',
#   :'RunStepStreamEventOneOf2',
#   :'RunStepStreamEventOneOf3',
#   :'RunStepStreamEventOneOf4',
#   :'RunStepStreamEventOneOf5',
#   :'RunStepStreamEventOneOf6'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::RunStepStreamEvent.build(data)
# => #<RunStepStreamEventOneOf:0x00007fdd4aab02a0>

OpenApiOpenAIClient::RunStepStreamEvent.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `RunStepStreamEventOneOf`
- `RunStepStreamEventOneOf1`
- `RunStepStreamEventOneOf2`
- `RunStepStreamEventOneOf3`
- `RunStepStreamEventOneOf4`
- `RunStepStreamEventOneOf5`
- `RunStepStreamEventOneOf6`
- `nil` (if no type matches)

