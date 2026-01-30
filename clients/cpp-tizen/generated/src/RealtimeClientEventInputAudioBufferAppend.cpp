#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeClientEventInputAudioBufferAppend.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeClientEventInputAudioBufferAppend::RealtimeClientEventInputAudioBufferAppend()
{
	//__init();
}

RealtimeClientEventInputAudioBufferAppend::~RealtimeClientEventInputAudioBufferAppend()
{
	//__cleanup();
}

void
RealtimeClientEventInputAudioBufferAppend::__init()
{
	//event_id = std::string();
	//type = std::string();
	//audio = std::string();
}

void
RealtimeClientEventInputAudioBufferAppend::__cleanup()
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
	//if(audio != NULL) {
	//
	//delete audio;
	//audio = NULL;
	//}
	//
}

void
RealtimeClientEventInputAudioBufferAppend::fromJson(char* jsonStr)
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
	const gchar *audioKey = "audio";
	node = json_object_get_member(pJsonObject, audioKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&audio, node, "std::string", "");
		} else {
			
		}
	}
}

RealtimeClientEventInputAudioBufferAppend::RealtimeClientEventInputAudioBufferAppend(char* json)
{
	this->fromJson(json);
}

char*
RealtimeClientEventInputAudioBufferAppend::toJson()
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
		std::string obj = getAudio();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *audioKey = "audio";
	json_object_set_member(pJsonObject, audioKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeClientEventInputAudioBufferAppend::getEventId()
{
	return event_id;
}

void
RealtimeClientEventInputAudioBufferAppend::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeClientEventInputAudioBufferAppend::getType()
{
	return type;
}

void
RealtimeClientEventInputAudioBufferAppend::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeClientEventInputAudioBufferAppend::getAudio()
{
	return audio;
}

void
RealtimeClientEventInputAudioBufferAppend::setAudio(std::string  audio)
{
	this->audio = audio;
}


