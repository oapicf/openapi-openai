-module(openapi_audit_log_actor_service_account).

-export([encode/1]).

-export_type([openapi_audit_log_actor_service_account/0]).

-type openapi_audit_log_actor_service_account() ::
    #{ 'id' => binary()
     }.

encode(#{ 'id' := Id
        }) ->
    #{ 'id' => Id
     }.
