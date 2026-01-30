

# Invite

Represents an individual `invite` to the organization.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`object`** | [**`Object`**](#`Object`) | The object type, which is always &#x60;organization.invite&#x60; | 
**id** | **String** | The identifier, which can be referenced in API endpoints | 
**email** | **String** | The email address of the individual to whom the invite was sent | 
**role** | [**Role**](#Role) | `owner&#x60; or &#x60;reader` | 
**status** | [**Status**](#Status) | `accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending` | 
**invitedAt** | **Int** | The Unix timestamp (in seconds) of when the invite was sent. | 
**expiresAt** | **Int** | The Unix timestamp (in seconds) of when the invite expires. | 
**acceptedAt** | **Int** | The Unix timestamp (in seconds) of when the invite was accepted. |  [optional]
**projects** | [**Seq&lt;InviteProjectsInner&gt;**](InviteProjectsInner.md) | The projects that were granted membership upon acceptance of the invite. |  [optional]


## Enum: `Object`
Allowed values: [organization.invite]



## Enum: Role
Allowed values: [owner, reader]



## Enum: Status
Allowed values: [accepted, expired, pending]




