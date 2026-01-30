#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProjectApiKey.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProjectApiKey::ProjectApiKey()
{
	//__init();
}

ProjectApiKey::~ProjectApiKey()
{
	//__cleanup();
}

void
ProjectApiKey::__init()
{
	//object = std::string();
	//redacted_value = std::string();
	//name = std::string();
	//created_at = int(0);
	//id = std::string();
	//owner = new ProjectApiKey_owner();
}

void
ProjectApiKey::__cleanup()
{
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//if(redacted_value != NULL) {
	//
	//delete redacted_value;
	//redacted_value = NULL;
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
	//if(owner != NULL) {
	//
	//delete owner;
	//owner = NULL;
	//}
	//
}

void
ProjectApiKey::fromJson(char* jsonStr)
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
	const gchar *redacted_valueKey = "redacted_value";
	node = json_object_get_member(pJsonObject, redacted_valueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&redacted_value, node, "std::string", "");
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
	const gchar *ownerKey = "owner";
	node = json_object_get_member(pJsonObject, ownerKey);
	if (node !=NULL) {
	

		if (isprimitive("ProjectApiKey_owner")) {
			jsonToValue(&owner, node, "ProjectApiKey_owner", "ProjectApiKey_owner");
		} else {
			
			ProjectApiKey_owner* obj = static_cast<ProjectApiKey_owner*> (&owner);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ProjectApiKey::ProjectApiKey(char* json)
{
	this->fromJson(json);
}

char*
ProjectApiKey::toJson()
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
		std::string obj = getRedactedValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *redacted_valueKey = "redacted_value";
	json_object_set_member(pJsonObject, redacted_valueKey, node);
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
	if (isprimitive("ProjectApiKey_owner")) {
		ProjectApiKey_owner obj = getOwner();
		node = converttoJson(&obj, "ProjectApiKey_owner", "");
	}
	else {
		
		ProjectApiKey_owner obj = static_cast<ProjectApiKey_owner> (getOwner());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ownerKey = "owner";
	json_object_set_member(pJsonObject, ownerKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ProjectApiKey::getObject()
{
	return object;
}

void
ProjectApiKey::setObject(std::string  object)
{
	this->object = object;
}

std::string
ProjectApiKey::getRedactedValue()
{
	return redacted_value;
}

void
ProjectApiKey::setRedactedValue(std::string  redacted_value)
{
	this->redacted_value = redacted_value;
}

std::string
ProjectApiKey::getName()
{
	return name;
}

void
ProjectApiKey::setName(std::string  name)
{
	this->name = name;
}

int
ProjectApiKey::getCreatedAt()
{
	return created_at;
}

void
ProjectApiKey::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
ProjectApiKey::getId()
{
	return id;
}

void
ProjectApiKey::setId(std::string  id)
{
	this->id = id;
}

ProjectApiKey_owner
ProjectApiKey::getOwner()
{
	return owner;
}

void
ProjectApiKey::setOwner(ProjectApiKey_owner  owner)
{
	this->owner = owner;
}


