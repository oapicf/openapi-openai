-module(openapi_create_embedding_response).

-export([encode/1]).

-export_type([openapi_create_embedding_response/0]).

-type openapi_create_embedding_response() ::
    #{ 'object' := binary(),
       'model' := binary(),
       'data' := list(),
       'usage' := openapi_create_embedding_response_usage:openapi_create_embedding_response_usage()
     }.

encode(#{ 'object' := Object,
          'model' := Model,
          'data' := Data,
          'usage' := Usage
        }) ->
    #{ 'object' => Object,
       'model' => Model,
       'data' => Data,
       'usage' => Usage
     }.
