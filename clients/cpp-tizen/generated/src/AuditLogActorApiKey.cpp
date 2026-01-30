#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuditLogActorApiKey.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuditLogActorApiKey::AuditLogActorApiKey()
{
	//__init();
}

AuditLogActorApiKey::~AuditLogActorApiKey()
{
	//__cleanup();
}

void
AuditLogActorApiKey::__init()
{
	//id = std::string();
	//type = std::string();
	//user = new AuditLogActorUser();
	//service_account = new AuditLogActorServiceAccount();
}

void
AuditLogActorApiKey::__cleanup()
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
	//if(user != NULL) {
	//
	//delete user;
	//user = NULL;
	//}
	//if(service_account != NULL) {
	//
	//delete service_account;
	//service_account = NULL;
	//}
	//
}

void
AuditLogActorApiKey::fromJson(char* jsonStr)
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
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *userKey = "user";
	node = json_object_get_member(pJsonObject, userKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLogActorUser")) {
			jsonToValue(&user, node, "AuditLogActorUser", "AuditLogActorUser");
		} else {
			
			AuditLogActorUser* obj = static_cast<AuditLogActorUser*> (&user);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *service_accountKey = "service_account";
	node = json_object_get_member(pJsonObject, service_accountKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLogActorServiceAccount")) {
			jsonToValue(&service_account, node, "AuditLogActorServiceAccount", "AuditLogActorServiceAccount");
		} else {
			
			AuditLogActorServiceAccount* obj = static_cast<AuditLogActorServiceAccount*> (&service_account);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AuditLogActorApiKey::AuditLogActorApiKey(char* json)
{
	this->fromJson(json);
}

char*
AuditLogActorApiKey::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("AuditLogActorUser")) {
		AuditLogActorUser obj = getUser();
		node = converttoJson(&obj, "AuditLogActorUser", "");
	}
	else {
		
		AuditLogActorUser obj = static_cast<AuditLogActorUser> (getUser());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userKey = "user";
	json_object_set_member(pJsonObject, userKey, node);
	if (isprimitive("AuditLogActorServiceAccount")) {
		AuditLogActorServiceAccount obj = getServiceAccount();
		node = converttoJson(&obj, "AuditLogActorServiceAccount", "");
	}
	else {
		
		AuditLogActorServiceAccount obj = static_cast<AuditLogActorServiceAccount> (getServiceAccount());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *service_accountKey = "service_account";
	json_object_set_member(pJsonObject, service_accountKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AuditLogActorApiKey::getId()
{
	return id;
}

void
AuditLogActorApiKey::setId(std::string  id)
{
	this->id = id;
}

std::string
AuditLogActorApiKey::getType()
{
	return type;
}

void
AuditLogActorApiKey::setType(std::string  type)
{
	this->type = type;
}

AuditLogActorUser
AuditLogActorApiKey::getUser()
{
	return user;
}

void
AuditLogActorApiKey::setUser(AuditLogActorUser  user)
{
	this->user = user;
}

AuditLogActorServiceAccount
AuditLogActorApiKey::getServiceAccount()
{
	return service_account;
}

void
AuditLogActorApiKey::setServiceAccount(AuditLogActorServiceAccount  service_account)
{
	this->service_account = service_account;
}


