import { StaticChunkingStrategyRequestParam } from './static-chunking-strategy-request-param';
import { StaticChunkingStrategy } from './static-chunking-strategy';
import { AutoChunkingStrategyRequestParam } from './auto-chunking-strategy-request-param';


/**
 * The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy. Only applicable if `file_ids` is non-empty.
 */
/**
 * @type CreateVectorStoreRequestChunkingStrategy
 * The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy. Only applicable if `file_ids` is non-empty.
 * @export
 */
export type CreateVectorStoreRequestChunkingStrategy = AutoChunkingStrategyRequestParam | StaticChunkingStrategyRequestParam;

