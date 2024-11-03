-module(openapi_list_runs_response).

-export([encode/1]).

-export_type([openapi_list_runs_response/0]).

-type openapi_list_runs_response() ::
    #{ 'object' := binary(),
       'data' := list(),
       'first_id' := binary(),
       'last_id' := binary(),
       'has_more' := boolean()
     }.

encode(#{ 'object' := Object,
          'data' := Data,
          'first_id' := FirstId,
          'last_id' := LastId,
          'has_more' := HasMore
        }) ->
    #{ 'object' => Object,
       'data' => Data,
       'first_id' => FirstId,
       'last_id' => LastId,
       'has_more' => HasMore
     }.
