-module(openapi_audit_log_project_created_data).

-include("openapi.hrl").

-export([openapi_audit_log_project_created_data/0]).

-export([openapi_audit_log_project_created_data/1]).

-export_type([openapi_audit_log_project_created_data/0]).

-type openapi_audit_log_project_created_data() ::
  [ {'name', binary() }
  | {'title', binary() }
  ].


openapi_audit_log_project_created_data() ->
    openapi_audit_log_project_created_data([]).

openapi_audit_log_project_created_data(Fields) ->
  Default = [ {'name', binary() }
            , {'title', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

