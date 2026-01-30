# OpenApiOpenAIClient::Invite

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** | The object type, which is always &#x60;organization.invite&#x60; |  |
| **id** | **String** | The identifier, which can be referenced in API endpoints |  |
| **email** | **String** | The email address of the individual to whom the invite was sent |  |
| **role** | **String** | &#x60;owner&#x60; or &#x60;reader&#x60; |  |
| **status** | **String** | &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60; |  |
| **invited_at** | **Integer** | The Unix timestamp (in seconds) of when the invite was sent. |  |
| **expires_at** | **Integer** | The Unix timestamp (in seconds) of when the invite expires. |  |
| **accepted_at** | **Integer** | The Unix timestamp (in seconds) of when the invite was accepted. | [optional] |
| **projects** | [**Array&lt;InviteProjectsInner&gt;**](InviteProjectsInner.md) | The projects that were granted membership upon acceptance of the invite. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::Invite.new(
  object: null,
  id: null,
  email: null,
  role: null,
  status: null,
  invited_at: null,
  expires_at: null,
  accepted_at: null,
  projects: null
)
```

