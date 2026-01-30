#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AssistantToolsFileSearch.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AssistantToolsFileSearch::AssistantToolsFileSearch()
{
	//__init();
}

AssistantToolsFileSearch::~AssistantToolsFileSearch()
{
	//__cleanup();
}

void
AssistantToolsFileSearch::__init()
{
	//type = std::string();
	//file_search = new AssistantToolsFileSearch_file_search();
}

void
AssistantToolsFileSearch::__cleanup()
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
	//
}

void
AssistantToolsFileSearch::fromJson(char* jsonStr)
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
}

AssistantToolsFileSearch::AssistantToolsFileSearch(char* json)
{
	this->fromJson(json);
}

char*
AssistantToolsFileSearch::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AssistantToolsFileSearch::getType()
{
	return type;
}

void
AssistantToolsFileSearch::setType(std::string  type)
{
	this->type = type;
}

AssistantToolsFileSearch_file_search
AssistantToolsFileSearch::getFileSearch()
{
	return file_search;
}

void
AssistantToolsFileSearch::setFileSearch(AssistantToolsFileSearch_file_search  file_search)
{
	this->file_search = file_search;
}


