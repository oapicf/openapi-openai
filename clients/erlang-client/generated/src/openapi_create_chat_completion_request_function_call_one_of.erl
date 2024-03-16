-module(openapi_create_chat_completion_request_function_call_one_of).

-export([encode/1]).

-export_type([openapi_create_chat_completion_request_function_call_one_of/0]).

-type openapi_create_chat_completion_request_function_call_one_of() ::
    #{ 'name' := binary()
     }.

encode(#{ 'name' := Name
        }) ->
    #{ 'name' => Name
     }.
