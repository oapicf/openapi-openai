-module(openapi_run_step_delta_step_details_tool_calls_file_search_object).

-export([encode/1]).

-export_type([openapi_run_step_delta_step_details_tool_calls_file_search_object/0]).

-type openapi_run_step_delta_step_details_tool_calls_file_search_object() ::
    #{ 'index' := integer(),
       'id' => binary(),
       'type' := binary(),
       'file_search' := maps:map()
     }.

encode(#{ 'index' := Index,
          'id' := Id,
          'type' := Type,
          'file_search' := FileSearch
        }) ->
    #{ 'index' => Index,
       'id' => Id,
       'type' => Type,
       'file_search' => FileSearch
     }.
