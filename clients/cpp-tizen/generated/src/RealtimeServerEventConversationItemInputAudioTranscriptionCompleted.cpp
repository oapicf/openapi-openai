#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::RealtimeServerEventConversationItemInputAudioTranscriptionCompleted()
{
	//__init();
}

RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::~RealtimeServerEventConversationItemInputAudioTranscriptionCompleted()
{
	//__cleanup();
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::__init()
{
	//event_id = std::string();
	//type = std::string();
	//item_id = std::string();
	//content_index = int(0);
	//transcript = std::string();
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::__cleanup()
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
	//if(item_id != NULL) {
	//
	//delete item_id;
	//item_id = NULL;
	//}
	//if(content_index != NULL) {
	//
	//delete content_index;
	//content_index = NULL;
	//}
	//if(transcript != NULL) {
	//
	//delete transcript;
	//transcript = NULL;
	//}
	//
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::fromJson(char* jsonStr)
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
	const gchar *item_idKey = "item_id";
	node = json_object_get_member(pJsonObject, item_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&item_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *content_indexKey = "content_index";
	node = json_object_get_member(pJsonObject, content_indexKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&content_index, node, "int", "");
		} else {
			
		}
	}
	const gchar *transcriptKey = "transcript";
	node = json_object_get_member(pJsonObject, transcriptKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&transcript, node, "std::string", "");
		} else {
			
		}
	}
}

RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::RealtimeServerEventConversationItemInputAudioTranscriptionCompleted(char* json)
{
	this->fromJson(json);
}

char*
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::toJson()
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
		std::string obj = getItemId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *item_idKey = "item_id";
	json_object_set_member(pJsonObject, item_idKey, node);
	if (isprimitive("int")) {
		int obj = getContentIndex();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *content_indexKey = "content_index";
	json_object_set_member(pJsonObject, content_indexKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTranscript();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *transcriptKey = "transcript";
	json_object_set_member(pJsonObject, transcriptKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::getEventId()
{
	return event_id;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::getType()
{
	return type;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::getItemId()
{
	return item_id;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

int
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::getContentIndex()
{
	return content_index;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::setContentIndex(int  content_index)
{
	this->content_index = content_index;
}

std::string
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::getTranscript()
{
	return transcript;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::setTranscript(std::string  transcript)
{
	this->transcript = transcript;
}


