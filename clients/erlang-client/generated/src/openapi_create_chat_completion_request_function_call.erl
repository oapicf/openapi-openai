-module(openapi_create_chat_completion_request_function_call).

-export([encode/1]).

-export_type([openapi_create_chat_completion_request_function_call/0]).

-type openapi_create_chat_completion_request_function_call() ::
    #{ 'name' := binary()
     }.

encode(#{ 'name' := Name
        }) ->
    #{ 'name' => Name
     }.
