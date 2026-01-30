-module(openapi_create_chat_completion_request_audio).

-export([encode/1]).

-export_type([openapi_create_chat_completion_request_audio/0]).

-type openapi_create_chat_completion_request_audio() ::
    #{ 'voice' := binary(),
       'format' := binary()
     }.

encode(#{ 'voice' := Voice,
          'format' := Format
        }) ->
    #{ 'voice' => Voice,
       'format' => Format
     }.
