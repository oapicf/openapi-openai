-module(openapi_list_batches_response).

-export([encode/1]).

-export_type([openapi_list_batches_response/0]).

-type openapi_list_batches_response() ::
    #{ 'data' := list(),
       'first_id' => binary(),
       'last_id' => binary(),
       'has_more' := boolean(),
       'object' := binary()
     }.

encode(#{ 'data' := Data,
          'first_id' := FirstId,
          'last_id' := LastId,
          'has_more' := HasMore,
          'object' := Object
        }) ->
    #{ 'data' => Data,
       'first_id' => FirstId,
       'last_id' => LastId,
       'has_more' => HasMore,
       'object' => Object
     }.
