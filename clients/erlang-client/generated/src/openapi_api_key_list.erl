-module(openapi_api_key_list).

-export([encode/1]).

-export_type([openapi_api_key_list/0]).

-type openapi_api_key_list() ::
    #{ 'object' => binary(),
       'data' => list(),
       'has_more' => boolean(),
       'first_id' => binary(),
       'last_id' => binary()
     }.

encode(#{ 'object' := Object,
          'data' := Data,
          'has_more' := HasMore,
          'first_id' := FirstId,
          'last_id' := LastId
        }) ->
    #{ 'object' => Object,
       'data' => Data,
       'has_more' => HasMore,
       'first_id' => FirstId,
       'last_id' => LastId
     }.
