#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FineTune.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FineTune::FineTune()
{
	//__init();
}

FineTune::~FineTune()
{
	//__cleanup();
}

void
FineTune::__init()
{
	//id = std::string();
	//object = std::string();
	//created_at = int(0);
	//updated_at = int(0);
	//model = std::string();
	//fine_tuned_model = std::string();
	//organization_id = std::string();
	//status = std::string();
	//hyperparams = null;
	//new std::list()std::list> training_files;
	//new std::list()std::list> validation_files;
	//new std::list()std::list> result_files;
	//new std::list()std::list> events;
}

void
FineTune::__cleanup()
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
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(updated_at != NULL) {
	//
	//delete updated_at;
	//updated_at = NULL;
	//}
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//if(fine_tuned_model != NULL) {
	//
	//delete fine_tuned_model;
	//fine_tuned_model = NULL;
	//}
	//if(organization_id != NULL) {
	//
	//delete organization_id;
	//organization_id = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(hyperparams != NULL) {
	//
	//delete hyperparams;
	//hyperparams = NULL;
	//}
	//if(training_files != NULL) {
	//training_files.RemoveAll(true);
	//delete training_files;
	//training_files = NULL;
	//}
	//if(validation_files != NULL) {
	//validation_files.RemoveAll(true);
	//delete validation_files;
	//validation_files = NULL;
	//}
	//if(result_files != NULL) {
	//result_files.RemoveAll(true);
	//delete result_files;
	//result_files = NULL;
	//}
	//if(events != NULL) {
	//events.RemoveAll(true);
	//delete events;
	//events = NULL;
	//}
	//
}

void
FineTune::fromJson(char* jsonStr)
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
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *updated_atKey = "updated_at";
	node = json_object_get_member(pJsonObject, updated_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&updated_at, node, "int", "");
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
	const gchar *fine_tuned_modelKey = "fine_tuned_model";
	node = json_object_get_member(pJsonObject, fine_tuned_modelKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&fine_tuned_model, node, "std::string", "");
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
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&status, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *hyperparamsKey = "hyperparams";
	node = json_object_get_member(pJsonObject, hyperparamsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&hyperparams, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&hyperparams);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *training_filesKey = "training_files";
	node = json_object_get_member(pJsonObject, training_filesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OpenAIFile> new_list;
			OpenAIFile inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OpenAIFile")) {
					jsonToValue(&inst, temp_json, "OpenAIFile", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			training_files = new_list;
		}
		
	}
	const gchar *validation_filesKey = "validation_files";
	node = json_object_get_member(pJsonObject, validation_filesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OpenAIFile> new_list;
			OpenAIFile inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OpenAIFile")) {
					jsonToValue(&inst, temp_json, "OpenAIFile", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			validation_files = new_list;
		}
		
	}
	const gchar *result_filesKey = "result_files";
	node = json_object_get_member(pJsonObject, result_filesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OpenAIFile> new_list;
			OpenAIFile inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OpenAIFile")) {
					jsonToValue(&inst, temp_json, "OpenAIFile", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			result_files = new_list;
		}
		
	}
	const gchar *eventsKey = "events";
	node = json_object_get_member(pJsonObject, eventsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<FineTuneEvent> new_list;
			FineTuneEvent inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("FineTuneEvent")) {
					jsonToValue(&inst, temp_json, "FineTuneEvent", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			events = new_list;
		}
		
	}
}

FineTune::FineTune(char* json)
{
	this->fromJson(json);
}

char*
FineTune::toJson()
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
		int obj = getCreatedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("int")) {
		int obj = getUpdatedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *updated_atKey = "updated_at";
	json_object_set_member(pJsonObject, updated_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getModel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFineTunedModel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *fine_tuned_modelKey = "fine_tuned_model";
	json_object_set_member(pJsonObject, fine_tuned_modelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOrganizationId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *organization_idKey = "organization_id";
	json_object_set_member(pJsonObject, organization_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getHyperparams();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getHyperparams());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hyperparamsKey = "hyperparams";
	json_object_set_member(pJsonObject, hyperparamsKey, node);
	if (isprimitive("OpenAIFile")) {
		list<OpenAIFile> new_list = static_cast<list <OpenAIFile> > (getTrainingFiles());
		node = converttoJson(&new_list, "OpenAIFile", "array");
	} else {
		node = json_node_alloc();
		list<OpenAIFile> new_list = static_cast<list <OpenAIFile> > (getTrainingFiles());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OpenAIFile>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OpenAIFile obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *training_filesKey = "training_files";
	json_object_set_member(pJsonObject, training_filesKey, node);
	if (isprimitive("OpenAIFile")) {
		list<OpenAIFile> new_list = static_cast<list <OpenAIFile> > (getValidationFiles());
		node = converttoJson(&new_list, "OpenAIFile", "array");
	} else {
		node = json_node_alloc();
		list<OpenAIFile> new_list = static_cast<list <OpenAIFile> > (getValidationFiles());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OpenAIFile>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OpenAIFile obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *validation_filesKey = "validation_files";
	json_object_set_member(pJsonObject, validation_filesKey, node);
	if (isprimitive("OpenAIFile")) {
		list<OpenAIFile> new_list = static_cast<list <OpenAIFile> > (getResultFiles());
		node = converttoJson(&new_list, "OpenAIFile", "array");
	} else {
		node = json_node_alloc();
		list<OpenAIFile> new_list = static_cast<list <OpenAIFile> > (getResultFiles());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OpenAIFile>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OpenAIFile obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *result_filesKey = "result_files";
	json_object_set_member(pJsonObject, result_filesKey, node);
	if (isprimitive("FineTuneEvent")) {
		list<FineTuneEvent> new_list = static_cast<list <FineTuneEvent> > (getEvents());
		node = converttoJson(&new_list, "FineTuneEvent", "array");
	} else {
		node = json_node_alloc();
		list<FineTuneEvent> new_list = static_cast<list <FineTuneEvent> > (getEvents());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<FineTuneEvent>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			FineTuneEvent obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *eventsKey = "events";
	json_object_set_member(pJsonObject, eventsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
FineTune::getId()
{
	return id;
}

void
FineTune::setId(std::string  id)
{
	this->id = id;
}

std::string
FineTune::getObject()
{
	return object;
}

void
FineTune::setObject(std::string  object)
{
	this->object = object;
}

int
FineTune::getCreatedAt()
{
	return created_at;
}

void
FineTune::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

int
FineTune::getUpdatedAt()
{
	return updated_at;
}

void
FineTune::setUpdatedAt(int  updated_at)
{
	this->updated_at = updated_at;
}

std::string
FineTune::getModel()
{
	return model;
}

void
FineTune::setModel(std::string  model)
{
	this->model = model;
}

std::string
FineTune::getFineTunedModel()
{
	return fine_tuned_model;
}

void
FineTune::setFineTunedModel(std::string  fine_tuned_model)
{
	this->fine_tuned_model = fine_tuned_model;
}

std::string
FineTune::getOrganizationId()
{
	return organization_id;
}

void
FineTune::setOrganizationId(std::string  organization_id)
{
	this->organization_id = organization_id;
}

std::string
FineTune::getStatus()
{
	return status;
}

void
FineTune::setStatus(std::string  status)
{
	this->status = status;
}

std::string
FineTune::getHyperparams()
{
	return hyperparams;
}

void
FineTune::setHyperparams(std::string  hyperparams)
{
	this->hyperparams = hyperparams;
}

std::list<OpenAIFile>
FineTune::getTrainingFiles()
{
	return training_files;
}

void
FineTune::setTrainingFiles(std::list <OpenAIFile> training_files)
{
	this->training_files = training_files;
}

std::list<OpenAIFile>
FineTune::getValidationFiles()
{
	return validation_files;
}

void
FineTune::setValidationFiles(std::list <OpenAIFile> validation_files)
{
	this->validation_files = validation_files;
}

std::list<OpenAIFile>
FineTune::getResultFiles()
{
	return result_files;
}

void
FineTune::setResultFiles(std::list <OpenAIFile> result_files)
{
	this->result_files = result_files;
}

std::list<FineTuneEvent>
FineTune::getEvents()
{
	return events;
}

void
FineTune::setEvents(std::list <FineTuneEvent> events)
{
	this->events = events;
}


