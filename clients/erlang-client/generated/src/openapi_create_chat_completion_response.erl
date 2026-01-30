-module(openapi_create_chat_completion_response).

-export([encode/1]).

-export_type([openapi_create_chat_completion_response/0]).

-type openapi_create_chat_completion_response() ::
    #{ 'id' := binary(),
       'choices' := list(),
       'created' := integer(),
       'model' := binary(),
       'service_tier' => binary(),
       'system_fingerprint' => binary(),
       'object' := binary(),
       'usage' => openapi_completion_usage:openapi_completion_usage()
     }.

encode(#{ 'id' := Id,
          'choices' := Choices,
          'created' := Created,
          'model' := Model,
          'service_tier' := ServiceTier,
          'system_fingerprint' := SystemFingerprint,
          'object' := Object,
          'usage' := Usage
        }) ->
    #{ 'id' => Id,
       'choices' => Choices,
       'created' => Created,
       'model' => Model,
       'service_tier' => ServiceTier,
       'system_fingerprint' => SystemFingerprint,
       'object' => Object,
       'usage' => Usage
     }.
