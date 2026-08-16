

#include "CreateModerationRequest_input.h"

using namespace Tiny;

CreateModerationRequest_input::CreateModerationRequest_input()
{
}

CreateModerationRequest_input::CreateModerationRequest_input(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateModerationRequest_input::~CreateModerationRequest_input()
{

}

void
CreateModerationRequest_input::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CreateModerationRequest_input::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



