#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DeleteAssistantResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DeleteAssistantResponse::DeleteAssistantResponse()
{
	//__init();
}

DeleteAssistantResponse::~DeleteAssistantResponse()
{
	//__cleanup();
}

void
DeleteAssistantResponse::__init()
{
	//id = std::string();
	//deleted = bool(false);
	//object = std::string();
}

void
DeleteAssistantResponse::__cleanup()
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
DeleteAssistantResponse::fromJson(char* jsonStr)
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

DeleteAssistantResponse::DeleteAssistantResponse(char* json)
{
	this->fromJson(json);
}

char*
DeleteAssistantResponse::toJson()
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
DeleteAssistantResponse::getId()
{
	return id;
}

void
DeleteAssistantResponse::setId(std::string  id)
{
	this->id = id;
}

bool
DeleteAssistantResponse::getDeleted()
{
	return deleted;
}

void
DeleteAssistantResponse::setDeleted(bool  deleted)
{
	this->deleted = deleted;
}

std::string
DeleteAssistantResponse::getObject()
{
	return object;
}

void
DeleteAssistantResponse::setObject(std::string  object)
{
	this->object = object;
}


