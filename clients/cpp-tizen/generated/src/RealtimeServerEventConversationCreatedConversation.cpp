#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeServerEventConversationCreated_conversation.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeServerEventConversationCreated_conversation::RealtimeServerEventConversationCreated_conversation()
{
	//__init();
}

RealtimeServerEventConversationCreated_conversation::~RealtimeServerEventConversationCreated_conversation()
{
	//__cleanup();
}

void
RealtimeServerEventConversationCreated_conversation::__init()
{
	//id = std::string();
	//object = std::string();
}

void
RealtimeServerEventConversationCreated_conversation::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//
}

void
RealtimeServerEventConversationCreated_conversation::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *objectKey = "object";
	node = json_object_get_member(pJsonObject, objectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&object, node, "std::string", "");
		} else {
			
		}
	}
}

RealtimeServerEventConversationCreated_conversation::RealtimeServerEventConversationCreated_conversation(char* json)
{
	this->fromJson(json);
}

char*
RealtimeServerEventConversationCreated_conversation::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getObject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *objectKey = "object";
	json_object_set_member(pJsonObject, objectKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeServerEventConversationCreated_conversation::getId()
{
	return id;
}

void
RealtimeServerEventConversationCreated_conversation::setId(std::string  id)
{
	this->id = id;
}

std::string
RealtimeServerEventConversationCreated_conversation::getObject()
{
	return object;
}

void
RealtimeServerEventConversationCreated_conversation::setObject(std::string  object)
{
	this->object = object;
}


