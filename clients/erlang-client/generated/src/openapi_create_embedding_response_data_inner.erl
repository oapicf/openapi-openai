-module(openapi_create_embedding_response_data_inner).

-export([encode/1]).

-export_type([openapi_create_embedding_response_data_inner/0]).

-type openapi_create_embedding_response_data_inner() ::
    #{ 'index' := integer(),
       'object' := binary(),
       'embedding' := list()
     }.

encode(#{ 'index' := Index,
          'object' := Object,
          'embedding' := Embedding
        }) ->
    #{ 'index' => Index,
       'object' => Object,
       'embedding' => Embedding
     }.
