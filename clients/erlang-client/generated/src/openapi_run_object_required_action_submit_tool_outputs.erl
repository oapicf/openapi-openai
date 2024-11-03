-module(openapi_run_object_required_action_submit_tool_outputs).

-export([encode/1]).

-export_type([openapi_run_object_required_action_submit_tool_outputs/0]).

-type openapi_run_object_required_action_submit_tool_outputs() ::
    #{ 'tool_calls' := list()
     }.

encode(#{ 'tool_calls' := ToolCalls
        }) ->
    #{ 'tool_calls' => ToolCalls
     }.
