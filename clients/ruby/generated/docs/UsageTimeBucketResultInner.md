# OpenApiOpenAIClient::UsageTimeBucketResultInner

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::UsageTimeBucketResultInner.openapi_one_of
# =>
# [
#   :'CostsResult',
#   :'UsageAudioSpeechesResult',
#   :'UsageAudioTranscriptionsResult',
#   :'UsageCodeInterpreterSessionsResult',
#   :'UsageCompletionsResult',
#   :'UsageEmbeddingsResult',
#   :'UsageImagesResult',
#   :'UsageModerationsResult',
#   :'UsageVectorStoresResult'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'openapi_openai'

OpenApiOpenAIClient::UsageTimeBucketResultInner.build(data)
# => #<CostsResult:0x00007fdd4aab02a0>

OpenApiOpenAIClient::UsageTimeBucketResultInner.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `CostsResult`
- `UsageAudioSpeechesResult`
- `UsageAudioTranscriptionsResult`
- `UsageCodeInterpreterSessionsResult`
- `UsageCompletionsResult`
- `UsageEmbeddingsResult`
- `UsageImagesResult`
- `UsageModerationsResult`
- `UsageVectorStoresResult`
- `nil` (if no type matches)

