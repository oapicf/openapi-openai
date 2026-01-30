-module(openapi_audit_log_project_created).

-include("openapi.hrl").

-export([openapi_audit_log_project_created/0]).

-export([openapi_audit_log_project_created/1]).

-export_type([openapi_audit_log_project_created/0]).

-type openapi_audit_log_project_created() ::
  [ {'id', binary() }
  | {'data', openapi_audit_log_project_created_data:openapi_audit_log_project_created_data() }
  ].


openapi_audit_log_project_created() ->
    openapi_audit_log_project_created([]).

openapi_audit_log_project_created(Fields) ->
  Default = [ {'id', binary() }
            , {'data', openapi_audit_log_project_created_data:openapi_audit_log_project_created_data() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

