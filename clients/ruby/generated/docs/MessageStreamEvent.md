# OpenApiOpenAIClient::MessageStreamEvent

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::MessageStreamEvent.openapi_one_of
# =>
# [
#   :'MessageStreamEventOneOf',
#   :'MessageStreamEventOneOf1',
#   :'MessageStreamEventOneOf2',
#   :'MessageStreamEventOneOf3',
#   :'MessageStreamEventOneOf4'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::MessageStreamEvent.build(data)
# => #<MessageStreamEventOneOf:0x00007fdd4aab02a0>

OpenApiOpenAIClient::MessageStreamEvent.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `MessageStreamEventOneOf`
- `MessageStreamEventOneOf1`
- `MessageStreamEventOneOf2`
- `MessageStreamEventOneOf3`
- `MessageStreamEventOneOf4`
- `nil` (if no type matches)

