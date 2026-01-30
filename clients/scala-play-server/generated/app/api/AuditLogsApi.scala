package api

import play.api.libs.json._
import model.AuditLogEventType
import model.ListAuditLogsEffectiveAtParameter
import model.ListAuditLogsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait AuditLogsApi {
  /**
    * List user actions and configuration changes within this organization.
    * @param effectiveAt Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range.
    * @param projectIdsLeft_Square_BracketRight_Square_Bracket Return only events for these projects.
    * @param eventTypesLeft_Square_BracketRight_Square_Bracket Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).
    * @param actorIdsLeft_Square_BracketRight_Square_Bracket Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.
    * @param actorEmailsLeft_Square_BracketRight_Square_Bracket Return only events performed by users with these emails.
    * @param resourceIdsLeft_Square_BracketRight_Square_Bracket Return only events performed on these targets. For example, a project ID updated.
    * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    */
  def listAuditLogs(effectiveAt: Option[ListAuditLogsEffectiveAtParameter], projectIdsLeft_Square_BracketRight_Square_Bracket: Option[List[String]], eventTypesLeft_Square_BracketRight_Square_Bracket: Option[List[AuditLogEventType]], actorIdsLeft_Square_BracketRight_Square_Bracket: Option[List[String]], actorEmailsLeft_Square_BracketRight_Square_Bracket: Option[List[String]], resourceIdsLeft_Square_BracketRight_Square_Bracket: Option[List[String]], limit: Option[Int], after: Option[String], before: Option[String]): ListAuditLogsResponse
}
