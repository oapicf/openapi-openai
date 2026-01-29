-module(openapi_assistant_tools_code).

-include("openapi.hrl").

-export([openapi_assistant_tools_code/0]).

-export([openapi_assistant_tools_code/1]).

-export_type([openapi_assistant_tools_code/0]).

-type openapi_assistant_tools_code() ::
  [ {'type', binary() }
  ].


openapi_assistant_tools_code() ->
    openapi_assistant_tools_code([]).

openapi_assistant_tools_code(Fields) ->
  Default = [ {'type', elements([<<"code_interpreter">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

