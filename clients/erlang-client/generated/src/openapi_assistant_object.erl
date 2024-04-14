-module(openapi_assistant_object).

-export([encode/1]).

-export_type([openapi_assistant_object/0]).

-type openapi_assistant_object() ::
    #{ 'id' := binary(),
       'object' := binary(),
       'created_at' := integer(),
       'name' := binary(),
       'description' := binary(),
       'model' := binary(),
       'instructions' := binary(),
       'tools' := list(),
       'file_ids' := list(),
       'metadata' := maps:map()
     }.

encode(#{ 'id' := Id,
          'object' := Object,
          'created_at' := CreatedAt,
          'name' := Name,
          'description' := Description,
          'model' := Model,
          'instructions' := Instructions,
          'tools' := Tools,
          'file_ids' := FileIds,
          'metadata' := Metadata
        }) ->
    #{ 'id' => Id,
       'object' => Object,
       'created_at' => CreatedAt,
       'name' => Name,
       'description' => Description,
       'model' => Model,
       'instructions' => Instructions,
       'tools' => Tools,
       'file_ids' => FileIds,
       'metadata' => Metadata
     }.
