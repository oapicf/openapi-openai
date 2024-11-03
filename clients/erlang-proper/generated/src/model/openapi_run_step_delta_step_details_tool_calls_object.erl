-module(openapi_run_step_delta_step_details_tool_calls_object).

-include("openapi.hrl").

-export([openapi_run_step_delta_step_details_tool_calls_object/0]).

-export([openapi_run_step_delta_step_details_tool_calls_object/1]).

-export_type([openapi_run_step_delta_step_details_tool_calls_object/0]).

-type openapi_run_step_delta_step_details_tool_calls_object() ::
  [ {'type', binary() }
  | {'tool_calls', list(openapi_run_step_delta_step_details_tool_calls_object_tool_calls_inner:openapi_run_step_delta_step_details_tool_calls_object_tool_calls_inner()) }
  ].


openapi_run_step_delta_step_details_tool_calls_object() ->
    openapi_run_step_delta_step_details_tool_calls_object([]).

openapi_run_step_delta_step_details_tool_calls_object(Fields) ->
  Default = [ {'type', elements([<<"tool_calls">>]) }
            , {'tool_calls', list(openapi_run_step_delta_step_details_tool_calls_object_tool_calls_inner:openapi_run_step_delta_step_details_tool_calls_object_tool_calls_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

