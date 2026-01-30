#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FineTuneSupervisedMethod_hyperparameters.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FineTuneSupervisedMethod_hyperparameters::FineTuneSupervisedMethod_hyperparameters()
{
	//__init();
}

FineTuneSupervisedMethod_hyperparameters::~FineTuneSupervisedMethod_hyperparameters()
{
	//__cleanup();
}

void
FineTuneSupervisedMethod_hyperparameters::__init()
{
	//batch_size = new FineTuneDPOMethod_hyperparameters_batch_size();
	//learning_rate_multiplier = new FineTuneDPOMethod_hyperparameters_learning_rate_multiplier();
	//n_epochs = new FineTuneDPOMethod_hyperparameters_n_epochs();
}

void
FineTuneSupervisedMethod_hyperparameters::__cleanup()
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
FineTuneSupervisedMethod_hyperparameters::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *batch_sizeKey = "batch_size";
	node = json_object_get_member(pJsonObject, batch_sizeKey);
	if (node !=NULL) {
	

		if (isprimitive("FineTuneDPOMethod_hyperparameters_batch_size")) {
			jsonToValue(&batch_size, node, "FineTuneDPOMethod_hyperparameters_batch_size", "FineTuneDPOMethod_hyperparameters_batch_size");
		} else {
			
			FineTuneDPOMethod_hyperparameters_batch_size* obj = static_cast<FineTuneDPOMethod_hyperparameters_batch_size*> (&batch_size);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *learning_rate_multiplierKey = "learning_rate_multiplier";
	node = json_object_get_member(pJsonObject, learning_rate_multiplierKey);
	if (node !=NULL) {
	

		if (isprimitive("FineTuneDPOMethod_hyperparameters_learning_rate_multiplier")) {
			jsonToValue(&learning_rate_multiplier, node, "FineTuneDPOMethod_hyperparameters_learning_rate_multiplier", "FineTuneDPOMethod_hyperparameters_learning_rate_multiplier");
		} else {
			
			FineTuneDPOMethod_hyperparameters_learning_rate_multiplier* obj = static_cast<FineTuneDPOMethod_hyperparameters_learning_rate_multiplier*> (&learning_rate_multiplier);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *n_epochsKey = "n_epochs";
	node = json_object_get_member(pJsonObject, n_epochsKey);
	if (node !=NULL) {
	

		if (isprimitive("FineTuneDPOMethod_hyperparameters_n_epochs")) {
			jsonToValue(&n_epochs, node, "FineTuneDPOMethod_hyperparameters_n_epochs", "FineTuneDPOMethod_hyperparameters_n_epochs");
		} else {
			
			FineTuneDPOMethod_hyperparameters_n_epochs* obj = static_cast<FineTuneDPOMethod_hyperparameters_n_epochs*> (&n_epochs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

FineTuneSupervisedMethod_hyperparameters::FineTuneSupervisedMethod_hyperparameters(char* json)
{
	this->fromJson(json);
}

char*
FineTuneSupervisedMethod_hyperparameters::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("FineTuneDPOMethod_hyperparameters_batch_size")) {
		FineTuneDPOMethod_hyperparameters_batch_size obj = getBatchSize();
		node = converttoJson(&obj, "FineTuneDPOMethod_hyperparameters_batch_size", "");
	}
	else {
		
		FineTuneDPOMethod_hyperparameters_batch_size obj = static_cast<FineTuneDPOMethod_hyperparameters_batch_size> (getBatchSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *batch_sizeKey = "batch_size";
	json_object_set_member(pJsonObject, batch_sizeKey, node);
	if (isprimitive("FineTuneDPOMethod_hyperparameters_learning_rate_multiplier")) {
		FineTuneDPOMethod_hyperparameters_learning_rate_multiplier obj = getLearningRateMultiplier();
		node = converttoJson(&obj, "FineTuneDPOMethod_hyperparameters_learning_rate_multiplier", "");
	}
	else {
		
		FineTuneDPOMethod_hyperparameters_learning_rate_multiplier obj = static_cast<FineTuneDPOMethod_hyperparameters_learning_rate_multiplier> (getLearningRateMultiplier());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *learning_rate_multiplierKey = "learning_rate_multiplier";
	json_object_set_member(pJsonObject, learning_rate_multiplierKey, node);
	if (isprimitive("FineTuneDPOMethod_hyperparameters_n_epochs")) {
		FineTuneDPOMethod_hyperparameters_n_epochs obj = getNEpochs();
		node = converttoJson(&obj, "FineTuneDPOMethod_hyperparameters_n_epochs", "");
	}
	else {
		
		FineTuneDPOMethod_hyperparameters_n_epochs obj = static_cast<FineTuneDPOMethod_hyperparameters_n_epochs> (getNEpochs());
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

FineTuneDPOMethod_hyperparameters_batch_size
FineTuneSupervisedMethod_hyperparameters::getBatchSize()
{
	return batch_size;
}

void
FineTuneSupervisedMethod_hyperparameters::setBatchSize(FineTuneDPOMethod_hyperparameters_batch_size  batch_size)
{
	this->batch_size = batch_size;
}

FineTuneDPOMethod_hyperparameters_learning_rate_multiplier
FineTuneSupervisedMethod_hyperparameters::getLearningRateMultiplier()
{
	return learning_rate_multiplier;
}

void
FineTuneSupervisedMethod_hyperparameters::setLearningRateMultiplier(FineTuneDPOMethod_hyperparameters_learning_rate_multiplier  learning_rate_multiplier)
{
	this->learning_rate_multiplier = learning_rate_multiplier;
}

FineTuneDPOMethod_hyperparameters_n_epochs
FineTuneSupervisedMethod_hyperparameters::getNEpochs()
{
	return n_epochs;
}

void
FineTuneSupervisedMethod_hyperparameters::setNEpochs(FineTuneDPOMethod_hyperparameters_n_epochs  n_epochs)
{
	this->n_epochs = n_epochs;
}


