#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuditLogActorSession.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuditLogActorSession::AuditLogActorSession()
{
	//__init();
}

AuditLogActorSession::~AuditLogActorSession()
{
	//__cleanup();
}

void
AuditLogActorSession::__init()
{
	//user = new AuditLogActorUser();
	//ip_address = std::string();
}

void
AuditLogActorSession::__cleanup()
{
	//if(user != NULL) {
	//
	//delete user;
	//user = NULL;
	//}
	//if(ip_address != NULL) {
	//
	//delete ip_address;
	//ip_address = NULL;
	//}
	//
}

void
AuditLogActorSession::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *ip_addressKey = "ip_address";
	node = json_object_get_member(pJsonObject, ip_addressKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ip_address, node, "std::string", "");
		} else {
			
		}
	}
}

AuditLogActorSession::AuditLogActorSession(char* json)
{
	this->fromJson(json);
}

char*
AuditLogActorSession::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("std::string")) {
		std::string obj = getIpAddress();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ip_addressKey = "ip_address";
	json_object_set_member(pJsonObject, ip_addressKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AuditLogActorUser
AuditLogActorSession::getUser()
{
	return user;
}

void
AuditLogActorSession::setUser(AuditLogActorUser  user)
{
	this->user = user;
}

std::string
AuditLogActorSession::getIpAddress()
{
	return ip_address;
}

void
AuditLogActorSession::setIpAddress(std::string  ip_address)
{
	this->ip_address = ip_address;
}


