#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeServerEventConversationCreated.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeServerEventConversationCreated::RealtimeServerEventConversationCreated()
{
	//__init();
}

RealtimeServerEventConversationCreated::~RealtimeServerEventConversationCreated()
{
	//__cleanup();
}

void
RealtimeServerEventConversationCreated::__init()
{
	//event_id = std::string();
	//type = std::string();
	//conversation = new RealtimeServerEventConversationCreated_conversation();
}

void
RealtimeServerEventConversationCreated::__cleanup()
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
	//if(conversation != NULL) {
	//
	//delete conversation;
	//conversation = NULL;
	//}
	//
}

void
RealtimeServerEventConversationCreated::fromJson(char* jsonStr)
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
	const gchar *conversationKey = "conversation";
	node = json_object_get_member(pJsonObject, conversationKey);
	if (node !=NULL) {
	

		if (isprimitive("RealtimeServerEventConversationCreated_conversation")) {
			jsonToValue(&conversation, node, "RealtimeServerEventConversationCreated_conversation", "RealtimeServerEventConversationCreated_conversation");
		} else {
			
			RealtimeServerEventConversationCreated_conversation* obj = static_cast<RealtimeServerEventConversationCreated_conversation*> (&conversation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RealtimeServerEventConversationCreated::RealtimeServerEventConversationCreated(char* json)
{
	this->fromJson(json);
}

char*
RealtimeServerEventConversationCreated::toJson()
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
	if (isprimitive("RealtimeServerEventConversationCreated_conversation")) {
		RealtimeServerEventConversationCreated_conversation obj = getConversation();
		node = converttoJson(&obj, "RealtimeServerEventConversationCreated_conversation", "");
	}
	else {
		
		RealtimeServerEventConversationCreated_conversation obj = static_cast<RealtimeServerEventConversationCreated_conversation> (getConversation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *conversationKey = "conversation";
	json_object_set_member(pJsonObject, conversationKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeServerEventConversationCreated::getEventId()
{
	return event_id;
}

void
RealtimeServerEventConversationCreated::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventConversationCreated::getType()
{
	return type;
}

void
RealtimeServerEventConversationCreated::setType(std::string  type)
{
	this->type = type;
}

RealtimeServerEventConversationCreated_conversation
RealtimeServerEventConversationCreated::getConversation()
{
	return conversation;
}

void
RealtimeServerEventConversationCreated::setConversation(RealtimeServerEventConversationCreated_conversation  conversation)
{
	this->conversation = conversation;
}


