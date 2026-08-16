

#include "RealtimeSession.h"

using namespace Tiny;

RealtimeSession::RealtimeSession()
{
	id = std::string();
	modalities = std::list<std::string>();
	model = RealtimeSession_model();
	instructions = std::string();
	voice = std::string();
	input_audio_format = std::string();
	output_audio_format = std::string();
	input_audio_transcription = RealtimeSession_input_audio_transcription();
	turn_detection = RealtimeSession_turn_detection();
	tools = std::list<RealtimeResponseCreateParams_tools_inner>();
	tool_choice = std::string();
	temperature = float(0);
	max_response_output_tokens = RealtimeResponseCreateParams_max_response_output_tokens();
}

RealtimeSession::RealtimeSession(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeSession::~RealtimeSession()
{

}

void
RealtimeSession::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *modalitiesKey = "modalities";

    if(object.has_key(modalitiesKey))
    {
        bourne::json value = object[modalitiesKey];


        std::list<std::string> modalities_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            modalities_list.push_back(element);
        }
        modalities = modalities_list;


    }

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];




        RealtimeSession_model* obj = &model;
		obj->fromJson(value.dump());

    }

    const char *instructionsKey = "instructions";

    if(object.has_key(instructionsKey))
    {
        bourne::json value = object[instructionsKey];



        jsonToValue(&instructions, value, "std::string");


    }

    const char *voiceKey = "voice";

    if(object.has_key(voiceKey))
    {
        bourne::json value = object[voiceKey];



        jsonToValue(&voice, value, "std::string");


    }

    const char *input_audio_formatKey = "input_audio_format";

    if(object.has_key(input_audio_formatKey))
    {
        bourne::json value = object[input_audio_formatKey];



        jsonToValue(&input_audio_format, value, "std::string");


    }

    const char *output_audio_formatKey = "output_audio_format";

    if(object.has_key(output_audio_formatKey))
    {
        bourne::json value = object[output_audio_formatKey];



        jsonToValue(&output_audio_format, value, "std::string");


    }

    const char *input_audio_transcriptionKey = "input_audio_transcription";

    if(object.has_key(input_audio_transcriptionKey))
    {
        bourne::json value = object[input_audio_transcriptionKey];




        RealtimeSession_input_audio_transcription* obj = &input_audio_transcription;
		obj->fromJson(value.dump());

    }

    const char *turn_detectionKey = "turn_detection";

    if(object.has_key(turn_detectionKey))
    {
        bourne::json value = object[turn_detectionKey];




        RealtimeSession_turn_detection* obj = &turn_detection;
		obj->fromJson(value.dump());

    }

    const char *toolsKey = "tools";

    if(object.has_key(toolsKey))
    {
        bourne::json value = object[toolsKey];


        std::list<RealtimeResponseCreateParams_tools_inner> tools_list;
        RealtimeResponseCreateParams_tools_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            tools_list.push_back(element);
        }
        tools = tools_list;


    }

    const char *tool_choiceKey = "tool_choice";

    if(object.has_key(tool_choiceKey))
    {
        bourne::json value = object[tool_choiceKey];



        jsonToValue(&tool_choice, value, "std::string");


    }

    const char *temperatureKey = "temperature";

    if(object.has_key(temperatureKey))
    {
        bourne::json value = object[temperatureKey];



        jsonToValue(&temperature, value, "long");


    }

    const char *max_response_output_tokensKey = "max_response_output_tokens";

    if(object.has_key(max_response_output_tokensKey))
    {
        bourne::json value = object[max_response_output_tokensKey];




        RealtimeResponseCreateParams_max_response_output_tokens* obj = &max_response_output_tokens;
		obj->fromJson(value.dump());

    }


}

bourne::json
RealtimeSession::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();





    std::list<std::string> modalities_list = getModalities();
    bourne::json modalities_arr = bourne::json::array();

    for(auto& var : modalities_list)
    {
        modalities_arr.append(var);
    }
    object["modalities"] = modalities_arr;










	object["model"] = getModel().toJson();





    object["instructions"] = getInstructions();






    object["voice"] = getVoice();






    object["input_audio_format"] = getInputAudioFormat();






    object["output_audio_format"] = getOutputAudioFormat();







	object["input_audio_transcription"] = getInputAudioTranscription().toJson();






	object["turn_detection"] = getTurnDetection().toJson();




    std::list<RealtimeResponseCreateParams_tools_inner> tools_list = getTools();
    bourne::json tools_arr = bourne::json::array();

    for(auto& var : tools_list)
    {
        RealtimeResponseCreateParams_tools_inner obj = var;
        tools_arr.append(obj.toJson());
    }
    object["tools"] = tools_arr;







    object["tool_choice"] = getToolChoice();






    object["temperature"] = getTemperature();







	object["max_response_output_tokens"] = getMaxResponseOutputTokens().toJson();


    return object;

}

std::string
RealtimeSession::getId()
{
	return id;
}

void
RealtimeSession::setId(std::string  id)
{
	this->id = id;
}

std::list<std::string>
RealtimeSession::getModalities()
{
	return modalities;
}

void
RealtimeSession::setModalities(std::list <std::string> modalities)
{
	this->modalities = modalities;
}

RealtimeSession_model
RealtimeSession::getModel()
{
	return model;
}

void
RealtimeSession::setModel(RealtimeSession_model  model)
{
	this->model = model;
}

std::string
RealtimeSession::getInstructions()
{
	return instructions;
}

void
RealtimeSession::setInstructions(std::string  instructions)
{
	this->instructions = instructions;
}

std::string
RealtimeSession::getVoice()
{
	return voice;
}

void
RealtimeSession::setVoice(std::string  voice)
{
	this->voice = voice;
}

std::string
RealtimeSession::getInputAudioFormat()
{
	return input_audio_format;
}

void
RealtimeSession::setInputAudioFormat(std::string  input_audio_format)
{
	this->input_audio_format = input_audio_format;
}

std::string
RealtimeSession::getOutputAudioFormat()
{
	return output_audio_format;
}

void
RealtimeSession::setOutputAudioFormat(std::string  output_audio_format)
{
	this->output_audio_format = output_audio_format;
}

RealtimeSession_input_audio_transcription
RealtimeSession::getInputAudioTranscription()
{
	return input_audio_transcription;
}

void
RealtimeSession::setInputAudioTranscription(RealtimeSession_input_audio_transcription  input_audio_transcription)
{
	this->input_audio_transcription = input_audio_transcription;
}

RealtimeSession_turn_detection
RealtimeSession::getTurnDetection()
{
	return turn_detection;
}

void
RealtimeSession::setTurnDetection(RealtimeSession_turn_detection  turn_detection)
{
	this->turn_detection = turn_detection;
}

std::list<RealtimeResponseCreateParams_tools_inner>
RealtimeSession::getTools()
{
	return tools;
}

void
RealtimeSession::setTools(std::list <RealtimeResponseCreateParams_tools_inner> tools)
{
	this->tools = tools;
}

std::string
RealtimeSession::getToolChoice()
{
	return tool_choice;
}

void
RealtimeSession::setToolChoice(std::string  tool_choice)
{
	this->tool_choice = tool_choice;
}

long
RealtimeSession::getTemperature()
{
	return temperature;
}

void
RealtimeSession::setTemperature(long  temperature)
{
	this->temperature = temperature;
}

RealtimeResponseCreateParams_max_response_output_tokens
RealtimeSession::getMaxResponseOutputTokens()
{
	return max_response_output_tokens;
}

void
RealtimeSession::setMaxResponseOutputTokens(RealtimeResponseCreateParams_max_response_output_tokens  max_response_output_tokens)
{
	this->max_response_output_tokens = max_response_output_tokens;
}



