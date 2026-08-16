

#include "FineTuneSupervisedMethod.h"

using namespace Tiny;

FineTuneSupervisedMethod::FineTuneSupervisedMethod()
{
	hyperparameters = FineTuneSupervisedMethod_hyperparameters();
}

FineTuneSupervisedMethod::FineTuneSupervisedMethod(std::string jsonString)
{
	this->fromJson(jsonString);
}

FineTuneSupervisedMethod::~FineTuneSupervisedMethod()
{

}

void
FineTuneSupervisedMethod::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hyperparametersKey = "hyperparameters";

    if(object.has_key(hyperparametersKey))
    {
        bourne::json value = object[hyperparametersKey];




        FineTuneSupervisedMethod_hyperparameters* obj = &hyperparameters;
		obj->fromJson(value.dump());

    }


}

bourne::json
FineTuneSupervisedMethod::toJson()
{
    bourne::json object = bourne::json::object();






	object["hyperparameters"] = getHyperparameters().toJson();


    return object;

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



