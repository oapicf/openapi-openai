-module(openapi_chat_completion_request_message).

-export([encode/1]).

-export_type([openapi_chat_completion_request_message/0]).

-type openapi_chat_completion_request_message() ::
    #{ 'role' := binary(),
       'content' => binary(),
       'name' => binary(),
       'function_call' => openapi_chat_completion_request_message_function_call:openapi_chat_completion_request_message_function_call()
     }.

encode(#{ 'role' := Role,
          'content' := Content,
          'name' := Name,
          'function_call' := FunctionCall
        }) ->
    #{ 'role' => Role,
       'content' => Content,
       'name' => Name,
       'function_call' => FunctionCall
     }.
