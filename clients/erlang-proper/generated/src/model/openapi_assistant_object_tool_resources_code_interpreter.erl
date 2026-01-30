-module(openapi_assistant_object_tool_resources_code_interpreter).

-include("openapi.hrl").

-export([openapi_assistant_object_tool_resources_code_interpreter/0]).

-export([openapi_assistant_object_tool_resources_code_interpreter/1]).

-export_type([openapi_assistant_object_tool_resources_code_interpreter/0]).

-type openapi_assistant_object_tool_resources_code_interpreter() ::
  [ {'file_ids', list(binary()) }
  ].


openapi_assistant_object_tool_resources_code_interpreter() ->
    openapi_assistant_object_tool_resources_code_interpreter([]).

openapi_assistant_object_tool_resources_code_interpreter(Fields) ->
  Default = [ {'file_ids', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

