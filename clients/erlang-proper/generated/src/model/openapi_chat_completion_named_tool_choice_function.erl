-module(openapi_chat_completion_named_tool_choice_function).

-include("openapi.hrl").

-export([openapi_chat_completion_named_tool_choice_function/0]).

-export([openapi_chat_completion_named_tool_choice_function/1]).

-export_type([openapi_chat_completion_named_tool_choice_function/0]).

-type openapi_chat_completion_named_tool_choice_function() ::
  [ {'name', binary() }
  ].


openapi_chat_completion_named_tool_choice_function() ->
    openapi_chat_completion_named_tool_choice_function([]).

openapi_chat_completion_named_tool_choice_function(Fields) ->
  Default = [ {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

