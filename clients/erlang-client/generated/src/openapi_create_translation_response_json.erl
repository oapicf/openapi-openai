-module(openapi_create_translation_response_json).

-export([encode/1]).

-export_type([openapi_create_translation_response_json/0]).

-type openapi_create_translation_response_json() ::
    #{ 'text' := binary()
     }.

encode(#{ 'text' := Text
        }) ->
    #{ 'text' => Text
     }.
