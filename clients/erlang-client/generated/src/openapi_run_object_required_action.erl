-module(openapi_run_object_required_action).

-export([encode/1]).

-export_type([openapi_run_object_required_action/0]).

-type openapi_run_object_required_action() ::
    #{ 'type' := binary(),
       'submit_tool_outputs' := openapi_run_object_required_action_submit_tool_outputs:openapi_run_object_required_action_submit_tool_outputs()
     }.

encode(#{ 'type' := Type,
          'submit_tool_outputs' := SubmitToolOutputs
        }) ->
    #{ 'type' => Type,
       'submit_tool_outputs' => SubmitToolOutputs
     }.
