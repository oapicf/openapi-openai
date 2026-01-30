-module(openapi_project).

-export([encode/1]).

-export_type([openapi_project/0]).

-type openapi_project() ::
    #{ 'id' := binary(),
       'object' := binary(),
       'name' := binary(),
       'created_at' := integer(),
       'archived_at' => integer(),
       'status' := binary()
     }.

encode(#{ 'id' := Id,
          'object' := Object,
          'name' := Name,
          'created_at' := CreatedAt,
          'archived_at' := ArchivedAt,
          'status' := Status
        }) ->
    #{ 'id' => Id,
       'object' => Object,
       'name' => Name,
       'created_at' => CreatedAt,
       'archived_at' => ArchivedAt,
       'status' => Status
     }.
