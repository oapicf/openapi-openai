-module(openapi_run_step_details_tool_calls_file_search_result_object_content_inner).

-export([encode/1]).

-export_type([openapi_run_step_details_tool_calls_file_search_result_object_content_inner/0]).

-type openapi_run_step_details_tool_calls_file_search_result_object_content_inner() ::
    #{ 'type' => binary(),
       'text' => binary()
     }.

encode(#{ 'type' := Type,
          'text' := Text
        }) ->
    #{ 'type' => Type,
       'text' => Text
     }.
