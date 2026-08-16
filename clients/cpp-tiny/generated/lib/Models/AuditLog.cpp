

#include "AuditLog.h"

using namespace Tiny;

AuditLog::AuditLog()
{
	id = std::string();
	type = AuditLogEventType();
	effective_at = int(0);
	project = AuditLog_project();
	actor = AuditLogActor();
	api_keycreated = AuditLog_api_key_created();
	api_keyupdated = AuditLog_api_key_updated();
	api_keydeleted = AuditLog_api_key_deleted();
	invitesent = AuditLog_invite_sent();
	inviteaccepted = AuditLog_invite_accepted();
	invitedeleted = AuditLog_invite_accepted();
	loginfailed = AuditLog_login_failed();
	logoutfailed = AuditLog_login_failed();
	organizationupdated = AuditLog_organization_updated();
	projectcreated = AuditLog_project_created();
	projectupdated = AuditLog_project_updated();
	projectarchived = AuditLog_project_archived();
	rate_limitupdated = AuditLog_rate_limit_updated();
	rate_limitdeleted = AuditLog_rate_limit_deleted();
	service_accountcreated = AuditLog_service_account_created();
	service_accountupdated = AuditLog_service_account_updated();
	service_accountdeleted = AuditLog_service_account_deleted();
	useradded = AuditLog_user_added();
	userupdated = AuditLog_user_updated();
	userdeleted = AuditLog_user_deleted();
}

AuditLog::AuditLog(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog::~AuditLog()
{

}

void
AuditLog::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        AuditLogEventType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *effective_atKey = "effective_at";

    if(object.has_key(effective_atKey))
    {
        bourne::json value = object[effective_atKey];



        jsonToValue(&effective_at, value, "int");


    }

    const char *projectKey = "project";

    if(object.has_key(projectKey))
    {
        bourne::json value = object[projectKey];




        AuditLog_project* obj = &project;
		obj->fromJson(value.dump());

    }

    const char *actorKey = "actor";

    if(object.has_key(actorKey))
    {
        bourne::json value = object[actorKey];




        AuditLogActor* obj = &actor;
		obj->fromJson(value.dump());

    }

    const char *api_keycreatedKey = "api_key.created";

    if(object.has_key(api_keycreatedKey))
    {
        bourne::json value = object[api_keycreatedKey];




        AuditLog_api_key_created* obj = &api_keycreated;
		obj->fromJson(value.dump());

    }

    const char *api_keyupdatedKey = "api_key.updated";

    if(object.has_key(api_keyupdatedKey))
    {
        bourne::json value = object[api_keyupdatedKey];




        AuditLog_api_key_updated* obj = &api_keyupdated;
		obj->fromJson(value.dump());

    }

    const char *api_keydeletedKey = "api_key.deleted";

    if(object.has_key(api_keydeletedKey))
    {
        bourne::json value = object[api_keydeletedKey];




        AuditLog_api_key_deleted* obj = &api_keydeleted;
		obj->fromJson(value.dump());

    }

    const char *invitesentKey = "invite.sent";

    if(object.has_key(invitesentKey))
    {
        bourne::json value = object[invitesentKey];




        AuditLog_invite_sent* obj = &invitesent;
		obj->fromJson(value.dump());

    }

    const char *inviteacceptedKey = "invite.accepted";

    if(object.has_key(inviteacceptedKey))
    {
        bourne::json value = object[inviteacceptedKey];




        AuditLog_invite_accepted* obj = &inviteaccepted;
		obj->fromJson(value.dump());

    }

    const char *invitedeletedKey = "invite.deleted";

    if(object.has_key(invitedeletedKey))
    {
        bourne::json value = object[invitedeletedKey];




        AuditLog_invite_accepted* obj = &invitedeleted;
		obj->fromJson(value.dump());

    }

    const char *loginfailedKey = "login.failed";

    if(object.has_key(loginfailedKey))
    {
        bourne::json value = object[loginfailedKey];




        AuditLog_login_failed* obj = &loginfailed;
		obj->fromJson(value.dump());

    }

    const char *logoutfailedKey = "logout.failed";

    if(object.has_key(logoutfailedKey))
    {
        bourne::json value = object[logoutfailedKey];




        AuditLog_login_failed* obj = &logoutfailed;
		obj->fromJson(value.dump());

    }

    const char *organizationupdatedKey = "organization.updated";

    if(object.has_key(organizationupdatedKey))
    {
        bourne::json value = object[organizationupdatedKey];




        AuditLog_organization_updated* obj = &organizationupdated;
		obj->fromJson(value.dump());

    }

    const char *projectcreatedKey = "project.created";

    if(object.has_key(projectcreatedKey))
    {
        bourne::json value = object[projectcreatedKey];




        AuditLog_project_created* obj = &projectcreated;
		obj->fromJson(value.dump());

    }

    const char *projectupdatedKey = "project.updated";

    if(object.has_key(projectupdatedKey))
    {
        bourne::json value = object[projectupdatedKey];




        AuditLog_project_updated* obj = &projectupdated;
		obj->fromJson(value.dump());

    }

    const char *projectarchivedKey = "project.archived";

    if(object.has_key(projectarchivedKey))
    {
        bourne::json value = object[projectarchivedKey];




        AuditLog_project_archived* obj = &projectarchived;
		obj->fromJson(value.dump());

    }

    const char *rate_limitupdatedKey = "rate_limit.updated";

    if(object.has_key(rate_limitupdatedKey))
    {
        bourne::json value = object[rate_limitupdatedKey];




        AuditLog_rate_limit_updated* obj = &rate_limitupdated;
		obj->fromJson(value.dump());

    }

    const char *rate_limitdeletedKey = "rate_limit.deleted";

    if(object.has_key(rate_limitdeletedKey))
    {
        bourne::json value = object[rate_limitdeletedKey];




        AuditLog_rate_limit_deleted* obj = &rate_limitdeleted;
		obj->fromJson(value.dump());

    }

    const char *service_accountcreatedKey = "service_account.created";

    if(object.has_key(service_accountcreatedKey))
    {
        bourne::json value = object[service_accountcreatedKey];




        AuditLog_service_account_created* obj = &service_accountcreated;
		obj->fromJson(value.dump());

    }

    const char *service_accountupdatedKey = "service_account.updated";

    if(object.has_key(service_accountupdatedKey))
    {
        bourne::json value = object[service_accountupdatedKey];




        AuditLog_service_account_updated* obj = &service_accountupdated;
		obj->fromJson(value.dump());

    }

    const char *service_accountdeletedKey = "service_account.deleted";

    if(object.has_key(service_accountdeletedKey))
    {
        bourne::json value = object[service_accountdeletedKey];




        AuditLog_service_account_deleted* obj = &service_accountdeleted;
		obj->fromJson(value.dump());

    }

    const char *useraddedKey = "user.added";

    if(object.has_key(useraddedKey))
    {
        bourne::json value = object[useraddedKey];




        AuditLog_user_added* obj = &useradded;
		obj->fromJson(value.dump());

    }

    const char *userupdatedKey = "user.updated";

    if(object.has_key(userupdatedKey))
    {
        bourne::json value = object[userupdatedKey];




        AuditLog_user_updated* obj = &userupdated;
		obj->fromJson(value.dump());

    }

    const char *userdeletedKey = "user.deleted";

    if(object.has_key(userdeletedKey))
    {
        bourne::json value = object[userdeletedKey];




        AuditLog_user_deleted* obj = &userdeleted;
		obj->fromJson(value.dump());

    }


}

bourne::json
AuditLog::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["type"] = getType().toJson();





    object["effective_at"] = getEffectiveAt();







	object["project"] = getProject().toJson();






	object["actor"] = getActor().toJson();






	object["api_keycreated"] = getApiKeycreated().toJson();






	object["api_keyupdated"] = getApiKeyupdated().toJson();






	object["api_keydeleted"] = getApiKeydeleted().toJson();






	object["invitesent"] = getInvitesent().toJson();






	object["inviteaccepted"] = getInviteaccepted().toJson();






	object["invitedeleted"] = getInvitedeleted().toJson();






	object["loginfailed"] = getLoginfailed().toJson();






	object["logoutfailed"] = getLogoutfailed().toJson();






	object["organizationupdated"] = getOrganizationupdated().toJson();






	object["projectcreated"] = getProjectcreated().toJson();






	object["projectupdated"] = getProjectupdated().toJson();






	object["projectarchived"] = getProjectarchived().toJson();






	object["rate_limitupdated"] = getRateLimitupdated().toJson();






	object["rate_limitdeleted"] = getRateLimitdeleted().toJson();






	object["service_accountcreated"] = getServiceAccountcreated().toJson();






	object["service_accountupdated"] = getServiceAccountupdated().toJson();






	object["service_accountdeleted"] = getServiceAccountdeleted().toJson();






	object["useradded"] = getUseradded().toJson();






	object["userupdated"] = getUserupdated().toJson();






	object["userdeleted"] = getUserdeleted().toJson();


    return object;

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



