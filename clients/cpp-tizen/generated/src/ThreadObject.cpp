#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ThreadObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ThreadObject::ThreadObject()
{
	//__init();
}

ThreadObject::~ThreadObject()
{
	//__cleanup();
}

void
ThreadObject::__init()
{
	//id = std::string();
	//object = std::string();
	//created_at = int(0);
	//tool_resources = new ModifyThreadRequest_tool_resources();
	//metadata = null;
}

void
ThreadObject::__cleanup()
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
	//if(tool_resources != NULL) {
	//
	//delete tool_resources;
	//tool_resources = NULL;
	//}
	//if(metadata != NULL) {
	//
	//delete metadata;
	//metadata = NULL;
	//}
	//
}

void
ThreadObject::fromJson(char* jsonStr)
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
	const gchar *tool_resourcesKey = "tool_resources";
	node = json_object_get_member(pJsonObject, tool_resourcesKey);
	if (node !=NULL) {
	

		if (isprimitive("ModifyThreadRequest_tool_resources")) {
			jsonToValue(&tool_resources, node, "ModifyThreadRequest_tool_resources", "ModifyThreadRequest_tool_resources");
		} else {
			
			ModifyThreadRequest_tool_resources* obj = static_cast<ModifyThreadRequest_tool_resources*> (&tool_resources);
			obj->fromJson(json_to_string(node, false));
			
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

ThreadObject::ThreadObject(char* json)
{
	this->fromJson(json);
}

char*
ThreadObject::toJson()
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
	if (isprimitive("ModifyThreadRequest_tool_resources")) {
		ModifyThreadRequest_tool_resources obj = getToolResources();
		node = converttoJson(&obj, "ModifyThreadRequest_tool_resources", "");
	}
	else {
		
		ModifyThreadRequest_tool_resources obj = static_cast<ModifyThreadRequest_tool_resources> (getToolResources());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tool_resourcesKey = "tool_resources";
	json_object_set_member(pJsonObject, tool_resourcesKey, node);
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
ThreadObject::getId()
{
	return id;
}

void
ThreadObject::setId(std::string  id)
{
	this->id = id;
}

std::string
ThreadObject::getObject()
{
	return object;
}

void
ThreadObject::setObject(std::string  object)
{
	this->object = object;
}

int
ThreadObject::getCreatedAt()
{
	return created_at;
}

void
ThreadObject::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

ModifyThreadRequest_tool_resources
ThreadObject::getToolResources()
{
	return tool_resources;
}

void
ThreadObject::setToolResources(ModifyThreadRequest_tool_resources  tool_resources)
{
	this->tool_resources = tool_resources;
}

std::string
ThreadObject::getMetadata()
{
	return metadata;
}

void
ThreadObject::setMetadata(std::string  metadata)
{
	this->metadata = metadata;
}


