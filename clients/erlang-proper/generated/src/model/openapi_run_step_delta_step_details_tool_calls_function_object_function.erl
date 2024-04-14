-module(openapi_run_step_delta_step_details_tool_calls_function_object_function).

-include("openapi.hrl").

-export([openapi_run_step_delta_step_details_tool_calls_function_object_function/0]).

-export([openapi_run_step_delta_step_details_tool_calls_function_object_function/1]).

-export_type([openapi_run_step_delta_step_details_tool_calls_function_object_function/0]).

-type openapi_run_step_delta_step_details_tool_calls_function_object_function() ::
  [ {'name', binary() }
  | {'arguments', binary() }
  | {'output', binary() }
  ].


openapi_run_step_delta_step_details_tool_calls_function_object_function() ->
    openapi_run_step_delta_step_details_tool_calls_function_object_function([]).

openapi_run_step_delta_step_details_tool_calls_function_object_function(Fields) ->
  Default = [ {'name', binary() }
            , {'arguments', binary() }
            , {'output', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

