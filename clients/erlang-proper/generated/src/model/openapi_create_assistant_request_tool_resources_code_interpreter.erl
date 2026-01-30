-module(openapi_create_assistant_request_tool_resources_code_interpreter).

-include("openapi.hrl").

-export([openapi_create_assistant_request_tool_resources_code_interpreter/0]).

-export([openapi_create_assistant_request_tool_resources_code_interpreter/1]).

-export_type([openapi_create_assistant_request_tool_resources_code_interpreter/0]).

-type openapi_create_assistant_request_tool_resources_code_interpreter() ::
  [ {'file_ids', list(binary()) }
  ].


openapi_create_assistant_request_tool_resources_code_interpreter() ->
    openapi_create_assistant_request_tool_resources_code_interpreter([]).

openapi_create_assistant_request_tool_resources_code_interpreter(Fields) ->
  Default = [ {'file_ids', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

