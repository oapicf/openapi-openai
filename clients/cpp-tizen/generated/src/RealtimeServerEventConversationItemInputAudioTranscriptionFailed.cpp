#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeServerEventConversationItemInputAudioTranscriptionFailed.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeServerEventConversationItemInputAudioTranscriptionFailed::RealtimeServerEventConversationItemInputAudioTranscriptionFailed()
{
	//__init();
}

RealtimeServerEventConversationItemInputAudioTranscriptionFailed::~RealtimeServerEventConversationItemInputAudioTranscriptionFailed()
{
	//__cleanup();
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::__init()
{
	//event_id = std::string();
	//type = std::string();
	//item_id = std::string();
	//content_index = int(0);
	//error = new RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error();
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::__cleanup()
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
	//if(error != NULL) {
	//
	//delete error;
	//error = NULL;
	//}
	//
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::fromJson(char* jsonStr)
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
	const gchar *errorKey = "error";
	node = json_object_get_member(pJsonObject, errorKey);
	if (node !=NULL) {
	

		if (isprimitive("RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error")) {
			jsonToValue(&error, node, "RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error", "RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error");
		} else {
			
			RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error* obj = static_cast<RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error*> (&error);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RealtimeServerEventConversationItemInputAudioTranscriptionFailed::RealtimeServerEventConversationItemInputAudioTranscriptionFailed(char* json)
{
	this->fromJson(json);
}

char*
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::toJson()
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
	if (isprimitive("RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error")) {
		RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error obj = getError();
		node = converttoJson(&obj, "RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error", "");
	}
	else {
		
		RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error obj = static_cast<RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error> (getError());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *errorKey = "error";
	json_object_set_member(pJsonObject, errorKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::getEventId()
{
	return event_id;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::getType()
{
	return type;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::getItemId()
{
	return item_id;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

int
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::getContentIndex()
{
	return content_index;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::setContentIndex(int  content_index)
{
	this->content_index = content_index;
}

RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::getError()
{
	return error;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::setError(RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error  error)
{
	this->error = error;
}


