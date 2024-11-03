#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessageFileObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessageFileObject::MessageFileObject()
{
	//__init();
}

MessageFileObject::~MessageFileObject()
{
	//__cleanup();
}

void
MessageFileObject::__init()
{
	//id = std::string();
	//object = std::string();
	//created_at = int(0);
	//message_id = std::string();
}

void
MessageFileObject::__cleanup()
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
	//if(message_id != NULL) {
	//
	//delete message_id;
	//message_id = NULL;
	//}
	//
}

void
MessageFileObject::fromJson(char* jsonStr)
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
	const gchar *message_idKey = "message_id";
	node = json_object_get_member(pJsonObject, message_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&message_id, node, "std::string", "");
		} else {
			
		}
	}
}

MessageFileObject::MessageFileObject(char* json)
{
	this->fromJson(json);
}

char*
MessageFileObject::toJson()
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
		std::string obj = getMessageId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *message_idKey = "message_id";
	json_object_set_member(pJsonObject, message_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
MessageFileObject::getId()
{
	return id;
}

void
MessageFileObject::setId(std::string  id)
{
	this->id = id;
}

std::string
MessageFileObject::getObject()
{
	return object;
}

void
MessageFileObject::setObject(std::string  object)
{
	this->object = object;
}

int
MessageFileObject::getCreatedAt()
{
	return created_at;
}

void
MessageFileObject::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
MessageFileObject::getMessageId()
{
	return message_id;
}

void
MessageFileObject::setMessageId(std::string  message_id)
{
	this->message_id = message_id;
}


