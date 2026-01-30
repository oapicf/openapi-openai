-module(openapi_audit_log_service_account_created_data).

-export([encode/1]).

-export_type([openapi_audit_log_service_account_created_data/0]).

-type openapi_audit_log_service_account_created_data() ::
    #{ 'role' => binary()
     }.

encode(#{ 'role' := Role
        }) ->
    #{ 'role' => Role
     }.
