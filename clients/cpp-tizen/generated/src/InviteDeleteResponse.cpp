#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "InviteDeleteResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

InviteDeleteResponse::InviteDeleteResponse()
{
	//__init();
}

InviteDeleteResponse::~InviteDeleteResponse()
{
	//__cleanup();
}

void
InviteDeleteResponse::__init()
{
	//object = std::string();
	//id = std::string();
	//deleted = bool(false);
}

void
InviteDeleteResponse::__cleanup()
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
	//if(deleted != NULL) {
	//
	//delete deleted;
	//deleted = NULL;
	//}
	//
}

void
InviteDeleteResponse::fromJson(char* jsonStr)
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
	const gchar *deletedKey = "deleted";
	node = json_object_get_member(pJsonObject, deletedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&deleted, node, "bool", "");
		} else {
			
		}
	}
}

InviteDeleteResponse::InviteDeleteResponse(char* json)
{
	this->fromJson(json);
}

char*
InviteDeleteResponse::toJson()
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
InviteDeleteResponse::getObject()
{
	return object;
}

void
InviteDeleteResponse::setObject(std::string  object)
{
	this->object = object;
}

std::string
InviteDeleteResponse::getId()
{
	return id;
}

void
InviteDeleteResponse::setId(std::string  id)
{
	this->id = id;
}

bool
InviteDeleteResponse::getDeleted()
{
	return deleted;
}

void
InviteDeleteResponse::setDeleted(bool  deleted)
{
	this->deleted = deleted;
}


