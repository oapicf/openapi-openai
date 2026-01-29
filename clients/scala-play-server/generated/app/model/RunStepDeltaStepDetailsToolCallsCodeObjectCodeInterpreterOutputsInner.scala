package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.
  * @param index The index of the output in the outputs array.
  * @param `type` Always `logs`.
  * @param logs The text output from the Code Interpreter tool call.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(
  index: Int,
  `type`: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.Type.Value,
  logs: Option[String],
  image: Option[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage]
  additionalProperties: 
)

object RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
  implicit lazy val runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerJsonFormat: Format[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner] = {
    val realJsonFormat = Json.format[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]
    val declaredPropNames = Set("index", "`type`", "logs", "image")
    
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
      Writes { runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner =>
        val jsObj = realJsonFormat.writes(runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Logs = Value("logs")
    val Image = Value("image")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

