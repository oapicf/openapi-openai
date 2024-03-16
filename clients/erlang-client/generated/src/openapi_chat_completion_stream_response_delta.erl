-module(openapi_chat_completion_stream_response_delta).

-export([encode/1]).

-export_type([openapi_chat_completion_stream_response_delta/0]).

-type openapi_chat_completion_stream_response_delta() ::
    #{ 'role' => binary(),
       'content' => binary(),
       'function_call' => openapi_chat_completion_request_message_function_call:openapi_chat_completion_request_message_function_call()
     }.

encode(#{ 'role' := Role,
          'content' := Content,
          'function_call' := FunctionCall
        }) ->
    #{ 'role' => Role,
       'content' => Content,
       'function_call' => FunctionCall
     }.
