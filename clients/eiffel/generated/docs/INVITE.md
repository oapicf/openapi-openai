# INVITE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | [**STRING_32**](STRING_32.md) | The object type, which is always &#x60;organization.invite&#x60; | [default to null]
**id** | [**STRING_32**](STRING_32.md) | The identifier, which can be referenced in API endpoints | [default to null]
**email** | [**STRING_32**](STRING_32.md) | The email address of the individual to whom the invite was sent | [default to null]
**role** | [**STRING_32**](STRING_32.md) | &#x60;owner&#x60; or &#x60;reader&#x60; | [default to null]
**status** | [**STRING_32**](STRING_32.md) | &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60; | [default to null]
**invited_at** | **INTEGER_32** | The Unix timestamp (in seconds) of when the invite was sent. | [default to null]
**expires_at** | **INTEGER_32** | The Unix timestamp (in seconds) of when the invite expires. | [default to null]
**accepted_at** | **INTEGER_32** | The Unix timestamp (in seconds) of when the invite was accepted. | [optional] [default to null]
**projects** | [**LIST [INVITE_PROJECTS_INNER]**](Invite_projects_inner.md) | The projects that were granted membership upon acceptance of the invite. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


