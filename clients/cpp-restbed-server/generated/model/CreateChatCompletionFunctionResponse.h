/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * CreateChatCompletionFunctionResponse.h
 *
 * Represents a chat completion response returned by model, based on the provided input.
 */

#ifndef CreateChatCompletionFunctionResponse_H_
#define CreateChatCompletionFunctionResponse_H_



#include <string>
#include "CreateChatCompletionFunctionResponse_choices_inner.h"
#include "CompletionUsage.h"
#include <vector>
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Represents a chat completion response returned by model, based on the provided input.
/// </summary>
class  CreateChatCompletionFunctionResponse 
{
public:
    CreateChatCompletionFunctionResponse() = default;
    explicit CreateChatCompletionFunctionResponse(boost::property_tree::ptree const& pt);
    virtual ~CreateChatCompletionFunctionResponse() = default;

    CreateChatCompletionFunctionResponse(const CreateChatCompletionFunctionResponse& other) = default; // copy constructor
    CreateChatCompletionFunctionResponse(CreateChatCompletionFunctionResponse&& other) noexcept = default; // move constructor

    CreateChatCompletionFunctionResponse& operator=(const CreateChatCompletionFunctionResponse& other) = default; // copy assignment
    CreateChatCompletionFunctionResponse& operator=(CreateChatCompletionFunctionResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateChatCompletionFunctionResponse members

    /// <summary>
    /// A unique identifier for the chat completion.
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1.
    /// </summary>
    std::vector<CreateChatCompletionFunctionResponse_choices_inner> getChoices() const;
    void setChoices(std::vector<CreateChatCompletionFunctionResponse_choices_inner> value);

    /// <summary>
    /// The Unix timestamp (in seconds) of when the chat completion was created.
    /// </summary>
    int32_t getCreated() const;
    void setCreated(int32_t value);

    /// <summary>
    /// The model used for the chat completion.
    /// </summary>
    std::string getModel() const;
    void setModel(std::string value);

    /// <summary>
    /// This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. 
    /// </summary>
    std::string getSystemFingerprint() const;
    void setSystemFingerprint(std::string value);

    /// <summary>
    /// The object type, which is always &#x60;chat.completion&#x60;.
    /// </summary>
    std::string getObject() const;
    void setObject(std::string value);

    /// <summary>
    /// 
    /// </summary>
    CompletionUsage getUsage() const;
    void setUsage(CompletionUsage value);

protected:
    std::string m_Id = "";
    std::vector<CreateChatCompletionFunctionResponse_choices_inner> m_Choices;
    int32_t m_Created = 0;
    std::string m_Model = "";
    std::string m_System_fingerprint = "";
    std::string m_object = "";
    CompletionUsage m_Usage;
};

std::vector<CreateChatCompletionFunctionResponse> createCreateChatCompletionFunctionResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateChatCompletionFunctionResponse>(const CreateChatCompletionFunctionResponse& val) {
    return val.toPropertyTree();
}

template<>
inline CreateChatCompletionFunctionResponse fromPt<CreateChatCompletionFunctionResponse>(const boost::property_tree::ptree& pt) {
    CreateChatCompletionFunctionResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateChatCompletionFunctionResponse_H_ */
