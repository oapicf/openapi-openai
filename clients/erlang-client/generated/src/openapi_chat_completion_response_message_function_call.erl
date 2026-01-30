-module(openapi_chat_completion_response_message_function_call).

-export([encode/1]).

-export_type([openapi_chat_completion_response_message_function_call/0]).

-type openapi_chat_completion_response_message_function_call() ::
    #{ 'arguments' := binary(),
       'name' := binary()
     }.

encode(#{ 'arguments' := Arguments,
          'name' := Name
        }) ->
    #{ 'arguments' => Arguments,
       'name' => Name
     }.
