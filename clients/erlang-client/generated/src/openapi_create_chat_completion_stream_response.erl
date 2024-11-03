-module(openapi_create_chat_completion_stream_response).

-export([encode/1]).

-export_type([openapi_create_chat_completion_stream_response/0]).

-type openapi_create_chat_completion_stream_response() ::
    #{ 'id' := binary(),
       'choices' := list(),
       'created' := integer(),
       'model' := binary(),
       'system_fingerprint' => binary(),
       'object' := binary()
     }.

encode(#{ 'id' := Id,
          'choices' := Choices,
          'created' := Created,
          'model' := Model,
          'system_fingerprint' := SystemFingerprint,
          'object' := Object
        }) ->
    #{ 'id' => Id,
       'choices' => Choices,
       'created' => Created,
       'model' => Model,
       'system_fingerprint' => SystemFingerprint,
       'object' => Object
     }.
