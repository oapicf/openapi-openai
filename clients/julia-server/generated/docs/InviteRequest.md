# InviteRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`email`** | **`String`** | Send an email to this address | [default to nothing]
**`role`** | **`String`** | &#x60;owner&#x60; or &#x60;reader&#x60; | [default to nothing]
**`projects`** | [**`Vector{InviteRequestProjectsInner}`**](InviteRequestProjectsInner.md) | An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


