-module(openapi_modify_assistant_request_tool_resources).

-include("openapi.hrl").

-export([openapi_modify_assistant_request_tool_resources/0]).

-export([openapi_modify_assistant_request_tool_resources/1]).

-export_type([openapi_modify_assistant_request_tool_resources/0]).

-type openapi_modify_assistant_request_tool_resources() ::
  [ {'code_interpreter', openapi_modify_assistant_request_tool_resources_code_interpreter:openapi_modify_assistant_request_tool_resources_code_interpreter() }
  | {'file_search', openapi_modify_assistant_request_tool_resources_file_search:openapi_modify_assistant_request_tool_resources_file_search() }
  ].


openapi_modify_assistant_request_tool_resources() ->
    openapi_modify_assistant_request_tool_resources([]).

openapi_modify_assistant_request_tool_resources(Fields) ->
  Default = [ {'code_interpreter', openapi_modify_assistant_request_tool_resources_code_interpreter:openapi_modify_assistant_request_tool_resources_code_interpreter() }
            , {'file_search', openapi_modify_assistant_request_tool_resources_file_search:openapi_modify_assistant_request_tool_resources_file_search() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

