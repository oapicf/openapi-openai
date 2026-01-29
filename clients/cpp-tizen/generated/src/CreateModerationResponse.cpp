#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateModerationResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateModerationResponse::CreateModerationResponse()
{
	//__init();
}

CreateModerationResponse::~CreateModerationResponse()
{
	//__cleanup();
}

void
CreateModerationResponse::__init()
{
	//id = std::string();
	//model = std::string();
	//new std::list()std::list> results;
}

void
CreateModerationResponse::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//if(results != NULL) {
	//results.RemoveAll(true);
	//delete results;
	//results = NULL;
	//}
	//
}

void
CreateModerationResponse::fromJson(char* jsonStr)
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
	const gchar *modelKey = "model";
	node = json_object_get_member(pJsonObject, modelKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&model, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *resultsKey = "results";
	node = json_object_get_member(pJsonObject, resultsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CreateModerationResponse_results_inner> new_list;
			CreateModerationResponse_results_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CreateModerationResponse_results_inner")) {
					jsonToValue(&inst, temp_json, "CreateModerationResponse_results_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			results = new_list;
		}
		
	}
}

CreateModerationResponse::CreateModerationResponse(char* json)
{
	this->fromJson(json);
}

char*
CreateModerationResponse::toJson()
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
		std::string obj = getModel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
	if (isprimitive("CreateModerationResponse_results_inner")) {
		list<CreateModerationResponse_results_inner> new_list = static_cast<list <CreateModerationResponse_results_inner> > (getResults());
		node = converttoJson(&new_list, "CreateModerationResponse_results_inner", "array");
	} else {
		node = json_node_alloc();
		list<CreateModerationResponse_results_inner> new_list = static_cast<list <CreateModerationResponse_results_inner> > (getResults());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CreateModerationResponse_results_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CreateModerationResponse_results_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *resultsKey = "results";
	json_object_set_member(pJsonObject, resultsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CreateModerationResponse::getId()
{
	return id;
}

void
CreateModerationResponse::setId(std::string  id)
{
	this->id = id;
}

std::string
CreateModerationResponse::getModel()
{
	return model;
}

void
CreateModerationResponse::setModel(std::string  model)
{
	this->model = model;
}

std::list<CreateModerationResponse_results_inner>
CreateModerationResponse::getResults()
{
	return results;
}

void
CreateModerationResponse::setResults(std::list <CreateModerationResponse_results_inner> results)
{
	this->results = results;
}


