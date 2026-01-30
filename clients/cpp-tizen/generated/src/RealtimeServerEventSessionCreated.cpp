#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeServerEventSessionCreated.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeServerEventSessionCreated::RealtimeServerEventSessionCreated()
{
	//__init();
}

RealtimeServerEventSessionCreated::~RealtimeServerEventSessionCreated()
{
	//__cleanup();
}

void
RealtimeServerEventSessionCreated::__init()
{
	//event_id = std::string();
	//type = std::string();
	//session = new RealtimeSession();
}

void
RealtimeServerEventSessionCreated::__cleanup()
{
	//if(event_id != NULL) {
	//
	//delete event_id;
	//event_id = NULL;
	//}
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
	//
}

void
RealtimeServerEventSessionCreated::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *event_idKey = "event_id";
	node = json_object_get_member(pJsonObject, event_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&event_id, node, "std::string", "");
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
	const gchar *sessionKey = "session";
	node = json_object_get_member(pJsonObject, sessionKey);
	if (node !=NULL) {
	

		if (isprimitive("RealtimeSession")) {
			jsonToValue(&session, node, "RealtimeSession", "RealtimeSession");
		} else {
			
			RealtimeSession* obj = static_cast<RealtimeSession*> (&session);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RealtimeServerEventSessionCreated::RealtimeServerEventSessionCreated(char* json)
{
	this->fromJson(json);
}

char*
RealtimeServerEventSessionCreated::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getEventId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *event_idKey = "event_id";
	json_object_set_member(pJsonObject, event_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("RealtimeSession")) {
		RealtimeSession obj = getSession();
		node = converttoJson(&obj, "RealtimeSession", "");
	}
	else {
		
		RealtimeSession obj = static_cast<RealtimeSession> (getSession());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sessionKey = "session";
	json_object_set_member(pJsonObject, sessionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeServerEventSessionCreated::getEventId()
{
	return event_id;
}

void
RealtimeServerEventSessionCreated::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventSessionCreated::getType()
{
	return type;
}

void
RealtimeServerEventSessionCreated::setType(std::string  type)
{
	this->type = type;
}

RealtimeSession
RealtimeServerEventSessionCreated::getSession()
{
	return session;
}

void
RealtimeServerEventSessionCreated::setSession(RealtimeSession  session)
{
	this->session = session;
}


