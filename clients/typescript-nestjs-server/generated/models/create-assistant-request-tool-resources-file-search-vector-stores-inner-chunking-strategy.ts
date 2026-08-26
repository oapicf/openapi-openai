import { StaticChunkingStrategy } from './static-chunking-strategy';
import { AutoChunkingStrategyRequestParam } from './auto-chunking-strategy-request-param';
import { StaticChunkingStrategyStatic } from './static-chunking-strategy-static';


/**
 * The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
 */
/**
 * @type CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy
 * The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
 * @export
 */
export type CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy = AutoChunkingStrategyRequestParam | StaticChunkingStrategy;

