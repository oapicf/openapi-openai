-module(openapi_chat_completion_named_tool_choice).

-include("openapi.hrl").

-export([openapi_chat_completion_named_tool_choice/0]).

-export([openapi_chat_completion_named_tool_choice/1]).

-export_type([openapi_chat_completion_named_tool_choice/0]).

-type openapi_chat_completion_named_tool_choice() ::
  [ {'type', binary() }
  | {'function', openapi_assistants_named_tool_choice_function:openapi_assistants_named_tool_choice_function() }
  ].


openapi_chat_completion_named_tool_choice() ->
    openapi_chat_completion_named_tool_choice([]).

openapi_chat_completion_named_tool_choice(Fields) ->
  Default = [ {'type', elements([<<"function">>]) }
            , {'function', openapi_assistants_named_tool_choice_function:openapi_assistants_named_tool_choice_function() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

