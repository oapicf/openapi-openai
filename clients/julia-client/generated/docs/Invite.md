# Invite


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`object`** | **`String`** | The object type, which is always &#x60;organization.invite&#x60; | [default to nothing]
**`id`** | **`String`** | The identifier, which can be referenced in API endpoints | [default to nothing]
**`email`** | **`String`** | The email address of the individual to whom the invite was sent | [default to nothing]
**`role`** | **`String`** | &#x60;owner&#x60; or &#x60;reader&#x60; | [default to nothing]
**`status`** | **`String`** | &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60; | [default to nothing]
**`invited_at`** | **`Int64`** | The Unix timestamp (in seconds) of when the invite was sent. | [default to nothing]
**`expires_at`** | **`Int64`** | The Unix timestamp (in seconds) of when the invite expires. | [default to nothing]
**`accepted_at`** | **`Int64`** | The Unix timestamp (in seconds) of when the invite was accepted. | [optional] [default to nothing]
**`projects`** | [**`Vector{InviteProjectsInner}`**](InviteProjectsInner.md) | The projects that were granted membership upon acceptance of the invite. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


