-module(openapi_audit_log_actor_user).

-include("openapi.hrl").

-export([openapi_audit_log_actor_user/0]).

-export([openapi_audit_log_actor_user/1]).

-export_type([openapi_audit_log_actor_user/0]).

-type openapi_audit_log_actor_user() ::
  [ {'id', binary() }
  | {'email', binary() }
  ].


openapi_audit_log_actor_user() ->
    openapi_audit_log_actor_user([]).

openapi_audit_log_actor_user(Fields) ->
  Default = [ {'id', binary() }
            , {'email', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

