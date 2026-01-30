-module(openapi_chat_completion_request_assistant_message_audio).

-export([encode/1]).

-export_type([openapi_chat_completion_request_assistant_message_audio/0]).

-type openapi_chat_completion_request_assistant_message_audio() ::
    #{ 'id' := binary()
     }.

encode(#{ 'id' := Id
        }) ->
    #{ 'id' => Id
     }.
