package model

import play.api.libs.json._

/**
  * The aggregated code interpreter sessions usage details of the specific time bucket.
  * @param sessions The number of code interpreter sessions.
  * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UsageCodeInterpreterSessionsResult(
  `object`: UsageCodeInterpreterSessionsResult.Object.Value,
  sessions: Int,
  projectId: Option[String]
)

object UsageCodeInterpreterSessionsResult {
  implicit lazy val usageCodeInterpreterSessionsResultJsonFormat: Format[UsageCodeInterpreterSessionsResult] = Json.format[UsageCodeInterpreterSessionsResult]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val OrganizationUsageCodeInterpreterSessionsResult = Value("organization.usage.code_interpreter_sessions.result")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

