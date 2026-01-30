#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeServerEventInputAudioBufferCleared.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeServerEventInputAudioBufferCleared::RealtimeServerEventInputAudioBufferCleared()
{
	//__init();
}

RealtimeServerEventInputAudioBufferCleared::~RealtimeServerEventInputAudioBufferCleared()
{
	//__cleanup();
}

void
RealtimeServerEventInputAudioBufferCleared::__init()
{
	//event_id = std::string();
	//type = std::string();
}

void
RealtimeServerEventInputAudioBufferCleared::__cleanup()
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
	//
}

void
RealtimeServerEventInputAudioBufferCleared::fromJson(char* jsonStr)
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
}

RealtimeServerEventInputAudioBufferCleared::RealtimeServerEventInputAudioBufferCleared(char* json)
{
	this->fromJson(json);
}

char*
RealtimeServerEventInputAudioBufferCleared::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeServerEventInputAudioBufferCleared::getEventId()
{
	return event_id;
}

void
RealtimeServerEventInputAudioBufferCleared::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventInputAudioBufferCleared::getType()
{
	return type;
}

void
RealtimeServerEventInputAudioBufferCleared::setType(std::string  type)
{
	this->type = type;
}


