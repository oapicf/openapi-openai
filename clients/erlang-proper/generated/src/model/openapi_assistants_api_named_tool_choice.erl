-module(openapi_assistants_api_named_tool_choice).

-include("openapi.hrl").

-export([openapi_assistants_api_named_tool_choice/0]).

-export([openapi_assistants_api_named_tool_choice/1]).

-export_type([openapi_assistants_api_named_tool_choice/0]).

-type openapi_assistants_api_named_tool_choice() ::
  [ {'type', binary() }
  | {'function', openapi_chat_completion_named_tool_choice_function:openapi_chat_completion_named_tool_choice_function() }
  ].


openapi_assistants_api_named_tool_choice() ->
    openapi_assistants_api_named_tool_choice([]).

openapi_assistants_api_named_tool_choice(Fields) ->
  Default = [ {'type', elements([<<"function">>, <<"code_interpreter">>, <<"retrieval">>]) }
            , {'function', openapi_chat_completion_named_tool_choice_function:openapi_chat_completion_named_tool_choice_function() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

