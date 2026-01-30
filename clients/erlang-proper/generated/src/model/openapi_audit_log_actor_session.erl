-module(openapi_audit_log_actor_session).

-include("openapi.hrl").

-export([openapi_audit_log_actor_session/0]).

-export([openapi_audit_log_actor_session/1]).

-export_type([openapi_audit_log_actor_session/0]).

-type openapi_audit_log_actor_session() ::
  [ {'user', openapi_audit_log_actor_user:openapi_audit_log_actor_user() }
  | {'ip_address', binary() }
  ].


openapi_audit_log_actor_session() ->
    openapi_audit_log_actor_session([]).

openapi_audit_log_actor_session(Fields) ->
  Default = [ {'user', openapi_audit_log_actor_user:openapi_audit_log_actor_user() }
            , {'ip_address', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

