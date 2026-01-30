-module(openapi_chat_completion_named_tool_choice).

-export([encode/1]).

-export_type([openapi_chat_completion_named_tool_choice/0]).

-type openapi_chat_completion_named_tool_choice() ::
    #{ 'type' := binary(),
       'function' := openapi_assistants_named_tool_choice_function:openapi_assistants_named_tool_choice_function()
     }.

encode(#{ 'type' := Type,
          'function' := Function
        }) ->
    #{ 'type' => Type,
       'function' => Function
     }.
