-module(openapi_modify_assistant_request_tool_resources_file_search).

-include("openapi.hrl").

-export([openapi_modify_assistant_request_tool_resources_file_search/0]).

-export([openapi_modify_assistant_request_tool_resources_file_search/1]).

-export_type([openapi_modify_assistant_request_tool_resources_file_search/0]).

-type openapi_modify_assistant_request_tool_resources_file_search() ::
  [ {'vector_store_ids', list(binary()) }
  ].


openapi_modify_assistant_request_tool_resources_file_search() ->
    openapi_modify_assistant_request_tool_resources_file_search([]).

openapi_modify_assistant_request_tool_resources_file_search(Fields) ->
  Default = [ {'vector_store_ids', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

