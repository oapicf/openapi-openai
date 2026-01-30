-module(openapi_fine_tuning_job_event).

-export([encode/1]).

-export_type([openapi_fine_tuning_job_event/0]).

-type openapi_fine_tuning_job_event() ::
    #{ 'object' := binary(),
       'id' := binary(),
       'created_at' := integer(),
       'level' := binary(),
       'message' := binary(),
       'type' => binary(),
       'data' => maps:map()
     }.

encode(#{ 'object' := Object,
          'id' := Id,
          'created_at' := CreatedAt,
          'level' := Level,
          'message' := Message,
          'type' := Type,
          'data' := Data
        }) ->
    #{ 'object' => Object,
       'id' => Id,
       'created_at' => CreatedAt,
       'level' => Level,
       'message' => Message,
       'type' => Type,
       'data' => Data
     }.
