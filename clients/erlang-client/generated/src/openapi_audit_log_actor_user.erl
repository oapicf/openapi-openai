-module(openapi_audit_log_actor_user).

-export([encode/1]).

-export_type([openapi_audit_log_actor_user/0]).

-type openapi_audit_log_actor_user() ::
    #{ 'id' => binary(),
       'email' => binary()
     }.

encode(#{ 'id' := Id,
          'email' := Email
        }) ->
    #{ 'id' => Id,
       'email' => Email
     }.
