#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProjectServiceAccountApiKey.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProjectServiceAccountApiKey::ProjectServiceAccountApiKey()
{
	//__init();
}

ProjectServiceAccountApiKey::~ProjectServiceAccountApiKey()
{
	//__cleanup();
}

void
ProjectServiceAccountApiKey::__init()
{
	//object = std::string();
	//value = std::string();
	//name = std::string();
	//created_at = int(0);
	//id = std::string();
}

void
ProjectServiceAccountApiKey::__cleanup()
{
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//
}

void
ProjectServiceAccountApiKey::fromJson(char* jsonStr)
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
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&value, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
}

ProjectServiceAccountApiKey::ProjectServiceAccountApiKey(char* json)
{
	this->fromJson(json);
}

char*
ProjectServiceAccountApiKey::toJson()
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
		std::string obj = getValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("int")) {
		int obj = getCreatedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ProjectServiceAccountApiKey::getObject()
{
	return object;
}

void
ProjectServiceAccountApiKey::setObject(std::string  object)
{
	this->object = object;
}

std::string
ProjectServiceAccountApiKey::getValue()
{
	return value;
}

void
ProjectServiceAccountApiKey::setValue(std::string  value)
{
	this->value = value;
}

std::string
ProjectServiceAccountApiKey::getName()
{
	return name;
}

void
ProjectServiceAccountApiKey::setName(std::string  name)
{
	this->name = name;
}

int
ProjectServiceAccountApiKey::getCreatedAt()
{
	return created_at;
}

void
ProjectServiceAccountApiKey::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
ProjectServiceAccountApiKey::getId()
{
	return id;
}

void
ProjectServiceAccountApiKey::setId(std::string  id)
{
	this->id = id;
}


