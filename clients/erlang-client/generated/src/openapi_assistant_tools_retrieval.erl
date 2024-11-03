-module(openapi_assistant_tools_retrieval).

-export([encode/1]).

-export_type([openapi_assistant_tools_retrieval/0]).

-type openapi_assistant_tools_retrieval() ::
    #{ 'type' := binary()
     }.

encode(#{ 'type' := Type
        }) ->
    #{ 'type' => Type
     }.
