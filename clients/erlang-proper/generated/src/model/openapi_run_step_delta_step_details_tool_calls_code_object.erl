-module(openapi_run_step_delta_step_details_tool_calls_code_object).

-include("openapi.hrl").

-export([openapi_run_step_delta_step_details_tool_calls_code_object/0]).

-export([openapi_run_step_delta_step_details_tool_calls_code_object/1]).

-export_type([openapi_run_step_delta_step_details_tool_calls_code_object/0]).

-type openapi_run_step_delta_step_details_tool_calls_code_object() ::
  [ {'index', integer() }
  | {'id', binary() }
  | {'type', binary() }
  | {'code_interpreter', openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter:openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter() }
  ].


openapi_run_step_delta_step_details_tool_calls_code_object() ->
    openapi_run_step_delta_step_details_tool_calls_code_object([]).

openapi_run_step_delta_step_details_tool_calls_code_object(Fields) ->
  Default = [ {'index', integer() }
            , {'id', binary() }
            , {'type', elements([<<"code_interpreter">>]) }
            , {'code_interpreter', openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter:openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

