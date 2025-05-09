package model

import play.api.libs.json._

/**
  * The details of the run step.
  * @param `type` Always `message_creation`.
  * @param toolCalls An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class RunStepObjectStepDetails(
  `type`: RunStepObjectStepDetails.Type.Value,
  messageCreation: RunStepDetailsMessageCreationObjectMessageCreation,
  toolCalls: List[RunStepDetailsToolCallsObjectToolCallsInner]
  additionalProperties: 
)

object RunStepObjectStepDetails {
  implicit lazy val runStepObjectStepDetailsJsonFormat: Format[RunStepObjectStepDetails] = {
    val realJsonFormat = Json.format[RunStepObjectStepDetails]
    val declaredPropNames = Set("`type`", "messageCreation", "toolCalls")
    
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
      Writes { runStepObjectStepDetails =>
        val jsObj = realJsonFormat.writes(runStepObjectStepDetails)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val MessageCreation = Value("message_creation")
    val ToolCalls = Value("tool_calls")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

