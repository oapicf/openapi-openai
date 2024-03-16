-module(openapi_create_chat_completion_stream_response).

-export([encode/1]).

-export_type([openapi_create_chat_completion_stream_response/0]).

-type openapi_create_chat_completion_stream_response() ::
    #{ 'id' := binary(),
       'object' := binary(),
       'created' := integer(),
       'model' := binary(),
       'choices' := list()
     }.

encode(#{ 'id' := Id,
          'object' := Object,
          'created' := Created,
          'model' := Model,
          'choices' := Choices
        }) ->
    #{ 'id' => Id,
       'object' => Object,
       'created' => Created,
       'model' => Model,
       'choices' => Choices
     }.
