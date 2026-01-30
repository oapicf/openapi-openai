-module(openapi_response_format_json_object).

-export([encode/1]).

-export_type([openapi_response_format_json_object/0]).

-type openapi_response_format_json_object() ::
    #{ 'type' := binary()
     }.

encode(#{ 'type' := Type
        }) ->
    #{ 'type' => Type
     }.
