# # InviteRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **string** | Send an email to this address |
**role** | **string** | &#x60;owner&#x60; or &#x60;reader&#x60; |
**projects** | [**\OpenAPI\Client\Model\InviteRequestProjectsInner[]**](InviteRequestProjectsInner.md) | An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
