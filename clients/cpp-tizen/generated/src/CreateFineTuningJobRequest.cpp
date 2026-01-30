#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateFineTuningJobRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateFineTuningJobRequest::CreateFineTuningJobRequest()
{
	//__init();
}

CreateFineTuningJobRequest::~CreateFineTuningJobRequest()
{
	//__cleanup();
}

void
CreateFineTuningJobRequest::__init()
{
	//model = new CreateFineTuningJobRequest_model();
	//training_file = std::string();
	//hyperparameters = new CreateFineTuningJobRequest_hyperparameters();
	//suffix = std::string();
	//validation_file = std::string();
	//new std::list()std::list> integrations;
	//seed = int(0);
	//method = new FineTuneMethod();
}

void
CreateFineTuningJobRequest::__cleanup()
{
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//if(training_file != NULL) {
	//
	//delete training_file;
	//training_file = NULL;
	//}
	//if(hyperparameters != NULL) {
	//
	//delete hyperparameters;
	//hyperparameters = NULL;
	//}
	//if(suffix != NULL) {
	//
	//delete suffix;
	//suffix = NULL;
	//}
	//if(validation_file != NULL) {
	//
	//delete validation_file;
	//validation_file = NULL;
	//}
	//if(integrations != NULL) {
	//integrations.RemoveAll(true);
	//delete integrations;
	//integrations = NULL;
	//}
	//if(seed != NULL) {
	//
	//delete seed;
	//seed = NULL;
	//}
	//if(method != NULL) {
	//
	//delete method;
	//method = NULL;
	//}
	//
}

void
CreateFineTuningJobRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *modelKey = "model";
	node = json_object_get_member(pJsonObject, modelKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateFineTuningJobRequest_model")) {
			jsonToValue(&model, node, "CreateFineTuningJobRequest_model", "CreateFineTuningJobRequest_model");
		} else {
			
			CreateFineTuningJobRequest_model* obj = static_cast<CreateFineTuningJobRequest_model*> (&model);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *training_fileKey = "training_file";
	node = json_object_get_member(pJsonObject, training_fileKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&training_file, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *hyperparametersKey = "hyperparameters";
	node = json_object_get_member(pJsonObject, hyperparametersKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateFineTuningJobRequest_hyperparameters")) {
			jsonToValue(&hyperparameters, node, "CreateFineTuningJobRequest_hyperparameters", "CreateFineTuningJobRequest_hyperparameters");
		} else {
			
			CreateFineTuningJobRequest_hyperparameters* obj = static_cast<CreateFineTuningJobRequest_hyperparameters*> (&hyperparameters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *suffixKey = "suffix";
	node = json_object_get_member(pJsonObject, suffixKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&suffix, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *validation_fileKey = "validation_file";
	node = json_object_get_member(pJsonObject, validation_fileKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&validation_file, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *integrationsKey = "integrations";
	node = json_object_get_member(pJsonObject, integrationsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CreateFineTuningJobRequest_integrations_inner> new_list;
			CreateFineTuningJobRequest_integrations_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CreateFineTuningJobRequest_integrations_inner")) {
					jsonToValue(&inst, temp_json, "CreateFineTuningJobRequest_integrations_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			integrations = new_list;
		}
		
	}
	const gchar *seedKey = "seed";
	node = json_object_get_member(pJsonObject, seedKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&seed, node, "int", "");
		} else {
			
		}
	}
	const gchar *methodKey = "method";
	node = json_object_get_member(pJsonObject, methodKey);
	if (node !=NULL) {
	

		if (isprimitive("FineTuneMethod")) {
			jsonToValue(&method, node, "FineTuneMethod", "FineTuneMethod");
		} else {
			
			FineTuneMethod* obj = static_cast<FineTuneMethod*> (&method);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CreateFineTuningJobRequest::CreateFineTuningJobRequest(char* json)
{
	this->fromJson(json);
}

char*
CreateFineTuningJobRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CreateFineTuningJobRequest_model")) {
		CreateFineTuningJobRequest_model obj = getModel();
		node = converttoJson(&obj, "CreateFineTuningJobRequest_model", "");
	}
	else {
		
		CreateFineTuningJobRequest_model obj = static_cast<CreateFineTuningJobRequest_model> (getModel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTrainingFile();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *training_fileKey = "training_file";
	json_object_set_member(pJsonObject, training_fileKey, node);
	if (isprimitive("CreateFineTuningJobRequest_hyperparameters")) {
		CreateFineTuningJobRequest_hyperparameters obj = getHyperparameters();
		node = converttoJson(&obj, "CreateFineTuningJobRequest_hyperparameters", "");
	}
	else {
		
		CreateFineTuningJobRequest_hyperparameters obj = static_cast<CreateFineTuningJobRequest_hyperparameters> (getHyperparameters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hyperparametersKey = "hyperparameters";
	json_object_set_member(pJsonObject, hyperparametersKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSuffix();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *suffixKey = "suffix";
	json_object_set_member(pJsonObject, suffixKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getValidationFile();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *validation_fileKey = "validation_file";
	json_object_set_member(pJsonObject, validation_fileKey, node);
	if (isprimitive("CreateFineTuningJobRequest_integrations_inner")) {
		list<CreateFineTuningJobRequest_integrations_inner> new_list = static_cast<list <CreateFineTuningJobRequest_integrations_inner> > (getIntegrations());
		node = converttoJson(&new_list, "CreateFineTuningJobRequest_integrations_inner", "array");
	} else {
		node = json_node_alloc();
		list<CreateFineTuningJobRequest_integrations_inner> new_list = static_cast<list <CreateFineTuningJobRequest_integrations_inner> > (getIntegrations());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CreateFineTuningJobRequest_integrations_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CreateFineTuningJobRequest_integrations_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *integrationsKey = "integrations";
	json_object_set_member(pJsonObject, integrationsKey, node);
	if (isprimitive("int")) {
		int obj = getSeed();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *seedKey = "seed";
	json_object_set_member(pJsonObject, seedKey, node);
	if (isprimitive("FineTuneMethod")) {
		FineTuneMethod obj = getMethod();
		node = converttoJson(&obj, "FineTuneMethod", "");
	}
	else {
		
		FineTuneMethod obj = static_cast<FineTuneMethod> (getMethod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *methodKey = "method";
	json_object_set_member(pJsonObject, methodKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CreateFineTuningJobRequest_model
CreateFineTuningJobRequest::getModel()
{
	return model;
}

void
CreateFineTuningJobRequest::setModel(CreateFineTuningJobRequest_model  model)
{
	this->model = model;
}

std::string
CreateFineTuningJobRequest::getTrainingFile()
{
	return training_file;
}

void
CreateFineTuningJobRequest::setTrainingFile(std::string  training_file)
{
	this->training_file = training_file;
}

CreateFineTuningJobRequest_hyperparameters
CreateFineTuningJobRequest::getHyperparameters()
{
	return hyperparameters;
}

void
CreateFineTuningJobRequest::setHyperparameters(CreateFineTuningJobRequest_hyperparameters  hyperparameters)
{
	this->hyperparameters = hyperparameters;
}

std::string
CreateFineTuningJobRequest::getSuffix()
{
	return suffix;
}

void
CreateFineTuningJobRequest::setSuffix(std::string  suffix)
{
	this->suffix = suffix;
}

std::string
CreateFineTuningJobRequest::getValidationFile()
{
	return validation_file;
}

void
CreateFineTuningJobRequest::setValidationFile(std::string  validation_file)
{
	this->validation_file = validation_file;
}

std::list<CreateFineTuningJobRequest_integrations_inner>
CreateFineTuningJobRequest::getIntegrations()
{
	return integrations;
}

void
CreateFineTuningJobRequest::setIntegrations(std::list <CreateFineTuningJobRequest_integrations_inner> integrations)
{
	this->integrations = integrations;
}

int
CreateFineTuningJobRequest::getSeed()
{
	return seed;
}

void
CreateFineTuningJobRequest::setSeed(int  seed)
{
	this->seed = seed;
}

FineTuneMethod
CreateFineTuningJobRequest::getMethod()
{
	return method;
}

void
CreateFineTuningJobRequest::setMethod(FineTuneMethod  method)
{
	this->method = method;
}


