/*
 * AuditLog.h
 *
 * A log of a user action or configuration change within this organization.
 */

#ifndef _AuditLog_H_
#define _AuditLog_H_


#include <string>
#include "AuditLogActor.h"
#include "AuditLogEventType.h"
#include "AuditLog_api_key_created.h"
#include "AuditLog_api_key_deleted.h"
#include "AuditLog_api_key_updated.h"
#include "AuditLog_invite_accepted.h"
#include "AuditLog_invite_sent.h"
#include "AuditLog_login_failed.h"
#include "AuditLog_organization_updated.h"
#include "AuditLog_project.h"
#include "AuditLog_project_archived.h"
#include "AuditLog_project_created.h"
#include "AuditLog_project_updated.h"
#include "AuditLog_rate_limit_deleted.h"
#include "AuditLog_rate_limit_updated.h"
#include "AuditLog_service_account_created.h"
#include "AuditLog_service_account_deleted.h"
#include "AuditLog_service_account_updated.h"
#include "AuditLog_user_added.h"
#include "AuditLog_user_deleted.h"
#include "AuditLog_user_updated.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A log of a user action or configuration change within this organization.
 *
 *  \ingroup Models
 *
 */

class AuditLog : public Object {
public:
	/*! \brief Constructor.
	 */
	AuditLog();
	AuditLog(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuditLog();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of this log.
	 */
	std::string getId();

	/*! \brief Set The ID of this log.
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	AuditLogEventType getType();

	/*! \brief Set 
	 */
	void setType(AuditLogEventType  type);
	/*! \brief Get The Unix timestamp (in seconds) of the event.
	 */
	int getEffectiveAt();

	/*! \brief Set The Unix timestamp (in seconds) of the event.
	 */
	void setEffectiveAt(int  effective_at);
	/*! \brief Get 
	 */
	AuditLog_project getProject();

	/*! \brief Set 
	 */
	void setProject(AuditLog_project  project);
	/*! \brief Get 
	 */
	AuditLogActor getActor();

	/*! \brief Set 
	 */
	void setActor(AuditLogActor  actor);
	/*! \brief Get 
	 */
	AuditLog_api_key_created getApiKeycreated();

	/*! \brief Set 
	 */
	void setApiKeycreated(AuditLog_api_key_created  api_keycreated);
	/*! \brief Get 
	 */
	AuditLog_api_key_updated getApiKeyupdated();

	/*! \brief Set 
	 */
	void setApiKeyupdated(AuditLog_api_key_updated  api_keyupdated);
	/*! \brief Get 
	 */
	AuditLog_api_key_deleted getApiKeydeleted();

	/*! \brief Set 
	 */
	void setApiKeydeleted(AuditLog_api_key_deleted  api_keydeleted);
	/*! \brief Get 
	 */
	AuditLog_invite_sent getInvitesent();

	/*! \brief Set 
	 */
	void setInvitesent(AuditLog_invite_sent  invitesent);
	/*! \brief Get 
	 */
	AuditLog_invite_accepted getInviteaccepted();

	/*! \brief Set 
	 */
	void setInviteaccepted(AuditLog_invite_accepted  inviteaccepted);
	/*! \brief Get 
	 */
	AuditLog_invite_accepted getInvitedeleted();

	/*! \brief Set 
	 */
	void setInvitedeleted(AuditLog_invite_accepted  invitedeleted);
	/*! \brief Get 
	 */
	AuditLog_login_failed getLoginfailed();

	/*! \brief Set 
	 */
	void setLoginfailed(AuditLog_login_failed  loginfailed);
	/*! \brief Get 
	 */
	AuditLog_login_failed getLogoutfailed();

	/*! \brief Set 
	 */
	void setLogoutfailed(AuditLog_login_failed  logoutfailed);
	/*! \brief Get 
	 */
	AuditLog_organization_updated getOrganizationupdated();

	/*! \brief Set 
	 */
	void setOrganizationupdated(AuditLog_organization_updated  organizationupdated);
	/*! \brief Get 
	 */
	AuditLog_project_created getProjectcreated();

	/*! \brief Set 
	 */
	void setProjectcreated(AuditLog_project_created  projectcreated);
	/*! \brief Get 
	 */
	AuditLog_project_updated getProjectupdated();

	/*! \brief Set 
	 */
	void setProjectupdated(AuditLog_project_updated  projectupdated);
	/*! \brief Get 
	 */
	AuditLog_project_archived getProjectarchived();

	/*! \brief Set 
	 */
	void setProjectarchived(AuditLog_project_archived  projectarchived);
	/*! \brief Get 
	 */
	AuditLog_rate_limit_updated getRateLimitupdated();

	/*! \brief Set 
	 */
	void setRateLimitupdated(AuditLog_rate_limit_updated  rate_limitupdated);
	/*! \brief Get 
	 */
	AuditLog_rate_limit_deleted getRateLimitdeleted();

	/*! \brief Set 
	 */
	void setRateLimitdeleted(AuditLog_rate_limit_deleted  rate_limitdeleted);
	/*! \brief Get 
	 */
	AuditLog_service_account_created getServiceAccountcreated();

	/*! \brief Set 
	 */
	void setServiceAccountcreated(AuditLog_service_account_created  service_accountcreated);
	/*! \brief Get 
	 */
	AuditLog_service_account_updated getServiceAccountupdated();

	/*! \brief Set 
	 */
	void setServiceAccountupdated(AuditLog_service_account_updated  service_accountupdated);
	/*! \brief Get 
	 */
	AuditLog_service_account_deleted getServiceAccountdeleted();

	/*! \brief Set 
	 */
	void setServiceAccountdeleted(AuditLog_service_account_deleted  service_accountdeleted);
	/*! \brief Get 
	 */
	AuditLog_user_added getUseradded();

	/*! \brief Set 
	 */
	void setUseradded(AuditLog_user_added  useradded);
	/*! \brief Get 
	 */
	AuditLog_user_updated getUserupdated();

	/*! \brief Set 
	 */
	void setUserupdated(AuditLog_user_updated  userupdated);
	/*! \brief Get 
	 */
	AuditLog_user_deleted getUserdeleted();

	/*! \brief Set 
	 */
	void setUserdeleted(AuditLog_user_deleted  userdeleted);

private:
	std::string id;
	AuditLogEventType type;
	int effective_at;
	AuditLog_project project;
	AuditLogActor actor;
	AuditLog_api_key_created api_keycreated;
	AuditLog_api_key_updated api_keyupdated;
	AuditLog_api_key_deleted api_keydeleted;
	AuditLog_invite_sent invitesent;
	AuditLog_invite_accepted inviteaccepted;
	AuditLog_invite_accepted invitedeleted;
	AuditLog_login_failed loginfailed;
	AuditLog_login_failed logoutfailed;
	AuditLog_organization_updated organizationupdated;
	AuditLog_project_created projectcreated;
	AuditLog_project_updated projectupdated;
	AuditLog_project_archived projectarchived;
	AuditLog_rate_limit_updated rate_limitupdated;
	AuditLog_rate_limit_deleted rate_limitdeleted;
	AuditLog_service_account_created service_accountcreated;
	AuditLog_service_account_updated service_accountupdated;
	AuditLog_service_account_deleted service_accountdeleted;
	AuditLog_user_added useradded;
	AuditLog_user_updated userupdated;
	AuditLog_user_deleted userdeleted;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuditLog_H_ */
