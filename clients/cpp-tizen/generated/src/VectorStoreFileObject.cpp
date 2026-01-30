#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VectorStoreFileObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VectorStoreFileObject::VectorStoreFileObject()
{
	//__init();
}

VectorStoreFileObject::~VectorStoreFileObject()
{
	//__cleanup();
}

void
VectorStoreFileObject::__init()
{
	//id = std::string();
	//object = std::string();
	//usage_bytes = int(0);
	//created_at = int(0);
	//vector_store_id = std::string();
	//status = std::string();
	//last_error = new VectorStoreFileObject_last_error();
	//chunking_strategy = new VectorStoreFileObject_chunking_strategy();
}

void
VectorStoreFileObject::__cleanup()
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
	//if(usage_bytes != NULL) {
	//
	//delete usage_bytes;
	//usage_bytes = NULL;
	//}
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(vector_store_id != NULL) {
	//
	//delete vector_store_id;
	//vector_store_id = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(last_error != NULL) {
	//
	//delete last_error;
	//last_error = NULL;
	//}
	//if(chunking_strategy != NULL) {
	//
	//delete chunking_strategy;
	//chunking_strategy = NULL;
	//}
	//
}

void
VectorStoreFileObject::fromJson(char* jsonStr)
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
	const gchar *usage_bytesKey = "usage_bytes";
	node = json_object_get_member(pJsonObject, usage_bytesKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&usage_bytes, node, "int", "");
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
	const gchar *vector_store_idKey = "vector_store_id";
	node = json_object_get_member(pJsonObject, vector_store_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&vector_store_id, node, "std::string", "");
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
	const gchar *last_errorKey = "last_error";
	node = json_object_get_member(pJsonObject, last_errorKey);
	if (node !=NULL) {
	

		if (isprimitive("VectorStoreFileObject_last_error")) {
			jsonToValue(&last_error, node, "VectorStoreFileObject_last_error", "VectorStoreFileObject_last_error");
		} else {
			
			VectorStoreFileObject_last_error* obj = static_cast<VectorStoreFileObject_last_error*> (&last_error);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *chunking_strategyKey = "chunking_strategy";
	node = json_object_get_member(pJsonObject, chunking_strategyKey);
	if (node !=NULL) {
	

		if (isprimitive("VectorStoreFileObject_chunking_strategy")) {
			jsonToValue(&chunking_strategy, node, "VectorStoreFileObject_chunking_strategy", "VectorStoreFileObject_chunking_strategy");
		} else {
			
			VectorStoreFileObject_chunking_strategy* obj = static_cast<VectorStoreFileObject_chunking_strategy*> (&chunking_strategy);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

VectorStoreFileObject::VectorStoreFileObject(char* json)
{
	this->fromJson(json);
}

char*
VectorStoreFileObject::toJson()
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
		int obj = getUsageBytes();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *usage_bytesKey = "usage_bytes";
	json_object_set_member(pJsonObject, usage_bytesKey, node);
	if (isprimitive("int")) {
		int obj = getCreatedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVectorStoreId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *vector_store_idKey = "vector_store_id";
	json_object_set_member(pJsonObject, vector_store_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("VectorStoreFileObject_last_error")) {
		VectorStoreFileObject_last_error obj = getLastError();
		node = converttoJson(&obj, "VectorStoreFileObject_last_error", "");
	}
	else {
		
		VectorStoreFileObject_last_error obj = static_cast<VectorStoreFileObject_last_error> (getLastError());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *last_errorKey = "last_error";
	json_object_set_member(pJsonObject, last_errorKey, node);
	if (isprimitive("VectorStoreFileObject_chunking_strategy")) {
		VectorStoreFileObject_chunking_strategy obj = getChunkingStrategy();
		node = converttoJson(&obj, "VectorStoreFileObject_chunking_strategy", "");
	}
	else {
		
		VectorStoreFileObject_chunking_strategy obj = static_cast<VectorStoreFileObject_chunking_strategy> (getChunkingStrategy());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *chunking_strategyKey = "chunking_strategy";
	json_object_set_member(pJsonObject, chunking_strategyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
VectorStoreFileObject::getId()
{
	return id;
}

void
VectorStoreFileObject::setId(std::string  id)
{
	this->id = id;
}

std::string
VectorStoreFileObject::getObject()
{
	return object;
}

void
VectorStoreFileObject::setObject(std::string  object)
{
	this->object = object;
}

int
VectorStoreFileObject::getUsageBytes()
{
	return usage_bytes;
}

void
VectorStoreFileObject::setUsageBytes(int  usage_bytes)
{
	this->usage_bytes = usage_bytes;
}

int
VectorStoreFileObject::getCreatedAt()
{
	return created_at;
}

void
VectorStoreFileObject::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
VectorStoreFileObject::getVectorStoreId()
{
	return vector_store_id;
}

void
VectorStoreFileObject::setVectorStoreId(std::string  vector_store_id)
{
	this->vector_store_id = vector_store_id;
}

std::string
VectorStoreFileObject::getStatus()
{
	return status;
}

void
VectorStoreFileObject::setStatus(std::string  status)
{
	this->status = status;
}

VectorStoreFileObject_last_error
VectorStoreFileObject::getLastError()
{
	return last_error;
}

void
VectorStoreFileObject::setLastError(VectorStoreFileObject_last_error  last_error)
{
	this->last_error = last_error;
}

VectorStoreFileObject_chunking_strategy
VectorStoreFileObject::getChunkingStrategy()
{
	return chunking_strategy;
}

void
VectorStoreFileObject::setChunkingStrategy(VectorStoreFileObject_chunking_strategy  chunking_strategy)
{
	this->chunking_strategy = chunking_strategy;
}


