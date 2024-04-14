-module(openapi_run_step_object_step_details).

-export([encode/1]).

-export_type([openapi_run_step_object_step_details/0]).

-type openapi_run_step_object_step_details() ::
    #{ 'type' := binary(),
       'message_creation' := openapi_run_step_details_message_creation_object_message_creation:openapi_run_step_details_message_creation_object_message_creation(),
       'tool_calls' := list()
     }.

encode(#{ 'type' := Type,
          'message_creation' := MessageCreation,
          'tool_calls' := ToolCalls
        }) ->
    #{ 'type' => Type,
       'message_creation' => MessageCreation,
       'tool_calls' => ToolCalls
     }.
