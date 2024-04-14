#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FineTuningJob.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FineTuningJob::FineTuningJob()
{
	//__init();
}

FineTuningJob::~FineTuningJob()
{
	//__cleanup();
}

void
FineTuningJob::__init()
{
	//id = std::string();
	//created_at = int(0);
	//error = new FineTuningJob_error();
	//fine_tuned_model = std::string();
	//finished_at = int(0);
	//hyperparameters = new FineTuningJob_hyperparameters();
	//model = std::string();
	//object = std::string();
	//organization_id = std::string();
	//new std::list()std::list> result_files;
	//status = std::string();
	//trained_tokens = int(0);
	//training_file = std::string();
	//validation_file = std::string();
	//new std::list()std::list> integrations;
	//seed = int(0);
}

void
FineTuningJob::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(error != NULL) {
	//
	//delete error;
	//error = NULL;
	//}
	//if(fine_tuned_model != NULL) {
	//
	//delete fine_tuned_model;
	//fine_tuned_model = NULL;
	//}
	//if(finished_at != NULL) {
	//
	//delete finished_at;
	//finished_at = NULL;
	//}
	//if(hyperparameters != NULL) {
	//
	//delete hyperparameters;
	//hyperparameters = NULL;
	//}
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//if(organization_id != NULL) {
	//
	//delete organization_id;
	//organization_id = NULL;
	//}
	//if(result_files != NULL) {
	//result_files.RemoveAll(true);
	//delete result_files;
	//result_files = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(trained_tokens != NULL) {
	//
	//delete trained_tokens;
	//trained_tokens = NULL;
	//}
	//if(training_file != NULL) {
	//
	//delete training_file;
	//training_file = NULL;
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
	//
}

void
FineTuningJob::fromJson(char* jsonStr)
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
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *errorKey = "error";
	node = json_object_get_member(pJsonObject, errorKey);
	if (node !=NULL) {
	

		if (isprimitive("FineTuningJob_error")) {
			jsonToValue(&error, node, "FineTuningJob_error", "FineTuningJob_error");
		} else {
			
			FineTuningJob_error* obj = static_cast<FineTuningJob_error*> (&error);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *fine_tuned_modelKey = "fine_tuned_model";
	node = json_object_get_member(pJsonObject, fine_tuned_modelKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&fine_tuned_model, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *finished_atKey = "finished_at";
	node = json_object_get_member(pJsonObject, finished_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&finished_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *hyperparametersKey = "hyperparameters";
	node = json_object_get_member(pJsonObject, hyperparametersKey);
	if (node !=NULL) {
	

		if (isprimitive("FineTuningJob_hyperparameters")) {
			jsonToValue(&hyperparameters, node, "FineTuningJob_hyperparameters", "FineTuningJob_hyperparameters");
		} else {
			
			FineTuningJob_hyperparameters* obj = static_cast<FineTuningJob_hyperparameters*> (&hyperparameters);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *objectKey = "object";
	node = json_object_get_member(pJsonObject, objectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&object, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *organization_idKey = "organization_id";
	node = json_object_get_member(pJsonObject, organization_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&organization_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *result_filesKey = "result_files";
	node = json_object_get_member(pJsonObject, result_filesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			result_files = new_list;
		}
		
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&status, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *trained_tokensKey = "trained_tokens";
	node = json_object_get_member(pJsonObject, trained_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&trained_tokens, node, "int", "");
		} else {
			
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
			list<FineTuningJob_integrations_inner> new_list;
			FineTuningJob_integrations_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("FineTuningJob_integrations_inner")) {
					jsonToValue(&inst, temp_json, "FineTuningJob_integrations_inner", "");
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
}

FineTuningJob::FineTuningJob(char* json)
{
	this->fromJson(json);
}

char*
FineTuningJob::toJson()
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
	if (isprimitive("int")) {
		int obj = getCreatedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("FineTuningJob_error")) {
		FineTuningJob_error obj = getError();
		node = converttoJson(&obj, "FineTuningJob_error", "");
	}
	else {
		
		FineTuningJob_error obj = static_cast<FineTuningJob_error> (getError());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *errorKey = "error";
	json_object_set_member(pJsonObject, errorKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFineTunedModel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *fine_tuned_modelKey = "fine_tuned_model";
	json_object_set_member(pJsonObject, fine_tuned_modelKey, node);
	if (isprimitive("int")) {
		int obj = getFinishedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *finished_atKey = "finished_at";
	json_object_set_member(pJsonObject, finished_atKey, node);
	if (isprimitive("FineTuningJob_hyperparameters")) {
		FineTuningJob_hyperparameters obj = getHyperparameters();
		node = converttoJson(&obj, "FineTuningJob_hyperparameters", "");
	}
	else {
		
		FineTuningJob_hyperparameters obj = static_cast<FineTuningJob_hyperparameters> (getHyperparameters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hyperparametersKey = "hyperparameters";
	json_object_set_member(pJsonObject, hyperparametersKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getModel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getObject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *objectKey = "object";
	json_object_set_member(pJsonObject, objectKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOrganizationId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *organization_idKey = "organization_id";
	json_object_set_member(pJsonObject, organization_idKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getResultFiles());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getResultFiles());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *result_filesKey = "result_files";
	json_object_set_member(pJsonObject, result_filesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("int")) {
		int obj = getTrainedTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *trained_tokensKey = "trained_tokens";
	json_object_set_member(pJsonObject, trained_tokensKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTrainingFile();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *training_fileKey = "training_file";
	json_object_set_member(pJsonObject, training_fileKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getValidationFile();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *validation_fileKey = "validation_file";
	json_object_set_member(pJsonObject, validation_fileKey, node);
	if (isprimitive("FineTuningJob_integrations_inner")) {
		list<FineTuningJob_integrations_inner> new_list = static_cast<list <FineTuningJob_integrations_inner> > (getIntegrations());
		node = converttoJson(&new_list, "FineTuningJob_integrations_inner", "array");
	} else {
		node = json_node_alloc();
		list<FineTuningJob_integrations_inner> new_list = static_cast<list <FineTuningJob_integrations_inner> > (getIntegrations());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<FineTuningJob_integrations_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			FineTuningJob_integrations_inner obj = *it;
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
FineTuningJob::getId()
{
	return id;
}

void
FineTuningJob::setId(std::string  id)
{
	this->id = id;
}

int
FineTuningJob::getCreatedAt()
{
	return created_at;
}

void
FineTuningJob::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

FineTuningJob_error
FineTuningJob::getError()
{
	return error;
}

void
FineTuningJob::setError(FineTuningJob_error  error)
{
	this->error = error;
}

std::string
FineTuningJob::getFineTunedModel()
{
	return fine_tuned_model;
}

void
FineTuningJob::setFineTunedModel(std::string  fine_tuned_model)
{
	this->fine_tuned_model = fine_tuned_model;
}

int
FineTuningJob::getFinishedAt()
{
	return finished_at;
}

void
FineTuningJob::setFinishedAt(int  finished_at)
{
	this->finished_at = finished_at;
}

FineTuningJob_hyperparameters
FineTuningJob::getHyperparameters()
{
	return hyperparameters;
}

void
FineTuningJob::setHyperparameters(FineTuningJob_hyperparameters  hyperparameters)
{
	this->hyperparameters = hyperparameters;
}

std::string
FineTuningJob::getModel()
{
	return model;
}

void
FineTuningJob::setModel(std::string  model)
{
	this->model = model;
}

std::string
FineTuningJob::getObject()
{
	return object;
}

void
FineTuningJob::setObject(std::string  object)
{
	this->object = object;
}

std::string
FineTuningJob::getOrganizationId()
{
	return organization_id;
}

void
FineTuningJob::setOrganizationId(std::string  organization_id)
{
	this->organization_id = organization_id;
}

std::list<std::string>
FineTuningJob::getResultFiles()
{
	return result_files;
}

void
FineTuningJob::setResultFiles(std::list <std::string> result_files)
{
	this->result_files = result_files;
}

std::string
FineTuningJob::getStatus()
{
	return status;
}

void
FineTuningJob::setStatus(std::string  status)
{
	this->status = status;
}

int
FineTuningJob::getTrainedTokens()
{
	return trained_tokens;
}

void
FineTuningJob::setTrainedTokens(int  trained_tokens)
{
	this->trained_tokens = trained_tokens;
}

std::string
FineTuningJob::getTrainingFile()
{
	return training_file;
}

void
FineTuningJob::setTrainingFile(std::string  training_file)
{
	this->training_file = training_file;
}

std::string
FineTuningJob::getValidationFile()
{
	return validation_file;
}

void
FineTuningJob::setValidationFile(std::string  validation_file)
{
	this->validation_file = validation_file;
}

std::list<FineTuningJob_integrations_inner>
FineTuningJob::getIntegrations()
{
	return integrations;
}

void
FineTuningJob::setIntegrations(std::list <FineTuningJob_integrations_inner> integrations)
{
	this->integrations = integrations;
}

int
FineTuningJob::getSeed()
{
	return seed;
}

void
FineTuningJob::setSeed(int  seed)
{
	this->seed = seed;
}


