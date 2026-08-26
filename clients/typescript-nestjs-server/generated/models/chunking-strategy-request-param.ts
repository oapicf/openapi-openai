import { StaticChunkingStrategyRequestParam } from './static-chunking-strategy-request-param';
import { StaticChunkingStrategy } from './static-chunking-strategy';
import { AutoChunkingStrategyRequestParam } from './auto-chunking-strategy-request-param';


/**
 * The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
 */
/**
 * @type ChunkingStrategyRequestParam
 * The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
 * @export
 */
export type ChunkingStrategyRequestParam = AutoChunkingStrategyRequestParam | StaticChunkingStrategyRequestParam;

