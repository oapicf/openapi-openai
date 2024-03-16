# OpenApiOpenAIClient::CreateImageRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **prompt** | **String** | A text description of the desired image(s). The maximum length is 1000 characters. |  |
| **n** | **Integer** | The number of images to generate. Must be between 1 and 10. | [optional][default to 1] |
| **size** | **String** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional][default to &#39;1024x1024&#39;] |
| **response_format** | **String** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional][default to &#39;url&#39;] |
| **user** | **String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateImageRequest.new(
  prompt: A cute baby sea otter,
  n: 1,
  size: 1024x1024,
  response_format: url,
  user: user-1234
)
```

