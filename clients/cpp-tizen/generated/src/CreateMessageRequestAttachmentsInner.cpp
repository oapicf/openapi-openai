#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateMessageRequest_attachments_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateMessageRequest_attachments_inner::CreateMessageRequest_attachments_inner()
{
	//__init();
}

CreateMessageRequest_attachments_inner::~CreateMessageRequest_attachments_inner()
{
	//__cleanup();
}

void
CreateMessageRequest_attachments_inner::__init()
{
	//file_id = std::string();
	//new std::list()std::list> tools;
}

void
CreateMessageRequest_attachments_inner::__cleanup()
{
	//if(file_id != NULL) {
	//
	//delete file_id;
	//file_id = NULL;
	//}
	//if(tools != NULL) {
	//tools.RemoveAll(true);
	//delete tools;
	//tools = NULL;
	//}
	//
}

void
CreateMessageRequest_attachments_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *file_idKey = "file_id";
	node = json_object_get_member(pJsonObject, file_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&file_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *toolsKey = "tools";
	node = json_object_get_member(pJsonObject, toolsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CreateMessageRequest_attachments_inner_tools_inner> new_list;
			CreateMessageRequest_attachments_inner_tools_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CreateMessageRequest_attachments_inner_tools_inner")) {
					jsonToValue(&inst, temp_json, "CreateMessageRequest_attachments_inner_tools_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			tools = new_list;
		}
		
	}
}

CreateMessageRequest_attachments_inner::CreateMessageRequest_attachments_inner(char* json)
{
	this->fromJson(json);
}

char*
CreateMessageRequest_attachments_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getFileId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *file_idKey = "file_id";
	json_object_set_member(pJsonObject, file_idKey, node);
	if (isprimitive("CreateMessageRequest_attachments_inner_tools_inner")) {
		list<CreateMessageRequest_attachments_inner_tools_inner> new_list = static_cast<list <CreateMessageRequest_attachments_inner_tools_inner> > (getTools());
		node = converttoJson(&new_list, "CreateMessageRequest_attachments_inner_tools_inner", "array");
	} else {
		node = json_node_alloc();
		list<CreateMessageRequest_attachments_inner_tools_inner> new_list = static_cast<list <CreateMessageRequest_attachments_inner_tools_inner> > (getTools());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CreateMessageRequest_attachments_inner_tools_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CreateMessageRequest_attachments_inner_tools_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *toolsKey = "tools";
	json_object_set_member(pJsonObject, toolsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CreateMessageRequest_attachments_inner::getFileId()
{
	return file_id;
}

void
CreateMessageRequest_attachments_inner::setFileId(std::string  file_id)
{
	this->file_id = file_id;
}

std::list<CreateMessageRequest_attachments_inner_tools_inner>
CreateMessageRequest_attachments_inner::getTools()
{
	return tools;
}

void
CreateMessageRequest_attachments_inner::setTools(std::list <CreateMessageRequest_attachments_inner_tools_inner> tools)
{
	this->tools = tools;
}


