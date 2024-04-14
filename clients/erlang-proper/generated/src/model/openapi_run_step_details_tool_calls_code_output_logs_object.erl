-module(openapi_run_step_details_tool_calls_code_output_logs_object).

-include("openapi.hrl").

-export([openapi_run_step_details_tool_calls_code_output_logs_object/0]).

-export([openapi_run_step_details_tool_calls_code_output_logs_object/1]).

-export_type([openapi_run_step_details_tool_calls_code_output_logs_object/0]).

-type openapi_run_step_details_tool_calls_code_output_logs_object() ::
  [ {'type', binary() }
  | {'logs', binary() }
  ].


openapi_run_step_details_tool_calls_code_output_logs_object() ->
    openapi_run_step_details_tool_calls_code_output_logs_object([]).

openapi_run_step_details_tool_calls_code_output_logs_object(Fields) ->
  Default = [ {'type', elements([<<"logs">>]) }
            , {'logs', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

