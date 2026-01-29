# OpenApiOpenAIClient::MessageDeltaContentTextObjectTextAnnotationsInner

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::MessageDeltaContentTextObjectTextAnnotationsInner.openapi_one_of
# =>
# [
#   :'MessageDeltaContentTextAnnotationsFileCitationObject',
#   :'MessageDeltaContentTextAnnotationsFilePathObject'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::MessageDeltaContentTextObjectTextAnnotationsInner.build(data)
# => #<MessageDeltaContentTextAnnotationsFileCitationObject:0x00007fdd4aab02a0>

OpenApiOpenAIClient::MessageDeltaContentTextObjectTextAnnotationsInner.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `MessageDeltaContentTextAnnotationsFileCitationObject`
- `MessageDeltaContentTextAnnotationsFilePathObject`
- `nil` (if no type matches)

