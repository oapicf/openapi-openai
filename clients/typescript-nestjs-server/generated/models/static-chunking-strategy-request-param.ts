import { StaticChunkingStrategy } from './static-chunking-strategy';


export interface StaticChunkingStrategyRequestParam { 
  /**
   * Always `static`.
   */
  type: StaticChunkingStrategyRequestParam.TypeEnum;
  'static': StaticChunkingStrategy;
}
export namespace StaticChunkingStrategyRequestParam {
  export const TypeEnum = {
    Static: 'static'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


