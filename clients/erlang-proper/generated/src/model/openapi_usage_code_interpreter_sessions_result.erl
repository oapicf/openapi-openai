-module(openapi_usage_code_interpreter_sessions_result).

-include("openapi.hrl").

-export([openapi_usage_code_interpreter_sessions_result/0]).

-export([openapi_usage_code_interpreter_sessions_result/1]).

-export_type([openapi_usage_code_interpreter_sessions_result/0]).

-type openapi_usage_code_interpreter_sessions_result() ::
  [ {'object', binary() }
  | {'sessions', integer() }
  | {'project_id', binary() }
  ].


openapi_usage_code_interpreter_sessions_result() ->
    openapi_usage_code_interpreter_sessions_result([]).

openapi_usage_code_interpreter_sessions_result(Fields) ->
  Default = [ {'object', elements([<<"organization.usage.code_interpreter_sessions.result">>]) }
            , {'sessions', integer() }
            , {'project_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

