-module(openapi_auto_chunking_strategy).

-export([encode/1]).

-export_type([openapi_auto_chunking_strategy/0]).

-type openapi_auto_chunking_strategy() ::
    #{ 'type' := binary()
     }.

encode(#{ 'type' := Type
        }) ->
    #{ 'type' => Type
     }.
