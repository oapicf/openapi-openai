-module(openapi_audit_log_actor).

-export([encode/1]).

-export_type([openapi_audit_log_actor/0]).

-type openapi_audit_log_actor() ::
    #{ 'type' => binary(),
       'session' => openapi_audit_log_actor_session:openapi_audit_log_actor_session(),
       'api_key' => openapi_audit_log_actor_api_key:openapi_audit_log_actor_api_key()
     }.

encode(#{ 'type' := Type,
          'session' := Session,
          'api_key' := ApiKey
        }) ->
    #{ 'type' => Type,
       'session' => Session,
       'api_key' => ApiKey
     }.
