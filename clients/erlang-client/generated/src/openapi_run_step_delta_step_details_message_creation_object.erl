-module(openapi_run_step_delta_step_details_message_creation_object).

-export([encode/1]).

-export_type([openapi_run_step_delta_step_details_message_creation_object/0]).

-type openapi_run_step_delta_step_details_message_creation_object() ::
    #{ 'type' := binary(),
       'message_creation' => openapi_run_step_delta_step_details_message_creation_object_message_creation:openapi_run_step_delta_step_details_message_creation_object_message_creation()
     }.

encode(#{ 'type' := Type,
          'message_creation' := MessageCreation
        }) ->
    #{ 'type' => Type,
       'message_creation' => MessageCreation
     }.
