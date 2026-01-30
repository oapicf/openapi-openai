-module(openapi_static_chunking_strategy_response_param).

-export([encode/1]).

-export_type([openapi_static_chunking_strategy_response_param/0]).

-type openapi_static_chunking_strategy_response_param() ::
    #{ 'type' := binary(),
       'static' := openapi_static_chunking_strategy:openapi_static_chunking_strategy()
     }.

encode(#{ 'type' := Type,
          'static' := Static
        }) ->
    #{ 'type' => Type,
       'static' => Static
     }.
