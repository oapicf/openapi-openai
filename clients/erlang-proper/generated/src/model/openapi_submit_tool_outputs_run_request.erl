-module(openapi_submit_tool_outputs_run_request).

-include("openapi.hrl").

-export([openapi_submit_tool_outputs_run_request/0]).

-export([openapi_submit_tool_outputs_run_request/1]).

-export_type([openapi_submit_tool_outputs_run_request/0]).

-type openapi_submit_tool_outputs_run_request() ::
  [ {'tool_outputs', list(openapi_submit_tool_outputs_run_request_tool_outputs_inner:openapi_submit_tool_outputs_run_request_tool_outputs_inner()) }
  | {'stream', boolean() }
  ].


openapi_submit_tool_outputs_run_request() ->
    openapi_submit_tool_outputs_run_request([]).

openapi_submit_tool_outputs_run_request(Fields) ->
  Default = [ {'tool_outputs', list(openapi_submit_tool_outputs_run_request_tool_outputs_inner:openapi_submit_tool_outputs_run_request_tool_outputs_inner()) }
            , {'stream', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

