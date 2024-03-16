-module(openapi_chat_completion_request_message_function_call).

-export([encode/1]).

-export_type([openapi_chat_completion_request_message_function_call/0]).

-type openapi_chat_completion_request_message_function_call() ::
    #{ 'name' => binary(),
       'arguments' => binary()
     }.

encode(#{ 'name' := Name,
          'arguments' := Arguments
        }) ->
    #{ 'name' => Name,
       'arguments' => Arguments
     }.
