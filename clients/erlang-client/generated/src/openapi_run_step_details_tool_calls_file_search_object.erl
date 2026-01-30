-module(openapi_run_step_details_tool_calls_file_search_object).

-export([encode/1]).

-export_type([openapi_run_step_details_tool_calls_file_search_object/0]).

-type openapi_run_step_details_tool_calls_file_search_object() ::
    #{ 'id' := binary(),
       'type' := binary(),
       'file_search' := openapi_run_step_details_tool_calls_file_search_object_file_search:openapi_run_step_details_tool_calls_file_search_object_file_search()
     }.

encode(#{ 'id' := Id,
          'type' := Type,
          'file_search' := FileSearch
        }) ->
    #{ 'id' => Id,
       'type' => Type,
       'file_search' => FileSearch
     }.
