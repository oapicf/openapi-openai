-module(openapi_assistant_tools_file_search_type_only).

-export([encode/1]).

-export_type([openapi_assistant_tools_file_search_type_only/0]).

-type openapi_assistant_tools_file_search_type_only() ::
    #{ 'type' := binary()
     }.

encode(#{ 'type' := Type
        }) ->
    #{ 'type' => Type
     }.
