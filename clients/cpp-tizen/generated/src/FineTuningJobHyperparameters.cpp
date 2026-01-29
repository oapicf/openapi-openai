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
	//n_epochs = new FineTuningJob_hyperparameters_n_epochs();
}

void
FineTuningJob_hyperparameters::__cleanup()
{
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
	const gchar *n_epochsKey = "n_epochs";
	node = json_object_get_member(pJsonObject, n_epochsKey);
	if (node !=NULL) {
	

		if (isprimitive("FineTuningJob_hyperparameters_n_epochs")) {
			jsonToValue(&n_epochs, node, "FineTuningJob_hyperparameters_n_epochs", "FineTuningJob_hyperparameters_n_epochs");
		} else {
			
			FineTuningJob_hyperparameters_n_epochs* obj = static_cast<FineTuningJob_hyperparameters_n_epochs*> (&n_epochs);
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
	if (isprimitive("FineTuningJob_hyperparameters_n_epochs")) {
		FineTuningJob_hyperparameters_n_epochs obj = getNEpochs();
		node = converttoJson(&obj, "FineTuningJob_hyperparameters_n_epochs", "");
	}
	else {
		
		FineTuningJob_hyperparameters_n_epochs obj = static_cast<FineTuningJob_hyperparameters_n_epochs> (getNEpochs());
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

FineTuningJob_hyperparameters_n_epochs
FineTuningJob_hyperparameters::getNEpochs()
{
	return n_epochs;
}

void
FineTuningJob_hyperparameters::setNEpochs(FineTuningJob_hyperparameters_n_epochs  n_epochs)
{
	this->n_epochs = n_epochs;
}


