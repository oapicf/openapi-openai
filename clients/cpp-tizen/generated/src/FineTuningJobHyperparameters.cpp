#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FineTuningJob_hyperparameters.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FineTuningJob_hyperparameters::FineTuningJob_hyperparameters()
{
	//__init();
}

FineTuningJob_hyperparameters::~FineTuningJob_hyperparameters()
{
	//__cleanup();
}

void
FineTuningJob_hyperparameters::__init()
{
	//batch_size = new CreateFineTuningJobRequest_hyperparameters_batch_size();
	//learning_rate_multiplier = new CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier();
	//n_epochs = new CreateFineTuningJobRequest_hyperparameters_n_epochs();
}

void
FineTuningJob_hyperparameters::__cleanup()
{
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
	//if(n_epochs != NULL) {
	//
	//delete n_epochs;
	//n_epochs = NULL;
	//}
	//
}

void
FineTuningJob_hyperparameters::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *batch_sizeKey = "batch_size";
	node = json_object_get_member(pJsonObject, batch_sizeKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateFineTuningJobRequest_hyperparameters_batch_size")) {
			jsonToValue(&batch_size, node, "CreateFineTuningJobRequest_hyperparameters_batch_size", "CreateFineTuningJobRequest_hyperparameters_batch_size");
		} else {
			
			CreateFineTuningJobRequest_hyperparameters_batch_size* obj = static_cast<CreateFineTuningJobRequest_hyperparameters_batch_size*> (&batch_size);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *learning_rate_multiplierKey = "learning_rate_multiplier";
	node = json_object_get_member(pJsonObject, learning_rate_multiplierKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier")) {
			jsonToValue(&learning_rate_multiplier, node, "CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier", "CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier");
		} else {
			
			CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier* obj = static_cast<CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier*> (&learning_rate_multiplier);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *n_epochsKey = "n_epochs";
	node = json_object_get_member(pJsonObject, n_epochsKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateFineTuningJobRequest_hyperparameters_n_epochs")) {
			jsonToValue(&n_epochs, node, "CreateFineTuningJobRequest_hyperparameters_n_epochs", "CreateFineTuningJobRequest_hyperparameters_n_epochs");
		} else {
			
			CreateFineTuningJobRequest_hyperparameters_n_epochs* obj = static_cast<CreateFineTuningJobRequest_hyperparameters_n_epochs*> (&n_epochs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

FineTuningJob_hyperparameters::FineTuningJob_hyperparameters(char* json)
{
	this->fromJson(json);
}

char*
FineTuningJob_hyperparameters::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CreateFineTuningJobRequest_hyperparameters_batch_size")) {
		CreateFineTuningJobRequest_hyperparameters_batch_size obj = getBatchSize();
		node = converttoJson(&obj, "CreateFineTuningJobRequest_hyperparameters_batch_size", "");
	}
	else {
		
		CreateFineTuningJobRequest_hyperparameters_batch_size obj = static_cast<CreateFineTuningJobRequest_hyperparameters_batch_size> (getBatchSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *batch_sizeKey = "batch_size";
	json_object_set_member(pJsonObject, batch_sizeKey, node);
	if (isprimitive("CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier")) {
		CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier obj = getLearningRateMultiplier();
		node = converttoJson(&obj, "CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier", "");
	}
	else {
		
		CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier obj = static_cast<CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier> (getLearningRateMultiplier());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *learning_rate_multiplierKey = "learning_rate_multiplier";
	json_object_set_member(pJsonObject, learning_rate_multiplierKey, node);
	if (isprimitive("CreateFineTuningJobRequest_hyperparameters_n_epochs")) {
		CreateFineTuningJobRequest_hyperparameters_n_epochs obj = getNEpochs();
		node = converttoJson(&obj, "CreateFineTuningJobRequest_hyperparameters_n_epochs", "");
	}
	else {
		
		CreateFineTuningJobRequest_hyperparameters_n_epochs obj = static_cast<CreateFineTuningJobRequest_hyperparameters_n_epochs> (getNEpochs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *n_epochsKey = "n_epochs";
	json_object_set_member(pJsonObject, n_epochsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CreateFineTuningJobRequest_hyperparameters_batch_size
FineTuningJob_hyperparameters::getBatchSize()
{
	return batch_size;
}

void
FineTuningJob_hyperparameters::setBatchSize(CreateFineTuningJobRequest_hyperparameters_batch_size  batch_size)
{
	this->batch_size = batch_size;
}

CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier
FineTuningJob_hyperparameters::getLearningRateMultiplier()
{
	return learning_rate_multiplier;
}

void
FineTuningJob_hyperparameters::setLearningRateMultiplier(CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier  learning_rate_multiplier)
{
	this->learning_rate_multiplier = learning_rate_multiplier;
}

CreateFineTuningJobRequest_hyperparameters_n_epochs
FineTuningJob_hyperparameters::getNEpochs()
{
	return n_epochs;
}

void
FineTuningJob_hyperparameters::setNEpochs(CreateFineTuningJobRequest_hyperparameters_n_epochs  n_epochs)
{
	this->n_epochs = n_epochs;
}


