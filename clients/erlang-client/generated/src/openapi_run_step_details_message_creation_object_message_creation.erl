-module(openapi_run_step_details_message_creation_object_message_creation).

-export([encode/1]).

-export_type([openapi_run_step_details_message_creation_object_message_creation/0]).

-type openapi_run_step_details_message_creation_object_message_creation() ::
    #{ 'message_id' := binary()
     }.

encode(#{ 'message_id' := MessageId
        }) ->
    #{ 'message_id' => MessageId
     }.
