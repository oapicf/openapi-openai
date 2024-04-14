-module(openapi_create_embedding_response).

-export([encode/1]).

-export_type([openapi_create_embedding_response/0]).

-type openapi_create_embedding_response() ::
    #{ 'data' := list(),
       'model' := binary(),
       'object' := binary(),
       'usage' := openapi_create_embedding_response_usage:openapi_create_embedding_response_usage()
     }.

encode(#{ 'data' := Data,
          'model' := Model,
          'object' := Object,
          'usage' := Usage
        }) ->
    #{ 'data' => Data,
       'model' => Model,
       'object' => Object,
       'usage' => Usage
     }.
