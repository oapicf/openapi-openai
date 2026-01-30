-module(openapi_audit_log_rate_limit_deleted).

-export([encode/1]).

-export_type([openapi_audit_log_rate_limit_deleted/0]).

-type openapi_audit_log_rate_limit_deleted() ::
    #{ 'id' => binary()
     }.

encode(#{ 'id' := Id
        }) ->
    #{ 'id' => Id
     }.
