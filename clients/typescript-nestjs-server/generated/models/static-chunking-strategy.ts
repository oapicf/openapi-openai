import { StaticChunkingStrategyStatic } from './static-chunking-strategy-static';


export interface StaticChunkingStrategy { 
  /**
   * Always `static`.
   */
  type: StaticChunkingStrategy.TypeEnum;
  'static': StaticChunkingStrategyStatic;
}
export namespace StaticChunkingStrategy {
  export const TypeEnum = {
    Static: 'static'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


