-module(openapi_embedding).

-export([encode/1]).

-export_type([openapi_embedding/0]).

-type openapi_embedding() ::
    #{ 'index' := integer(),
       'embedding' := list(),
       'object' := binary()
     }.

encode(#{ 'index' := Index,
          'embedding' := Embedding,
          'object' := Object
        }) ->
    #{ 'index' => Index,
       'embedding' => Embedding,
       'object' => Object
     }.
