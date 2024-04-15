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
 * CreateChatCompletionStreamResponse.h
 *
 * Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
 */

#ifndef CreateChatCompletionStreamResponse_H_
#define CreateChatCompletionStreamResponse_H_



#include <string>
#include <vector>
#include "CreateChatCompletionStreamResponse_choices_inner.h"
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
/// Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
/// </summary>
class  CreateChatCompletionStreamResponse 
{
public:
    CreateChatCompletionStreamResponse() = default;
    explicit CreateChatCompletionStreamResponse(boost::property_tree::ptree const& pt);
    virtual ~CreateChatCompletionStreamResponse() = default;

    CreateChatCompletionStreamResponse(const CreateChatCompletionStreamResponse& other) = default; // copy constructor
    CreateChatCompletionStreamResponse(CreateChatCompletionStreamResponse&& other) noexcept = default; // move constructor

    CreateChatCompletionStreamResponse& operator=(const CreateChatCompletionStreamResponse& other) = default; // copy assignment
    CreateChatCompletionStreamResponse& operator=(CreateChatCompletionStreamResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateChatCompletionStreamResponse members

    /// <summary>
    /// A unique identifier for the chat completion. Each chunk has the same ID.
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1.
    /// </summary>
    std::vector<CreateChatCompletionStreamResponse_choices_inner> getChoices() const;
    void setChoices(std::vector<CreateChatCompletionStreamResponse_choices_inner> value);

    /// <summary>
    /// The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
    /// </summary>
    int32_t getCreated() const;
    void setCreated(int32_t value);

    /// <summary>
    /// The model to generate the completion.
    /// </summary>
    std::string getModel() const;
    void setModel(std::string value);

    /// <summary>
    /// This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. 
    /// </summary>
    std::string getSystemFingerprint() const;
    void setSystemFingerprint(std::string value);

    /// <summary>
    /// The object type, which is always &#x60;chat.completion.chunk&#x60;.
    /// </summary>
    std::string getObject() const;
    void setObject(std::string value);

protected:
    std::string m_Id = "";
    std::vector<CreateChatCompletionStreamResponse_choices_inner> m_Choices;
    int32_t m_Created = 0;
    std::string m_Model = "";
    std::string m_System_fingerprint = "";
    std::string m_object = "";
};

std::vector<CreateChatCompletionStreamResponse> createCreateChatCompletionStreamResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateChatCompletionStreamResponse>(const CreateChatCompletionStreamResponse& val) {
    return val.toPropertyTree();
}

template<>
inline CreateChatCompletionStreamResponse fromPt<CreateChatCompletionStreamResponse>(const boost::property_tree::ptree& pt) {
    CreateChatCompletionStreamResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateChatCompletionStreamResponse_H_ */