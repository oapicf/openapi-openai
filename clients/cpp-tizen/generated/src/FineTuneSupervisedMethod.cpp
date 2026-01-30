#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FineTuneSupervisedMethod.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FineTuneSupervisedMethod::FineTuneSupervisedMethod()
{
	//__init();
}

FineTuneSupervisedMethod::~FineTuneSupervisedMethod()
{
	//__cleanup();
}

void
FineTuneSupervisedMethod::__init()
{
	//hyperparameters = new FineTuneSupervisedMethod_hyperparameters();
}

void
FineTuneSupervisedMethod::__cleanup()
{
	//if(hyperparameters != NULL) {
	//
	//delete hyperparameters;
	//hyperparameters = NULL;
	//}
	//
}

void
FineTuneSupervisedMethod::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *hyperparametersKey = "hyperparameters";
	node = json_object_get_member(pJsonObject, hyperparametersKey);
	if (node !=NULL) {
	

		if (isprimitive("FineTuneSupervisedMethod_hyperparameters")) {
			jsonToValue(&hyperparameters, node, "FineTuneSupervisedMethod_hyperparameters", "FineTuneSupervisedMethod_hyperparameters");
		} else {
			
			FineTuneSupervisedMethod_hyperparameters* obj = static_cast<FineTuneSupervisedMethod_hyperparameters*> (&hyperparameters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

FineTuneSupervisedMethod::FineTuneSupervisedMethod(char* json)
{
	this->fromJson(json);
}

char*
FineTuneSupervisedMethod::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("FineTuneSupervisedMethod_hyperparameters")) {
		FineTuneSupervisedMethod_hyperparameters obj = getHyperparameters();
		node = converttoJson(&obj, "FineTuneSupervisedMethod_hyperparameters", "");
	}
	else {
		
		FineTuneSupervisedMethod_hyperparameters obj = static_cast<FineTuneSupervisedMethod_hyperparameters> (getHyperparameters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hyperparametersKey = "hyperparameters";
	json_object_set_member(pJsonObject, hyperparametersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

FineTuneSupervisedMethod_hyperparameters
FineTuneSupervisedMethod::getHyperparameters()
{
	return hyperparameters;
}

void
FineTuneSupervisedMethod::setHyperparameters(FineTuneSupervisedMethod_hyperparameters  hyperparameters)
{
	this->hyperparameters = hyperparameters;
}


