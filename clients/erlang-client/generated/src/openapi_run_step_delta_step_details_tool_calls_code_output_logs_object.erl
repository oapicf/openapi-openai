-module(openapi_run_step_delta_step_details_tool_calls_code_output_logs_object).

-export([encode/1]).

-export_type([openapi_run_step_delta_step_details_tool_calls_code_output_logs_object/0]).

-type openapi_run_step_delta_step_details_tool_calls_code_output_logs_object() ::
    #{ 'index' := integer(),
       'type' := binary(),
       'logs' => binary()
     }.

encode(#{ 'index' := Index,
          'type' := Type,
          'logs' := Logs
        }) ->
    #{ 'index' => Index,
       'type' => Type,
       'logs' => Logs
     }.
