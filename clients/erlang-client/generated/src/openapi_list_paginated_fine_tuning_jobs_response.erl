-module(openapi_list_paginated_fine_tuning_jobs_response).

-export([encode/1]).

-export_type([openapi_list_paginated_fine_tuning_jobs_response/0]).

-type openapi_list_paginated_fine_tuning_jobs_response() ::
    #{ 'data' := list(),
       'has_more' := boolean(),
       'object' := binary()
     }.

encode(#{ 'data' := Data,
          'has_more' := HasMore,
          'object' := Object
        }) ->
    #{ 'data' => Data,
       'has_more' => HasMore,
       'object' => Object
     }.
