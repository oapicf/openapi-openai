-module(openapi_audit_log_invite_accepted).

-export([encode/1]).

-export_type([openapi_audit_log_invite_accepted/0]).

-type openapi_audit_log_invite_accepted() ::
    #{ 'id' => binary()
     }.

encode(#{ 'id' := Id
        }) ->
    #{ 'id' => Id
     }.
