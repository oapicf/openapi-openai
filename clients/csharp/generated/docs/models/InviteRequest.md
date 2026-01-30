# Org.OpenAPITools.Model.InviteRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Email** | **string** | Send an email to this address | 
**Role** | **string** | &#x60;owner&#x60; or &#x60;reader&#x60; | 
**Projects** | [**List&lt;InviteRequestProjectsInner&gt;**](InviteRequestProjectsInner.md) | An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

