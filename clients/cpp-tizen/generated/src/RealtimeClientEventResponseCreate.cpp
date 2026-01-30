#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeClientEventResponseCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeClientEventResponseCreate::RealtimeClientEventResponseCreate()
{
	//__init();
}

RealtimeClientEventResponseCreate::~RealtimeClientEventResponseCreate()
{
	//__cleanup();
}

void
RealtimeClientEventResponseCreate::__init()
{
	//event_id = std::string();
	//type = std::string();
	//response = new RealtimeResponseCreateParams();
}

void
RealtimeClientEventResponseCreate::__cleanup()
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
RealtimeClientEventResponseCreate::fromJson(char* jsonStr)
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
	

		if (isprimitive("RealtimeResponseCreateParams")) {
			jsonToValue(&response, node, "RealtimeResponseCreateParams", "RealtimeResponseCreateParams");
		} else {
			
			RealtimeResponseCreateParams* obj = static_cast<RealtimeResponseCreateParams*> (&response);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RealtimeClientEventResponseCreate::RealtimeClientEventResponseCreate(char* json)
{
	this->fromJson(json);
}

char*
RealtimeClientEventResponseCreate::toJson()
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
	if (isprimitive("RealtimeResponseCreateParams")) {
		RealtimeResponseCreateParams obj = getResponse();
		node = converttoJson(&obj, "RealtimeResponseCreateParams", "");
	}
	else {
		
		RealtimeResponseCreateParams obj = static_cast<RealtimeResponseCreateParams> (getResponse());
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
RealtimeClientEventResponseCreate::getEventId()
{
	return event_id;
}

void
RealtimeClientEventResponseCreate::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeClientEventResponseCreate::getType()
{
	return type;
}

void
RealtimeClientEventResponseCreate::setType(std::string  type)
{
	this->type = type;
}

RealtimeResponseCreateParams
RealtimeClientEventResponseCreate::getResponse()
{
	return response;
}

void
RealtimeClientEventResponseCreate::setResponse(RealtimeResponseCreateParams  response)
{
	this->response = response;
}


