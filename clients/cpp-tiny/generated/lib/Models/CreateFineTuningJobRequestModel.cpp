

#include "CreateFineTuningJobRequest_model.h"

using namespace Tiny;

CreateFineTuningJobRequest_model::CreateFineTuningJobRequest_model()
{
}

CreateFineTuningJobRequest_model::CreateFineTuningJobRequest_model(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateFineTuningJobRequest_model::~CreateFineTuningJobRequest_model()
{

}

void
CreateFineTuningJobRequest_model::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CreateFineTuningJobRequest_model::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



