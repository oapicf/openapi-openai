-module(openapi_audit_log_project_archived).

-include("openapi.hrl").

-export([openapi_audit_log_project_archived/0]).

-export([openapi_audit_log_project_archived/1]).

-export_type([openapi_audit_log_project_archived/0]).

-type openapi_audit_log_project_archived() ::
  [ {'id', binary() }
  ].


openapi_audit_log_project_archived() ->
    openapi_audit_log_project_archived([]).

openapi_audit_log_project_archived(Fields) ->
  Default = [ {'id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

