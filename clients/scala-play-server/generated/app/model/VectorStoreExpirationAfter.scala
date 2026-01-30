package model

import play.api.libs.json._

/**
  * The expiration policy for a vector store.
  * @param anchor Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
  * @param days The number of days after the anchor time that the vector store will expire.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class VectorStoreExpirationAfter(
  anchor: VectorStoreExpirationAfter.Anchor.Value,
  days: Int
)

object VectorStoreExpirationAfter {
  implicit lazy val vectorStoreExpirationAfterJsonFormat: Format[VectorStoreExpirationAfter] = Json.format[VectorStoreExpirationAfter]

  // noinspection TypeAnnotation
  object Anchor extends Enumeration {
    val LastActiveAt = Value("last_active_at")

    type Anchor = Value
    implicit lazy val AnchorJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

