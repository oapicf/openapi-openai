#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FineTuneDPOMethod.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FineTuneDPOMethod::FineTuneDPOMethod()
{
	//__init();
}

FineTuneDPOMethod::~FineTuneDPOMethod()
{
	//__cleanup();
}

void
FineTuneDPOMethod::__init()
{
	//hyperparameters = new FineTuneDPOMethod_hyperparameters();
}

void
FineTuneDPOMethod::__cleanup()
{
	//if(hyperparameters != NULL) {
	//
	//delete hyperparameters;
	//hyperparameters = NULL;
	//}
	//
}

void
FineTuneDPOMethod::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *hyperparametersKey = "hyperparameters";
	node = json_object_get_member(pJsonObject, hyperparametersKey);
	if (node !=NULL) {
	

		if (isprimitive("FineTuneDPOMethod_hyperparameters")) {
			jsonToValue(&hyperparameters, node, "FineTuneDPOMethod_hyperparameters", "FineTuneDPOMethod_hyperparameters");
		} else {
			
			FineTuneDPOMethod_hyperparameters* obj = static_cast<FineTuneDPOMethod_hyperparameters*> (&hyperparameters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

FineTuneDPOMethod::FineTuneDPOMethod(char* json)
{
	this->fromJson(json);
}

char*
FineTuneDPOMethod::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("FineTuneDPOMethod_hyperparameters")) {
		FineTuneDPOMethod_hyperparameters obj = getHyperparameters();
		node = converttoJson(&obj, "FineTuneDPOMethod_hyperparameters", "");
	}
	else {
		
		FineTuneDPOMethod_hyperparameters obj = static_cast<FineTuneDPOMethod_hyperparameters> (getHyperparameters());
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

FineTuneDPOMethod_hyperparameters
FineTuneDPOMethod::getHyperparameters()
{
	return hyperparameters;
}

void
FineTuneDPOMethod::setHyperparameters(FineTuneDPOMethod_hyperparameters  hyperparameters)
{
	this->hyperparameters = hyperparameters;
}


