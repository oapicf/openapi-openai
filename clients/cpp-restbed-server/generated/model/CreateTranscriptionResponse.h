/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * CreateTranscriptionResponse.h
 *
 * 
 */

#ifndef CreateTranscriptionResponse_H_
#define CreateTranscriptionResponse_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  CreateTranscriptionResponse 
{
public:
    CreateTranscriptionResponse() = default;
    explicit CreateTranscriptionResponse(boost::property_tree::ptree const& pt);
    virtual ~CreateTranscriptionResponse() = default;

    CreateTranscriptionResponse(const CreateTranscriptionResponse& other) = default; // copy constructor
    CreateTranscriptionResponse(CreateTranscriptionResponse&& other) noexcept = default; // move constructor

    CreateTranscriptionResponse& operator=(const CreateTranscriptionResponse& other) = default; // copy assignment
    CreateTranscriptionResponse& operator=(CreateTranscriptionResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateTranscriptionResponse members

    /// <summary>
    /// 
    /// </summary>
    std::string getText() const;
    void setText(std::string value);

protected:
    std::string m_Text = "";
};

std::vector<CreateTranscriptionResponse> createCreateTranscriptionResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateTranscriptionResponse>(const CreateTranscriptionResponse& val) {
    return val.toPropertyTree();
}

template<>
inline CreateTranscriptionResponse fromPt<CreateTranscriptionResponse>(const boost::property_tree::ptree& pt) {
    CreateTranscriptionResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateTranscriptionResponse_H_ */
