-module(openapi_run_step_details_tool_calls_code_output_logs_object).

-export([encode/1]).

-export_type([openapi_run_step_details_tool_calls_code_output_logs_object/0]).

-type openapi_run_step_details_tool_calls_code_output_logs_object() ::
    #{ 'type' := binary(),
       'logs' := binary()
     }.

encode(#{ 'type' := Type,
          'logs' := Logs
        }) ->
    #{ 'type' => Type,
       'logs' => Logs
     }.
