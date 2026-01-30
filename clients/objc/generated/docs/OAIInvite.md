# OAIInvite

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **NSString*** | The object type, which is always &#x60;organization.invite&#x60; | 
**_id** | **NSString*** | The identifier, which can be referenced in API endpoints | 
**email** | **NSString*** | The email address of the individual to whom the invite was sent | 
**role** | **NSString*** | &#x60;owner&#x60; or &#x60;reader&#x60; | 
**status** | **NSString*** | &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60; | 
**invitedAt** | **NSNumber*** | The Unix timestamp (in seconds) of when the invite was sent. | 
**expiresAt** | **NSNumber*** | The Unix timestamp (in seconds) of when the invite expires. | 
**acceptedAt** | **NSNumber*** | The Unix timestamp (in seconds) of when the invite was accepted. | [optional] 
**projects** | [**NSArray&lt;OAIInviteProjectsInner&gt;***](OAIInviteProjectsInner.md) | The projects that were granted membership upon acceptance of the invite. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


