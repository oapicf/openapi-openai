#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ModifyAssistantRequest_tool_resources.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ModifyAssistantRequest_tool_resources::ModifyAssistantRequest_tool_resources()
{
	//__init();
}

ModifyAssistantRequest_tool_resources::~ModifyAssistantRequest_tool_resources()
{
	//__cleanup();
}

void
ModifyAssistantRequest_tool_resources::__init()
{
	//code_interpreter = new ModifyAssistantRequest_tool_resources_code_interpreter();
	//file_search = new ModifyAssistantRequest_tool_resources_file_search();
}

void
ModifyAssistantRequest_tool_resources::__cleanup()
{
	//if(code_interpreter != NULL) {
	//
	//delete code_interpreter;
	//code_interpreter = NULL;
	//}
	//if(file_search != NULL) {
	//
	//delete file_search;
	//file_search = NULL;
	//}
	//
}

void
ModifyAssistantRequest_tool_resources::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *code_interpreterKey = "code_interpreter";
	node = json_object_get_member(pJsonObject, code_interpreterKey);
	if (node !=NULL) {
	

		if (isprimitive("ModifyAssistantRequest_tool_resources_code_interpreter")) {
			jsonToValue(&code_interpreter, node, "ModifyAssistantRequest_tool_resources_code_interpreter", "ModifyAssistantRequest_tool_resources_code_interpreter");
		} else {
			
			ModifyAssistantRequest_tool_resources_code_interpreter* obj = static_cast<ModifyAssistantRequest_tool_resources_code_interpreter*> (&code_interpreter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *file_searchKey = "file_search";
	node = json_object_get_member(pJsonObject, file_searchKey);
	if (node !=NULL) {
	

		if (isprimitive("ModifyAssistantRequest_tool_resources_file_search")) {
			jsonToValue(&file_search, node, "ModifyAssistantRequest_tool_resources_file_search", "ModifyAssistantRequest_tool_resources_file_search");
		} else {
			
			ModifyAssistantRequest_tool_resources_file_search* obj = static_cast<ModifyAssistantRequest_tool_resources_file_search*> (&file_search);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ModifyAssistantRequest_tool_resources::ModifyAssistantRequest_tool_resources(char* json)
{
	this->fromJson(json);
}

char*
ModifyAssistantRequest_tool_resources::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ModifyAssistantRequest_tool_resources_code_interpreter")) {
		ModifyAssistantRequest_tool_resources_code_interpreter obj = getCodeInterpreter();
		node = converttoJson(&obj, "ModifyAssistantRequest_tool_resources_code_interpreter", "");
	}
	else {
		
		ModifyAssistantRequest_tool_resources_code_interpreter obj = static_cast<ModifyAssistantRequest_tool_resources_code_interpreter> (getCodeInterpreter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *code_interpreterKey = "code_interpreter";
	json_object_set_member(pJsonObject, code_interpreterKey, node);
	if (isprimitive("ModifyAssistantRequest_tool_resources_file_search")) {
		ModifyAssistantRequest_tool_resources_file_search obj = getFileSearch();
		node = converttoJson(&obj, "ModifyAssistantRequest_tool_resources_file_search", "");
	}
	else {
		
		ModifyAssistantRequest_tool_resources_file_search obj = static_cast<ModifyAssistantRequest_tool_resources_file_search> (getFileSearch());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *file_searchKey = "file_search";
	json_object_set_member(pJsonObject, file_searchKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ModifyAssistantRequest_tool_resources_code_interpreter
ModifyAssistantRequest_tool_resources::getCodeInterpreter()
{
	return code_interpreter;
}

void
ModifyAssistantRequest_tool_resources::setCodeInterpreter(ModifyAssistantRequest_tool_resources_code_interpreter  code_interpreter)
{
	this->code_interpreter = code_interpreter;
}

ModifyAssistantRequest_tool_resources_file_search
ModifyAssistantRequest_tool_resources::getFileSearch()
{
	return file_search;
}

void
ModifyAssistantRequest_tool_resources::setFileSearch(ModifyAssistantRequest_tool_resources_file_search  file_search)
{
	this->file_search = file_search;
}


