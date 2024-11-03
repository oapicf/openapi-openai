-module(openapi_assistants_api_named_tool_choice).

-export([encode/1]).

-export_type([openapi_assistants_api_named_tool_choice/0]).

-type openapi_assistants_api_named_tool_choice() ::
    #{ 'type' := binary(),
       'function' => openapi_chat_completion_named_tool_choice_function:openapi_chat_completion_named_tool_choice_function()
     }.

encode(#{ 'type' := Type,
          'function' := Function
        }) ->
    #{ 'type' => Type,
       'function' => Function
     }.
