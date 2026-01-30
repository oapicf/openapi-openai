-module(openapi_audit_log_user_updated).

-include("openapi.hrl").

-export([openapi_audit_log_user_updated/0]).

-export([openapi_audit_log_user_updated/1]).

-export_type([openapi_audit_log_user_updated/0]).

-type openapi_audit_log_user_updated() ::
  [ {'id', binary() }
  | {'changes_requested', openapi_audit_log_user_updated_changes_requested:openapi_audit_log_user_updated_changes_requested() }
  ].


openapi_audit_log_user_updated() ->
    openapi_audit_log_user_updated([]).

openapi_audit_log_user_updated(Fields) ->
  Default = [ {'id', binary() }
            , {'changes_requested', openapi_audit_log_user_updated_changes_requested:openapi_audit_log_user_updated_changes_requested() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

