-module(openapi_submit_tool_outputs_run_request_tool_outputs_inner).

-include("openapi.hrl").

-export([openapi_submit_tool_outputs_run_request_tool_outputs_inner/0]).

-export([openapi_submit_tool_outputs_run_request_tool_outputs_inner/1]).

-export_type([openapi_submit_tool_outputs_run_request_tool_outputs_inner/0]).

-type openapi_submit_tool_outputs_run_request_tool_outputs_inner() ::
  [ {'tool_call_id', binary() }
  | {'output', binary() }
  ].


openapi_submit_tool_outputs_run_request_tool_outputs_inner() ->
    openapi_submit_tool_outputs_run_request_tool_outputs_inner([]).

openapi_submit_tool_outputs_run_request_tool_outputs_inner(Fields) ->
  Default = [ {'tool_call_id', binary() }
            , {'output', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

