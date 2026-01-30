#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FineTuningJobEvent.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FineTuningJobEvent::FineTuningJobEvent()
{
	//__init();
}

FineTuningJobEvent::~FineTuningJobEvent()
{
	//__cleanup();
}

void
FineTuningJobEvent::__init()
{
	//object = std::string();
	//id = std::string();
	//created_at = int(0);
	//level = std::string();
	//message = std::string();
	//type = std::string();
	//data = null;
}

void
FineTuningJobEvent::__cleanup()
{
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
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
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
	//}
	//
}

void
FineTuningJobEvent::fromJson(char* jsonStr)
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
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
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&data, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

FineTuningJobEvent::FineTuningJobEvent(char* json)
{
	this->fromJson(json);
}

char*
FineTuningJobEvent::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
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
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getData();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
FineTuningJobEvent::getObject()
{
	return object;
}

void
FineTuningJobEvent::setObject(std::string  object)
{
	this->object = object;
}

std::string
FineTuningJobEvent::getId()
{
	return id;
}

void
FineTuningJobEvent::setId(std::string  id)
{
	this->id = id;
}

int
FineTuningJobEvent::getCreatedAt()
{
	return created_at;
}

void
FineTuningJobEvent::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
FineTuningJobEvent::getLevel()
{
	return level;
}

void
FineTuningJobEvent::setLevel(std::string  level)
{
	this->level = level;
}

std::string
FineTuningJobEvent::getMessage()
{
	return message;
}

void
FineTuningJobEvent::setMessage(std::string  message)
{
	this->message = message;
}

std::string
FineTuningJobEvent::getType()
{
	return type;
}

void
FineTuningJobEvent::setType(std::string  type)
{
	this->type = type;
}

std::string
FineTuningJobEvent::getData()
{
	return data;
}

void
FineTuningJobEvent::setData(std::string  data)
{
	this->data = data;
}


