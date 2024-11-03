# OpenApiOpenAIClient::MessageDeltaObjectDeltaContentInner

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::MessageDeltaObjectDeltaContentInner.openapi_one_of
# =>
# [
#   :'MessageDeltaContentImageFileObject',
#   :'MessageDeltaContentTextObject'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::MessageDeltaObjectDeltaContentInner.build(data)
# => #<MessageDeltaContentImageFileObject:0x00007fdd4aab02a0>

OpenApiOpenAIClient::MessageDeltaObjectDeltaContentInner.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `MessageDeltaContentImageFileObject`
- `MessageDeltaContentTextObject`
- `nil` (if no type matches)

