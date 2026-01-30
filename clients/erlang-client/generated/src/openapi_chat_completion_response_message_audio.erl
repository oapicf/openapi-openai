-module(openapi_chat_completion_response_message_audio).

-export([encode/1]).

-export_type([openapi_chat_completion_response_message_audio/0]).

-type openapi_chat_completion_response_message_audio() ::
    #{ 'id' := binary(),
       'expires_at' := integer(),
       'data' := binary(),
       'transcript' := binary()
     }.

encode(#{ 'id' := Id,
          'expires_at' := ExpiresAt,
          'data' := Data,
          'transcript' := Transcript
        }) ->
    #{ 'id' => Id,
       'expires_at' => ExpiresAt,
       'data' => Data,
       'transcript' => Transcript
     }.
