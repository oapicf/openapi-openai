-module(openapi_run_step_details_tool_calls_object_tool_calls_inner).

-include("openapi.hrl").

-export([openapi_run_step_details_tool_calls_object_tool_calls_inner/0]).

-export([openapi_run_step_details_tool_calls_object_tool_calls_inner/1]).

-export_type([openapi_run_step_details_tool_calls_object_tool_calls_inner/0]).

-type openapi_run_step_details_tool_calls_object_tool_calls_inner() ::
  [ {'id', binary() }
  | {'type', binary() }
  | {'code_interpreter', openapi_run_step_details_tool_calls_code_object_code_interpreter:openapi_run_step_details_tool_calls_code_object_code_interpreter() }
  | {'retrieval', map() }
  | {'function', openapi_run_step_details_tool_calls_function_object_function:openapi_run_step_details_tool_calls_function_object_function() }
  ].


openapi_run_step_details_tool_calls_object_tool_calls_inner() ->
    openapi_run_step_details_tool_calls_object_tool_calls_inner([]).

openapi_run_step_details_tool_calls_object_tool_calls_inner(Fields) ->
  Default = [ {'id', binary() }
            , {'type', elements([<<"code_interpreter">>, <<"retrieval">>, <<"function">>]) }
            , {'code_interpreter', openapi_run_step_details_tool_calls_code_object_code_interpreter:openapi_run_step_details_tool_calls_code_object_code_interpreter() }
            , {'retrieval', map() }
            , {'function', openapi_run_step_details_tool_calls_function_object_function:openapi_run_step_details_tool_calls_function_object_function() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

