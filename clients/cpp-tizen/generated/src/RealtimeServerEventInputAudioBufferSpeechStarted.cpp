#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeServerEventInputAudioBufferSpeechStarted.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeServerEventInputAudioBufferSpeechStarted::RealtimeServerEventInputAudioBufferSpeechStarted()
{
	//__init();
}

RealtimeServerEventInputAudioBufferSpeechStarted::~RealtimeServerEventInputAudioBufferSpeechStarted()
{
	//__cleanup();
}

void
RealtimeServerEventInputAudioBufferSpeechStarted::__init()
{
	//event_id = std::string();
	//type = std::string();
	//audio_start_ms = int(0);
	//item_id = std::string();
}

void
RealtimeServerEventInputAudioBufferSpeechStarted::__cleanup()
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
	//if(audio_start_ms != NULL) {
	//
	//delete audio_start_ms;
	//audio_start_ms = NULL;
	//}
	//if(item_id != NULL) {
	//
	//delete item_id;
	//item_id = NULL;
	//}
	//
}

void
RealtimeServerEventInputAudioBufferSpeechStarted::fromJson(char* jsonStr)
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
	const gchar *audio_start_msKey = "audio_start_ms";
	node = json_object_get_member(pJsonObject, audio_start_msKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&audio_start_ms, node, "int", "");
		} else {
			
		}
	}
	const gchar *item_idKey = "item_id";
	node = json_object_get_member(pJsonObject, item_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&item_id, node, "std::string", "");
		} else {
			
		}
	}
}

RealtimeServerEventInputAudioBufferSpeechStarted::RealtimeServerEventInputAudioBufferSpeechStarted(char* json)
{
	this->fromJson(json);
}

char*
RealtimeServerEventInputAudioBufferSpeechStarted::toJson()
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
	if (isprimitive("int")) {
		int obj = getAudioStartMs();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *audio_start_msKey = "audio_start_ms";
	json_object_set_member(pJsonObject, audio_start_msKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getItemId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *item_idKey = "item_id";
	json_object_set_member(pJsonObject, item_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeServerEventInputAudioBufferSpeechStarted::getEventId()
{
	return event_id;
}

void
RealtimeServerEventInputAudioBufferSpeechStarted::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventInputAudioBufferSpeechStarted::getType()
{
	return type;
}

void
RealtimeServerEventInputAudioBufferSpeechStarted::setType(std::string  type)
{
	this->type = type;
}

int
RealtimeServerEventInputAudioBufferSpeechStarted::getAudioStartMs()
{
	return audio_start_ms;
}

void
RealtimeServerEventInputAudioBufferSpeechStarted::setAudioStartMs(int  audio_start_ms)
{
	this->audio_start_ms = audio_start_ms;
}

std::string
RealtimeServerEventInputAudioBufferSpeechStarted::getItemId()
{
	return item_id;
}

void
RealtimeServerEventInputAudioBufferSpeechStarted::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}


