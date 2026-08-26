

/**
 * The default strategy. This strategy currently uses a `max_chunk_size_tokens` of `800` and `chunk_overlap_tokens` of `400`.
 */
export interface AutoChunkingStrategyRequestParam { 
  /**
   * Always `auto`.
   */
  type: AutoChunkingStrategyRequestParam.TypeEnum;
}
export namespace AutoChunkingStrategyRequestParam {
  export const TypeEnum = {
    Auto: 'auto'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


