-module(openapi_chat_completion_request_assistant_message_content_part).

-export([encode/1]).

-export_type([openapi_chat_completion_request_assistant_message_content_part/0]).

-type openapi_chat_completion_request_assistant_message_content_part() ::
    #{ 'type' := binary(),
       'text' := binary(),
       'refusal' := binary()
     }.

encode(#{ 'type' := Type,
          'text' := Text,
          'refusal' := Refusal
        }) ->
    #{ 'type' => Type,
       'text' => Text,
       'refusal' => Refusal
     }.
