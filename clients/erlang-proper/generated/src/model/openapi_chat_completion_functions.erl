-module(openapi_chat_completion_functions).

-include("openapi.hrl").

-export([openapi_chat_completion_functions/0]).

-export([openapi_chat_completion_functions/1]).

-export_type([openapi_chat_completion_functions/0]).

-type openapi_chat_completion_functions() ::
  [ {'name', binary() }
  | {'description', binary() }
  | {'parameters', map() }
  ].


openapi_chat_completion_functions() ->
    openapi_chat_completion_functions([]).

openapi_chat_completion_functions(Fields) ->
  Default = [ {'name', binary() }
            , {'description', binary() }
            , {'parameters', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

