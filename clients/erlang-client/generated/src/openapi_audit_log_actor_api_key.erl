-module(openapi_audit_log_actor_api_key).

-export([encode/1]).

-export_type([openapi_audit_log_actor_api_key/0]).

-type openapi_audit_log_actor_api_key() ::
    #{ 'id' => binary(),
       'type' => binary(),
       'user' => openapi_audit_log_actor_user:openapi_audit_log_actor_user(),
       'service_account' => openapi_audit_log_actor_service_account:openapi_audit_log_actor_service_account()
     }.

encode(#{ 'id' := Id,
          'type' := Type,
          'user' := User,
          'service_account' := ServiceAccount
        }) ->
    #{ 'id' => Id,
       'type' => Type,
       'user' => User,
       'service_account' => ServiceAccount
     }.
