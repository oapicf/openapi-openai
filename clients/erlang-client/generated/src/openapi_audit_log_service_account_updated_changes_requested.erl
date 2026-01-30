-module(openapi_audit_log_service_account_updated_changes_requested).

-export([encode/1]).

-export_type([openapi_audit_log_service_account_updated_changes_requested/0]).

-type openapi_audit_log_service_account_updated_changes_requested() ::
    #{ 'role' => binary()
     }.

encode(#{ 'role' := Role
        }) ->
    #{ 'role' => Role
     }.
