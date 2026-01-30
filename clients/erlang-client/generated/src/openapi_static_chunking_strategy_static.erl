-module(openapi_static_chunking_strategy_static).

-export([encode/1]).

-export_type([openapi_static_chunking_strategy_static/0]).

-type openapi_static_chunking_strategy_static() ::
    #{ 'max_chunk_size_tokens' := integer(),
       'chunk_overlap_tokens' := integer()
     }.

encode(#{ 'max_chunk_size_tokens' := MaxChunkSizeTokens,
          'chunk_overlap_tokens' := ChunkOverlapTokens
        }) ->
    #{ 'max_chunk_size_tokens' => MaxChunkSizeTokens,
       'chunk_overlap_tokens' => ChunkOverlapTokens
     }.
