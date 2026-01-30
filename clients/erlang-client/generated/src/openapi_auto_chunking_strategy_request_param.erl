-module(openapi_auto_chunking_strategy_request_param).

-export([encode/1]).

-export_type([openapi_auto_chunking_strategy_request_param/0]).

-type openapi_auto_chunking_strategy_request_param() ::
    #{ 'type' := binary()
     }.

encode(#{ 'type' := Type
        }) ->
    #{ 'type' => Type
     }.
