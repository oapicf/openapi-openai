-module(openapi_chat_completion_request_message_content_part_text).

-export([encode/1]).

-export_type([openapi_chat_completion_request_message_content_part_text/0]).

-type openapi_chat_completion_request_message_content_part_text() ::
    #{ 'type' := binary(),
       'text' := binary()
     }.

encode(#{ 'type' := Type,
          'text' := Text
        }) ->
    #{ 'type' => Type,
       'text' => Text
     }.
