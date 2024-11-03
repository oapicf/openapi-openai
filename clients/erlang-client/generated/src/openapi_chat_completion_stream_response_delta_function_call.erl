-module(openapi_chat_completion_stream_response_delta_function_call).

-export([encode/1]).

-export_type([openapi_chat_completion_stream_response_delta_function_call/0]).

-type openapi_chat_completion_stream_response_delta_function_call() ::
    #{ 'arguments' => binary(),
       'name' => binary()
     }.

encode(#{ 'arguments' := Arguments,
          'name' := Name
        }) ->
    #{ 'arguments' => Arguments,
       'name' => Name
     }.
