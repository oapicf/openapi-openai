-module(openapi_create_completion_response).

-export([encode/1]).

-export_type([openapi_create_completion_response/0]).

-type openapi_create_completion_response() ::
    #{ 'id' := binary(),
       'object' := binary(),
       'created' := integer(),
       'model' := binary(),
       'choices' := list(),
       'usage' => openapi_create_completion_response_usage:openapi_create_completion_response_usage()
     }.

encode(#{ 'id' := Id,
          'object' := Object,
          'created' := Created,
          'model' := Model,
          'choices' := Choices,
          'usage' := Usage
        }) ->
    #{ 'id' => Id,
       'object' => Object,
       'created' => Created,
       'model' => Model,
       'choices' => Choices,
       'usage' => Usage
     }.
