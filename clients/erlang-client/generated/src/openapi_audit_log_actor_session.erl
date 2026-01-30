-module(openapi_audit_log_actor_session).

-export([encode/1]).

-export_type([openapi_audit_log_actor_session/0]).

-type openapi_audit_log_actor_session() ::
    #{ 'user' => openapi_audit_log_actor_user:openapi_audit_log_actor_user(),
       'ip_address' => binary()
     }.

encode(#{ 'user' := User,
          'ip_address' := IpAddress
        }) ->
    #{ 'user' => User,
       'ip_address' => IpAddress
     }.
