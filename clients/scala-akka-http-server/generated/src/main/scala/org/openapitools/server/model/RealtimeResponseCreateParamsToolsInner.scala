package org.openapitools.server.model


/**
 * @param `type` The type of the tool, i.e. `function`. for example: ''null''
 * @param name The name of the function. for example: ''null''
 * @param description The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything).  for example: ''null''
 * @param parameters Parameters of the function in JSON Schema. for example: ''null''
*/
final case class RealtimeResponseCreateParamsToolsInner (
  `type`: Option[String] = None,
  name: Option[String] = None,
  description: Option[String] = None,
  parameters: Option[Any] = None
)

