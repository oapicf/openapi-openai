#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UsageVectorStoresResult.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UsageVectorStoresResult::UsageVectorStoresResult()
{
	//__init();
}

UsageVectorStoresResult::~UsageVectorStoresResult()
{
	//__cleanup();
}

void
UsageVectorStoresResult::__init()
{
	//object = std::string();
	//usage_bytes = int(0);
	//project_id = std::string();
}

void
UsageVectorStoresResult::__cleanup()
{
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
	//if(project_id != NULL) {
	//
	//delete project_id;
	//project_id = NULL;
	//}
	//
}

void
UsageVectorStoresResult::fromJson(char* jsonStr)
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
	const gchar *usage_bytesKey = "usage_bytes";
	node = json_object_get_member(pJsonObject, usage_bytesKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&usage_bytes, node, "int", "");
		} else {
			
		}
	}
	const gchar *project_idKey = "project_id";
	node = json_object_get_member(pJsonObject, project_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&project_id, node, "std::string", "");
		} else {
			
		}
	}
}

UsageVectorStoresResult::UsageVectorStoresResult(char* json)
{
	this->fromJson(json);
}

char*
UsageVectorStoresResult::toJson()
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
	if (isprimitive("int")) {
		int obj = getUsageBytes();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *usage_bytesKey = "usage_bytes";
	json_object_set_member(pJsonObject, usage_bytesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getProjectId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *project_idKey = "project_id";
	json_object_set_member(pJsonObject, project_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UsageVectorStoresResult::getObject()
{
	return object;
}

void
UsageVectorStoresResult::setObject(std::string  object)
{
	this->object = object;
}

int
UsageVectorStoresResult::getUsageBytes()
{
	return usage_bytes;
}

void
UsageVectorStoresResult::setUsageBytes(int  usage_bytes)
{
	this->usage_bytes = usage_bytes;
}

std::string
UsageVectorStoresResult::getProjectId()
{
	return project_id;
}

void
UsageVectorStoresResult::setProjectId(std::string  project_id)
{
	this->project_id = project_id;
}


