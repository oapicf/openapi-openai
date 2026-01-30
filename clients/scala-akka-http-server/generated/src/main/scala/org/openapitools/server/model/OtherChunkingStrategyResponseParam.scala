package org.openapitools.server.model


/**
 * = Other Chunking Strategy =
 *
 * This is returned when the chunking strategy is unknown. Typically, this is because the file was indexed before the `chunking_strategy` concept was introduced in the API.
 *
 * @param `type` Always `other`. for example: ''null''
*/
final case class OtherChunkingStrategyResponseParam (
  `type`: String
)

