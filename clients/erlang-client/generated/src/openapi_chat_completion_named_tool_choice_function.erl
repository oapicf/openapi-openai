-module(openapi_chat_completion_named_tool_choice_function).

-export([encode/1]).

-export_type([openapi_chat_completion_named_tool_choice_function/0]).

-type openapi_chat_completion_named_tool_choice_function() ::
    #{ 'name' := binary()
     }.

encode(#{ 'name' := Name
        }) ->
    #{ 'name' => Name
     }.
