#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ModifyAssistantRequest_tool_resources_code_interpreter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ModifyAssistantRequest_tool_resources_code_interpreter::ModifyAssistantRequest_tool_resources_code_interpreter()
{
	//__init();
}

ModifyAssistantRequest_tool_resources_code_interpreter::~ModifyAssistantRequest_tool_resources_code_interpreter()
{
	//__cleanup();
}

void
ModifyAssistantRequest_tool_resources_code_interpreter::__init()
{
	//new std::list()std::list> file_ids;
}

void
ModifyAssistantRequest_tool_resources_code_interpreter::__cleanup()
{
	//if(file_ids != NULL) {
	//file_ids.RemoveAll(true);
	//delete file_ids;
	//file_ids = NULL;
	//}
	//
}

void
ModifyAssistantRequest_tool_resources_code_interpreter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *file_idsKey = "file_ids";
	node = json_object_get_member(pJsonObject, file_idsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			file_ids = new_list;
		}
		
	}
}

ModifyAssistantRequest_tool_resources_code_interpreter::ModifyAssistantRequest_tool_resources_code_interpreter(char* json)
{
	this->fromJson(json);
}

char*
ModifyAssistantRequest_tool_resources_code_interpreter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getFileIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getFileIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *file_idsKey = "file_ids";
	json_object_set_member(pJsonObject, file_idsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
ModifyAssistantRequest_tool_resources_code_interpreter::getFileIds()
{
	return file_ids;
}

void
ModifyAssistantRequest_tool_resources_code_interpreter::setFileIds(std::list <std::string> file_ids)
{
	this->file_ids = file_ids;
}


