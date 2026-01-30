-module(openapi_audit_log_user_added).

-export([encode/1]).

-export_type([openapi_audit_log_user_added/0]).

-type openapi_audit_log_user_added() ::
    #{ 'id' => binary(),
       'data' => openapi_audit_log_user_added_data:openapi_audit_log_user_added_data()
     }.

encode(#{ 'id' := Id,
          'data' := Data
        }) ->
    #{ 'id' => Id,
       'data' => Data
     }.
