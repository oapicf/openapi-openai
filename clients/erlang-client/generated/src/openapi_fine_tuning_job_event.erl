-module(openapi_fine_tuning_job_event).

-export([encode/1]).

-export_type([openapi_fine_tuning_job_event/0]).

-type openapi_fine_tuning_job_event() ::
    #{ 'id' := binary(),
       'created_at' := integer(),
       'level' := binary(),
       'message' := binary(),
       'object' := binary()
     }.

encode(#{ 'id' := Id,
          'created_at' := CreatedAt,
          'level' := Level,
          'message' := Message,
          'object' := Object
        }) ->
    #{ 'id' => Id,
       'created_at' => CreatedAt,
       'level' => Level,
       'message' => Message,
       'object' => Object
     }.
