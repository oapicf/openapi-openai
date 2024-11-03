-module(openapi_chat_completion_request_system_message).

-export([encode/1]).

-export_type([openapi_chat_completion_request_system_message/0]).

-type openapi_chat_completion_request_system_message() ::
    #{ 'content' := binary(),
       'role' := binary(),
       'name' => binary()
     }.

encode(#{ 'content' := Content,
          'role' := Role,
          'name' := Name
        }) ->
    #{ 'content' => Content,
       'role' => Role,
       'name' => Name
     }.
