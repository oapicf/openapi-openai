-module(openapi_chat_completion_request_message_content_part_refusal).

-export([encode/1]).

-export_type([openapi_chat_completion_request_message_content_part_refusal/0]).

-type openapi_chat_completion_request_message_content_part_refusal() ::
    #{ 'type' := binary(),
       'refusal' := binary()
     }.

encode(#{ 'type' := Type,
          'refusal' := Refusal
        }) ->
    #{ 'type' => Type,
       'refusal' => Refusal
     }.
