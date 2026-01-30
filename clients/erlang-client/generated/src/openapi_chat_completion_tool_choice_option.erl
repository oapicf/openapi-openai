-module(openapi_chat_completion_tool_choice_option).

-export([encode/1]).

-export_type([openapi_chat_completion_tool_choice_option/0]).

-type openapi_chat_completion_tool_choice_option() ::
    #{ 'type' := binary(),
       'function' := openapi_assistants_named_tool_choice_function:openapi_assistants_named_tool_choice_function()
     }.

encode(#{ 'type' := Type,
          'function' := Function
        }) ->
    #{ 'type' => Type,
       'function' => Function
     }.
