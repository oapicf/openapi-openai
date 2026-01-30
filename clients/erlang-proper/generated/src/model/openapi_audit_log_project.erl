-module(openapi_audit_log_project).

-include("openapi.hrl").

-export([openapi_audit_log_project/0]).

-export([openapi_audit_log_project/1]).

-export_type([openapi_audit_log_project/0]).

-type openapi_audit_log_project() ::
  [ {'id', binary() }
  | {'name', binary() }
  ].


openapi_audit_log_project() ->
    openapi_audit_log_project([]).

openapi_audit_log_project(Fields) ->
  Default = [ {'id', binary() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

