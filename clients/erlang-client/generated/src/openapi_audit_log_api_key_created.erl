-module(openapi_audit_log_api_key_created).

-export([encode/1]).

-export_type([openapi_audit_log_api_key_created/0]).

-type openapi_audit_log_api_key_created() ::
    #{ 'id' => binary(),
       'data' => openapi_audit_log_api_key_created_data:openapi_audit_log_api_key_created_data()
     }.

encode(#{ 'id' := Id,
          'data' := Data
        }) ->
    #{ 'id' => Id,
       'data' => Data
     }.
