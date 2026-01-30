#ifndef _AuditLogsManager_H_
#define _AuditLogsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AuditLogEventType.h"
#include "ListAuditLogsResponse.h"
#include "List_audit_logs_effective_at_parameter.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup AuditLogs AuditLogs
 * \ingroup Operations
 *  @{
 */
class AuditLogsManager {
public:
	AuditLogsManager();
	virtual ~AuditLogsManager();

/*! \brief List user actions and configuration changes within this organization.. *Synchronous*
 *
 * 
 * \param effectiveAt Return only events whose `effective_at` (Unix seconds) is in this range.
 * \param projectIdsLeft_Square_BracketRight_Square_Bracket Return only events for these projects.
 * \param eventTypesLeft_Square_BracketRight_Square_Bracket Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).
 * \param actorIdsLeft_Square_BracketRight_Square_Bracket Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.
 * \param actorEmailsLeft_Square_BracketRight_Square_Bracket Return only events performed by users with these emails.
 * \param resourceIdsLeft_Square_BracketRight_Square_Bracket Return only events performed on these targets. For example, a project ID updated.
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listAuditLogsSync(char * accessToken,
	List_audit_logs_effective_at_parameter effectiveAt, std::list<std::string> projectIdsLeft_Square_BracketRight_Square_Bracket, std::list<AuditLogEventType> eventTypesLeft_Square_BracketRight_Square_Bracket, std::list<std::string> actorIdsLeft_Square_BracketRight_Square_Bracket, std::list<std::string> actorEmailsLeft_Square_BracketRight_Square_Bracket, std::list<std::string> resourceIdsLeft_Square_BracketRight_Square_Bracket, int limit, std::string after, std::string before, 
	void(* handler)(ListAuditLogsResponse, Error, void* )
	, void* userData);

/*! \brief List user actions and configuration changes within this organization.. *Asynchronous*
 *
 * 
 * \param effectiveAt Return only events whose `effective_at` (Unix seconds) is in this range.
 * \param projectIdsLeft_Square_BracketRight_Square_Bracket Return only events for these projects.
 * \param eventTypesLeft_Square_BracketRight_Square_Bracket Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).
 * \param actorIdsLeft_Square_BracketRight_Square_Bracket Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.
 * \param actorEmailsLeft_Square_BracketRight_Square_Bracket Return only events performed by users with these emails.
 * \param resourceIdsLeft_Square_BracketRight_Square_Bracket Return only events performed on these targets. For example, a project ID updated.
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listAuditLogsAsync(char * accessToken,
	List_audit_logs_effective_at_parameter effectiveAt, std::list<std::string> projectIdsLeft_Square_BracketRight_Square_Bracket, std::list<AuditLogEventType> eventTypesLeft_Square_BracketRight_Square_Bracket, std::list<std::string> actorIdsLeft_Square_BracketRight_Square_Bracket, std::list<std::string> actorEmailsLeft_Square_BracketRight_Square_Bracket, std::list<std::string> resourceIdsLeft_Square_BracketRight_Square_Bracket, int limit, std::string after, std::string before, 
	void(* handler)(ListAuditLogsResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.openai.com/v1";
	}
};
/** @}*/

}
}
#endif /* AuditLogsManager_H_ */
