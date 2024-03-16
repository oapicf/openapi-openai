#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateEmbeddingResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateEmbeddingResponse::CreateEmbeddingResponse()
{
	//__init();
}

CreateEmbeddingResponse::~CreateEmbeddingResponse()
{
	//__cleanup();
}

void
CreateEmbeddingResponse::__init()
{
	//object = std::string();
	//model = std::string();
	//new std::list()std::list> data;
	//usage = new CreateEmbeddingResponse_usage();
}

void
CreateEmbeddingResponse::__cleanup()
{
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//if(data != NULL) {
	//data.RemoveAll(true);
	//delete data;
	//data = NULL;
	//}
	//if(usage != NULL) {
	//
	//delete usage;
	//usage = NULL;
	//}
	//
}

void
CreateEmbeddingResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *objectKey = "object";
	node = json_object_get_member(pJsonObject, objectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&object, node, "std::string", "");
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
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CreateEmbeddingResponse_data_inner> new_list;
			CreateEmbeddingResponse_data_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CreateEmbeddingResponse_data_inner")) {
					jsonToValue(&inst, temp_json, "CreateEmbeddingResponse_data_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			data = new_list;
		}
		
	}
	const gchar *usageKey = "usage";
	node = json_object_get_member(pJsonObject, usageKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateEmbeddingResponse_usage")) {
			jsonToValue(&usage, node, "CreateEmbeddingResponse_usage", "CreateEmbeddingResponse_usage");
		} else {
			
			CreateEmbeddingResponse_usage* obj = static_cast<CreateEmbeddingResponse_usage*> (&usage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CreateEmbeddingResponse::CreateEmbeddingResponse(char* json)
{
	this->fromJson(json);
}

char*
CreateEmbeddingResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getObject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *objectKey = "object";
	json_object_set_member(pJsonObject, objectKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getModel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
	if (isprimitive("CreateEmbeddingResponse_data_inner")) {
		list<CreateEmbeddingResponse_data_inner> new_list = static_cast<list <CreateEmbeddingResponse_data_inner> > (getData());
		node = converttoJson(&new_list, "CreateEmbeddingResponse_data_inner", "array");
	} else {
		node = json_node_alloc();
		list<CreateEmbeddingResponse_data_inner> new_list = static_cast<list <CreateEmbeddingResponse_data_inner> > (getData());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CreateEmbeddingResponse_data_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CreateEmbeddingResponse_data_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	if (isprimitive("CreateEmbeddingResponse_usage")) {
		CreateEmbeddingResponse_usage obj = getUsage();
		node = converttoJson(&obj, "CreateEmbeddingResponse_usage", "");
	}
	else {
		
		CreateEmbeddingResponse_usage obj = static_cast<CreateEmbeddingResponse_usage> (getUsage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *usageKey = "usage";
	json_object_set_member(pJsonObject, usageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CreateEmbeddingResponse::getObject()
{
	return object;
}

void
CreateEmbeddingResponse::setObject(std::string  object)
{
	this->object = object;
}

std::string
CreateEmbeddingResponse::getModel()
{
	return model;
}

void
CreateEmbeddingResponse::setModel(std::string  model)
{
	this->model = model;
}

std::list<CreateEmbeddingResponse_data_inner>
CreateEmbeddingResponse::getData()
{
	return data;
}

void
CreateEmbeddingResponse::setData(std::list <CreateEmbeddingResponse_data_inner> data)
{
	this->data = data;
}

CreateEmbeddingResponse_usage
CreateEmbeddingResponse::getUsage()
{
	return usage;
}

void
CreateEmbeddingResponse::setUsage(CreateEmbeddingResponse_usage  usage)
{
	this->usage = usage;
}


