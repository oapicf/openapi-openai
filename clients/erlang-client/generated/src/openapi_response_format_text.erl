-module(openapi_response_format_text).

-export([encode/1]).

-export_type([openapi_response_format_text/0]).

-type openapi_response_format_text() ::
    #{ 'type' := binary()
     }.

encode(#{ 'type' := Type
        }) ->
    #{ 'type' => Type
     }.
