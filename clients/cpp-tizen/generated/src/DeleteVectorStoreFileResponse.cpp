#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DeleteVectorStoreFileResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DeleteVectorStoreFileResponse::DeleteVectorStoreFileResponse()
{
	//__init();
}

DeleteVectorStoreFileResponse::~DeleteVectorStoreFileResponse()
{
	//__cleanup();
}

void
DeleteVectorStoreFileResponse::__init()
{
	//id = std::string();
	//deleted = bool(false);
	//object = std::string();
}

void
DeleteVectorStoreFileResponse::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(deleted != NULL) {
	//
	//delete deleted;
	//deleted = NULL;
	//}
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//
}

void
DeleteVectorStoreFileResponse::fromJson(char* jsonStr)
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
	const gchar *deletedKey = "deleted";
	node = json_object_get_member(pJsonObject, deletedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&deleted, node, "bool", "");
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

DeleteVectorStoreFileResponse::DeleteVectorStoreFileResponse(char* json)
{
	this->fromJson(json);
}

char*
DeleteVectorStoreFileResponse::toJson()
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
	if (isprimitive("bool")) {
		bool obj = getDeleted();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *deletedKey = "deleted";
	json_object_set_member(pJsonObject, deletedKey, node);
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
DeleteVectorStoreFileResponse::getId()
{
	return id;
}

void
DeleteVectorStoreFileResponse::setId(std::string  id)
{
	this->id = id;
}

bool
DeleteVectorStoreFileResponse::getDeleted()
{
	return deleted;
}

void
DeleteVectorStoreFileResponse::setDeleted(bool  deleted)
{
	this->deleted = deleted;
}

std::string
DeleteVectorStoreFileResponse::getObject()
{
	return object;
}

void
DeleteVectorStoreFileResponse::setObject(std::string  object)
{
	this->object = object;
}


