-module(openapi_audit_log_actor).

-include("openapi.hrl").

-export([openapi_audit_log_actor/0]).

-export([openapi_audit_log_actor/1]).

-export_type([openapi_audit_log_actor/0]).

-type openapi_audit_log_actor() ::
  [ {'type', binary() }
  | {'session', openapi_audit_log_actor_session:openapi_audit_log_actor_session() }
  | {'api_key', openapi_audit_log_actor_api_key:openapi_audit_log_actor_api_key() }
  ].


openapi_audit_log_actor() ->
    openapi_audit_log_actor([]).

openapi_audit_log_actor(Fields) ->
  Default = [ {'type', elements([<<"session">>, <<"api_key">>]) }
            , {'session', openapi_audit_log_actor_session:openapi_audit_log_actor_session() }
            , {'api_key', openapi_audit_log_actor_api_key:openapi_audit_log_actor_api_key() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

