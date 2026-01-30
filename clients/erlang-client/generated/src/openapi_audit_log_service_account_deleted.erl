-module(openapi_audit_log_service_account_deleted).

-export([encode/1]).

-export_type([openapi_audit_log_service_account_deleted/0]).

-type openapi_audit_log_service_account_deleted() ::
    #{ 'id' => binary()
     }.

encode(#{ 'id' := Id
        }) ->
    #{ 'id' => Id
     }.
