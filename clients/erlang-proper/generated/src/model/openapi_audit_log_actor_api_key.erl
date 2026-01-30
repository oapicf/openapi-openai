-module(openapi_audit_log_actor_api_key).

-include("openapi.hrl").

-export([openapi_audit_log_actor_api_key/0]).

-export([openapi_audit_log_actor_api_key/1]).

-export_type([openapi_audit_log_actor_api_key/0]).

-type openapi_audit_log_actor_api_key() ::
  [ {'id', binary() }
  | {'type', binary() }
  | {'user', openapi_audit_log_actor_user:openapi_audit_log_actor_user() }
  | {'service_account', openapi_audit_log_actor_service_account:openapi_audit_log_actor_service_account() }
  ].


openapi_audit_log_actor_api_key() ->
    openapi_audit_log_actor_api_key([]).

openapi_audit_log_actor_api_key(Fields) ->
  Default = [ {'id', binary() }
            , {'type', elements([<<"user">>, <<"service_account">>]) }
            , {'user', openapi_audit_log_actor_user:openapi_audit_log_actor_user() }
            , {'service_account', openapi_audit_log_actor_service_account:openapi_audit_log_actor_service_account() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

