# Invite
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **object** | **String** | The object type, which is always &#x60;organization.invite&#x60; | [default to null] |
| **id** | **String** | The identifier, which can be referenced in API endpoints | [default to null] |
| **email** | **String** | The email address of the individual to whom the invite was sent | [default to null] |
| **role** | **String** | &#x60;owner&#x60; or &#x60;reader&#x60; | [default to null] |
| **status** | **String** | &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60; | [default to null] |
| **invited\_at** | **Integer** | The Unix timestamp (in seconds) of when the invite was sent. | [default to null] |
| **expires\_at** | **Integer** | The Unix timestamp (in seconds) of when the invite expires. | [default to null] |
| **accepted\_at** | **Integer** | The Unix timestamp (in seconds) of when the invite was accepted. | [optional] [default to null] |
| **projects** | [**List**](Invite_projects_inner.md) | The projects that were granted membership upon acceptance of the invite. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

