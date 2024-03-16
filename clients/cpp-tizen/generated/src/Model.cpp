#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Model.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Model::Model()
{
	//__init();
}

Model::~Model()
{
	//__cleanup();
}

void
Model::__init()
{
	//id = std::string();
	//object = std::string();
	//created = int(0);
	//owned_by = std::string();
}

void
Model::__cleanup()
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
	//if(created != NULL) {
	//
	//delete created;
	//created = NULL;
	//}
	//if(owned_by != NULL) {
	//
	//delete owned_by;
	//owned_by = NULL;
	//}
	//
}

void
Model::fromJson(char* jsonStr)
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
	const gchar *createdKey = "created";
	node = json_object_get_member(pJsonObject, createdKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created, node, "int", "");
		} else {
			
		}
	}
	const gchar *owned_byKey = "owned_by";
	node = json_object_get_member(pJsonObject, owned_byKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&owned_by, node, "std::string", "");
		} else {
			
		}
	}
}

Model::Model(char* json)
{
	this->fromJson(json);
}

char*
Model::toJson()
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
		int obj = getCreated();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *createdKey = "created";
	json_object_set_member(pJsonObject, createdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOwnedBy();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *owned_byKey = "owned_by";
	json_object_set_member(pJsonObject, owned_byKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Model::getId()
{
	return id;
}

void
Model::setId(std::string  id)
{
	this->id = id;
}

std::string
Model::getObject()
{
	return object;
}

void
Model::setObject(std::string  object)
{
	this->object = object;
}

int
Model::getCreated()
{
	return created;
}

void
Model::setCreated(int  created)
{
	this->created = created;
}

std::string
Model::getOwnedBy()
{
	return owned_by;
}

void
Model::setOwnedBy(std::string  owned_by)
{
	this->owned_by = owned_by;
}


