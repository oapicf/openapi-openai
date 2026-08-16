

#include "CreateModerationResponse_results_inner_category_applied_input_types.h"

using namespace Tiny;

CreateModerationResponse_results_inner_category_applied_input_types::CreateModerationResponse_results_inner_category_applied_input_types()
{
	hate = std::list<std::string>();
	hatethreatening = std::list<std::string>();
	harassment = std::list<std::string>();
	harassmentthreatening = std::list<std::string>();
	illicit = std::list<std::string>();
	illicitviolent = std::list<std::string>();
	selfharm = std::list<std::string>();
	selfharmintent = std::list<std::string>();
	selfharminstructions = std::list<std::string>();
	sexual = std::list<std::string>();
	sexualminors = std::list<std::string>();
	violence = std::list<std::string>();
	violencegraphic = std::list<std::string>();
}

CreateModerationResponse_results_inner_category_applied_input_types::CreateModerationResponse_results_inner_category_applied_input_types(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateModerationResponse_results_inner_category_applied_input_types::~CreateModerationResponse_results_inner_category_applied_input_types()
{

}

void
CreateModerationResponse_results_inner_category_applied_input_types::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hateKey = "hate";

    if(object.has_key(hateKey))
    {
        bourne::json value = object[hateKey];


        std::list<std::string> hate_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            hate_list.push_back(element);
        }
        hate = hate_list;


    }

    const char *hatethreateningKey = "hate/threatening";

    if(object.has_key(hatethreateningKey))
    {
        bourne::json value = object[hatethreateningKey];


        std::list<std::string> hatethreatening_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            hatethreatening_list.push_back(element);
        }
        hatethreatening = hatethreatening_list;


    }

    const char *harassmentKey = "harassment";

    if(object.has_key(harassmentKey))
    {
        bourne::json value = object[harassmentKey];


        std::list<std::string> harassment_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            harassment_list.push_back(element);
        }
        harassment = harassment_list;


    }

    const char *harassmentthreateningKey = "harassment/threatening";

    if(object.has_key(harassmentthreateningKey))
    {
        bourne::json value = object[harassmentthreateningKey];


        std::list<std::string> harassmentthreatening_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            harassmentthreatening_list.push_back(element);
        }
        harassmentthreatening = harassmentthreatening_list;


    }

    const char *illicitKey = "illicit";

    if(object.has_key(illicitKey))
    {
        bourne::json value = object[illicitKey];


        std::list<std::string> illicit_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            illicit_list.push_back(element);
        }
        illicit = illicit_list;


    }

    const char *illicitviolentKey = "illicit/violent";

    if(object.has_key(illicitviolentKey))
    {
        bourne::json value = object[illicitviolentKey];


        std::list<std::string> illicitviolent_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            illicitviolent_list.push_back(element);
        }
        illicitviolent = illicitviolent_list;


    }

    const char *selfharmKey = "self-harm";

    if(object.has_key(selfharmKey))
    {
        bourne::json value = object[selfharmKey];


        std::list<std::string> selfharm_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            selfharm_list.push_back(element);
        }
        selfharm = selfharm_list;


    }

    const char *selfharmintentKey = "self-harm/intent";

    if(object.has_key(selfharmintentKey))
    {
        bourne::json value = object[selfharmintentKey];


        std::list<std::string> selfharmintent_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            selfharmintent_list.push_back(element);
        }
        selfharmintent = selfharmintent_list;


    }

    const char *selfharminstructionsKey = "self-harm/instructions";

    if(object.has_key(selfharminstructionsKey))
    {
        bourne::json value = object[selfharminstructionsKey];


        std::list<std::string> selfharminstructions_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            selfharminstructions_list.push_back(element);
        }
        selfharminstructions = selfharminstructions_list;


    }

    const char *sexualKey = "sexual";

    if(object.has_key(sexualKey))
    {
        bourne::json value = object[sexualKey];


        std::list<std::string> sexual_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            sexual_list.push_back(element);
        }
        sexual = sexual_list;


    }

    const char *sexualminorsKey = "sexual/minors";

    if(object.has_key(sexualminorsKey))
    {
        bourne::json value = object[sexualminorsKey];


        std::list<std::string> sexualminors_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            sexualminors_list.push_back(element);
        }
        sexualminors = sexualminors_list;


    }

    const char *violenceKey = "violence";

    if(object.has_key(violenceKey))
    {
        bourne::json value = object[violenceKey];


        std::list<std::string> violence_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            violence_list.push_back(element);
        }
        violence = violence_list;


    }

    const char *violencegraphicKey = "violence/graphic";

    if(object.has_key(violencegraphicKey))
    {
        bourne::json value = object[violencegraphicKey];


        std::list<std::string> violencegraphic_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            violencegraphic_list.push_back(element);
        }
        violencegraphic = violencegraphic_list;


    }


}

bourne::json
CreateModerationResponse_results_inner_category_applied_input_types::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> hate_list = getHate();
    bourne::json hate_arr = bourne::json::array();

    for(auto& var : hate_list)
    {
        hate_arr.append(var);
    }
    object["hate"] = hate_arr;








    std::list<std::string> hatethreatening_list = getHatethreatening();
    bourne::json hatethreatening_arr = bourne::json::array();

    for(auto& var : hatethreatening_list)
    {
        hatethreatening_arr.append(var);
    }
    object["hatethreatening"] = hatethreatening_arr;








    std::list<std::string> harassment_list = getHarassment();
    bourne::json harassment_arr = bourne::json::array();

    for(auto& var : harassment_list)
    {
        harassment_arr.append(var);
    }
    object["harassment"] = harassment_arr;








    std::list<std::string> harassmentthreatening_list = getHarassmentthreatening();
    bourne::json harassmentthreatening_arr = bourne::json::array();

    for(auto& var : harassmentthreatening_list)
    {
        harassmentthreatening_arr.append(var);
    }
    object["harassmentthreatening"] = harassmentthreatening_arr;








    std::list<std::string> illicit_list = getIllicit();
    bourne::json illicit_arr = bourne::json::array();

    for(auto& var : illicit_list)
    {
        illicit_arr.append(var);
    }
    object["illicit"] = illicit_arr;








    std::list<std::string> illicitviolent_list = getIllicitviolent();
    bourne::json illicitviolent_arr = bourne::json::array();

    for(auto& var : illicitviolent_list)
    {
        illicitviolent_arr.append(var);
    }
    object["illicitviolent"] = illicitviolent_arr;








    std::list<std::string> selfharm_list = getSelfharm();
    bourne::json selfharm_arr = bourne::json::array();

    for(auto& var : selfharm_list)
    {
        selfharm_arr.append(var);
    }
    object["selfharm"] = selfharm_arr;








    std::list<std::string> selfharmintent_list = getSelfharmintent();
    bourne::json selfharmintent_arr = bourne::json::array();

    for(auto& var : selfharmintent_list)
    {
        selfharmintent_arr.append(var);
    }
    object["selfharmintent"] = selfharmintent_arr;








    std::list<std::string> selfharminstructions_list = getSelfharminstructions();
    bourne::json selfharminstructions_arr = bourne::json::array();

    for(auto& var : selfharminstructions_list)
    {
        selfharminstructions_arr.append(var);
    }
    object["selfharminstructions"] = selfharminstructions_arr;








    std::list<std::string> sexual_list = getSexual();
    bourne::json sexual_arr = bourne::json::array();

    for(auto& var : sexual_list)
    {
        sexual_arr.append(var);
    }
    object["sexual"] = sexual_arr;








    std::list<std::string> sexualminors_list = getSexualminors();
    bourne::json sexualminors_arr = bourne::json::array();

    for(auto& var : sexualminors_list)
    {
        sexualminors_arr.append(var);
    }
    object["sexualminors"] = sexualminors_arr;








    std::list<std::string> violence_list = getViolence();
    bourne::json violence_arr = bourne::json::array();

    for(auto& var : violence_list)
    {
        violence_arr.append(var);
    }
    object["violence"] = violence_arr;








    std::list<std::string> violencegraphic_list = getViolencegraphic();
    bourne::json violencegraphic_arr = bourne::json::array();

    for(auto& var : violencegraphic_list)
    {
        violencegraphic_arr.append(var);
    }
    object["violencegraphic"] = violencegraphic_arr;






    return object;

}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getHate()
{
	return hate;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setHate(std::list <std::string> hate)
{
	this->hate = hate;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getHatethreatening()
{
	return hatethreatening;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setHatethreatening(std::list <std::string> hatethreatening)
{
	this->hatethreatening = hatethreatening;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getHarassment()
{
	return harassment;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setHarassment(std::list <std::string> harassment)
{
	this->harassment = harassment;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getHarassmentthreatening()
{
	return harassmentthreatening;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setHarassmentthreatening(std::list <std::string> harassmentthreatening)
{
	this->harassmentthreatening = harassmentthreatening;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getIllicit()
{
	return illicit;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setIllicit(std::list <std::string> illicit)
{
	this->illicit = illicit;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getIllicitviolent()
{
	return illicitviolent;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setIllicitviolent(std::list <std::string> illicitviolent)
{
	this->illicitviolent = illicitviolent;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getSelfharm()
{
	return selfharm;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setSelfharm(std::list <std::string> selfharm)
{
	this->selfharm = selfharm;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getSelfharmintent()
{
	return selfharmintent;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setSelfharmintent(std::list <std::string> selfharmintent)
{
	this->selfharmintent = selfharmintent;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getSelfharminstructions()
{
	return selfharminstructions;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setSelfharminstructions(std::list <std::string> selfharminstructions)
{
	this->selfharminstructions = selfharminstructions;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getSexual()
{
	return sexual;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setSexual(std::list <std::string> sexual)
{
	this->sexual = sexual;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getSexualminors()
{
	return sexualminors;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setSexualminors(std::list <std::string> sexualminors)
{
	this->sexualminors = sexualminors;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getViolence()
{
	return violence;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setViolence(std::list <std::string> violence)
{
	this->violence = violence;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getViolencegraphic()
{
	return violencegraphic;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setViolencegraphic(std::list <std::string> violencegraphic)
{
	this->violencegraphic = violencegraphic;
}



