#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VectorStoreFileBatchObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VectorStoreFileBatchObject::VectorStoreFileBatchObject()
{
	//__init();
}

VectorStoreFileBatchObject::~VectorStoreFileBatchObject()
{
	//__cleanup();
}

void
VectorStoreFileBatchObject::__init()
{
	//id = std::string();
	//object = std::string();
	//created_at = int(0);
	//vector_store_id = std::string();
	//status = std::string();
	//file_counts = new VectorStoreFileBatchObject_file_counts();
}

void
VectorStoreFileBatchObject::__cleanup()
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
	//if(file_counts != NULL) {
	//
	//delete file_counts;
	//file_counts = NULL;
	//}
	//
}

void
VectorStoreFileBatchObject::fromJson(char* jsonStr)
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
	const gchar *file_countsKey = "file_counts";
	node = json_object_get_member(pJsonObject, file_countsKey);
	if (node !=NULL) {
	

		if (isprimitive("VectorStoreFileBatchObject_file_counts")) {
			jsonToValue(&file_counts, node, "VectorStoreFileBatchObject_file_counts", "VectorStoreFileBatchObject_file_counts");
		} else {
			
			VectorStoreFileBatchObject_file_counts* obj = static_cast<VectorStoreFileBatchObject_file_counts*> (&file_counts);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

VectorStoreFileBatchObject::VectorStoreFileBatchObject(char* json)
{
	this->fromJson(json);
}

char*
VectorStoreFileBatchObject::toJson()
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
	if (isprimitive("VectorStoreFileBatchObject_file_counts")) {
		VectorStoreFileBatchObject_file_counts obj = getFileCounts();
		node = converttoJson(&obj, "VectorStoreFileBatchObject_file_counts", "");
	}
	else {
		
		VectorStoreFileBatchObject_file_counts obj = static_cast<VectorStoreFileBatchObject_file_counts> (getFileCounts());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *file_countsKey = "file_counts";
	json_object_set_member(pJsonObject, file_countsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
VectorStoreFileBatchObject::getId()
{
	return id;
}

void
VectorStoreFileBatchObject::setId(std::string  id)
{
	this->id = id;
}

std::string
VectorStoreFileBatchObject::getObject()
{
	return object;
}

void
VectorStoreFileBatchObject::setObject(std::string  object)
{
	this->object = object;
}

int
VectorStoreFileBatchObject::getCreatedAt()
{
	return created_at;
}

void
VectorStoreFileBatchObject::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
VectorStoreFileBatchObject::getVectorStoreId()
{
	return vector_store_id;
}

void
VectorStoreFileBatchObject::setVectorStoreId(std::string  vector_store_id)
{
	this->vector_store_id = vector_store_id;
}

std::string
VectorStoreFileBatchObject::getStatus()
{
	return status;
}

void
VectorStoreFileBatchObject::setStatus(std::string  status)
{
	this->status = status;
}

VectorStoreFileBatchObject_file_counts
VectorStoreFileBatchObject::getFileCounts()
{
	return file_counts;
}

void
VectorStoreFileBatchObject::setFileCounts(VectorStoreFileBatchObject_file_counts  file_counts)
{
	this->file_counts = file_counts;
}


