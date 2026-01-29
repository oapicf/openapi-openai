# OpenApiOpenAIClient::AssistantsApiToolChoiceOption

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::AssistantsApiToolChoiceOption.openapi_one_of
# =>
# [
#   :'AssistantsApiNamedToolChoice',
#   :'String'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::AssistantsApiToolChoiceOption.build(data)
# => #<AssistantsApiNamedToolChoice:0x00007fdd4aab02a0>

OpenApiOpenAIClient::AssistantsApiToolChoiceOption.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `AssistantsApiNamedToolChoice`
- `String`
- `nil` (if no type matches)

