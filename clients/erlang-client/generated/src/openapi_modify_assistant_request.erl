-module(openapi_modify_assistant_request).

-export([encode/1]).

-export_type([openapi_modify_assistant_request/0]).

-type openapi_modify_assistant_request() ::
    #{ 'model' => binary(),
       'name' => binary(),
       'description' => binary(),
       'instructions' => binary(),
       'tools' => list(),
       'file_ids' => list(),
       'metadata' => maps:map()
     }.

encode(#{ 'model' := Model,
          'name' := Name,
          'description' := Description,
          'instructions' := Instructions,
          'tools' := Tools,
          'file_ids' := FileIds,
          'metadata' := Metadata
        }) ->
    #{ 'model' => Model,
       'name' => Name,
       'description' => Description,
       'instructions' => Instructions,
       'tools' => Tools,
       'file_ids' => FileIds,
       'metadata' => Metadata
     }.
