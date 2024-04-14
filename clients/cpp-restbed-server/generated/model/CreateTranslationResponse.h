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
 * CreateTranslationResponse.h
 *
 * 
 */

#ifndef CreateTranslationResponse_H_
#define CreateTranslationResponse_H_



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
class  CreateTranslationResponse 
{
public:
    CreateTranslationResponse() = default;
    explicit CreateTranslationResponse(boost::property_tree::ptree const& pt);
    virtual ~CreateTranslationResponse() = default;

    CreateTranslationResponse(const CreateTranslationResponse& other) = default; // copy constructor
    CreateTranslationResponse(CreateTranslationResponse&& other) noexcept = default; // move constructor

    CreateTranslationResponse& operator=(const CreateTranslationResponse& other) = default; // copy assignment
    CreateTranslationResponse& operator=(CreateTranslationResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateTranslationResponse members

    /// <summary>
    /// 
    /// </summary>
    std::string getText() const;
    void setText(std::string value);

protected:
    std::string m_Text = "";
};

std::vector<CreateTranslationResponse> createCreateTranslationResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateTranslationResponse>(const CreateTranslationResponse& val) {
    return val.toPropertyTree();
}

template<>
inline CreateTranslationResponse fromPt<CreateTranslationResponse>(const boost::property_tree::ptree& pt) {
    CreateTranslationResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateTranslationResponse_H_ */