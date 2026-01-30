package api

import model.AuditLogEventType
import model.ListAuditLogsEffectiveAtParameter
import model.ListAuditLogsResponse

/**
  * Provides a default implementation for [[AuditLogsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class AuditLogsApiImpl extends AuditLogsApi {
  /**
    * @inheritdoc
    */
  override def listAuditLogs(effectiveAt: Option[ListAuditLogsEffectiveAtParameter], projectIdsLeft_Square_BracketRight_Square_Bracket: Option[List[String]], eventTypesLeft_Square_BracketRight_Square_Bracket: Option[List[AuditLogEventType]], actorIdsLeft_Square_BracketRight_Square_Bracket: Option[List[String]], actorEmailsLeft_Square_BracketRight_Square_Bracket: Option[List[String]], resourceIdsLeft_Square_BracketRight_Square_Bracket: Option[List[String]], limit: Option[Int], after: Option[String], before: Option[String]): ListAuditLogsResponse = {
    // TODO: Implement better logic

    ListAuditLogsResponse("", List.empty[AuditLog], "", "", false)
  }
}
