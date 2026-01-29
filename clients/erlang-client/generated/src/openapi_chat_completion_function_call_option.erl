-module(openapi_chat_completion_function_call_option).

-export([encode/1]).

-export_type([openapi_chat_completion_function_call_option/0]).

-type openapi_chat_completion_function_call_option() ::
    #{ 'name' := binary()
     }.

encode(#{ 'name' := Name
        }) ->
    #{ 'name' => Name
     }.
