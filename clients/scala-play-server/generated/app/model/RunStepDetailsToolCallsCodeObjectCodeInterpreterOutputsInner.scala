package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.
  * @param `type` Always `logs`.
  * @param logs The text output from the Code Interpreter tool call.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(
  `type`: RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.Type.Value,
  logs: String,
  image: RunStepDetailsToolCallsCodeOutputImageObjectImage
  additionalProperties: 
)

object RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
  implicit lazy val runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerJsonFormat: Format[RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner] = {
    val realJsonFormat = Json.format[RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]
    val declaredPropNames = Set("`type`", "logs", "image")
    
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
      Writes { runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner =>
        val jsObj = realJsonFormat.writes(runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner)
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

