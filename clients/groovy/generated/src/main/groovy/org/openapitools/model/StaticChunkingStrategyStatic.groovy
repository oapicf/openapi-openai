package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class StaticChunkingStrategyStatic {
    /* The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`. */
    Integer maxChunkSizeTokens
    /* The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`.  */
    Integer chunkOverlapTokens
}
