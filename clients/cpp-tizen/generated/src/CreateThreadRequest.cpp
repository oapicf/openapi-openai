#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateThreadRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateThreadRequest::CreateThreadRequest()
{
	//__init();
}

CreateThreadRequest::~CreateThreadRequest()
{
	//__cleanup();
}

void
CreateThreadRequest::__init()
{
	//new std::list()std::list> messages;
	//tool_resources = new CreateThreadRequest_tool_resources();
	//metadata = null;
}

void
CreateThreadRequest::__cleanup()
{
	//if(messages != NULL) {
	//messages.RemoveAll(true);
	//delete messages;
	//messages = NULL;
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
CreateThreadRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *messagesKey = "messages";
	node = json_object_get_member(pJsonObject, messagesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CreateMessageRequest> new_list;
			CreateMessageRequest inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CreateMessageRequest")) {
					jsonToValue(&inst, temp_json, "CreateMessageRequest", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			messages = new_list;
		}
		
	}
	const gchar *tool_resourcesKey = "tool_resources";
	node = json_object_get_member(pJsonObject, tool_resourcesKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateThreadRequest_tool_resources")) {
			jsonToValue(&tool_resources, node, "CreateThreadRequest_tool_resources", "CreateThreadRequest_tool_resources");
		} else {
			
			CreateThreadRequest_tool_resources* obj = static_cast<CreateThreadRequest_tool_resources*> (&tool_resources);
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

CreateThreadRequest::CreateThreadRequest(char* json)
{
	this->fromJson(json);
}

char*
CreateThreadRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CreateMessageRequest")) {
		list<CreateMessageRequest> new_list = static_cast<list <CreateMessageRequest> > (getMessages());
		node = converttoJson(&new_list, "CreateMessageRequest", "array");
	} else {
		node = json_node_alloc();
		list<CreateMessageRequest> new_list = static_cast<list <CreateMessageRequest> > (getMessages());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CreateMessageRequest>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CreateMessageRequest obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *messagesKey = "messages";
	json_object_set_member(pJsonObject, messagesKey, node);
	if (isprimitive("CreateThreadRequest_tool_resources")) {
		CreateThreadRequest_tool_resources obj = getToolResources();
		node = converttoJson(&obj, "CreateThreadRequest_tool_resources", "");
	}
	else {
		
		CreateThreadRequest_tool_resources obj = static_cast<CreateThreadRequest_tool_resources> (getToolResources());
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

std::list<CreateMessageRequest>
CreateThreadRequest::getMessages()
{
	return messages;
}

void
CreateThreadRequest::setMessages(std::list <CreateMessageRequest> messages)
{
	this->messages = messages;
}

CreateThreadRequest_tool_resources
CreateThreadRequest::getToolResources()
{
	return tool_resources;
}

void
CreateThreadRequest::setToolResources(CreateThreadRequest_tool_resources  tool_resources)
{
	this->tool_resources = tool_resources;
}

std::string
CreateThreadRequest::getMetadata()
{
	return metadata;
}

void
CreateThreadRequest::setMetadata(std::string  metadata)
{
	this->metadata = metadata;
}


