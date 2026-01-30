-module(openapi_run_step_details_tool_calls_file_search_result_object).

-export([encode/1]).

-export_type([openapi_run_step_details_tool_calls_file_search_result_object/0]).

-type openapi_run_step_details_tool_calls_file_search_result_object() ::
    #{ 'file_id' := binary(),
       'file_name' := binary(),
       'score' := integer(),
       'content' => list()
     }.

encode(#{ 'file_id' := FileId,
          'file_name' := FileName,
          'score' := Score,
          'content' := Content
        }) ->
    #{ 'file_id' => FileId,
       'file_name' => FileName,
       'score' => Score,
       'content' => Content
     }.
