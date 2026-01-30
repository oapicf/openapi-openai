# invite_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **char \*** | Send an email to this address | 
**role** | **openai_api_invite_request_ROLE_e** | &#x60;owner&#x60; or &#x60;reader&#x60; | 
**projects** | [**list_t**](invite_request_projects_inner.md) \* | An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


