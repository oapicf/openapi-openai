#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeServerEventResponseDone.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeServerEventResponseDone::RealtimeServerEventResponseDone()
{
	//__init();
}

RealtimeServerEventResponseDone::~RealtimeServerEventResponseDone()
{
	//__cleanup();
}

void
RealtimeServerEventResponseDone::__init()
{
	//event_id = std::string();
	//type = std::string();
	//response = new RealtimeResponse();
}

void
RealtimeServerEventResponseDone::__cleanup()
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
	//if(response != NULL) {
	//
	//delete response;
	//response = NULL;
	//}
	//
}

void
RealtimeServerEventResponseDone::fromJson(char* jsonStr)
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
	const gchar *responseKey = "response";
	node = json_object_get_member(pJsonObject, responseKey);
	if (node !=NULL) {
	

		if (isprimitive("RealtimeResponse")) {
			jsonToValue(&response, node, "RealtimeResponse", "RealtimeResponse");
		} else {
			
			RealtimeResponse* obj = static_cast<RealtimeResponse*> (&response);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RealtimeServerEventResponseDone::RealtimeServerEventResponseDone(char* json)
{
	this->fromJson(json);
}

char*
RealtimeServerEventResponseDone::toJson()
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
	if (isprimitive("RealtimeResponse")) {
		RealtimeResponse obj = getResponse();
		node = converttoJson(&obj, "RealtimeResponse", "");
	}
	else {
		
		RealtimeResponse obj = static_cast<RealtimeResponse> (getResponse());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *responseKey = "response";
	json_object_set_member(pJsonObject, responseKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeServerEventResponseDone::getEventId()
{
	return event_id;
}

void
RealtimeServerEventResponseDone::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventResponseDone::getType()
{
	return type;
}

void
RealtimeServerEventResponseDone::setType(std::string  type)
{
	this->type = type;
}

RealtimeResponse
RealtimeServerEventResponseDone::getResponse()
{
	return response;
}

void
RealtimeServerEventResponseDone::setResponse(RealtimeResponse  response)
{
	this->response = response;
}


