#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateFineTuneRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateFineTuneRequest::CreateFineTuneRequest()
{
	//__init();
}

CreateFineTuneRequest::~CreateFineTuneRequest()
{
	//__cleanup();
}

void
CreateFineTuneRequest::__init()
{
	//training_file = std::string();
	//validation_file = std::string();
	//model = new CreateFineTuneRequest_model();
	//n_epochs = int(0);
	//batch_size = int(0);
	//learning_rate_multiplier = double(0);
	//prompt_loss_weight = double(0);
	//compute_classification_metrics = bool(false);
	//classification_n_classes = int(0);
	//classification_positive_class = std::string();
	//new std::list()std::list> classification_betas;
	//suffix = std::string();
}

void
CreateFineTuneRequest::__cleanup()
{
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
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//if(n_epochs != NULL) {
	//
	//delete n_epochs;
	//n_epochs = NULL;
	//}
	//if(batch_size != NULL) {
	//
	//delete batch_size;
	//batch_size = NULL;
	//}
	//if(learning_rate_multiplier != NULL) {
	//
	//delete learning_rate_multiplier;
	//learning_rate_multiplier = NULL;
	//}
	//if(prompt_loss_weight != NULL) {
	//
	//delete prompt_loss_weight;
	//prompt_loss_weight = NULL;
	//}
	//if(compute_classification_metrics != NULL) {
	//
	//delete compute_classification_metrics;
	//compute_classification_metrics = NULL;
	//}
	//if(classification_n_classes != NULL) {
	//
	//delete classification_n_classes;
	//classification_n_classes = NULL;
	//}
	//if(classification_positive_class != NULL) {
	//
	//delete classification_positive_class;
	//classification_positive_class = NULL;
	//}
	//if(classification_betas != NULL) {
	//classification_betas.RemoveAll(true);
	//delete classification_betas;
	//classification_betas = NULL;
	//}
	//if(suffix != NULL) {
	//
	//delete suffix;
	//suffix = NULL;
	//}
	//
}

void
CreateFineTuneRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *modelKey = "model";
	node = json_object_get_member(pJsonObject, modelKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateFineTuneRequest_model")) {
			jsonToValue(&model, node, "CreateFineTuneRequest_model", "CreateFineTuneRequest_model");
		} else {
			
			CreateFineTuneRequest_model* obj = static_cast<CreateFineTuneRequest_model*> (&model);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *n_epochsKey = "n_epochs";
	node = json_object_get_member(pJsonObject, n_epochsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&n_epochs, node, "int", "");
		} else {
			
		}
	}
	const gchar *batch_sizeKey = "batch_size";
	node = json_object_get_member(pJsonObject, batch_sizeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&batch_size, node, "int", "");
		} else {
			
		}
	}
	const gchar *learning_rate_multiplierKey = "learning_rate_multiplier";
	node = json_object_get_member(pJsonObject, learning_rate_multiplierKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&learning_rate_multiplier, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&learning_rate_multiplier);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *prompt_loss_weightKey = "prompt_loss_weight";
	node = json_object_get_member(pJsonObject, prompt_loss_weightKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&prompt_loss_weight, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&prompt_loss_weight);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *compute_classification_metricsKey = "compute_classification_metrics";
	node = json_object_get_member(pJsonObject, compute_classification_metricsKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&compute_classification_metrics, node, "bool", "");
		} else {
			
		}
	}
	const gchar *classification_n_classesKey = "classification_n_classes";
	node = json_object_get_member(pJsonObject, classification_n_classesKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&classification_n_classes, node, "int", "");
		} else {
			
		}
	}
	const gchar *classification_positive_classKey = "classification_positive_class";
	node = json_object_get_member(pJsonObject, classification_positive_classKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&classification_positive_class, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *classification_betasKey = "classification_betas";
	node = json_object_get_member(pJsonObject, classification_betasKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<long long> new_list;
			long long inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("long long")) {
					jsonToValue(&inst, temp_json, "long long", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			classification_betas = new_list;
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
}

CreateFineTuneRequest::CreateFineTuneRequest(char* json)
{
	this->fromJson(json);
}

char*
CreateFineTuneRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("CreateFineTuneRequest_model")) {
		CreateFineTuneRequest_model obj = getModel();
		node = converttoJson(&obj, "CreateFineTuneRequest_model", "");
	}
	else {
		
		CreateFineTuneRequest_model obj = static_cast<CreateFineTuneRequest_model> (getModel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
	if (isprimitive("int")) {
		int obj = getNEpochs();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *n_epochsKey = "n_epochs";
	json_object_set_member(pJsonObject, n_epochsKey, node);
	if (isprimitive("int")) {
		int obj = getBatchSize();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *batch_sizeKey = "batch_size";
	json_object_set_member(pJsonObject, batch_sizeKey, node);
	if (isprimitive("long long")) {
		long long obj = getLearningRateMultiplier();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getLearningRateMultiplier());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *learning_rate_multiplierKey = "learning_rate_multiplier";
	json_object_set_member(pJsonObject, learning_rate_multiplierKey, node);
	if (isprimitive("long long")) {
		long long obj = getPromptLossWeight();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getPromptLossWeight());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *prompt_loss_weightKey = "prompt_loss_weight";
	json_object_set_member(pJsonObject, prompt_loss_weightKey, node);
	if (isprimitive("bool")) {
		bool obj = getComputeClassificationMetrics();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *compute_classification_metricsKey = "compute_classification_metrics";
	json_object_set_member(pJsonObject, compute_classification_metricsKey, node);
	if (isprimitive("int")) {
		int obj = getClassificationNClasses();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *classification_n_classesKey = "classification_n_classes";
	json_object_set_member(pJsonObject, classification_n_classesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getClassificationPositiveClass();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *classification_positive_classKey = "classification_positive_class";
	json_object_set_member(pJsonObject, classification_positive_classKey, node);
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getClassificationBetas());
		node = converttoJson(&new_list, "long long", "array");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getClassificationBetas());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<long long>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			long long obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *classification_betasKey = "classification_betas";
	json_object_set_member(pJsonObject, classification_betasKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSuffix();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *suffixKey = "suffix";
	json_object_set_member(pJsonObject, suffixKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CreateFineTuneRequest::getTrainingFile()
{
	return training_file;
}

void
CreateFineTuneRequest::setTrainingFile(std::string  training_file)
{
	this->training_file = training_file;
}

std::string
CreateFineTuneRequest::getValidationFile()
{
	return validation_file;
}

void
CreateFineTuneRequest::setValidationFile(std::string  validation_file)
{
	this->validation_file = validation_file;
}

CreateFineTuneRequest_model
CreateFineTuneRequest::getModel()
{
	return model;
}

void
CreateFineTuneRequest::setModel(CreateFineTuneRequest_model  model)
{
	this->model = model;
}

int
CreateFineTuneRequest::getNEpochs()
{
	return n_epochs;
}

void
CreateFineTuneRequest::setNEpochs(int  n_epochs)
{
	this->n_epochs = n_epochs;
}

int
CreateFineTuneRequest::getBatchSize()
{
	return batch_size;
}

void
CreateFineTuneRequest::setBatchSize(int  batch_size)
{
	this->batch_size = batch_size;
}

long long
CreateFineTuneRequest::getLearningRateMultiplier()
{
	return learning_rate_multiplier;
}

void
CreateFineTuneRequest::setLearningRateMultiplier(long long  learning_rate_multiplier)
{
	this->learning_rate_multiplier = learning_rate_multiplier;
}

long long
CreateFineTuneRequest::getPromptLossWeight()
{
	return prompt_loss_weight;
}

void
CreateFineTuneRequest::setPromptLossWeight(long long  prompt_loss_weight)
{
	this->prompt_loss_weight = prompt_loss_weight;
}

bool
CreateFineTuneRequest::getComputeClassificationMetrics()
{
	return compute_classification_metrics;
}

void
CreateFineTuneRequest::setComputeClassificationMetrics(bool  compute_classification_metrics)
{
	this->compute_classification_metrics = compute_classification_metrics;
}

int
CreateFineTuneRequest::getClassificationNClasses()
{
	return classification_n_classes;
}

void
CreateFineTuneRequest::setClassificationNClasses(int  classification_n_classes)
{
	this->classification_n_classes = classification_n_classes;
}

std::string
CreateFineTuneRequest::getClassificationPositiveClass()
{
	return classification_positive_class;
}

void
CreateFineTuneRequest::setClassificationPositiveClass(std::string  classification_positive_class)
{
	this->classification_positive_class = classification_positive_class;
}

std::list<long long>
CreateFineTuneRequest::getClassificationBetas()
{
	return classification_betas;
}

void
CreateFineTuneRequest::setClassificationBetas(std::list <long long> classification_betas)
{
	this->classification_betas = classification_betas;
}

std::string
CreateFineTuneRequest::getSuffix()
{
	return suffix;
}

void
CreateFineTuneRequest::setSuffix(std::string  suffix)
{
	this->suffix = suffix;
}


