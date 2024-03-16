-module(openapi_list_fine_tune_events_response).

-export([encode/1]).

-export_type([openapi_list_fine_tune_events_response/0]).

-type openapi_list_fine_tune_events_response() ::
    #{ 'object' := binary(),
       'data' := list()
     }.

encode(#{ 'object' := Object,
          'data' := Data
        }) ->
    #{ 'object' => Object,
       'data' => Data
     }.
