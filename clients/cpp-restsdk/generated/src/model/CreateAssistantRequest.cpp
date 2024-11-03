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



#include "CppRestOpenAPIClient/model/CreateAssistantRequest.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CreateAssistantRequest::CreateAssistantRequest()
{
    m_ModelIsSet = false;
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
    m_Description = utility::conversions::to_string_t("");
    m_DescriptionIsSet = false;
    m_Instructions = utility::conversions::to_string_t("");
    m_InstructionsIsSet = false;
    m_ToolsIsSet = false;
    m_File_idsIsSet = false;
    m_MetadataIsSet = false;
}

CreateAssistantRequest::~CreateAssistantRequest()
{
}

void CreateAssistantRequest::validate()
{
    // TODO: implement validation
}

web::json::value CreateAssistantRequest::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_ModelIsSet)
    {
        val[utility::conversions::to_string_t(U("model"))] = ModelBase::toJson(m_Model);
    }
    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t(U("name"))] = ModelBase::toJson(m_Name);
    }
    if(m_DescriptionIsSet)
    {
        val[utility::conversions::to_string_t(U("description"))] = ModelBase::toJson(m_Description);
    }
    if(m_InstructionsIsSet)
    {
        val[utility::conversions::to_string_t(U("instructions"))] = ModelBase::toJson(m_Instructions);
    }
    if(m_ToolsIsSet)
    {
        val[utility::conversions::to_string_t(U("tools"))] = ModelBase::toJson(m_Tools);
    }
    if(m_File_idsIsSet)
    {
        val[utility::conversions::to_string_t(U("file_ids"))] = ModelBase::toJson(m_File_ids);
    }
    if(m_MetadataIsSet)
    {
        val[utility::conversions::to_string_t(U("metadata"))] = ModelBase::toJson(m_Metadata);
    }

    return val;
}

bool CreateAssistantRequest::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("model"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("model")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<CreateAssistantRequest_model> refVal_setModel;
            ok &= ModelBase::fromJson(fieldValue, refVal_setModel);
            setModel(refVal_setModel);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("name"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("name")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setName);
            setName(refVal_setName);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("description"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("description")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setDescription;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDescription);
            setDescription(refVal_setDescription);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("instructions"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("instructions")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setInstructions;
            ok &= ModelBase::fromJson(fieldValue, refVal_setInstructions);
            setInstructions(refVal_setInstructions);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("tools"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("tools")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<AssistantObject_tools_inner>> refVal_setTools;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTools);
            setTools(refVal_setTools);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("file_ids"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("file_ids")));
        if(!fieldValue.is_null())
        {
            std::vector<utility::string_t> refVal_setFileIds;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFileIds);
            setFileIds(refVal_setFileIds);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("metadata"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("metadata")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Object> refVal_setMetadata;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMetadata);
            setMetadata(refVal_setMetadata);
        }
    }
    return ok;
}

void CreateAssistantRequest::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("name")), m_Name));
    }
    if(m_DescriptionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("description")), m_Description));
    }
    if(m_InstructionsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("instructions")), m_Instructions));
    }
    if(m_ToolsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("tools")), m_Tools));
    }
    if(m_File_idsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("file_ids")), m_File_ids));
    }
    if(m_MetadataIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("metadata")), m_Metadata));
    }
}

bool CreateAssistantRequest::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("model"))))
    {
        std::shared_ptr<CreateAssistantRequest_model> refVal_setModel;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("model"))), refVal_setModel );
        setModel(refVal_setModel);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("name"))))
    {
        utility::string_t refVal_setName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("name"))), refVal_setName );
        setName(refVal_setName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("description"))))
    {
        utility::string_t refVal_setDescription;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("description"))), refVal_setDescription );
        setDescription(refVal_setDescription);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("instructions"))))
    {
        utility::string_t refVal_setInstructions;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("instructions"))), refVal_setInstructions );
        setInstructions(refVal_setInstructions);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("tools"))))
    {
        std::vector<std::shared_ptr<AssistantObject_tools_inner>> refVal_setTools;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("tools"))), refVal_setTools );
        setTools(refVal_setTools);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("file_ids"))))
    {
        std::vector<utility::string_t> refVal_setFileIds;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("file_ids"))), refVal_setFileIds );
        setFileIds(refVal_setFileIds);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("metadata"))))
    {
        std::shared_ptr<Object> refVal_setMetadata;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("metadata"))), refVal_setMetadata );
        setMetadata(refVal_setMetadata);
    }
    return ok;
}

std::shared_ptr<CreateAssistantRequest_model> CreateAssistantRequest::getModel() const
{
    return m_Model;
}

void CreateAssistantRequest::setModel(const std::shared_ptr<CreateAssistantRequest_model>& value)
{
    m_Model = value;
    m_ModelIsSet = true;
}

bool CreateAssistantRequest::modelIsSet() const
{
    return m_ModelIsSet;
}

void CreateAssistantRequest::unsetModel()
{
    m_ModelIsSet = false;
}
utility::string_t CreateAssistantRequest::getName() const
{
    return m_Name;
}

void CreateAssistantRequest::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool CreateAssistantRequest::nameIsSet() const
{
    return m_NameIsSet;
}

void CreateAssistantRequest::unsetName()
{
    m_NameIsSet = false;
}
utility::string_t CreateAssistantRequest::getDescription() const
{
    return m_Description;
}

void CreateAssistantRequest::setDescription(const utility::string_t& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}

bool CreateAssistantRequest::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}

void CreateAssistantRequest::unsetDescription()
{
    m_DescriptionIsSet = false;
}
utility::string_t CreateAssistantRequest::getInstructions() const
{
    return m_Instructions;
}

void CreateAssistantRequest::setInstructions(const utility::string_t& value)
{
    m_Instructions = value;
    m_InstructionsIsSet = true;
}

bool CreateAssistantRequest::instructionsIsSet() const
{
    return m_InstructionsIsSet;
}

void CreateAssistantRequest::unsetInstructions()
{
    m_InstructionsIsSet = false;
}
std::vector<std::shared_ptr<AssistantObject_tools_inner>>& CreateAssistantRequest::getTools()
{
    return m_Tools;
}

void CreateAssistantRequest::setTools(const std::vector<std::shared_ptr<AssistantObject_tools_inner>>& value)
{
    m_Tools = value;
    m_ToolsIsSet = true;
}

bool CreateAssistantRequest::toolsIsSet() const
{
    return m_ToolsIsSet;
}

void CreateAssistantRequest::unsetTools()
{
    m_ToolsIsSet = false;
}
std::vector<utility::string_t>& CreateAssistantRequest::getFileIds()
{
    return m_File_ids;
}

void CreateAssistantRequest::setFileIds(const std::vector<utility::string_t>& value)
{
    m_File_ids = value;
    m_File_idsIsSet = true;
}

bool CreateAssistantRequest::fileIdsIsSet() const
{
    return m_File_idsIsSet;
}

void CreateAssistantRequest::unsetFile_ids()
{
    m_File_idsIsSet = false;
}
std::shared_ptr<Object> CreateAssistantRequest::getMetadata() const
{
    return m_Metadata;
}

void CreateAssistantRequest::setMetadata(const std::shared_ptr<Object>& value)
{
    m_Metadata = value;
    m_MetadataIsSet = true;
}

bool CreateAssistantRequest::metadataIsSet() const
{
    return m_MetadataIsSet;
}

void CreateAssistantRequest::unsetMetadata()
{
    m_MetadataIsSet = false;
}
}
}
}
}


