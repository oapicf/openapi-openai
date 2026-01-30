# InviteListResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | The object type, which is always `list` | 
**data** | [**Vec<models::Invite>**](Invite.md) |  | 
**first_id** | Option<**String**> | The first `invite_id` in the retrieved `list` | [optional]
**last_id** | Option<**String**> | The last `invite_id` in the retrieved `list` | [optional]
**has_more** | Option<**bool**> | The `has_more` property is used for pagination to indicate there are additional results. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


