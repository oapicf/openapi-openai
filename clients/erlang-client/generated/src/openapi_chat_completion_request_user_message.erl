-module(openapi_chat_completion_request_user_message).

-export([encode/1]).

-export_type([openapi_chat_completion_request_user_message/0]).

-type openapi_chat_completion_request_user_message() ::
    #{ 'content' := openapi_chat_completion_request_user_message_content:openapi_chat_completion_request_user_message_content(),
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
