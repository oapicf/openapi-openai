#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TruncationObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TruncationObject::TruncationObject()
{
	//__init();
}

TruncationObject::~TruncationObject()
{
	//__cleanup();
}

void
TruncationObject::__init()
{
	//type = std::string();
	//last_messages = int(0);
}

void
TruncationObject::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(last_messages != NULL) {
	//
	//delete last_messages;
	//last_messages = NULL;
	//}
	//
}

void
TruncationObject::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *last_messagesKey = "last_messages";
	node = json_object_get_member(pJsonObject, last_messagesKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&last_messages, node, "int", "");
		} else {
			
		}
	}
}

TruncationObject::TruncationObject(char* json)
{
	this->fromJson(json);
}

char*
TruncationObject::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("int")) {
		int obj = getLastMessages();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *last_messagesKey = "last_messages";
	json_object_set_member(pJsonObject, last_messagesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
TruncationObject::getType()
{
	return type;
}

void
TruncationObject::setType(std::string  type)
{
	this->type = type;
}

int
TruncationObject::getLastMessages()
{
	return last_messages;
}

void
TruncationObject::setLastMessages(int  last_messages)
{
	this->last_messages = last_messages;
}


