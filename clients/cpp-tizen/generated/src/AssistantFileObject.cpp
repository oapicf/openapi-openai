#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AssistantFileObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AssistantFileObject::AssistantFileObject()
{
	//__init();
}

AssistantFileObject::~AssistantFileObject()
{
	//__cleanup();
}

void
AssistantFileObject::__init()
{
	//id = std::string();
	//object = std::string();
	//created_at = int(0);
	//assistant_id = std::string();
}

void
AssistantFileObject::__cleanup()
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
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(assistant_id != NULL) {
	//
	//delete assistant_id;
	//assistant_id = NULL;
	//}
	//
}

void
AssistantFileObject::fromJson(char* jsonStr)
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
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *assistant_idKey = "assistant_id";
	node = json_object_get_member(pJsonObject, assistant_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&assistant_id, node, "std::string", "");
		} else {
			
		}
	}
}

AssistantFileObject::AssistantFileObject(char* json)
{
	this->fromJson(json);
}

char*
AssistantFileObject::toJson()
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
	if (isprimitive("int")) {
		int obj = getCreatedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAssistantId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *assistant_idKey = "assistant_id";
	json_object_set_member(pJsonObject, assistant_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AssistantFileObject::getId()
{
	return id;
}

void
AssistantFileObject::setId(std::string  id)
{
	this->id = id;
}

std::string
AssistantFileObject::getObject()
{
	return object;
}

void
AssistantFileObject::setObject(std::string  object)
{
	this->object = object;
}

int
AssistantFileObject::getCreatedAt()
{
	return created_at;
}

void
AssistantFileObject::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
AssistantFileObject::getAssistantId()
{
	return assistant_id;
}

void
AssistantFileObject::setAssistantId(std::string  assistant_id)
{
	this->assistant_id = assistant_id;
}


