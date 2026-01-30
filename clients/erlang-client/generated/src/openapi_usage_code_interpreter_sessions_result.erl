-module(openapi_usage_code_interpreter_sessions_result).

-export([encode/1]).

-export_type([openapi_usage_code_interpreter_sessions_result/0]).

-type openapi_usage_code_interpreter_sessions_result() ::
    #{ 'object' := binary(),
       'sessions' := integer(),
       'project_id' => binary()
     }.

encode(#{ 'object' := Object,
          'sessions' := Sessions,
          'project_id' := ProjectId
        }) ->
    #{ 'object' => Object,
       'sessions' => Sessions,
       'project_id' => ProjectId
     }.
