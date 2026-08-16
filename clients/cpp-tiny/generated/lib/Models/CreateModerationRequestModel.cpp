

#include "CreateModerationRequest_model.h"

using namespace Tiny;

CreateModerationRequest_model::CreateModerationRequest_model()
{
}

CreateModerationRequest_model::CreateModerationRequest_model(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateModerationRequest_model::~CreateModerationRequest_model()
{

}

void
CreateModerationRequest_model::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CreateModerationRequest_model::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



