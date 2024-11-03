-module(openapi_submit_tool_outputs_run_request).

-export([encode/1]).

-export_type([openapi_submit_tool_outputs_run_request/0]).

-type openapi_submit_tool_outputs_run_request() ::
    #{ 'tool_outputs' := list(),
       'stream' => boolean()
     }.

encode(#{ 'tool_outputs' := ToolOutputs,
          'stream' := Stream
        }) ->
    #{ 'tool_outputs' => ToolOutputs,
       'stream' => Stream
     }.
