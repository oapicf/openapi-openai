/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/CreateSpeechRequest.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CreateSpeechRequest::CreateSpeechRequest()
{
    m_ModelIsSet = false;
    m_Input = utility::conversions::to_string_t("");
    m_InputIsSet = false;
    m_Voice = utility::conversions::to_string_t("");
    m_VoiceIsSet = false;
    m_Response_format = utility::conversions::to_string_t("");
    m_Response_formatIsSet = false;
    m_Speed = 0.0;
    m_SpeedIsSet = false;
}

CreateSpeechRequest::~CreateSpeechRequest()
{
}

void CreateSpeechRequest::validate()
{
    // TODO: implement validation
}

web::json::value CreateSpeechRequest::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_ModelIsSet)
    {
        val[utility::conversions::to_string_t(U("model"))] = ModelBase::toJson(m_Model);
    }
    if(m_InputIsSet)
    {
        val[utility::conversions::to_string_t(U("input"))] = ModelBase::toJson(m_Input);
    }
    if(m_VoiceIsSet)
    {
        val[utility::conversions::to_string_t(U("voice"))] = ModelBase::toJson(m_Voice);
    }
    if(m_Response_formatIsSet)
    {
        val[utility::conversions::to_string_t(U("response_format"))] = ModelBase::toJson(m_Response_format);
    }
    if(m_SpeedIsSet)
    {
        val[utility::conversions::to_string_t(U("speed"))] = ModelBase::toJson(m_Speed);
    }

    return val;
}

bool CreateSpeechRequest::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("model"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("model")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<CreateSpeechRequest_model> refVal_setModel;
            ok &= ModelBase::fromJson(fieldValue, refVal_setModel);
            setModel(refVal_setModel);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("input"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("input")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setInput;
            ok &= ModelBase::fromJson(fieldValue, refVal_setInput);
            setInput(refVal_setInput);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("voice"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("voice")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setVoice;
            ok &= ModelBase::fromJson(fieldValue, refVal_setVoice);
            setVoice(refVal_setVoice);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("response_format"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("response_format")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setResponseFormat;
            ok &= ModelBase::fromJson(fieldValue, refVal_setResponseFormat);
            setResponseFormat(refVal_setResponseFormat);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("speed"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("speed")));
        if(!fieldValue.is_null())
        {
            double refVal_setSpeed;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSpeed);
            setSpeed(refVal_setSpeed);
        }
    }
    return ok;
}

void CreateSpeechRequest::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_ModelIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("model")), m_Model));
    }
    if(m_InputIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("input")), m_Input));
    }
    if(m_VoiceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("voice")), m_Voice));
    }
    if(m_Response_formatIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("response_format")), m_Response_format));
    }
    if(m_SpeedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("speed")), m_Speed));
    }
}

bool CreateSpeechRequest::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("model"))))
    {
        std::shared_ptr<CreateSpeechRequest_model> refVal_setModel;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("model"))), refVal_setModel );
        setModel(refVal_setModel);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("input"))))
    {
        utility::string_t refVal_setInput;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("input"))), refVal_setInput );
        setInput(refVal_setInput);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("voice"))))
    {
        utility::string_t refVal_setVoice;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("voice"))), refVal_setVoice );
        setVoice(refVal_setVoice);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("response_format"))))
    {
        utility::string_t refVal_setResponseFormat;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("response_format"))), refVal_setResponseFormat );
        setResponseFormat(refVal_setResponseFormat);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("speed"))))
    {
        double refVal_setSpeed;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("speed"))), refVal_setSpeed );
        setSpeed(refVal_setSpeed);
    }
    return ok;
}

std::shared_ptr<CreateSpeechRequest_model> CreateSpeechRequest::getModel() const
{
    return m_Model;
}

void CreateSpeechRequest::setModel(const std::shared_ptr<CreateSpeechRequest_model>& value)
{
    m_Model = value;
    m_ModelIsSet = true;
}

bool CreateSpeechRequest::modelIsSet() const
{
    return m_ModelIsSet;
}

void CreateSpeechRequest::unsetModel()
{
    m_ModelIsSet = false;
}
utility::string_t CreateSpeechRequest::getInput() const
{
    return m_Input;
}

void CreateSpeechRequest::setInput(const utility::string_t& value)
{
    m_Input = value;
    m_InputIsSet = true;
}

bool CreateSpeechRequest::inputIsSet() const
{
    return m_InputIsSet;
}

void CreateSpeechRequest::unsetInput()
{
    m_InputIsSet = false;
}
utility::string_t CreateSpeechRequest::getVoice() const
{
    return m_Voice;
}

void CreateSpeechRequest::setVoice(const utility::string_t& value)
{
    m_Voice = value;
    m_VoiceIsSet = true;
}

bool CreateSpeechRequest::voiceIsSet() const
{
    return m_VoiceIsSet;
}

void CreateSpeechRequest::unsetVoice()
{
    m_VoiceIsSet = false;
}
utility::string_t CreateSpeechRequest::getResponseFormat() const
{
    return m_Response_format;
}

void CreateSpeechRequest::setResponseFormat(const utility::string_t& value)
{
    m_Response_format = value;
    m_Response_formatIsSet = true;
}

bool CreateSpeechRequest::responseFormatIsSet() const
{
    return m_Response_formatIsSet;
}

void CreateSpeechRequest::unsetResponse_format()
{
    m_Response_formatIsSet = false;
}
double CreateSpeechRequest::getSpeed() const
{
    return m_Speed;
}

void CreateSpeechRequest::setSpeed(double value)
{
    m_Speed = value;
    m_SpeedIsSet = true;
}

bool CreateSpeechRequest::speedIsSet() const
{
    return m_SpeedIsSet;
}

void CreateSpeechRequest::unsetSpeed()
{
    m_SpeedIsSet = false;
}
}
}
}
}


