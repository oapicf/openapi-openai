-module(openapi_fine_tune_event).

-export([encode/1]).

-export_type([openapi_fine_tune_event/0]).

-type openapi_fine_tune_event() ::
    #{ 'object' := binary(),
       'created_at' := integer(),
       'level' := binary(),
       'message' := binary()
     }.

encode(#{ 'object' := Object,
          'created_at' := CreatedAt,
          'level' := Level,
          'message' := Message
        }) ->
    #{ 'object' => Object,
       'created_at' => CreatedAt,
       'level' => Level,
       'message' => Message
     }.
