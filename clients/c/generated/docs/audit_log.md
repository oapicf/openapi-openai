# audit_log_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **char \*** | The ID of this log. | 
**type** | **audit_log_event_type_t \*** |  | 
**effective_at** | **int** | The Unix timestamp (in seconds) of the event. | 
**project** | [**audit_log_project_t**](audit_log_project.md) \* |  | [optional] 
**actor** | [**audit_log_actor_t**](audit_log_actor.md) \* |  | 
**api_key_created** | [**audit_log_api_key_created_t**](audit_log_api_key_created.md) \* |  | [optional] 
**api_key_updated** | [**audit_log_api_key_updated_t**](audit_log_api_key_updated.md) \* |  | [optional] 
**api_key_deleted** | [**audit_log_api_key_deleted_t**](audit_log_api_key_deleted.md) \* |  | [optional] 
**invite_sent** | [**audit_log_invite_sent_t**](audit_log_invite_sent.md) \* |  | [optional] 
**invite_accepted** | [**audit_log_invite_accepted_t**](audit_log_invite_accepted.md) \* |  | [optional] 
**invite_deleted** | [**audit_log_invite_accepted_t**](audit_log_invite_accepted.md) \* |  | [optional] 
**login_failed** | [**audit_log_login_failed_t**](audit_log_login_failed.md) \* |  | [optional] 
**logout_failed** | [**audit_log_login_failed_t**](audit_log_login_failed.md) \* |  | [optional] 
**organization_updated** | [**audit_log_organization_updated_t**](audit_log_organization_updated.md) \* |  | [optional] 
**project_created** | [**audit_log_project_created_t**](audit_log_project_created.md) \* |  | [optional] 
**project_updated** | [**audit_log_project_updated_t**](audit_log_project_updated.md) \* |  | [optional] 
**project_archived** | [**audit_log_project_archived_t**](audit_log_project_archived.md) \* |  | [optional] 
**rate_limit_updated** | [**audit_log_rate_limit_updated_t**](audit_log_rate_limit_updated.md) \* |  | [optional] 
**rate_limit_deleted** | [**audit_log_rate_limit_deleted_t**](audit_log_rate_limit_deleted.md) \* |  | [optional] 
**service_account_created** | [**audit_log_service_account_created_t**](audit_log_service_account_created.md) \* |  | [optional] 
**service_account_updated** | [**audit_log_service_account_updated_t**](audit_log_service_account_updated.md) \* |  | [optional] 
**service_account_deleted** | [**audit_log_service_account_deleted_t**](audit_log_service_account_deleted.md) \* |  | [optional] 
**user_added** | [**audit_log_user_added_t**](audit_log_user_added.md) \* |  | [optional] 
**user_updated** | [**audit_log_user_updated_t**](audit_log_user_updated.md) \* |  | [optional] 
**user_deleted** | [**audit_log_user_deleted_t**](audit_log_user_deleted.md) \* |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


