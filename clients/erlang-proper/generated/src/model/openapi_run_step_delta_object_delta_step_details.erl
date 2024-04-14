-module(openapi_run_step_delta_object_delta_step_details).

-include("openapi.hrl").

-export([openapi_run_step_delta_object_delta_step_details/0]).

-export([openapi_run_step_delta_object_delta_step_details/1]).

-export_type([openapi_run_step_delta_object_delta_step_details/0]).

-type openapi_run_step_delta_object_delta_step_details() ::
  [ {'type', binary() }
  | {'message_creation', openapi_run_step_delta_step_details_message_creation_object_message_creation:openapi_run_step_delta_step_details_message_creation_object_message_creation() }
  | {'tool_calls', list(openapi_run_step_delta_step_details_tool_calls_object_tool_calls_inner:openapi_run_step_delta_step_details_tool_calls_object_tool_calls_inner()) }
  ].


openapi_run_step_delta_object_delta_step_details() ->
    openapi_run_step_delta_object_delta_step_details([]).

openapi_run_step_delta_object_delta_step_details(Fields) ->
  Default = [ {'type', elements([<<"message_creation">>, <<"tool_calls">>]) }
            , {'message_creation', openapi_run_step_delta_step_details_message_creation_object_message_creation:openapi_run_step_delta_step_details_message_creation_object_message_creation() }
            , {'tool_calls', list(openapi_run_step_delta_step_details_tool_calls_object_tool_calls_inner:openapi_run_step_delta_step_details_tool_calls_object_tool_calls_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

