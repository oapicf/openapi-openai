-module(openapi_create_translation_response).

-export([encode/1]).

-export_type([openapi_create_translation_response/0]).

-type openapi_create_translation_response() ::
    #{ 'text' := binary()
     }.

encode(#{ 'text' := Text
        }) ->
    #{ 'text' => Text
     }.
