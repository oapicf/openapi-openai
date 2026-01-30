-module(openapi_batch_request_counts).

-export([encode/1]).

-export_type([openapi_batch_request_counts/0]).

-type openapi_batch_request_counts() ::
    #{ 'total' := integer(),
       'completed' := integer(),
       'failed' := integer()
     }.

encode(#{ 'total' := Total,
          'completed' := Completed,
          'failed' := Failed
        }) ->
    #{ 'total' => Total,
       'completed' => Completed,
       'failed' => Failed
     }.
