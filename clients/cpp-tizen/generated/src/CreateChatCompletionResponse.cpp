#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateChatCompletionResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateChatCompletionResponse::CreateChatCompletionResponse()
{
	//__init();
}

CreateChatCompletionResponse::~CreateChatCompletionResponse()
{
	//__cleanup();
}

void
CreateChatCompletionResponse::__init()
{
	//id = std::string();
	//object = std::string();
	//created = int(0);
	//model = std::string();
	//new std::list()std::list> choices;
	//usage = new CreateCompletionResponse_usage();
}

void
CreateChatCompletionResponse::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//if(created != NULL) {
	//
	//delete created;
	//created = NULL;
	//}
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//if(choices != NULL) {
	//choices.RemoveAll(true);
	//delete choices;
	//choices = NULL;
	//}
	//if(usage != NULL) {
	//
	//delete usage;
	//usage = NULL;
	//}
	//
}

void
CreateChatCompletionResponse::fromJson(char* jsonStr)
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
	const gchar *objectKey = "object";
	node = json_object_get_member(pJsonObject, objectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&object, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *createdKey = "created";
	node = json_object_get_member(pJsonObject, createdKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created, node, "int", "");
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
	const gchar *choicesKey = "choices";
	node = json_object_get_member(pJsonObject, choicesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CreateChatCompletionResponse_choices_inner> new_list;
			CreateChatCompletionResponse_choices_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CreateChatCompletionResponse_choices_inner")) {
					jsonToValue(&inst, temp_json, "CreateChatCompletionResponse_choices_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			choices = new_list;
		}
		
	}
	const gchar *usageKey = "usage";
	node = json_object_get_member(pJsonObject, usageKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateCompletionResponse_usage")) {
			jsonToValue(&usage, node, "CreateCompletionResponse_usage", "CreateCompletionResponse_usage");
		} else {
			
			CreateCompletionResponse_usage* obj = static_cast<CreateCompletionResponse_usage*> (&usage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CreateChatCompletionResponse::CreateChatCompletionResponse(char* json)
{
	this->fromJson(json);
}

char*
CreateChatCompletionResponse::toJson()
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
		std::string obj = getObject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *objectKey = "object";
	json_object_set_member(pJsonObject, objectKey, node);
	if (isprimitive("int")) {
		int obj = getCreated();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *createdKey = "created";
	json_object_set_member(pJsonObject, createdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getModel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
	if (isprimitive("CreateChatCompletionResponse_choices_inner")) {
		list<CreateChatCompletionResponse_choices_inner> new_list = static_cast<list <CreateChatCompletionResponse_choices_inner> > (getChoices());
		node = converttoJson(&new_list, "CreateChatCompletionResponse_choices_inner", "array");
	} else {
		node = json_node_alloc();
		list<CreateChatCompletionResponse_choices_inner> new_list = static_cast<list <CreateChatCompletionResponse_choices_inner> > (getChoices());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CreateChatCompletionResponse_choices_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CreateChatCompletionResponse_choices_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *choicesKey = "choices";
	json_object_set_member(pJsonObject, choicesKey, node);
	if (isprimitive("CreateCompletionResponse_usage")) {
		CreateCompletionResponse_usage obj = getUsage();
		node = converttoJson(&obj, "CreateCompletionResponse_usage", "");
	}
	else {
		
		CreateCompletionResponse_usage obj = static_cast<CreateCompletionResponse_usage> (getUsage());
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
CreateChatCompletionResponse::getId()
{
	return id;
}

void
CreateChatCompletionResponse::setId(std::string  id)
{
	this->id = id;
}

std::string
CreateChatCompletionResponse::getObject()
{
	return object;
}

void
CreateChatCompletionResponse::setObject(std::string  object)
{
	this->object = object;
}

int
CreateChatCompletionResponse::getCreated()
{
	return created;
}

void
CreateChatCompletionResponse::setCreated(int  created)
{
	this->created = created;
}

std::string
CreateChatCompletionResponse::getModel()
{
	return model;
}

void
CreateChatCompletionResponse::setModel(std::string  model)
{
	this->model = model;
}

std::list<CreateChatCompletionResponse_choices_inner>
CreateChatCompletionResponse::getChoices()
{
	return choices;
}

void
CreateChatCompletionResponse::setChoices(std::list <CreateChatCompletionResponse_choices_inner> choices)
{
	this->choices = choices;
}

CreateCompletionResponse_usage
CreateChatCompletionResponse::getUsage()
{
	return usage;
}

void
CreateChatCompletionResponse::setUsage(CreateCompletionResponse_usage  usage)
{
	this->usage = usage;
}

