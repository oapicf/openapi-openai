#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateAssistantRequest_tool_resources.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateAssistantRequest_tool_resources::CreateAssistantRequest_tool_resources()
{
	//__init();
}

CreateAssistantRequest_tool_resources::~CreateAssistantRequest_tool_resources()
{
	//__cleanup();
}

void
CreateAssistantRequest_tool_resources::__init()
{
	//code_interpreter = new CreateAssistantRequest_tool_resources_code_interpreter();
	//file_search = new CreateAssistantRequest_tool_resources_file_search();
}

void
CreateAssistantRequest_tool_resources::__cleanup()
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
CreateAssistantRequest_tool_resources::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *code_interpreterKey = "code_interpreter";
	node = json_object_get_member(pJsonObject, code_interpreterKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateAssistantRequest_tool_resources_code_interpreter")) {
			jsonToValue(&code_interpreter, node, "CreateAssistantRequest_tool_resources_code_interpreter", "CreateAssistantRequest_tool_resources_code_interpreter");
		} else {
			
			CreateAssistantRequest_tool_resources_code_interpreter* obj = static_cast<CreateAssistantRequest_tool_resources_code_interpreter*> (&code_interpreter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *file_searchKey = "file_search";
	node = json_object_get_member(pJsonObject, file_searchKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateAssistantRequest_tool_resources_file_search")) {
			jsonToValue(&file_search, node, "CreateAssistantRequest_tool_resources_file_search", "CreateAssistantRequest_tool_resources_file_search");
		} else {
			
			CreateAssistantRequest_tool_resources_file_search* obj = static_cast<CreateAssistantRequest_tool_resources_file_search*> (&file_search);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CreateAssistantRequest_tool_resources::CreateAssistantRequest_tool_resources(char* json)
{
	this->fromJson(json);
}

char*
CreateAssistantRequest_tool_resources::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CreateAssistantRequest_tool_resources_code_interpreter")) {
		CreateAssistantRequest_tool_resources_code_interpreter obj = getCodeInterpreter();
		node = converttoJson(&obj, "CreateAssistantRequest_tool_resources_code_interpreter", "");
	}
	else {
		
		CreateAssistantRequest_tool_resources_code_interpreter obj = static_cast<CreateAssistantRequest_tool_resources_code_interpreter> (getCodeInterpreter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *code_interpreterKey = "code_interpreter";
	json_object_set_member(pJsonObject, code_interpreterKey, node);
	if (isprimitive("CreateAssistantRequest_tool_resources_file_search")) {
		CreateAssistantRequest_tool_resources_file_search obj = getFileSearch();
		node = converttoJson(&obj, "CreateAssistantRequest_tool_resources_file_search", "");
	}
	else {
		
		CreateAssistantRequest_tool_resources_file_search obj = static_cast<CreateAssistantRequest_tool_resources_file_search> (getFileSearch());
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

CreateAssistantRequest_tool_resources_code_interpreter
CreateAssistantRequest_tool_resources::getCodeInterpreter()
{
	return code_interpreter;
}

void
CreateAssistantRequest_tool_resources::setCodeInterpreter(CreateAssistantRequest_tool_resources_code_interpreter  code_interpreter)
{
	this->code_interpreter = code_interpreter;
}

CreateAssistantRequest_tool_resources_file_search
CreateAssistantRequest_tool_resources::getFileSearch()
{
	return file_search;
}

void
CreateAssistantRequest_tool_resources::setFileSearch(CreateAssistantRequest_tool_resources_file_search  file_search)
{
	this->file_search = file_search;
}


