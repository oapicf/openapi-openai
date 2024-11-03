#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateModerationRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateModerationRequest::CreateModerationRequest()
{
	//__init();
}

CreateModerationRequest::~CreateModerationRequest()
{
	//__cleanup();
}

void
CreateModerationRequest::__init()
{
	//input = new CreateModerationRequest_input();
	//model = new CreateModerationRequest_model();
}

void
CreateModerationRequest::__cleanup()
{
	//if(input != NULL) {
	//
	//delete input;
	//input = NULL;
	//}
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//
}

void
CreateModerationRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *inputKey = "input";
	node = json_object_get_member(pJsonObject, inputKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateModerationRequest_input")) {
			jsonToValue(&input, node, "CreateModerationRequest_input", "CreateModerationRequest_input");
		} else {
			
			CreateModerationRequest_input* obj = static_cast<CreateModerationRequest_input*> (&input);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *modelKey = "model";
	node = json_object_get_member(pJsonObject, modelKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateModerationRequest_model")) {
			jsonToValue(&model, node, "CreateModerationRequest_model", "CreateModerationRequest_model");
		} else {
			
			CreateModerationRequest_model* obj = static_cast<CreateModerationRequest_model*> (&model);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CreateModerationRequest::CreateModerationRequest(char* json)
{
	this->fromJson(json);
}

char*
CreateModerationRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CreateModerationRequest_input")) {
		CreateModerationRequest_input obj = getInput();
		node = converttoJson(&obj, "CreateModerationRequest_input", "");
	}
	else {
		
		CreateModerationRequest_input obj = static_cast<CreateModerationRequest_input> (getInput());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *inputKey = "input";
	json_object_set_member(pJsonObject, inputKey, node);
	if (isprimitive("CreateModerationRequest_model")) {
		CreateModerationRequest_model obj = getModel();
		node = converttoJson(&obj, "CreateModerationRequest_model", "");
	}
	else {
		
		CreateModerationRequest_model obj = static_cast<CreateModerationRequest_model> (getModel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CreateModerationRequest_input
CreateModerationRequest::getInput()
{
	return input;
}

void
CreateModerationRequest::setInput(CreateModerationRequest_input  input)
{
	this->input = input;
}

CreateModerationRequest_model
CreateModerationRequest::getModel()
{
	return model;
}

void
CreateModerationRequest::setModel(CreateModerationRequest_model  model)
{
	this->model = model;
}


