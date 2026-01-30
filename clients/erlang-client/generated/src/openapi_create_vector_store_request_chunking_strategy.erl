-module(openapi_create_vector_store_request_chunking_strategy).

-export([encode/1]).

-export_type([openapi_create_vector_store_request_chunking_strategy/0]).

-type openapi_create_vector_store_request_chunking_strategy() ::
    #{ 'type' := binary(),
       'static' := openapi_static_chunking_strategy:openapi_static_chunking_strategy()
     }.

encode(#{ 'type' := Type,
          'static' := Static
        }) ->
    #{ 'type' => Type,
       'static' => Static
     }.
