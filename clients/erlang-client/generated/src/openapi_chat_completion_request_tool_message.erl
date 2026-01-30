-module(openapi_chat_completion_request_tool_message).

-export([encode/1]).

-export_type([openapi_chat_completion_request_tool_message/0]).

-type openapi_chat_completion_request_tool_message() ::
    #{ 'role' := binary(),
       'content' := openapi_chat_completion_request_tool_message_content:openapi_chat_completion_request_tool_message_content(),
       'tool_call_id' := binary()
     }.

encode(#{ 'role' := Role,
          'content' := Content,
          'tool_call_id' := ToolCallId
        }) ->
    #{ 'role' => Role,
       'content' => Content,
       'tool_call_id' => ToolCallId
     }.
