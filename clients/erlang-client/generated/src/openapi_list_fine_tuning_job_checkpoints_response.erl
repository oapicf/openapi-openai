-module(openapi_list_fine_tuning_job_checkpoints_response).

-export([encode/1]).

-export_type([openapi_list_fine_tuning_job_checkpoints_response/0]).

-type openapi_list_fine_tuning_job_checkpoints_response() ::
    #{ 'data' := list(),
       'object' := binary(),
       'first_id' => binary(),
       'last_id' => binary(),
       'has_more' := boolean()
     }.

encode(#{ 'data' := Data,
          'object' := Object,
          'first_id' := FirstId,
          'last_id' := LastId,
          'has_more' := HasMore
        }) ->
    #{ 'data' => Data,
       'object' => Object,
       'first_id' => FirstId,
       'last_id' => LastId,
       'has_more' => HasMore
     }.
