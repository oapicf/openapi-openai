#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdminApiKey.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdminApiKey::AdminApiKey()
{
	//__init();
}

AdminApiKey::~AdminApiKey()
{
	//__cleanup();
}

void
AdminApiKey::__init()
{
	//object = std::string();
	//id = std::string();
	//name = std::string();
	//redacted_value = std::string();
	//value = std::string();
	//created_at = long(0);
	//owner = new AdminApiKey_owner();
}

void
AdminApiKey::__cleanup()
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
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(redacted_value != NULL) {
	//
	//delete redacted_value;
	//redacted_value = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(owner != NULL) {
	//
	//delete owner;
	//owner = NULL;
	//}
	//
}

void
AdminApiKey::fromJson(char* jsonStr)
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
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
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&value, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&created_at, node, "long long", "");
		} else {
			
		}
	}
	const gchar *ownerKey = "owner";
	node = json_object_get_member(pJsonObject, ownerKey);
	if (node !=NULL) {
	

		if (isprimitive("AdminApiKey_owner")) {
			jsonToValue(&owner, node, "AdminApiKey_owner", "AdminApiKey_owner");
		} else {
			
			AdminApiKey_owner* obj = static_cast<AdminApiKey_owner*> (&owner);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AdminApiKey::AdminApiKey(char* json)
{
	this->fromJson(json);
}

char*
AdminApiKey::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRedactedValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *redacted_valueKey = "redacted_value";
	json_object_set_member(pJsonObject, redacted_valueKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	if (isprimitive("long long")) {
		long long obj = getCreatedAt();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("AdminApiKey_owner")) {
		AdminApiKey_owner obj = getOwner();
		node = converttoJson(&obj, "AdminApiKey_owner", "");
	}
	else {
		
		AdminApiKey_owner obj = static_cast<AdminApiKey_owner> (getOwner());
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
AdminApiKey::getObject()
{
	return object;
}

void
AdminApiKey::setObject(std::string  object)
{
	this->object = object;
}

std::string
AdminApiKey::getId()
{
	return id;
}

void
AdminApiKey::setId(std::string  id)
{
	this->id = id;
}

std::string
AdminApiKey::getName()
{
	return name;
}

void
AdminApiKey::setName(std::string  name)
{
	this->name = name;
}

std::string
AdminApiKey::getRedactedValue()
{
	return redacted_value;
}

void
AdminApiKey::setRedactedValue(std::string  redacted_value)
{
	this->redacted_value = redacted_value;
}

std::string
AdminApiKey::getValue()
{
	return value;
}

void
AdminApiKey::setValue(std::string  value)
{
	this->value = value;
}

long long
AdminApiKey::getCreatedAt()
{
	return created_at;
}

void
AdminApiKey::setCreatedAt(long long  created_at)
{
	this->created_at = created_at;
}

AdminApiKey_owner
AdminApiKey::getOwner()
{
	return owner;
}

void
AdminApiKey::setOwner(AdminApiKey_owner  owner)
{
	this->owner = owner;
}


