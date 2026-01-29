-module(openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter).

-include("openapi.hrl").

-export([openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter/0]).

-export([openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter/1]).

-export_type([openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter/0]).

-type openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter() ::
  [ {'input', binary() }
  | {'outputs', list(openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner:openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner()) }
  ].


openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter() ->
    openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter([]).

openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter(Fields) ->
  Default = [ {'input', binary() }
            , {'outputs', list(openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner:openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

