# openapi::Invite

Represents an individual `invite` to the organization.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **character** | The object type, which is always &#x60;organization.invite&#x60; | [Enum: [organization.invite]] 
**id** | **character** | The identifier, which can be referenced in API endpoints | 
**email** | **character** | The email address of the individual to whom the invite was sent | 
**role** | **character** | &#x60;owner&#x60; or &#x60;reader&#x60; | [Enum: [owner, reader]] 
**status** | **character** | &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60; | [Enum: [accepted, expired, pending]] 
**invited_at** | **integer** | The Unix timestamp (in seconds) of when the invite was sent. | 
**expires_at** | **integer** | The Unix timestamp (in seconds) of when the invite expires. | 
**accepted_at** | **integer** | The Unix timestamp (in seconds) of when the invite was accepted. | [optional] 
**projects** | [**array[InviteProjectsInner]**](Invite_projects_inner.md) | The projects that were granted membership upon acceptance of the invite. | [optional] 


