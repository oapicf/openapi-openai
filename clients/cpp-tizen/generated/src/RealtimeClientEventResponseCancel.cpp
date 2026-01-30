#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeClientEventResponseCancel.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeClientEventResponseCancel::RealtimeClientEventResponseCancel()
{
	//__init();
}

RealtimeClientEventResponseCancel::~RealtimeClientEventResponseCancel()
{
	//__cleanup();
}

void
RealtimeClientEventResponseCancel::__init()
{
	//event_id = std::string();
	//type = std::string();
	//response_id = std::string();
}

void
RealtimeClientEventResponseCancel::__cleanup()
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
	//if(response_id != NULL) {
	//
	//delete response_id;
	//response_id = NULL;
	//}
	//
}

void
RealtimeClientEventResponseCancel::fromJson(char* jsonStr)
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
	const gchar *response_idKey = "response_id";
	node = json_object_get_member(pJsonObject, response_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&response_id, node, "std::string", "");
		} else {
			
		}
	}
}

RealtimeClientEventResponseCancel::RealtimeClientEventResponseCancel(char* json)
{
	this->fromJson(json);
}

char*
RealtimeClientEventResponseCancel::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getResponseId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *response_idKey = "response_id";
	json_object_set_member(pJsonObject, response_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeClientEventResponseCancel::getEventId()
{
	return event_id;
}

void
RealtimeClientEventResponseCancel::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeClientEventResponseCancel::getType()
{
	return type;
}

void
RealtimeClientEventResponseCancel::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeClientEventResponseCancel::getResponseId()
{
	return response_id;
}

void
RealtimeClientEventResponseCancel::setResponseId(std::string  response_id)
{
	this->response_id = response_id;
}


