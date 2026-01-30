#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Project.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Project::Project()
{
	//__init();
}

Project::~Project()
{
	//__cleanup();
}

void
Project::__init()
{
	//id = std::string();
	//object = std::string();
	//name = std::string();
	//created_at = int(0);
	//archived_at = int(0);
	//status = std::string();
}

void
Project::__cleanup()
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
	//if(archived_at != NULL) {
	//
	//delete archived_at;
	//archived_at = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
Project::fromJson(char* jsonStr)
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
	const gchar *archived_atKey = "archived_at";
	node = json_object_get_member(pJsonObject, archived_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&archived_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&status, node, "std::string", "");
		} else {
			
		}
	}
}

Project::Project(char* json)
{
	this->fromJson(json);
}

char*
Project::toJson()
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
	if (isprimitive("int")) {
		int obj = getArchivedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *archived_atKey = "archived_at";
	json_object_set_member(pJsonObject, archived_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Project::getId()
{
	return id;
}

void
Project::setId(std::string  id)
{
	this->id = id;
}

std::string
Project::getObject()
{
	return object;
}

void
Project::setObject(std::string  object)
{
	this->object = object;
}

std::string
Project::getName()
{
	return name;
}

void
Project::setName(std::string  name)
{
	this->name = name;
}

int
Project::getCreatedAt()
{
	return created_at;
}

void
Project::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

int
Project::getArchivedAt()
{
	return archived_at;
}

void
Project::setArchivedAt(int  archived_at)
{
	this->archived_at = archived_at;
}

std::string
Project::getStatus()
{
	return status;
}

void
Project::setStatus(std::string  status)
{
	this->status = status;
}


