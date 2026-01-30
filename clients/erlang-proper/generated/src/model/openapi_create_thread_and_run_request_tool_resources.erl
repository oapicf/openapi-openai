-module(openapi_create_thread_and_run_request_tool_resources).

-include("openapi.hrl").

-export([openapi_create_thread_and_run_request_tool_resources/0]).

-export([openapi_create_thread_and_run_request_tool_resources/1]).

-export_type([openapi_create_thread_and_run_request_tool_resources/0]).

-type openapi_create_thread_and_run_request_tool_resources() ::
  [ {'code_interpreter', openapi_create_assistant_request_tool_resources_code_interpreter:openapi_create_assistant_request_tool_resources_code_interpreter() }
  | {'file_search', openapi_assistant_object_tool_resources_file_search:openapi_assistant_object_tool_resources_file_search() }
  ].


openapi_create_thread_and_run_request_tool_resources() ->
    openapi_create_thread_and_run_request_tool_resources([]).

openapi_create_thread_and_run_request_tool_resources(Fields) ->
  Default = [ {'code_interpreter', openapi_create_assistant_request_tool_resources_code_interpreter:openapi_create_assistant_request_tool_resources_code_interpreter() }
            , {'file_search', openapi_assistant_object_tool_resources_file_search:openapi_assistant_object_tool_resources_file_search() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

