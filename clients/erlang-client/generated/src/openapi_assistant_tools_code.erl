-module(openapi_assistant_tools_code).

-export([encode/1]).

-export_type([openapi_assistant_tools_code/0]).

-type openapi_assistant_tools_code() ::
    #{ 'type' := binary()
     }.

encode(#{ 'type' := Type
        }) ->
    #{ 'type' => Type
     }.
