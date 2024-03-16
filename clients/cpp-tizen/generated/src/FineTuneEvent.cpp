#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FineTuneEvent.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FineTuneEvent::FineTuneEvent()
{
	//__init();
}

FineTuneEvent::~FineTuneEvent()
{
	//__cleanup();
}

void
FineTuneEvent::__init()
{
	//object = std::string();
	//created_at = int(0);
	//level = std::string();
	//message = std::string();
}

void
FineTuneEvent::__cleanup()
{
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(level != NULL) {
	//
	//delete level;
	//level = NULL;
	//}
	//if(message != NULL) {
	//
	//delete message;
	//message = NULL;
	//}
	//
}

void
FineTuneEvent::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *objectKey = "object";
	node = json_object_get_member(pJsonObject, objectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&object, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *levelKey = "level";
	node = json_object_get_member(pJsonObject, levelKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&level, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *messageKey = "message";
	node = json_object_get_member(pJsonObject, messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&message, node, "std::string", "");
		} else {
			
		}
	}
}

FineTuneEvent::FineTuneEvent(char* json)
{
	this->fromJson(json);
}

char*
FineTuneEvent::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getObject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *objectKey = "object";
	json_object_set_member(pJsonObject, objectKey, node);
	if (isprimitive("int")) {
		int obj = getCreatedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLevel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *levelKey = "level";
	json_object_set_member(pJsonObject, levelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *messageKey = "message";
	json_object_set_member(pJsonObject, messageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
FineTuneEvent::getObject()
{
	return object;
}

void
FineTuneEvent::setObject(std::string  object)
{
	this->object = object;
}

int
FineTuneEvent::getCreatedAt()
{
	return created_at;
}

void
FineTuneEvent::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
FineTuneEvent::getLevel()
{
	return level;
}

void
FineTuneEvent::setLevel(std::string  level)
{
	this->level = level;
}

std::string
FineTuneEvent::getMessage()
{
	return message;
}

void
FineTuneEvent::setMessage(std::string  message)
{
	this->message = message;
}


