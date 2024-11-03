/**
* OpenAI API
* The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * ModifyAssistantRequest.h
 *
 * 
 */

#ifndef ModifyAssistantRequest_H_
#define ModifyAssistantRequest_H_


#include <nlohmann/json.hpp>
#include "AssistantObject_tools_inner.h"
#include <string>
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  ModifyAssistantRequest
{
public:
    ModifyAssistantRequest();
    virtual ~ModifyAssistantRequest() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const ModifyAssistantRequest& rhs) const;
    bool operator!=(const ModifyAssistantRequest& rhs) const;

    /////////////////////////////////////////////
    /// ModifyAssistantRequest members

    /// <summary>
    /// 
    /// </summary>
    std::string getModel() const;
    void setModel(std::string const& value);
    bool modelIsSet() const;
    void unsetModel();
    /// <summary>
    /// The name of the assistant. The maximum length is 256 characters. 
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
    bool nameIsSet() const;
    void unsetName();
    /// <summary>
    /// The description of the assistant. The maximum length is 512 characters. 
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string const& value);
    bool descriptionIsSet() const;
    void unsetDescription();
    /// <summary>
    /// The system instructions that the assistant uses. The maximum length is 256,000 characters. 
    /// </summary>
    std::string getInstructions() const;
    void setInstructions(std::string const& value);
    bool instructionsIsSet() const;
    void unsetInstructions();
    /// <summary>
    /// A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. 
    /// </summary>
    std::vector<org::openapitools::server::model::AssistantObject_tools_inner> getTools() const;
    void setTools(std::vector<org::openapitools::server::model::AssistantObject_tools_inner> const& value);
    bool toolsIsSet() const;
    void unsetTools();
    /// <summary>
    /// A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant. 
    /// </summary>
    std::vector<std::string> getFileIds() const;
    void setFileIds(std::vector<std::string> const& value);
    bool fileIdsIsSet() const;
    void unsetFile_ids();
    /// <summary>
    /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
    /// </summary>
    nlohmann::json getMetadata() const;
    void setMetadata(nlohmann::json const& value);
    bool metadataIsSet() const;
    void unsetMetadata();

    friend  void to_json(nlohmann::json& j, const ModifyAssistantRequest& o);
    friend  void from_json(const nlohmann::json& j, ModifyAssistantRequest& o);
protected:
    std::string m_Model;
    bool m_ModelIsSet;
    std::string m_Name;
    bool m_NameIsSet;
    std::string m_Description;
    bool m_DescriptionIsSet;
    std::string m_Instructions;
    bool m_InstructionsIsSet;
    std::vector<org::openapitools::server::model::AssistantObject_tools_inner> m_Tools;
    bool m_ToolsIsSet;
    std::vector<std::string> m_File_ids;
    bool m_File_idsIsSet;
    nlohmann::json m_Metadata;
    bool m_MetadataIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* ModifyAssistantRequest_H_ */
