-module(openapi_usage_time_bucket).

-export([encode/1]).

-export_type([openapi_usage_time_bucket/0]).

-type openapi_usage_time_bucket() ::
    #{ 'object' := binary(),
       'start_time' := integer(),
       'end_time' := integer(),
       'result' := list()
     }.

encode(#{ 'object' := Object,
          'start_time' := StartTime,
          'end_time' := EndTime,
          'result' := Result
        }) ->
    #{ 'object' => Object,
       'start_time' => StartTime,
       'end_time' => EndTime,
       'result' => Result
     }.
