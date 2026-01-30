# InviteListResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **string** | The object type, which is always &#x60;list&#x60; | [default to undefined]
**data** | [**Array&lt;Invite&gt;**](Invite.md) |  | [default to undefined]
**first_id** | **string** | The first &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60; | [optional] [default to undefined]
**last_id** | **string** | The last &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60; | [optional] [default to undefined]
**has_more** | **boolean** | The &#x60;has_more&#x60; property is used for pagination to indicate there are additional results. | [optional] [default to undefined]

## Example

```typescript
import { InviteListResponse } from './api';

const instance: InviteListResponse = {
    object,
    data,
    first_id,
    last_id,
    has_more,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
