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

/*
 * CreateTranslationResponseJson.h
 *
 * 
 */

#ifndef CreateTranslationResponseJson_H_
#define CreateTranslationResponseJson_H_



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
class  CreateTranslationResponseJson 
{
public:
    CreateTranslationResponseJson() = default;
    explicit CreateTranslationResponseJson(boost::property_tree::ptree const& pt);
    virtual ~CreateTranslationResponseJson() = default;

    CreateTranslationResponseJson(const CreateTranslationResponseJson& other) = default; // copy constructor
    CreateTranslationResponseJson(CreateTranslationResponseJson&& other) noexcept = default; // move constructor

    CreateTranslationResponseJson& operator=(const CreateTranslationResponseJson& other) = default; // copy assignment
    CreateTranslationResponseJson& operator=(CreateTranslationResponseJson&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateTranslationResponseJson members

    /// <summary>
    /// 
    /// </summary>
    std::string getText() const;
    void setText(std::string value);

protected:
    std::string m_Text = "";
};

std::vector<CreateTranslationResponseJson> createCreateTranslationResponseJsonVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateTranslationResponseJson>(const CreateTranslationResponseJson& val) {
    return val.toPropertyTree();
}

template<>
inline CreateTranslationResponseJson fromPt<CreateTranslationResponseJson>(const boost::property_tree::ptree& pt) {
    CreateTranslationResponseJson ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateTranslationResponseJson_H_ */
