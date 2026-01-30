# audit_log_actor_api_key_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **char \*** | The tracking id of the API key. | [optional] 
**type** | **openai_api_audit_log_actor_api_key_TYPE_e** | The type of API key. Can be either &#x60;user&#x60; or &#x60;service_account&#x60;. | [optional] 
**user** | [**audit_log_actor_user_t**](audit_log_actor_user.md) \* |  | [optional] 
**service_account** | [**audit_log_actor_service_account_t**](audit_log_actor_service_account.md) \* |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


