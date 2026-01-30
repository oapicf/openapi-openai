package model

import play.api.libs.json._

/**
  * The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy. Only applicable if `file_ids` is non-empty.
  * @param `type` Always `auto`.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateVectorStoreRequestChunkingStrategy(
  `type`: CreateVectorStoreRequestChunkingStrategy.Type.Value,
  static: StaticChunkingStrategy
  additionalProperties: 
)

object CreateVectorStoreRequestChunkingStrategy {
  implicit lazy val createVectorStoreRequestChunkingStrategyJsonFormat: Format[CreateVectorStoreRequestChunkingStrategy] = {
    val realJsonFormat = Json.format[CreateVectorStoreRequestChunkingStrategy]
    val declaredPropNames = Set("`type`", "static")
    
    Format(
      Reads {
        case JsObject(xs) =>
          val declaredProps = xs.filterKeys(declaredPropNames)
          val additionalProps = JsObject(xs -- declaredPropNames)
          val restructuredProps = declaredProps + ("additionalProperties" -> additionalProps)
          val newObj = JsObject(restructuredProps)
          realJsonFormat.reads(newObj)
        case _ =>
          JsError("error.expected.jsobject")
      },
      Writes { createVectorStoreRequestChunkingStrategy =>
        val jsObj = realJsonFormat.writes(createVectorStoreRequestChunkingStrategy)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Auto = Value("auto")
    val Static = Value("static")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

