#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FineTuningJobCheckpoint_metrics.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FineTuningJobCheckpoint_metrics::FineTuningJobCheckpoint_metrics()
{
	//__init();
}

FineTuningJobCheckpoint_metrics::~FineTuningJobCheckpoint_metrics()
{
	//__cleanup();
}

void
FineTuningJobCheckpoint_metrics::__init()
{
	//step = double(0);
	//train_loss = double(0);
	//train_mean_token_accuracy = double(0);
	//valid_loss = double(0);
	//valid_mean_token_accuracy = double(0);
	//full_valid_loss = double(0);
	//full_valid_mean_token_accuracy = double(0);
}

void
FineTuningJobCheckpoint_metrics::__cleanup()
{
	//if(step != NULL) {
	//
	//delete step;
	//step = NULL;
	//}
	//if(train_loss != NULL) {
	//
	//delete train_loss;
	//train_loss = NULL;
	//}
	//if(train_mean_token_accuracy != NULL) {
	//
	//delete train_mean_token_accuracy;
	//train_mean_token_accuracy = NULL;
	//}
	//if(valid_loss != NULL) {
	//
	//delete valid_loss;
	//valid_loss = NULL;
	//}
	//if(valid_mean_token_accuracy != NULL) {
	//
	//delete valid_mean_token_accuracy;
	//valid_mean_token_accuracy = NULL;
	//}
	//if(full_valid_loss != NULL) {
	//
	//delete full_valid_loss;
	//full_valid_loss = NULL;
	//}
	//if(full_valid_mean_token_accuracy != NULL) {
	//
	//delete full_valid_mean_token_accuracy;
	//full_valid_mean_token_accuracy = NULL;
	//}
	//
}

void
FineTuningJobCheckpoint_metrics::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *stepKey = "step";
	node = json_object_get_member(pJsonObject, stepKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&step, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&step);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *train_lossKey = "train_loss";
	node = json_object_get_member(pJsonObject, train_lossKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&train_loss, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&train_loss);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *train_mean_token_accuracyKey = "train_mean_token_accuracy";
	node = json_object_get_member(pJsonObject, train_mean_token_accuracyKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&train_mean_token_accuracy, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&train_mean_token_accuracy);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *valid_lossKey = "valid_loss";
	node = json_object_get_member(pJsonObject, valid_lossKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&valid_loss, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&valid_loss);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *valid_mean_token_accuracyKey = "valid_mean_token_accuracy";
	node = json_object_get_member(pJsonObject, valid_mean_token_accuracyKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&valid_mean_token_accuracy, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&valid_mean_token_accuracy);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *full_valid_lossKey = "full_valid_loss";
	node = json_object_get_member(pJsonObject, full_valid_lossKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&full_valid_loss, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&full_valid_loss);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *full_valid_mean_token_accuracyKey = "full_valid_mean_token_accuracy";
	node = json_object_get_member(pJsonObject, full_valid_mean_token_accuracyKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&full_valid_mean_token_accuracy, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&full_valid_mean_token_accuracy);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

FineTuningJobCheckpoint_metrics::FineTuningJobCheckpoint_metrics(char* json)
{
	this->fromJson(json);
}

char*
FineTuningJobCheckpoint_metrics::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getStep();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getStep());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *stepKey = "step";
	json_object_set_member(pJsonObject, stepKey, node);
	if (isprimitive("long long")) {
		long long obj = getTrainLoss();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getTrainLoss());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *train_lossKey = "train_loss";
	json_object_set_member(pJsonObject, train_lossKey, node);
	if (isprimitive("long long")) {
		long long obj = getTrainMeanTokenAccuracy();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getTrainMeanTokenAccuracy());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *train_mean_token_accuracyKey = "train_mean_token_accuracy";
	json_object_set_member(pJsonObject, train_mean_token_accuracyKey, node);
	if (isprimitive("long long")) {
		long long obj = getValidLoss();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getValidLoss());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *valid_lossKey = "valid_loss";
	json_object_set_member(pJsonObject, valid_lossKey, node);
	if (isprimitive("long long")) {
		long long obj = getValidMeanTokenAccuracy();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getValidMeanTokenAccuracy());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *valid_mean_token_accuracyKey = "valid_mean_token_accuracy";
	json_object_set_member(pJsonObject, valid_mean_token_accuracyKey, node);
	if (isprimitive("long long")) {
		long long obj = getFullValidLoss();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getFullValidLoss());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *full_valid_lossKey = "full_valid_loss";
	json_object_set_member(pJsonObject, full_valid_lossKey, node);
	if (isprimitive("long long")) {
		long long obj = getFullValidMeanTokenAccuracy();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getFullValidMeanTokenAccuracy());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *full_valid_mean_token_accuracyKey = "full_valid_mean_token_accuracy";
	json_object_set_member(pJsonObject, full_valid_mean_token_accuracyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
FineTuningJobCheckpoint_metrics::getStep()
{
	return step;
}

void
FineTuningJobCheckpoint_metrics::setStep(long long  step)
{
	this->step = step;
}

long long
FineTuningJobCheckpoint_metrics::getTrainLoss()
{
	return train_loss;
}

void
FineTuningJobCheckpoint_metrics::setTrainLoss(long long  train_loss)
{
	this->train_loss = train_loss;
}

long long
FineTuningJobCheckpoint_metrics::getTrainMeanTokenAccuracy()
{
	return train_mean_token_accuracy;
}

void
FineTuningJobCheckpoint_metrics::setTrainMeanTokenAccuracy(long long  train_mean_token_accuracy)
{
	this->train_mean_token_accuracy = train_mean_token_accuracy;
}

long long
FineTuningJobCheckpoint_metrics::getValidLoss()
{
	return valid_loss;
}

void
FineTuningJobCheckpoint_metrics::setValidLoss(long long  valid_loss)
{
	this->valid_loss = valid_loss;
}

long long
FineTuningJobCheckpoint_metrics::getValidMeanTokenAccuracy()
{
	return valid_mean_token_accuracy;
}

void
FineTuningJobCheckpoint_metrics::setValidMeanTokenAccuracy(long long  valid_mean_token_accuracy)
{
	this->valid_mean_token_accuracy = valid_mean_token_accuracy;
}

long long
FineTuningJobCheckpoint_metrics::getFullValidLoss()
{
	return full_valid_loss;
}

void
FineTuningJobCheckpoint_metrics::setFullValidLoss(long long  full_valid_loss)
{
	this->full_valid_loss = full_valid_loss;
}

long long
FineTuningJobCheckpoint_metrics::getFullValidMeanTokenAccuracy()
{
	return full_valid_mean_token_accuracy;
}

void
FineTuningJobCheckpoint_metrics::setFullValidMeanTokenAccuracy(long long  full_valid_mean_token_accuracy)
{
	this->full_valid_mean_token_accuracy = full_valid_mean_token_accuracy;
}


