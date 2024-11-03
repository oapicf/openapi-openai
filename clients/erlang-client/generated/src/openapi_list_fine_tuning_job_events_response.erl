-module(openapi_list_fine_tuning_job_events_response).

-export([encode/1]).

-export_type([openapi_list_fine_tuning_job_events_response/0]).

-type openapi_list_fine_tuning_job_events_response() ::
    #{ 'data' := list(),
       'object' := binary()
     }.

encode(#{ 'data' := Data,
          'object' := Object
        }) ->
    #{ 'data' => Data,
       'object' => Object
     }.
