#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepDetailsToolCallsFileSearchObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepDetailsToolCallsFileSearchObject::RunStepDetailsToolCallsFileSearchObject()
{
	//__init();
}

RunStepDetailsToolCallsFileSearchObject::~RunStepDetailsToolCallsFileSearchObject()
{
	//__cleanup();
}

void
RunStepDetailsToolCallsFileSearchObject::__init()
{
	//id = std::string();
	//type = std::string();
	//file_search = new RunStepDetailsToolCallsFileSearchObject_file_search();
}

void
RunStepDetailsToolCallsFileSearchObject::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
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
RunStepDetailsToolCallsFileSearchObject::fromJson(char* jsonStr)
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
	

		if (isprimitive("RunStepDetailsToolCallsFileSearchObject_file_search")) {
			jsonToValue(&file_search, node, "RunStepDetailsToolCallsFileSearchObject_file_search", "RunStepDetailsToolCallsFileSearchObject_file_search");
		} else {
			
			RunStepDetailsToolCallsFileSearchObject_file_search* obj = static_cast<RunStepDetailsToolCallsFileSearchObject_file_search*> (&file_search);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RunStepDetailsToolCallsFileSearchObject::RunStepDetailsToolCallsFileSearchObject(char* json)
{
	this->fromJson(json);
}

char*
RunStepDetailsToolCallsFileSearchObject::toJson()
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
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("RunStepDetailsToolCallsFileSearchObject_file_search")) {
		RunStepDetailsToolCallsFileSearchObject_file_search obj = getFileSearch();
		node = converttoJson(&obj, "RunStepDetailsToolCallsFileSearchObject_file_search", "");
	}
	else {
		
		RunStepDetailsToolCallsFileSearchObject_file_search obj = static_cast<RunStepDetailsToolCallsFileSearchObject_file_search> (getFileSearch());
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
RunStepDetailsToolCallsFileSearchObject::getId()
{
	return id;
}

void
RunStepDetailsToolCallsFileSearchObject::setId(std::string  id)
{
	this->id = id;
}

std::string
RunStepDetailsToolCallsFileSearchObject::getType()
{
	return type;
}

void
RunStepDetailsToolCallsFileSearchObject::setType(std::string  type)
{
	this->type = type;
}

RunStepDetailsToolCallsFileSearchObject_file_search
RunStepDetailsToolCallsFileSearchObject::getFileSearch()
{
	return file_search;
}

void
RunStepDetailsToolCallsFileSearchObject::setFileSearch(RunStepDetailsToolCallsFileSearchObject_file_search  file_search)
{
	this->file_search = file_search;
}


