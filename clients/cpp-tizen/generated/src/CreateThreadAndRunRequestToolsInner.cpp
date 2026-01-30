#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateThreadAndRunRequest_tools_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateThreadAndRunRequest_tools_inner::CreateThreadAndRunRequest_tools_inner()
{
	//__init();
}

CreateThreadAndRunRequest_tools_inner::~CreateThreadAndRunRequest_tools_inner()
{
	//__cleanup();
}

void
CreateThreadAndRunRequest_tools_inner::__init()
{
	//type = std::string();
	//file_search = new AssistantToolsFileSearch_file_search();
	//function = new FunctionObject();
}

void
CreateThreadAndRunRequest_tools_inner::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(file_search != NULL) {
	//
	//delete file_search;
	//file_search = NULL;
	//}
	//if(function != NULL) {
	//
	//delete function;
	//function = NULL;
	//}
	//
}

void
CreateThreadAndRunRequest_tools_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *file_searchKey = "file_search";
	node = json_object_get_member(pJsonObject, file_searchKey);
	if (node !=NULL) {
	

		if (isprimitive("AssistantToolsFileSearch_file_search")) {
			jsonToValue(&file_search, node, "AssistantToolsFileSearch_file_search", "AssistantToolsFileSearch_file_search");
		} else {
			
			AssistantToolsFileSearch_file_search* obj = static_cast<AssistantToolsFileSearch_file_search*> (&file_search);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *functionKey = "function";
	node = json_object_get_member(pJsonObject, functionKey);
	if (node !=NULL) {
	

		if (isprimitive("FunctionObject")) {
			jsonToValue(&function, node, "FunctionObject", "FunctionObject");
		} else {
			
			FunctionObject* obj = static_cast<FunctionObject*> (&function);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CreateThreadAndRunRequest_tools_inner::CreateThreadAndRunRequest_tools_inner(char* json)
{
	this->fromJson(json);
}

char*
CreateThreadAndRunRequest_tools_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("AssistantToolsFileSearch_file_search")) {
		AssistantToolsFileSearch_file_search obj = getFileSearch();
		node = converttoJson(&obj, "AssistantToolsFileSearch_file_search", "");
	}
	else {
		
		AssistantToolsFileSearch_file_search obj = static_cast<AssistantToolsFileSearch_file_search> (getFileSearch());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *file_searchKey = "file_search";
	json_object_set_member(pJsonObject, file_searchKey, node);
	if (isprimitive("FunctionObject")) {
		FunctionObject obj = getFunction();
		node = converttoJson(&obj, "FunctionObject", "");
	}
	else {
		
		FunctionObject obj = static_cast<FunctionObject> (getFunction());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *functionKey = "function";
	json_object_set_member(pJsonObject, functionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CreateThreadAndRunRequest_tools_inner::getType()
{
	return type;
}

void
CreateThreadAndRunRequest_tools_inner::setType(std::string  type)
{
	this->type = type;
}

AssistantToolsFileSearch_file_search
CreateThreadAndRunRequest_tools_inner::getFileSearch()
{
	return file_search;
}

void
CreateThreadAndRunRequest_tools_inner::setFileSearch(AssistantToolsFileSearch_file_search  file_search)
{
	this->file_search = file_search;
}

FunctionObject
CreateThreadAndRunRequest_tools_inner::getFunction()
{
	return function;
}

void
CreateThreadAndRunRequest_tools_inner::setFunction(FunctionObject  function)
{
	this->function = function;
}


