-module(openapi_assistants_api_response_format_option).

-export([encode/1]).

-export_type([openapi_assistants_api_response_format_option/0]).

-type openapi_assistants_api_response_format_option() ::
    #{ 'type' => binary()
     }.

encode(#{ 'type' := Type
        }) ->
    #{ 'type' => Type
     }.
