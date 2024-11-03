-module(openapi_create_chat_completion_function_response).

-export([encode/1]).

-export_type([openapi_create_chat_completion_function_response/0]).

-type openapi_create_chat_completion_function_response() ::
    #{ 'id' := binary(),
       'choices' := list(),
       'created' := integer(),
       'model' := binary(),
       'system_fingerprint' => binary(),
       'object' := binary(),
       'usage' => openapi_completion_usage:openapi_completion_usage()
     }.

encode(#{ 'id' := Id,
          'choices' := Choices,
          'created' := Created,
          'model' := Model,
          'system_fingerprint' := SystemFingerprint,
          'object' := Object,
          'usage' := Usage
        }) ->
    #{ 'id' => Id,
       'choices' => Choices,
       'created' => Created,
       'model' => Model,
       'system_fingerprint' => SystemFingerprint,
       'object' => Object,
       'usage' => Usage
     }.
