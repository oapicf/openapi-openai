-module(openapi_assistant_tools_function).

-include("openapi.hrl").

-export([openapi_assistant_tools_function/0]).

-export([openapi_assistant_tools_function/1]).

-export_type([openapi_assistant_tools_function/0]).

-type openapi_assistant_tools_function() ::
  [ {'type', binary() }
  | {'function', openapi_function_object:openapi_function_object() }
  ].


openapi_assistant_tools_function() ->
    openapi_assistant_tools_function([]).

openapi_assistant_tools_function(Fields) ->
  Default = [ {'type', elements([<<"function">>]) }
            , {'function', openapi_function_object:openapi_function_object() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

