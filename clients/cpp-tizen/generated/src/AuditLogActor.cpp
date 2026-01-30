#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuditLogActor.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuditLogActor::AuditLogActor()
{
	//__init();
}

AuditLogActor::~AuditLogActor()
{
	//__cleanup();
}

void
AuditLogActor::__init()
{
	//type = std::string();
	//session = new AuditLogActorSession();
	//api_key = new AuditLogActorApiKey();
}

void
AuditLogActor::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(session != NULL) {
	//
	//delete session;
	//session = NULL;
	//}
	//if(api_key != NULL) {
	//
	//delete api_key;
	//api_key = NULL;
	//}
	//
}

void
AuditLogActor::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *sessionKey = "session";
	node = json_object_get_member(pJsonObject, sessionKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLogActorSession")) {
			jsonToValue(&session, node, "AuditLogActorSession", "");
		} else {
			
			AuditLogActorSession* obj = static_cast<AuditLogActorSession*> (&session);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *api_keyKey = "api_key";
	node = json_object_get_member(pJsonObject, api_keyKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLogActorApiKey")) {
			jsonToValue(&api_key, node, "AuditLogActorApiKey", "");
		} else {
			
			AuditLogActorApiKey* obj = static_cast<AuditLogActorApiKey*> (&api_key);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AuditLogActor::AuditLogActor(char* json)
{
	this->fromJson(json);
}

char*
AuditLogActor::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("AuditLogActorSession")) {
		AuditLogActorSession obj = getSession();
		node = converttoJson(&obj, "AuditLogActorSession", "");
	}
	else {
		
		AuditLogActorSession obj = static_cast<AuditLogActorSession> (getSession());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sessionKey = "session";
	json_object_set_member(pJsonObject, sessionKey, node);
	if (isprimitive("AuditLogActorApiKey")) {
		AuditLogActorApiKey obj = getApiKey();
		node = converttoJson(&obj, "AuditLogActorApiKey", "");
	}
	else {
		
		AuditLogActorApiKey obj = static_cast<AuditLogActorApiKey> (getApiKey());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *api_keyKey = "api_key";
	json_object_set_member(pJsonObject, api_keyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AuditLogActor::getType()
{
	return type;
}

void
AuditLogActor::setType(std::string  type)
{
	this->type = type;
}

AuditLogActorSession
AuditLogActor::getSession()
{
	return session;
}

void
AuditLogActor::setSession(AuditLogActorSession  session)
{
	this->session = session;
}

AuditLogActorApiKey
AuditLogActor::getApiKey()
{
	return api_key;
}

void
AuditLogActor::setApiKey(AuditLogActorApiKey  api_key)
{
	this->api_key = api_key;
}


