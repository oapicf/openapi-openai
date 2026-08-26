import { OtherChunkingStrategyResponseParam } from './other-chunking-strategy-response-param';
import { StaticChunkingStrategyRequestParam } from './static-chunking-strategy-request-param';
import { StaticChunkingStrategy } from './static-chunking-strategy';


/**
 * The strategy used to chunk the file.
 */
/**
 * @type VectorStoreFileObjectChunkingStrategy
 * The strategy used to chunk the file.
 * @export
 */
export type VectorStoreFileObjectChunkingStrategy = OtherChunkingStrategyResponseParam | StaticChunkingStrategyRequestParam;

