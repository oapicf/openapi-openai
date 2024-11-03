-module(openapi_assistants_api_response_format).

-export([encode/1]).

-export_type([openapi_assistants_api_response_format/0]).

-type openapi_assistants_api_response_format() ::
    #{ 'type' => binary()
     }.

encode(#{ 'type' := Type
        }) ->
    #{ 'type' => Type
     }.
