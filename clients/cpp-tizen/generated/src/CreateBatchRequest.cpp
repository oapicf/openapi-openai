#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateBatch_request.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateBatch_request::CreateBatch_request()
{
	//__init();
}

CreateBatch_request::~CreateBatch_request()
{
	//__cleanup();
}

void
CreateBatch_request::__init()
{
	//input_file_id = std::string();
	//endpoint = std::string();
	//completion_window = std::string();
	//new std::map()std::map> metadata;
}

void
CreateBatch_request::__cleanup()
{
	//if(input_file_id != NULL) {
	//
	//delete input_file_id;
	//input_file_id = NULL;
	//}
	//if(endpoint != NULL) {
	//
	//delete endpoint;
	//endpoint = NULL;
	//}
	//if(completion_window != NULL) {
	//
	//delete completion_window;
	//completion_window = NULL;
	//}
	//if(metadata != NULL) {
	//metadata.RemoveAll(true);
	//delete metadata;
	//metadata = NULL;
	//}
	//
}

void
CreateBatch_request::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *input_file_idKey = "input_file_id";
	node = json_object_get_member(pJsonObject, input_file_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&input_file_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *endpointKey = "endpoint";
	node = json_object_get_member(pJsonObject, endpointKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&endpoint, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *completion_windowKey = "completion_window";
	node = json_object_get_member(pJsonObject, completion_windowKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&completion_window, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *metadataKey = "metadata";
	node = json_object_get_member(pJsonObject, metadataKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			metadata = new_map;
		}
		
	}
}

CreateBatch_request::CreateBatch_request(char* json)
{
	this->fromJson(json);
}

char*
CreateBatch_request::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getInputFileId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *input_file_idKey = "input_file_id";
	json_object_set_member(pJsonObject, input_file_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEndpoint();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *endpointKey = "endpoint";
	json_object_set_member(pJsonObject, endpointKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCompletionWindow();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *completion_windowKey = "completion_window";
	json_object_set_member(pJsonObject, completion_windowKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getMetadata());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
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

std::string
CreateBatch_request::getInputFileId()
{
	return input_file_id;
}

void
CreateBatch_request::setInputFileId(std::string  input_file_id)
{
	this->input_file_id = input_file_id;
}

std::string
CreateBatch_request::getEndpoint()
{
	return endpoint;
}

void
CreateBatch_request::setEndpoint(std::string  endpoint)
{
	this->endpoint = endpoint;
}

std::string
CreateBatch_request::getCompletionWindow()
{
	return completion_window;
}

void
CreateBatch_request::setCompletionWindow(std::string  completion_window)
{
	this->completion_window = completion_window;
}

std::map<string, string>
CreateBatch_request::getMetadata()
{
	return metadata;
}

void
CreateBatch_request::setMetadata(std::map <string, string> metadata)
{
	this->metadata = metadata;
}


