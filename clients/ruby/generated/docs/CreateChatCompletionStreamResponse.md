# OpenApiOpenAIClient::CreateChatCompletionStreamResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | A unique identifier for the chat completion. Each chunk has the same ID. |  |
| **choices** | [**Array&lt;CreateChatCompletionStreamResponseChoicesInner&gt;**](CreateChatCompletionStreamResponseChoicesInner.md) | A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1. |  |
| **created** | **Integer** | The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp. |  |
| **model** | **String** | The model to generate the completion. |  |
| **system_fingerprint** | **String** | This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] |
| **object** | **String** | The object type, which is always &#x60;chat.completion.chunk&#x60;. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateChatCompletionStreamResponse.new(
  id: null,
  choices: null,
  created: null,
  model: null,
  system_fingerprint: null,
  object: null
)
```

