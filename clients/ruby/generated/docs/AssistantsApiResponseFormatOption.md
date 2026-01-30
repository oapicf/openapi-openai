# OpenApiOpenAIClient::AssistantsApiResponseFormatOption

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::AssistantsApiResponseFormatOption.openapi_one_of
# =>
# [
#   :'ResponseFormatJsonObject',
#   :'ResponseFormatJsonSchema',
#   :'ResponseFormatText',
#   :'String'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::AssistantsApiResponseFormatOption.build(data)
# => #<ResponseFormatJsonObject:0x00007fdd4aab02a0>

OpenApiOpenAIClient::AssistantsApiResponseFormatOption.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `ResponseFormatJsonObject`
- `ResponseFormatJsonSchema`
- `ResponseFormatText`
- `String`
- `nil` (if no type matches)

