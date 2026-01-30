-module(openapi_usage_response).

-export([encode/1]).

-export_type([openapi_usage_response/0]).

-type openapi_usage_response() ::
    #{ 'object' := binary(),
       'data' := list(),
       'has_more' := boolean(),
       'next_page' := binary()
     }.

encode(#{ 'object' := Object,
          'data' := Data,
          'has_more' := HasMore,
          'next_page' := NextPage
        }) ->
    #{ 'object' => Object,
       'data' => Data,
       'has_more' => HasMore,
       'next_page' => NextPage
     }.
