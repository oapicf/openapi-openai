#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateEditRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateEditRequest::CreateEditRequest()
{
	//__init();
}

CreateEditRequest::~CreateEditRequest()
{
	//__cleanup();
}

void
CreateEditRequest::__init()
{
	//model = new CreateEditRequest_model();
	//input = std::string();
	//instruction = std::string();
	//n = int(0);
	//temperature = double(0);
	//top_p = double(0);
}

void
CreateEditRequest::__cleanup()
{
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//if(input != NULL) {
	//
	//delete input;
	//input = NULL;
	//}
	//if(instruction != NULL) {
	//
	//delete instruction;
	//instruction = NULL;
	//}
	//if(n != NULL) {
	//
	//delete n;
	//n = NULL;
	//}
	//if(temperature != NULL) {
	//
	//delete temperature;
	//temperature = NULL;
	//}
	//if(top_p != NULL) {
	//
	//delete top_p;
	//top_p = NULL;
	//}
	//
}

void
CreateEditRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *modelKey = "model";
	node = json_object_get_member(pJsonObject, modelKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateEditRequest_model")) {
			jsonToValue(&model, node, "CreateEditRequest_model", "CreateEditRequest_model");
		} else {
			
			CreateEditRequest_model* obj = static_cast<CreateEditRequest_model*> (&model);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *inputKey = "input";
	node = json_object_get_member(pJsonObject, inputKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&input, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *instructionKey = "instruction";
	node = json_object_get_member(pJsonObject, instructionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&instruction, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *nKey = "n";
	node = json_object_get_member(pJsonObject, nKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&n, node, "int", "");
		} else {
			
		}
	}
	const gchar *temperatureKey = "temperature";
	node = json_object_get_member(pJsonObject, temperatureKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&temperature, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&temperature);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *top_pKey = "top_p";
	node = json_object_get_member(pJsonObject, top_pKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&top_p, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&top_p);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CreateEditRequest::CreateEditRequest(char* json)
{
	this->fromJson(json);
}

char*
CreateEditRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CreateEditRequest_model")) {
		CreateEditRequest_model obj = getModel();
		node = converttoJson(&obj, "CreateEditRequest_model", "");
	}
	else {
		
		CreateEditRequest_model obj = static_cast<CreateEditRequest_model> (getModel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getInput();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *inputKey = "input";
	json_object_set_member(pJsonObject, inputKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getInstruction();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *instructionKey = "instruction";
	json_object_set_member(pJsonObject, instructionKey, node);
	if (isprimitive("int")) {
		int obj = getN();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *nKey = "n";
	json_object_set_member(pJsonObject, nKey, node);
	if (isprimitive("long long")) {
		long long obj = getTemperature();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getTemperature());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *temperatureKey = "temperature";
	json_object_set_member(pJsonObject, temperatureKey, node);
	if (isprimitive("long long")) {
		long long obj = getTopP();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getTopP());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *top_pKey = "top_p";
	json_object_set_member(pJsonObject, top_pKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CreateEditRequest_model
CreateEditRequest::getModel()
{
	return model;
}

void
CreateEditRequest::setModel(CreateEditRequest_model  model)
{
	this->model = model;
}

std::string
CreateEditRequest::getInput()
{
	return input;
}

void
CreateEditRequest::setInput(std::string  input)
{
	this->input = input;
}

std::string
CreateEditRequest::getInstruction()
{
	return instruction;
}

void
CreateEditRequest::setInstruction(std::string  instruction)
{
	this->instruction = instruction;
}

int
CreateEditRequest::getN()
{
	return n;
}

void
CreateEditRequest::setN(int  n)
{
	this->n = n;
}

long long
CreateEditRequest::getTemperature()
{
	return temperature;
}

void
CreateEditRequest::setTemperature(long long  temperature)
{
	this->temperature = temperature;
}

long long
CreateEditRequest::getTopP()
{
	return top_p;
}

void
CreateEditRequest::setTopP(long long  top_p)
{
	this->top_p = top_p;
}


