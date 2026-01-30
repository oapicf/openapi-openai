#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepDetailsToolCallsFileSearchResultObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepDetailsToolCallsFileSearchResultObject::RunStepDetailsToolCallsFileSearchResultObject()
{
	//__init();
}

RunStepDetailsToolCallsFileSearchResultObject::~RunStepDetailsToolCallsFileSearchResultObject()
{
	//__cleanup();
}

void
RunStepDetailsToolCallsFileSearchResultObject::__init()
{
	//file_id = std::string();
	//file_name = std::string();
	//score = double(0);
	//new std::list()std::list> content;
}

void
RunStepDetailsToolCallsFileSearchResultObject::__cleanup()
{
	//if(file_id != NULL) {
	//
	//delete file_id;
	//file_id = NULL;
	//}
	//if(file_name != NULL) {
	//
	//delete file_name;
	//file_name = NULL;
	//}
	//if(score != NULL) {
	//
	//delete score;
	//score = NULL;
	//}
	//if(content != NULL) {
	//content.RemoveAll(true);
	//delete content;
	//content = NULL;
	//}
	//
}

void
RunStepDetailsToolCallsFileSearchResultObject::fromJson(char* jsonStr)
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
	const gchar *file_nameKey = "file_name";
	node = json_object_get_member(pJsonObject, file_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&file_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *scoreKey = "score";
	node = json_object_get_member(pJsonObject, scoreKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&score, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&score);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *contentKey = "content";
	node = json_object_get_member(pJsonObject, contentKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<RunStepDetailsToolCallsFileSearchResultObject_content_inner> new_list;
			RunStepDetailsToolCallsFileSearchResultObject_content_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("RunStepDetailsToolCallsFileSearchResultObject_content_inner")) {
					jsonToValue(&inst, temp_json, "RunStepDetailsToolCallsFileSearchResultObject_content_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			content = new_list;
		}
		
	}
}

RunStepDetailsToolCallsFileSearchResultObject::RunStepDetailsToolCallsFileSearchResultObject(char* json)
{
	this->fromJson(json);
}

char*
RunStepDetailsToolCallsFileSearchResultObject::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getFileName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *file_nameKey = "file_name";
	json_object_set_member(pJsonObject, file_nameKey, node);
	if (isprimitive("long long")) {
		long long obj = getScore();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getScore());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scoreKey = "score";
	json_object_set_member(pJsonObject, scoreKey, node);
	if (isprimitive("RunStepDetailsToolCallsFileSearchResultObject_content_inner")) {
		list<RunStepDetailsToolCallsFileSearchResultObject_content_inner> new_list = static_cast<list <RunStepDetailsToolCallsFileSearchResultObject_content_inner> > (getContent());
		node = converttoJson(&new_list, "RunStepDetailsToolCallsFileSearchResultObject_content_inner", "array");
	} else {
		node = json_node_alloc();
		list<RunStepDetailsToolCallsFileSearchResultObject_content_inner> new_list = static_cast<list <RunStepDetailsToolCallsFileSearchResultObject_content_inner> > (getContent());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<RunStepDetailsToolCallsFileSearchResultObject_content_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			RunStepDetailsToolCallsFileSearchResultObject_content_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *contentKey = "content";
	json_object_set_member(pJsonObject, contentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RunStepDetailsToolCallsFileSearchResultObject::getFileId()
{
	return file_id;
}

void
RunStepDetailsToolCallsFileSearchResultObject::setFileId(std::string  file_id)
{
	this->file_id = file_id;
}

std::string
RunStepDetailsToolCallsFileSearchResultObject::getFileName()
{
	return file_name;
}

void
RunStepDetailsToolCallsFileSearchResultObject::setFileName(std::string  file_name)
{
	this->file_name = file_name;
}

long long
RunStepDetailsToolCallsFileSearchResultObject::getScore()
{
	return score;
}

void
RunStepDetailsToolCallsFileSearchResultObject::setScore(long long  score)
{
	this->score = score;
}

std::list<RunStepDetailsToolCallsFileSearchResultObject_content_inner>
RunStepDetailsToolCallsFileSearchResultObject::getContent()
{
	return content;
}

void
RunStepDetailsToolCallsFileSearchResultObject::setContent(std::list <RunStepDetailsToolCallsFileSearchResultObject_content_inner> content)
{
	this->content = content;
}


