-module(openapi_submit_tool_outputs_run_request_tool_outputs_inner).

-export([encode/1]).

-export_type([openapi_submit_tool_outputs_run_request_tool_outputs_inner/0]).

-type openapi_submit_tool_outputs_run_request_tool_outputs_inner() ::
    #{ 'tool_call_id' => binary(),
       'output' => binary()
     }.

encode(#{ 'tool_call_id' := ToolCallId,
          'output' := Output
        }) ->
    #{ 'tool_call_id' => ToolCallId,
       'output' => Output
     }.
