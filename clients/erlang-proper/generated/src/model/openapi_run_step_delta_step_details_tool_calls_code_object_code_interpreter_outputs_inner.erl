-module(openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner).

-include("openapi.hrl").

-export([openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner/0]).

-export([openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner/1]).

-export_type([openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner/0]).

-type openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner() ::
  [ {'index', integer() }
  | {'type', binary() }
  | {'logs', binary() }
  | {'image', openapi_run_step_delta_step_details_tool_calls_code_output_image_object_image:openapi_run_step_delta_step_details_tool_calls_code_output_image_object_image() }
  ].


openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner() ->
    openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner([]).

openapi_run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner(Fields) ->
  Default = [ {'index', integer() }
            , {'type', elements([<<"logs">>, <<"image">>]) }
            , {'logs', binary() }
            , {'image', openapi_run_step_delta_step_details_tool_calls_code_output_image_object_image:openapi_run_step_delta_step_details_tool_calls_code_output_image_object_image() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

