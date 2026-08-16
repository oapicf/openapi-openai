

#include "CreateRunRequest_model.h"

using namespace Tiny;

CreateRunRequest_model::CreateRunRequest_model()
{
}

CreateRunRequest_model::CreateRunRequest_model(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateRunRequest_model::~CreateRunRequest_model()
{

}

void
CreateRunRequest_model::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CreateRunRequest_model::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



