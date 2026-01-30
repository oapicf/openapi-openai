-module(openapi_audit_log_service_account_updated).

-export([encode/1]).

-export_type([openapi_audit_log_service_account_updated/0]).

-type openapi_audit_log_service_account_updated() ::
    #{ 'id' => binary(),
       'changes_requested' => openapi_audit_log_service_account_updated_changes_requested:openapi_audit_log_service_account_updated_changes_requested()
     }.

encode(#{ 'id' := Id,
          'changes_requested' := ChangesRequested
        }) ->
    #{ 'id' => Id,
       'changes_requested' => ChangesRequested
     }.
