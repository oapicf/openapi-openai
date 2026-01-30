# invite_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **openai_api_invite_OBJECT_e** | The object type, which is always &#x60;organization.invite&#x60; | 
**id** | **char \*** | The identifier, which can be referenced in API endpoints | 
**email** | **char \*** | The email address of the individual to whom the invite was sent | 
**role** | **openai_api_invite_ROLE_e** | &#x60;owner&#x60; or &#x60;reader&#x60; | 
**status** | **openai_api_invite_STATUS_e** | &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60; | 
**invited_at** | **int** | The Unix timestamp (in seconds) of when the invite was sent. | 
**expires_at** | **int** | The Unix timestamp (in seconds) of when the invite expires. | 
**accepted_at** | **int** | The Unix timestamp (in seconds) of when the invite was accepted. | [optional] 
**projects** | [**list_t**](invite_projects_inner.md) \* | The projects that were granted membership upon acceptance of the invite. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


