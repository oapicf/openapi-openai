-module(openapi_audit_log_service_account_created).

-export([encode/1]).

-export_type([openapi_audit_log_service_account_created/0]).

-type openapi_audit_log_service_account_created() ::
    #{ 'id' => binary(),
       'data' => openapi_audit_log_service_account_created_data:openapi_audit_log_service_account_created_data()
     }.

encode(#{ 'id' := Id,
          'data' := Data
        }) ->
    #{ 'id' => Id,
       'data' => Data
     }.
