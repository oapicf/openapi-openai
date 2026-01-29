package model

import play.api.libs.json._

/**
  * Represents an embedding vector returned by embedding endpoint. 
  * @param index The index of the embedding in the list of embeddings.
  * @param embedding The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
  * @param `object` The object type, which is always \"embedding\".
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class Embedding(
  index: Int,
  embedding: List[BigDecimal],
  `object`: Embedding.Object.Value
)

object Embedding {
  implicit lazy val embeddingJsonFormat: Format[Embedding] = Json.format[Embedding]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val Embedding = Value("embedding")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

