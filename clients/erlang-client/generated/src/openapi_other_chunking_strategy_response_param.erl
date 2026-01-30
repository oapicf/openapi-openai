-module(openapi_other_chunking_strategy_response_param).

-export([encode/1]).

-export_type([openapi_other_chunking_strategy_response_param/0]).

-type openapi_other_chunking_strategy_response_param() ::
    #{ 'type' := binary()
     }.

encode(#{ 'type' := Type
        }) ->
    #{ 'type' => Type
     }.
