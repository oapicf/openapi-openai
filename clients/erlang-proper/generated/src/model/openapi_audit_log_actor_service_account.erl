-module(openapi_audit_log_actor_service_account).

-include("openapi.hrl").

-export([openapi_audit_log_actor_service_account/0]).

-export([openapi_audit_log_actor_service_account/1]).

-export_type([openapi_audit_log_actor_service_account/0]).

-type openapi_audit_log_actor_service_account() ::
  [ {'id', binary() }
  ].


openapi_audit_log_actor_service_account() ->
    openapi_audit_log_actor_service_account([]).

openapi_audit_log_actor_service_account(Fields) ->
  Default = [ {'id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

