-module(openapi_audit_log_user_deleted).

-export([encode/1]).

-export_type([openapi_audit_log_user_deleted/0]).

-type openapi_audit_log_user_deleted() ::
    #{ 'id' => binary()
     }.

encode(#{ 'id' := Id
        }) ->
    #{ 'id' => Id
     }.
