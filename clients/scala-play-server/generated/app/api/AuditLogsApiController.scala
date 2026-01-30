package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AuditLogEventType
import model.ListAuditLogsEffectiveAtParameter
import model.ListAuditLogsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class AuditLogsApiController @Inject()(cc: ControllerComponents, api: AuditLogsApi) extends AbstractController(cc) {
  /**
    * GET /v1/organization/audit_logs?effectiveAt=[value]&projectIdsLeft_Square_BracketRight_Square_Bracket=[value]&eventTypesLeft_Square_BracketRight_Square_Bracket=[value]&actorIdsLeft_Square_BracketRight_Square_Bracket=[value]&actorEmailsLeft_Square_BracketRight_Square_Bracket=[value]&resourceIdsLeft_Square_BracketRight_Square_Bracket=[value]&limit=[value]&after=[value]&before=[value]
    */
  def listAuditLogs(): Action[AnyContent] = Action { request =>
    def executeApi(): ListAuditLogsResponse = {
      val effectiveAt = request.getQueryString("effective_at")
        .map(value => )
        
      val projectIdsLeft_Square_BracketRight_Square_Bracket = request.queryString.get("project_ids[]")
        .map(_.toList)
        
      val eventTypesLeft_Square_BracketRight_Square_Bracket = request.queryString.get("event_types[]")
        .map(_.toList)
        .map(_.map(value => )
        
      val actorIdsLeft_Square_BracketRight_Square_Bracket = request.queryString.get("actor_ids[]")
        .map(_.toList)
        
      val actorEmailsLeft_Square_BracketRight_Square_Bracket = request.queryString.get("actor_emails[]")
        .map(_.toList)
        
      val resourceIdsLeft_Square_BracketRight_Square_Bracket = request.queryString.get("resource_ids[]")
        .map(_.toList)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val after = request.getQueryString("after")
        
      val before = request.getQueryString("before")
        
      api.listAuditLogs(effectiveAt, projectIdsLeft_Square_BracketRight_Square_Bracket, eventTypesLeft_Square_BracketRight_Square_Bracket, actorIdsLeft_Square_BracketRight_Square_Bracket, actorEmailsLeft_Square_BracketRight_Square_Bracket, resourceIdsLeft_Square_BracketRight_Square_Bracket, limit, after, before)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
