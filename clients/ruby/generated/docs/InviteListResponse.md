# OpenApiOpenAIClient::InviteListResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** | The object type, which is always &#x60;list&#x60; |  |
| **data** | [**Array&lt;Invite&gt;**](Invite.md) |  |  |
| **first_id** | **String** | The first &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60; | [optional] |
| **last_id** | **String** | The last &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60; | [optional] |
| **has_more** | **Boolean** | The &#x60;has_more&#x60; property is used for pagination to indicate there are additional results. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::InviteListResponse.new(
  object: null,
  data: null,
  first_id: null,
  last_id: null,
  has_more: null
)
```

