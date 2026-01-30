#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VectorStoreObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VectorStoreObject::VectorStoreObject()
{
	//__init();
}

VectorStoreObject::~VectorStoreObject()
{
	//__cleanup();
}

void
VectorStoreObject::__init()
{
	//id = std::string();
	//object = std::string();
	//created_at = int(0);
	//name = std::string();
	//usage_bytes = int(0);
	//file_counts = new VectorStoreObject_file_counts();
	//status = std::string();
	//expires_after = new VectorStoreExpirationAfter();
	//expires_at = int(0);
	//last_active_at = int(0);
	//metadata = null;
}

void
VectorStoreObject::__cleanup()
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
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(usage_bytes != NULL) {
	//
	//delete usage_bytes;
	//usage_bytes = NULL;
	//}
	//if(file_counts != NULL) {
	//
	//delete file_counts;
	//file_counts = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(expires_after != NULL) {
	//
	//delete expires_after;
	//expires_after = NULL;
	//}
	//if(expires_at != NULL) {
	//
	//delete expires_at;
	//expires_at = NULL;
	//}
	//if(last_active_at != NULL) {
	//
	//delete last_active_at;
	//last_active_at = NULL;
	//}
	//if(metadata != NULL) {
	//
	//delete metadata;
	//metadata = NULL;
	//}
	//
}

void
VectorStoreObject::fromJson(char* jsonStr)
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
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_at, node, "int", "");
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
	const gchar *usage_bytesKey = "usage_bytes";
	node = json_object_get_member(pJsonObject, usage_bytesKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&usage_bytes, node, "int", "");
		} else {
			
		}
	}
	const gchar *file_countsKey = "file_counts";
	node = json_object_get_member(pJsonObject, file_countsKey);
	if (node !=NULL) {
	

		if (isprimitive("VectorStoreObject_file_counts")) {
			jsonToValue(&file_counts, node, "VectorStoreObject_file_counts", "VectorStoreObject_file_counts");
		} else {
			
			VectorStoreObject_file_counts* obj = static_cast<VectorStoreObject_file_counts*> (&file_counts);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *expires_afterKey = "expires_after";
	node = json_object_get_member(pJsonObject, expires_afterKey);
	if (node !=NULL) {
	

		if (isprimitive("VectorStoreExpirationAfter")) {
			jsonToValue(&expires_after, node, "VectorStoreExpirationAfter", "VectorStoreExpirationAfter");
		} else {
			
			VectorStoreExpirationAfter* obj = static_cast<VectorStoreExpirationAfter*> (&expires_after);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *expires_atKey = "expires_at";
	node = json_object_get_member(pJsonObject, expires_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&expires_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *last_active_atKey = "last_active_at";
	node = json_object_get_member(pJsonObject, last_active_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&last_active_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *metadataKey = "metadata";
	node = json_object_get_member(pJsonObject, metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&metadata, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&metadata);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

VectorStoreObject::VectorStoreObject(char* json)
{
	this->fromJson(json);
}

char*
VectorStoreObject::toJson()
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
		int obj = getCreatedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("int")) {
		int obj = getUsageBytes();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *usage_bytesKey = "usage_bytes";
	json_object_set_member(pJsonObject, usage_bytesKey, node);
	if (isprimitive("VectorStoreObject_file_counts")) {
		VectorStoreObject_file_counts obj = getFileCounts();
		node = converttoJson(&obj, "VectorStoreObject_file_counts", "");
	}
	else {
		
		VectorStoreObject_file_counts obj = static_cast<VectorStoreObject_file_counts> (getFileCounts());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *file_countsKey = "file_counts";
	json_object_set_member(pJsonObject, file_countsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("VectorStoreExpirationAfter")) {
		VectorStoreExpirationAfter obj = getExpiresAfter();
		node = converttoJson(&obj, "VectorStoreExpirationAfter", "");
	}
	else {
		
		VectorStoreExpirationAfter obj = static_cast<VectorStoreExpirationAfter> (getExpiresAfter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *expires_afterKey = "expires_after";
	json_object_set_member(pJsonObject, expires_afterKey, node);
	if (isprimitive("int")) {
		int obj = getExpiresAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *expires_atKey = "expires_at";
	json_object_set_member(pJsonObject, expires_atKey, node);
	if (isprimitive("int")) {
		int obj = getLastActiveAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *last_active_atKey = "last_active_at";
	json_object_set_member(pJsonObject, last_active_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMetadata();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getMetadata());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *metadataKey = "metadata";
	json_object_set_member(pJsonObject, metadataKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
VectorStoreObject::getId()
{
	return id;
}

void
VectorStoreObject::setId(std::string  id)
{
	this->id = id;
}

std::string
VectorStoreObject::getObject()
{
	return object;
}

void
VectorStoreObject::setObject(std::string  object)
{
	this->object = object;
}

int
VectorStoreObject::getCreatedAt()
{
	return created_at;
}

void
VectorStoreObject::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
VectorStoreObject::getName()
{
	return name;
}

void
VectorStoreObject::setName(std::string  name)
{
	this->name = name;
}

int
VectorStoreObject::getUsageBytes()
{
	return usage_bytes;
}

void
VectorStoreObject::setUsageBytes(int  usage_bytes)
{
	this->usage_bytes = usage_bytes;
}

VectorStoreObject_file_counts
VectorStoreObject::getFileCounts()
{
	return file_counts;
}

void
VectorStoreObject::setFileCounts(VectorStoreObject_file_counts  file_counts)
{
	this->file_counts = file_counts;
}

std::string
VectorStoreObject::getStatus()
{
	return status;
}

void
VectorStoreObject::setStatus(std::string  status)
{
	this->status = status;
}

VectorStoreExpirationAfter
VectorStoreObject::getExpiresAfter()
{
	return expires_after;
}

void
VectorStoreObject::setExpiresAfter(VectorStoreExpirationAfter  expires_after)
{
	this->expires_after = expires_after;
}

int
VectorStoreObject::getExpiresAt()
{
	return expires_at;
}

void
VectorStoreObject::setExpiresAt(int  expires_at)
{
	this->expires_at = expires_at;
}

int
VectorStoreObject::getLastActiveAt()
{
	return last_active_at;
}

void
VectorStoreObject::setLastActiveAt(int  last_active_at)
{
	this->last_active_at = last_active_at;
}

std::string
VectorStoreObject::getMetadata()
{
	return metadata;
}

void
VectorStoreObject::setMetadata(std::string  metadata)
{
	this->metadata = metadata;
}


