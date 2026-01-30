#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Admin_api_keys_delete_200_response.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Admin_api_keys_delete_200_response::Admin_api_keys_delete_200_response()
{
	//__init();
}

Admin_api_keys_delete_200_response::~Admin_api_keys_delete_200_response()
{
	//__cleanup();
}

void
Admin_api_keys_delete_200_response::__init()
{
	//id = std::string();
	//object = std::string();
	//deleted = bool(false);
}

void
Admin_api_keys_delete_200_response::__cleanup()
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
	//if(deleted != NULL) {
	//
	//delete deleted;
	//deleted = NULL;
	//}
	//
}

void
Admin_api_keys_delete_200_response::fromJson(char* jsonStr)
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
	const gchar *deletedKey = "deleted";
	node = json_object_get_member(pJsonObject, deletedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&deleted, node, "bool", "");
		} else {
			
		}
	}
}

Admin_api_keys_delete_200_response::Admin_api_keys_delete_200_response(char* json)
{
	this->fromJson(json);
}

char*
Admin_api_keys_delete_200_response::toJson()
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
	if (isprimitive("bool")) {
		bool obj = getDeleted();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *deletedKey = "deleted";
	json_object_set_member(pJsonObject, deletedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Admin_api_keys_delete_200_response::getId()
{
	return id;
}

void
Admin_api_keys_delete_200_response::setId(std::string  id)
{
	this->id = id;
}

std::string
Admin_api_keys_delete_200_response::getObject()
{
	return object;
}

void
Admin_api_keys_delete_200_response::setObject(std::string  object)
{
	this->object = object;
}

bool
Admin_api_keys_delete_200_response::getDeleted()
{
	return deleted;
}

void
Admin_api_keys_delete_200_response::setDeleted(bool  deleted)
{
	this->deleted = deleted;
}


