-module(openapi_assistant_object_tools_inner).

-include("openapi.hrl").

-export([openapi_assistant_object_tools_inner/0]).

-export([openapi_assistant_object_tools_inner/1]).

-export_type([openapi_assistant_object_tools_inner/0]).

-type openapi_assistant_object_tools_inner() ::
  [ {'type', binary() }
  | {'function', openapi_function_object:openapi_function_object() }
  ].


openapi_assistant_object_tools_inner() ->
    openapi_assistant_object_tools_inner([]).

openapi_assistant_object_tools_inner(Fields) ->
  Default = [ {'type', elements([<<"code_interpreter">>, <<"retrieval">>, <<"function">>]) }
            , {'function', openapi_function_object:openapi_function_object() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

