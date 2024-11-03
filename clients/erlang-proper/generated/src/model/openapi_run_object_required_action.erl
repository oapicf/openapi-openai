-module(openapi_run_object_required_action).

-include("openapi.hrl").

-export([openapi_run_object_required_action/0]).

-export([openapi_run_object_required_action/1]).

-export_type([openapi_run_object_required_action/0]).

-type openapi_run_object_required_action() ::
  [ {'type', binary() }
  | {'submit_tool_outputs', openapi_run_object_required_action_submit_tool_outputs:openapi_run_object_required_action_submit_tool_outputs() }
  ].


openapi_run_object_required_action() ->
    openapi_run_object_required_action([]).

openapi_run_object_required_action(Fields) ->
  Default = [ {'type', elements([<<"submit_tool_outputs">>]) }
            , {'submit_tool_outputs', openapi_run_object_required_action_submit_tool_outputs:openapi_run_object_required_action_submit_tool_outputs() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

