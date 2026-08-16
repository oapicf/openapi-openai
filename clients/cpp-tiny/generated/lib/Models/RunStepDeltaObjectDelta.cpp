

#include "RunStepDeltaObject_delta.h"

using namespace Tiny;

RunStepDeltaObject_delta::RunStepDeltaObject_delta()
{
	step_details = RunStepDeltaObject_delta_step_details();
}

RunStepDeltaObject_delta::RunStepDeltaObject_delta(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDeltaObject_delta::~RunStepDeltaObject_delta()
{

}

void
RunStepDeltaObject_delta::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *step_detailsKey = "step_details";

    if(object.has_key(step_detailsKey))
    {
        bourne::json value = object[step_detailsKey];




        RunStepDeltaObject_delta_step_details* obj = &step_details;
		obj->fromJson(value.dump());

    }


}

bourne::json
RunStepDeltaObject_delta::toJson()
{
    bourne::json object = bourne::json::object();






	object["step_details"] = getStepDetails().toJson();


    return object;

}

RunStepDeltaObject_delta_step_details
RunStepDeltaObject_delta::getStepDetails()
{
	return step_details;
}

void
RunStepDeltaObject_delta::setStepDetails(RunStepDeltaObject_delta_step_details  step_details)
{
	this->step_details = step_details;
}



