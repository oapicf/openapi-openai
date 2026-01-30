# InviteListResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** | The object type, which is always &#x60;list&#x60; | 
**VarData** | [**Invite[]**](Invite.md) |  | 
**FirstId** | **String** | The first &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60; | [optional] 
**LastId** | **String** | The last &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60; | [optional] 
**HasMore** | **Boolean** | The &#x60;has_more&#x60; property is used for pagination to indicate there are additional results. | [optional] 

## Examples

- Prepare the resource
```powershell
$InviteListResponse = Initialize-PSOpenAPIToolsInviteListResponse  -Object null `
 -VarData null `
 -FirstId null `
 -LastId null `
 -HasMore null
```

- Convert the resource to JSON
```powershell
$InviteListResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

