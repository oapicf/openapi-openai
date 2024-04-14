-module(openapi_chat_completion_request_function_message).

-export([encode/1]).

-export_type([openapi_chat_completion_request_function_message/0]).

-type openapi_chat_completion_request_function_message() ::
    #{ 'role' := binary(),
       'content' := binary(),
       'name' := binary()
     }.

encode(#{ 'role' := Role,
          'content' := Content,
          'name' := Name
        }) ->
    #{ 'role' => Role,
       'content' => Content,
       'name' => Name
     }.
