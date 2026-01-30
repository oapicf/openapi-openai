#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuditLog.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuditLog::AuditLog()
{
	//__init();
}

AuditLog::~AuditLog()
{
	//__cleanup();
}

void
AuditLog::__init()
{
	//id = std::string();
	//type = new AuditLogEventType();
	//effective_at = int(0);
	//project = new AuditLog_project();
	//actor = new AuditLogActor();
	//api_keycreated = new AuditLog_api_key_created();
	//api_keyupdated = new AuditLog_api_key_updated();
	//api_keydeleted = new AuditLog_api_key_deleted();
	//invitesent = new AuditLog_invite_sent();
	//inviteaccepted = new AuditLog_invite_accepted();
	//invitedeleted = new AuditLog_invite_accepted();
	//loginfailed = new AuditLog_login_failed();
	//logoutfailed = new AuditLog_login_failed();
	//organizationupdated = new AuditLog_organization_updated();
	//projectcreated = new AuditLog_project_created();
	//projectupdated = new AuditLog_project_updated();
	//projectarchived = new AuditLog_project_archived();
	//rate_limitupdated = new AuditLog_rate_limit_updated();
	//rate_limitdeleted = new AuditLog_rate_limit_deleted();
	//service_accountcreated = new AuditLog_service_account_created();
	//service_accountupdated = new AuditLog_service_account_updated();
	//service_accountdeleted = new AuditLog_service_account_deleted();
	//useradded = new AuditLog_user_added();
	//userupdated = new AuditLog_user_updated();
	//userdeleted = new AuditLog_user_deleted();
}

void
AuditLog::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(effective_at != NULL) {
	//
	//delete effective_at;
	//effective_at = NULL;
	//}
	//if(project != NULL) {
	//
	//delete project;
	//project = NULL;
	//}
	//if(actor != NULL) {
	//
	//delete actor;
	//actor = NULL;
	//}
	//if(api_keycreated != NULL) {
	//
	//delete api_keycreated;
	//api_keycreated = NULL;
	//}
	//if(api_keyupdated != NULL) {
	//
	//delete api_keyupdated;
	//api_keyupdated = NULL;
	//}
	//if(api_keydeleted != NULL) {
	//
	//delete api_keydeleted;
	//api_keydeleted = NULL;
	//}
	//if(invitesent != NULL) {
	//
	//delete invitesent;
	//invitesent = NULL;
	//}
	//if(inviteaccepted != NULL) {
	//
	//delete inviteaccepted;
	//inviteaccepted = NULL;
	//}
	//if(invitedeleted != NULL) {
	//
	//delete invitedeleted;
	//invitedeleted = NULL;
	//}
	//if(loginfailed != NULL) {
	//
	//delete loginfailed;
	//loginfailed = NULL;
	//}
	//if(logoutfailed != NULL) {
	//
	//delete logoutfailed;
	//logoutfailed = NULL;
	//}
	//if(organizationupdated != NULL) {
	//
	//delete organizationupdated;
	//organizationupdated = NULL;
	//}
	//if(projectcreated != NULL) {
	//
	//delete projectcreated;
	//projectcreated = NULL;
	//}
	//if(projectupdated != NULL) {
	//
	//delete projectupdated;
	//projectupdated = NULL;
	//}
	//if(projectarchived != NULL) {
	//
	//delete projectarchived;
	//projectarchived = NULL;
	//}
	//if(rate_limitupdated != NULL) {
	//
	//delete rate_limitupdated;
	//rate_limitupdated = NULL;
	//}
	//if(rate_limitdeleted != NULL) {
	//
	//delete rate_limitdeleted;
	//rate_limitdeleted = NULL;
	//}
	//if(service_accountcreated != NULL) {
	//
	//delete service_accountcreated;
	//service_accountcreated = NULL;
	//}
	//if(service_accountupdated != NULL) {
	//
	//delete service_accountupdated;
	//service_accountupdated = NULL;
	//}
	//if(service_accountdeleted != NULL) {
	//
	//delete service_accountdeleted;
	//service_accountdeleted = NULL;
	//}
	//if(useradded != NULL) {
	//
	//delete useradded;
	//useradded = NULL;
	//}
	//if(userupdated != NULL) {
	//
	//delete userupdated;
	//userupdated = NULL;
	//}
	//if(userdeleted != NULL) {
	//
	//delete userdeleted;
	//userdeleted = NULL;
	//}
	//
}

void
AuditLog::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLogEventType")) {
			jsonToValue(&type, node, "AuditLogEventType", "AuditLogEventType");
		} else {
			
			AuditLogEventType* obj = static_cast<AuditLogEventType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *effective_atKey = "effective_at";
	node = json_object_get_member(pJsonObject, effective_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&effective_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *projectKey = "project";
	node = json_object_get_member(pJsonObject, projectKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_project")) {
			jsonToValue(&project, node, "AuditLog_project", "AuditLog_project");
		} else {
			
			AuditLog_project* obj = static_cast<AuditLog_project*> (&project);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *actorKey = "actor";
	node = json_object_get_member(pJsonObject, actorKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLogActor")) {
			jsonToValue(&actor, node, "AuditLogActor", "AuditLogActor");
		} else {
			
			AuditLogActor* obj = static_cast<AuditLogActor*> (&actor);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *api_keycreatedKey = "api_key.created";
	node = json_object_get_member(pJsonObject, api_keycreatedKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_api_key_created")) {
			jsonToValue(&api_keycreated, node, "AuditLog_api_key_created", "AuditLog_api_key_created");
		} else {
			
			AuditLog_api_key_created* obj = static_cast<AuditLog_api_key_created*> (&api_keycreated);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *api_keyupdatedKey = "api_key.updated";
	node = json_object_get_member(pJsonObject, api_keyupdatedKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_api_key_updated")) {
			jsonToValue(&api_keyupdated, node, "AuditLog_api_key_updated", "AuditLog_api_key_updated");
		} else {
			
			AuditLog_api_key_updated* obj = static_cast<AuditLog_api_key_updated*> (&api_keyupdated);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *api_keydeletedKey = "api_key.deleted";
	node = json_object_get_member(pJsonObject, api_keydeletedKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_api_key_deleted")) {
			jsonToValue(&api_keydeleted, node, "AuditLog_api_key_deleted", "AuditLog_api_key_deleted");
		} else {
			
			AuditLog_api_key_deleted* obj = static_cast<AuditLog_api_key_deleted*> (&api_keydeleted);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *invitesentKey = "invite.sent";
	node = json_object_get_member(pJsonObject, invitesentKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_invite_sent")) {
			jsonToValue(&invitesent, node, "AuditLog_invite_sent", "AuditLog_invite_sent");
		} else {
			
			AuditLog_invite_sent* obj = static_cast<AuditLog_invite_sent*> (&invitesent);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *inviteacceptedKey = "invite.accepted";
	node = json_object_get_member(pJsonObject, inviteacceptedKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_invite_accepted")) {
			jsonToValue(&inviteaccepted, node, "AuditLog_invite_accepted", "AuditLog_invite_accepted");
		} else {
			
			AuditLog_invite_accepted* obj = static_cast<AuditLog_invite_accepted*> (&inviteaccepted);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *invitedeletedKey = "invite.deleted";
	node = json_object_get_member(pJsonObject, invitedeletedKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_invite_accepted")) {
			jsonToValue(&invitedeleted, node, "AuditLog_invite_accepted", "AuditLog_invite_accepted");
		} else {
			
			AuditLog_invite_accepted* obj = static_cast<AuditLog_invite_accepted*> (&invitedeleted);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *loginfailedKey = "login.failed";
	node = json_object_get_member(pJsonObject, loginfailedKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_login_failed")) {
			jsonToValue(&loginfailed, node, "AuditLog_login_failed", "AuditLog_login_failed");
		} else {
			
			AuditLog_login_failed* obj = static_cast<AuditLog_login_failed*> (&loginfailed);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *logoutfailedKey = "logout.failed";
	node = json_object_get_member(pJsonObject, logoutfailedKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_login_failed")) {
			jsonToValue(&logoutfailed, node, "AuditLog_login_failed", "AuditLog_login_failed");
		} else {
			
			AuditLog_login_failed* obj = static_cast<AuditLog_login_failed*> (&logoutfailed);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *organizationupdatedKey = "organization.updated";
	node = json_object_get_member(pJsonObject, organizationupdatedKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_organization_updated")) {
			jsonToValue(&organizationupdated, node, "AuditLog_organization_updated", "AuditLog_organization_updated");
		} else {
			
			AuditLog_organization_updated* obj = static_cast<AuditLog_organization_updated*> (&organizationupdated);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *projectcreatedKey = "project.created";
	node = json_object_get_member(pJsonObject, projectcreatedKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_project_created")) {
			jsonToValue(&projectcreated, node, "AuditLog_project_created", "AuditLog_project_created");
		} else {
			
			AuditLog_project_created* obj = static_cast<AuditLog_project_created*> (&projectcreated);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *projectupdatedKey = "project.updated";
	node = json_object_get_member(pJsonObject, projectupdatedKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_project_updated")) {
			jsonToValue(&projectupdated, node, "AuditLog_project_updated", "AuditLog_project_updated");
		} else {
			
			AuditLog_project_updated* obj = static_cast<AuditLog_project_updated*> (&projectupdated);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *projectarchivedKey = "project.archived";
	node = json_object_get_member(pJsonObject, projectarchivedKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_project_archived")) {
			jsonToValue(&projectarchived, node, "AuditLog_project_archived", "AuditLog_project_archived");
		} else {
			
			AuditLog_project_archived* obj = static_cast<AuditLog_project_archived*> (&projectarchived);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *rate_limitupdatedKey = "rate_limit.updated";
	node = json_object_get_member(pJsonObject, rate_limitupdatedKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_rate_limit_updated")) {
			jsonToValue(&rate_limitupdated, node, "AuditLog_rate_limit_updated", "AuditLog_rate_limit_updated");
		} else {
			
			AuditLog_rate_limit_updated* obj = static_cast<AuditLog_rate_limit_updated*> (&rate_limitupdated);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *rate_limitdeletedKey = "rate_limit.deleted";
	node = json_object_get_member(pJsonObject, rate_limitdeletedKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_rate_limit_deleted")) {
			jsonToValue(&rate_limitdeleted, node, "AuditLog_rate_limit_deleted", "AuditLog_rate_limit_deleted");
		} else {
			
			AuditLog_rate_limit_deleted* obj = static_cast<AuditLog_rate_limit_deleted*> (&rate_limitdeleted);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *service_accountcreatedKey = "service_account.created";
	node = json_object_get_member(pJsonObject, service_accountcreatedKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_service_account_created")) {
			jsonToValue(&service_accountcreated, node, "AuditLog_service_account_created", "AuditLog_service_account_created");
		} else {
			
			AuditLog_service_account_created* obj = static_cast<AuditLog_service_account_created*> (&service_accountcreated);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *service_accountupdatedKey = "service_account.updated";
	node = json_object_get_member(pJsonObject, service_accountupdatedKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_service_account_updated")) {
			jsonToValue(&service_accountupdated, node, "AuditLog_service_account_updated", "AuditLog_service_account_updated");
		} else {
			
			AuditLog_service_account_updated* obj = static_cast<AuditLog_service_account_updated*> (&service_accountupdated);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *service_accountdeletedKey = "service_account.deleted";
	node = json_object_get_member(pJsonObject, service_accountdeletedKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_service_account_deleted")) {
			jsonToValue(&service_accountdeleted, node, "AuditLog_service_account_deleted", "AuditLog_service_account_deleted");
		} else {
			
			AuditLog_service_account_deleted* obj = static_cast<AuditLog_service_account_deleted*> (&service_accountdeleted);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *useraddedKey = "user.added";
	node = json_object_get_member(pJsonObject, useraddedKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_user_added")) {
			jsonToValue(&useradded, node, "AuditLog_user_added", "AuditLog_user_added");
		} else {
			
			AuditLog_user_added* obj = static_cast<AuditLog_user_added*> (&useradded);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *userupdatedKey = "user.updated";
	node = json_object_get_member(pJsonObject, userupdatedKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_user_updated")) {
			jsonToValue(&userupdated, node, "AuditLog_user_updated", "AuditLog_user_updated");
		} else {
			
			AuditLog_user_updated* obj = static_cast<AuditLog_user_updated*> (&userupdated);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *userdeletedKey = "user.deleted";
	node = json_object_get_member(pJsonObject, userdeletedKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_user_deleted")) {
			jsonToValue(&userdeleted, node, "AuditLog_user_deleted", "AuditLog_user_deleted");
		} else {
			
			AuditLog_user_deleted* obj = static_cast<AuditLog_user_deleted*> (&userdeleted);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AuditLog::AuditLog(char* json)
{
	this->fromJson(json);
}

char*
AuditLog::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("AuditLogEventType")) {
		AuditLogEventType obj = getType();
		node = converttoJson(&obj, "AuditLogEventType", "");
	}
	else {
		
		AuditLogEventType obj = static_cast<AuditLogEventType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("int")) {
		int obj = getEffectiveAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *effective_atKey = "effective_at";
	json_object_set_member(pJsonObject, effective_atKey, node);
	if (isprimitive("AuditLog_project")) {
		AuditLog_project obj = getProject();
		node = converttoJson(&obj, "AuditLog_project", "");
	}
	else {
		
		AuditLog_project obj = static_cast<AuditLog_project> (getProject());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *projectKey = "project";
	json_object_set_member(pJsonObject, projectKey, node);
	if (isprimitive("AuditLogActor")) {
		AuditLogActor obj = getActor();
		node = converttoJson(&obj, "AuditLogActor", "");
	}
	else {
		
		AuditLogActor obj = static_cast<AuditLogActor> (getActor());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *actorKey = "actor";
	json_object_set_member(pJsonObject, actorKey, node);
	if (isprimitive("AuditLog_api_key_created")) {
		AuditLog_api_key_created obj = getApiKeycreated();
		node = converttoJson(&obj, "AuditLog_api_key_created", "");
	}
	else {
		
		AuditLog_api_key_created obj = static_cast<AuditLog_api_key_created> (getApiKeycreated());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *api_keycreatedKey = "api_key.created";
	json_object_set_member(pJsonObject, api_keycreatedKey, node);
	if (isprimitive("AuditLog_api_key_updated")) {
		AuditLog_api_key_updated obj = getApiKeyupdated();
		node = converttoJson(&obj, "AuditLog_api_key_updated", "");
	}
	else {
		
		AuditLog_api_key_updated obj = static_cast<AuditLog_api_key_updated> (getApiKeyupdated());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *api_keyupdatedKey = "api_key.updated";
	json_object_set_member(pJsonObject, api_keyupdatedKey, node);
	if (isprimitive("AuditLog_api_key_deleted")) {
		AuditLog_api_key_deleted obj = getApiKeydeleted();
		node = converttoJson(&obj, "AuditLog_api_key_deleted", "");
	}
	else {
		
		AuditLog_api_key_deleted obj = static_cast<AuditLog_api_key_deleted> (getApiKeydeleted());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *api_keydeletedKey = "api_key.deleted";
	json_object_set_member(pJsonObject, api_keydeletedKey, node);
	if (isprimitive("AuditLog_invite_sent")) {
		AuditLog_invite_sent obj = getInvitesent();
		node = converttoJson(&obj, "AuditLog_invite_sent", "");
	}
	else {
		
		AuditLog_invite_sent obj = static_cast<AuditLog_invite_sent> (getInvitesent());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *invitesentKey = "invite.sent";
	json_object_set_member(pJsonObject, invitesentKey, node);
	if (isprimitive("AuditLog_invite_accepted")) {
		AuditLog_invite_accepted obj = getInviteaccepted();
		node = converttoJson(&obj, "AuditLog_invite_accepted", "");
	}
	else {
		
		AuditLog_invite_accepted obj = static_cast<AuditLog_invite_accepted> (getInviteaccepted());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *inviteacceptedKey = "invite.accepted";
	json_object_set_member(pJsonObject, inviteacceptedKey, node);
	if (isprimitive("AuditLog_invite_accepted")) {
		AuditLog_invite_accepted obj = getInvitedeleted();
		node = converttoJson(&obj, "AuditLog_invite_accepted", "");
	}
	else {
		
		AuditLog_invite_accepted obj = static_cast<AuditLog_invite_accepted> (getInvitedeleted());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *invitedeletedKey = "invite.deleted";
	json_object_set_member(pJsonObject, invitedeletedKey, node);
	if (isprimitive("AuditLog_login_failed")) {
		AuditLog_login_failed obj = getLoginfailed();
		node = converttoJson(&obj, "AuditLog_login_failed", "");
	}
	else {
		
		AuditLog_login_failed obj = static_cast<AuditLog_login_failed> (getLoginfailed());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *loginfailedKey = "login.failed";
	json_object_set_member(pJsonObject, loginfailedKey, node);
	if (isprimitive("AuditLog_login_failed")) {
		AuditLog_login_failed obj = getLogoutfailed();
		node = converttoJson(&obj, "AuditLog_login_failed", "");
	}
	else {
		
		AuditLog_login_failed obj = static_cast<AuditLog_login_failed> (getLogoutfailed());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *logoutfailedKey = "logout.failed";
	json_object_set_member(pJsonObject, logoutfailedKey, node);
	if (isprimitive("AuditLog_organization_updated")) {
		AuditLog_organization_updated obj = getOrganizationupdated();
		node = converttoJson(&obj, "AuditLog_organization_updated", "");
	}
	else {
		
		AuditLog_organization_updated obj = static_cast<AuditLog_organization_updated> (getOrganizationupdated());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *organizationupdatedKey = "organization.updated";
	json_object_set_member(pJsonObject, organizationupdatedKey, node);
	if (isprimitive("AuditLog_project_created")) {
		AuditLog_project_created obj = getProjectcreated();
		node = converttoJson(&obj, "AuditLog_project_created", "");
	}
	else {
		
		AuditLog_project_created obj = static_cast<AuditLog_project_created> (getProjectcreated());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *projectcreatedKey = "project.created";
	json_object_set_member(pJsonObject, projectcreatedKey, node);
	if (isprimitive("AuditLog_project_updated")) {
		AuditLog_project_updated obj = getProjectupdated();
		node = converttoJson(&obj, "AuditLog_project_updated", "");
	}
	else {
		
		AuditLog_project_updated obj = static_cast<AuditLog_project_updated> (getProjectupdated());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *projectupdatedKey = "project.updated";
	json_object_set_member(pJsonObject, projectupdatedKey, node);
	if (isprimitive("AuditLog_project_archived")) {
		AuditLog_project_archived obj = getProjectarchived();
		node = converttoJson(&obj, "AuditLog_project_archived", "");
	}
	else {
		
		AuditLog_project_archived obj = static_cast<AuditLog_project_archived> (getProjectarchived());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *projectarchivedKey = "project.archived";
	json_object_set_member(pJsonObject, projectarchivedKey, node);
	if (isprimitive("AuditLog_rate_limit_updated")) {
		AuditLog_rate_limit_updated obj = getRateLimitupdated();
		node = converttoJson(&obj, "AuditLog_rate_limit_updated", "");
	}
	else {
		
		AuditLog_rate_limit_updated obj = static_cast<AuditLog_rate_limit_updated> (getRateLimitupdated());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *rate_limitupdatedKey = "rate_limit.updated";
	json_object_set_member(pJsonObject, rate_limitupdatedKey, node);
	if (isprimitive("AuditLog_rate_limit_deleted")) {
		AuditLog_rate_limit_deleted obj = getRateLimitdeleted();
		node = converttoJson(&obj, "AuditLog_rate_limit_deleted", "");
	}
	else {
		
		AuditLog_rate_limit_deleted obj = static_cast<AuditLog_rate_limit_deleted> (getRateLimitdeleted());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *rate_limitdeletedKey = "rate_limit.deleted";
	json_object_set_member(pJsonObject, rate_limitdeletedKey, node);
	if (isprimitive("AuditLog_service_account_created")) {
		AuditLog_service_account_created obj = getServiceAccountcreated();
		node = converttoJson(&obj, "AuditLog_service_account_created", "");
	}
	else {
		
		AuditLog_service_account_created obj = static_cast<AuditLog_service_account_created> (getServiceAccountcreated());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *service_accountcreatedKey = "service_account.created";
	json_object_set_member(pJsonObject, service_accountcreatedKey, node);
	if (isprimitive("AuditLog_service_account_updated")) {
		AuditLog_service_account_updated obj = getServiceAccountupdated();
		node = converttoJson(&obj, "AuditLog_service_account_updated", "");
	}
	else {
		
		AuditLog_service_account_updated obj = static_cast<AuditLog_service_account_updated> (getServiceAccountupdated());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *service_accountupdatedKey = "service_account.updated";
	json_object_set_member(pJsonObject, service_accountupdatedKey, node);
	if (isprimitive("AuditLog_service_account_deleted")) {
		AuditLog_service_account_deleted obj = getServiceAccountdeleted();
		node = converttoJson(&obj, "AuditLog_service_account_deleted", "");
	}
	else {
		
		AuditLog_service_account_deleted obj = static_cast<AuditLog_service_account_deleted> (getServiceAccountdeleted());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *service_accountdeletedKey = "service_account.deleted";
	json_object_set_member(pJsonObject, service_accountdeletedKey, node);
	if (isprimitive("AuditLog_user_added")) {
		AuditLog_user_added obj = getUseradded();
		node = converttoJson(&obj, "AuditLog_user_added", "");
	}
	else {
		
		AuditLog_user_added obj = static_cast<AuditLog_user_added> (getUseradded());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *useraddedKey = "user.added";
	json_object_set_member(pJsonObject, useraddedKey, node);
	if (isprimitive("AuditLog_user_updated")) {
		AuditLog_user_updated obj = getUserupdated();
		node = converttoJson(&obj, "AuditLog_user_updated", "");
	}
	else {
		
		AuditLog_user_updated obj = static_cast<AuditLog_user_updated> (getUserupdated());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userupdatedKey = "user.updated";
	json_object_set_member(pJsonObject, userupdatedKey, node);
	if (isprimitive("AuditLog_user_deleted")) {
		AuditLog_user_deleted obj = getUserdeleted();
		node = converttoJson(&obj, "AuditLog_user_deleted", "");
	}
	else {
		
		AuditLog_user_deleted obj = static_cast<AuditLog_user_deleted> (getUserdeleted());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userdeletedKey = "user.deleted";
	json_object_set_member(pJsonObject, userdeletedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AuditLog::getId()
{
	return id;
}

void
AuditLog::setId(std::string  id)
{
	this->id = id;
}

AuditLogEventType
AuditLog::getType()
{
	return type;
}

void
AuditLog::setType(AuditLogEventType  type)
{
	this->type = type;
}

int
AuditLog::getEffectiveAt()
{
	return effective_at;
}

void
AuditLog::setEffectiveAt(int  effective_at)
{
	this->effective_at = effective_at;
}

AuditLog_project
AuditLog::getProject()
{
	return project;
}

void
AuditLog::setProject(AuditLog_project  project)
{
	this->project = project;
}

AuditLogActor
AuditLog::getActor()
{
	return actor;
}

void
AuditLog::setActor(AuditLogActor  actor)
{
	this->actor = actor;
}

AuditLog_api_key_created
AuditLog::getApiKeycreated()
{
	return api_keycreated;
}

void
AuditLog::setApiKeycreated(AuditLog_api_key_created  api_keycreated)
{
	this->api_keycreated = api_keycreated;
}

AuditLog_api_key_updated
AuditLog::getApiKeyupdated()
{
	return api_keyupdated;
}

void
AuditLog::setApiKeyupdated(AuditLog_api_key_updated  api_keyupdated)
{
	this->api_keyupdated = api_keyupdated;
}

AuditLog_api_key_deleted
AuditLog::getApiKeydeleted()
{
	return api_keydeleted;
}

void
AuditLog::setApiKeydeleted(AuditLog_api_key_deleted  api_keydeleted)
{
	this->api_keydeleted = api_keydeleted;
}

AuditLog_invite_sent
AuditLog::getInvitesent()
{
	return invitesent;
}

void
AuditLog::setInvitesent(AuditLog_invite_sent  invitesent)
{
	this->invitesent = invitesent;
}

AuditLog_invite_accepted
AuditLog::getInviteaccepted()
{
	return inviteaccepted;
}

void
AuditLog::setInviteaccepted(AuditLog_invite_accepted  inviteaccepted)
{
	this->inviteaccepted = inviteaccepted;
}

AuditLog_invite_accepted
AuditLog::getInvitedeleted()
{
	return invitedeleted;
}

void
AuditLog::setInvitedeleted(AuditLog_invite_accepted  invitedeleted)
{
	this->invitedeleted = invitedeleted;
}

AuditLog_login_failed
AuditLog::getLoginfailed()
{
	return loginfailed;
}

void
AuditLog::setLoginfailed(AuditLog_login_failed  loginfailed)
{
	this->loginfailed = loginfailed;
}

AuditLog_login_failed
AuditLog::getLogoutfailed()
{
	return logoutfailed;
}

void
AuditLog::setLogoutfailed(AuditLog_login_failed  logoutfailed)
{
	this->logoutfailed = logoutfailed;
}

AuditLog_organization_updated
AuditLog::getOrganizationupdated()
{
	return organizationupdated;
}

void
AuditLog::setOrganizationupdated(AuditLog_organization_updated  organizationupdated)
{
	this->organizationupdated = organizationupdated;
}

AuditLog_project_created
AuditLog::getProjectcreated()
{
	return projectcreated;
}

void
AuditLog::setProjectcreated(AuditLog_project_created  projectcreated)
{
	this->projectcreated = projectcreated;
}

AuditLog_project_updated
AuditLog::getProjectupdated()
{
	return projectupdated;
}

void
AuditLog::setProjectupdated(AuditLog_project_updated  projectupdated)
{
	this->projectupdated = projectupdated;
}

AuditLog_project_archived
AuditLog::getProjectarchived()
{
	return projectarchived;
}

void
AuditLog::setProjectarchived(AuditLog_project_archived  projectarchived)
{
	this->projectarchived = projectarchived;
}

AuditLog_rate_limit_updated
AuditLog::getRateLimitupdated()
{
	return rate_limitupdated;
}

void
AuditLog::setRateLimitupdated(AuditLog_rate_limit_updated  rate_limitupdated)
{
	this->rate_limitupdated = rate_limitupdated;
}

AuditLog_rate_limit_deleted
AuditLog::getRateLimitdeleted()
{
	return rate_limitdeleted;
}

void
AuditLog::setRateLimitdeleted(AuditLog_rate_limit_deleted  rate_limitdeleted)
{
	this->rate_limitdeleted = rate_limitdeleted;
}

AuditLog_service_account_created
AuditLog::getServiceAccountcreated()
{
	return service_accountcreated;
}

void
AuditLog::setServiceAccountcreated(AuditLog_service_account_created  service_accountcreated)
{
	this->service_accountcreated = service_accountcreated;
}

AuditLog_service_account_updated
AuditLog::getServiceAccountupdated()
{
	return service_accountupdated;
}

void
AuditLog::setServiceAccountupdated(AuditLog_service_account_updated  service_accountupdated)
{
	this->service_accountupdated = service_accountupdated;
}

AuditLog_service_account_deleted
AuditLog::getServiceAccountdeleted()
{
	return service_accountdeleted;
}

void
AuditLog::setServiceAccountdeleted(AuditLog_service_account_deleted  service_accountdeleted)
{
	this->service_accountdeleted = service_accountdeleted;
}

AuditLog_user_added
AuditLog::getUseradded()
{
	return useradded;
}

void
AuditLog::setUseradded(AuditLog_user_added  useradded)
{
	this->useradded = useradded;
}

AuditLog_user_updated
AuditLog::getUserupdated()
{
	return userupdated;
}

void
AuditLog::setUserupdated(AuditLog_user_updated  userupdated)
{
	this->userupdated = userupdated;
}

AuditLog_user_deleted
AuditLog::getUserdeleted()
{
	return userdeleted;
}

void
AuditLog::setUserdeleted(AuditLog_user_deleted  userdeleted)
{
	this->userdeleted = userdeleted;
}


