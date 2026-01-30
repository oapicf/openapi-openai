# Invite

Represents an individual `invite` to the organization.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **string** | The object type, which is always &#x60;organization.invite&#x60; | [default to undefined]
**id** | **string** | The identifier, which can be referenced in API endpoints | [default to undefined]
**email** | **string** | The email address of the individual to whom the invite was sent | [default to undefined]
**role** | **string** | &#x60;owner&#x60; or &#x60;reader&#x60; | [default to undefined]
**status** | **string** | &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60; | [default to undefined]
**invited_at** | **number** | The Unix timestamp (in seconds) of when the invite was sent. | [default to undefined]
**expires_at** | **number** | The Unix timestamp (in seconds) of when the invite expires. | [default to undefined]
**accepted_at** | **number** | The Unix timestamp (in seconds) of when the invite was accepted. | [optional] [default to undefined]
**projects** | [**Array&lt;InviteProjectsInner&gt;**](InviteProjectsInner.md) | The projects that were granted membership upon acceptance of the invite. | [optional] [default to undefined]

## Example

```typescript
import { Invite } from './api';

const instance: Invite = {
    object,
    id,
    email,
    role,
    status,
    invited_at,
    expires_at,
    accepted_at,
    projects,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
