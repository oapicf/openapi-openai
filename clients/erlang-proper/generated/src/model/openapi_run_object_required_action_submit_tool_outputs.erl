-module(openapi_run_object_required_action_submit_tool_outputs).

-include("openapi.hrl").

-export([openapi_run_object_required_action_submit_tool_outputs/0]).

-export([openapi_run_object_required_action_submit_tool_outputs/1]).

-export_type([openapi_run_object_required_action_submit_tool_outputs/0]).

-type openapi_run_object_required_action_submit_tool_outputs() ::
  [ {'tool_calls', list(openapi_run_tool_call_object:openapi_run_tool_call_object()) }
  ].


openapi_run_object_required_action_submit_tool_outputs() ->
    openapi_run_object_required_action_submit_tool_outputs([]).

openapi_run_object_required_action_submit_tool_outputs(Fields) ->
  Default = [ {'tool_calls', list(openapi_run_tool_call_object:openapi_run_tool_call_object()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

