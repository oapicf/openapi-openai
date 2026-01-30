-module(openapi_static_chunking_strategy).

-export([encode/1]).

-export_type([openapi_static_chunking_strategy/0]).

-type openapi_static_chunking_strategy() ::
    #{ 'type' := binary(),
       'static' := openapi_static_chunking_strategy_static:openapi_static_chunking_strategy_static()
     }.

encode(#{ 'type' := Type,
          'static' := Static
        }) ->
    #{ 'type' => Type,
       'static' => Static
     }.
