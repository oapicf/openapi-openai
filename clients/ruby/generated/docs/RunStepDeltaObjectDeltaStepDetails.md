# OpenApiOpenAIClient::RunStepDeltaObjectDeltaStepDetails

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::RunStepDeltaObjectDeltaStepDetails.openapi_one_of
# =>
# [
#   :'RunStepDeltaStepDetailsMessageCreationObject',
#   :'RunStepDeltaStepDetailsToolCallsObject'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::RunStepDeltaObjectDeltaStepDetails.build(data)
# => #<RunStepDeltaStepDetailsMessageCreationObject:0x00007fdd4aab02a0>

OpenApiOpenAIClient::RunStepDeltaObjectDeltaStepDetails.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `RunStepDeltaStepDetailsMessageCreationObject`
- `RunStepDeltaStepDetailsToolCallsObject`
- `nil` (if no type matches)

