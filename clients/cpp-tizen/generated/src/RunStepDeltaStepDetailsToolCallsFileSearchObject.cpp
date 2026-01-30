#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepDeltaStepDetailsToolCallsFileSearchObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepDeltaStepDetailsToolCallsFileSearchObject::RunStepDeltaStepDetailsToolCallsFileSearchObject()
{
	//__init();
}

RunStepDeltaStepDetailsToolCallsFileSearchObject::~RunStepDeltaStepDetailsToolCallsFileSearchObject()
{
	//__cleanup();
}

void
RunStepDeltaStepDetailsToolCallsFileSearchObject::__init()
{
	//index = int(0);
	//id = std::string();
	//type = std::string();
	//file_search = null;
}

void
RunStepDeltaStepDetailsToolCallsFileSearchObject::__cleanup()
{
	//if(index != NULL) {
	//
	//delete index;
	//index = NULL;
	//}
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
RunStepDeltaStepDetailsToolCallsFileSearchObject::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *indexKey = "index";
	node = json_object_get_member(pJsonObject, indexKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&index, node, "int", "");
		} else {
			
		}
	}
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
	

		if (isprimitive("std::string")) {
			jsonToValue(&file_search, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&file_search);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RunStepDeltaStepDetailsToolCallsFileSearchObject::RunStepDeltaStepDetailsToolCallsFileSearchObject(char* json)
{
	this->fromJson(json);
}

char*
RunStepDeltaStepDetailsToolCallsFileSearchObject::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getIndex();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *indexKey = "index";
	json_object_set_member(pJsonObject, indexKey, node);
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
	if (isprimitive("std::string")) {
		std::string obj = getFileSearch();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getFileSearch());
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

int
RunStepDeltaStepDetailsToolCallsFileSearchObject::getIndex()
{
	return index;
}

void
RunStepDeltaStepDetailsToolCallsFileSearchObject::setIndex(int  index)
{
	this->index = index;
}

std::string
RunStepDeltaStepDetailsToolCallsFileSearchObject::getId()
{
	return id;
}

void
RunStepDeltaStepDetailsToolCallsFileSearchObject::setId(std::string  id)
{
	this->id = id;
}

std::string
RunStepDeltaStepDetailsToolCallsFileSearchObject::getType()
{
	return type;
}

void
RunStepDeltaStepDetailsToolCallsFileSearchObject::setType(std::string  type)
{
	this->type = type;
}

std::string
RunStepDeltaStepDetailsToolCallsFileSearchObject::getFileSearch()
{
	return file_search;
}

void
RunStepDeltaStepDetailsToolCallsFileSearchObject::setFileSearch(std::string  file_search)
{
	this->file_search = file_search;
}


