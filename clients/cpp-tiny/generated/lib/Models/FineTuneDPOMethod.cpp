

#include "FineTuneDPOMethod.h"

using namespace Tiny;

FineTuneDPOMethod::FineTuneDPOMethod()
{
	hyperparameters = FineTuneDPOMethod_hyperparameters();
}

FineTuneDPOMethod::FineTuneDPOMethod(std::string jsonString)
{
	this->fromJson(jsonString);
}

FineTuneDPOMethod::~FineTuneDPOMethod()
{

}

void
FineTuneDPOMethod::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hyperparametersKey = "hyperparameters";

    if(object.has_key(hyperparametersKey))
    {
        bourne::json value = object[hyperparametersKey];




        FineTuneDPOMethod_hyperparameters* obj = &hyperparameters;
		obj->fromJson(value.dump());

    }


}

bourne::json
FineTuneDPOMethod::toJson()
{
    bourne::json object = bourne::json::object();






	object["hyperparameters"] = getHyperparameters().toJson();


    return object;

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



