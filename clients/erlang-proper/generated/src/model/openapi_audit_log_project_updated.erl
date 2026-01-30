-module(openapi_audit_log_project_updated).

-include("openapi.hrl").

-export([openapi_audit_log_project_updated/0]).

-export([openapi_audit_log_project_updated/1]).

-export_type([openapi_audit_log_project_updated/0]).

-type openapi_audit_log_project_updated() ::
  [ {'id', binary() }
  | {'changes_requested', openapi_audit_log_project_updated_changes_requested:openapi_audit_log_project_updated_changes_requested() }
  ].


openapi_audit_log_project_updated() ->
    openapi_audit_log_project_updated([]).

openapi_audit_log_project_updated(Fields) ->
  Default = [ {'id', binary() }
            , {'changes_requested', openapi_audit_log_project_updated_changes_requested:openapi_audit_log_project_updated_changes_requested() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

