#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ModifyThreadRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ModifyThreadRequest::ModifyThreadRequest()
{
	//__init();
}

ModifyThreadRequest::~ModifyThreadRequest()
{
	//__cleanup();
}

void
ModifyThreadRequest::__init()
{
	//tool_resources = new ModifyThreadRequest_tool_resources();
	//metadata = null;
}

void
ModifyThreadRequest::__cleanup()
{
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
ModifyThreadRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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

ModifyThreadRequest::ModifyThreadRequest(char* json)
{
	this->fromJson(json);
}

char*
ModifyThreadRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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

ModifyThreadRequest_tool_resources
ModifyThreadRequest::getToolResources()
{
	return tool_resources;
}

void
ModifyThreadRequest::setToolResources(ModifyThreadRequest_tool_resources  tool_resources)
{
	this->tool_resources = tool_resources;
}

std::string
ModifyThreadRequest::getMetadata()
{
	return metadata;
}

void
ModifyThreadRequest::setMetadata(std::string  metadata)
{
	this->metadata = metadata;
}


