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
 * Error.h
 *
 * 
 */

#ifndef Error_H_
#define Error_H_



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
class  Error 
{
public:
    Error() = default;
    explicit Error(boost::property_tree::ptree const& pt);
    virtual ~Error() = default;

    Error(const Error& other) = default; // copy constructor
    Error(Error&& other) noexcept = default; // move constructor

    Error& operator=(const Error& other) = default; // copy assignment
    Error& operator=(Error&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// Error members

    /// <summary>
    /// 
    /// </summary>
    std::string getCode() const;
    void setCode(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getMessage() const;
    void setMessage(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getParam() const;
    void setParam(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getType() const;
    void setType(std::string value);

protected:
    std::string m_Code = "";
    std::string m_Message = "";
    std::string m_Param = "";
    std::string m_Type = "";
};

std::vector<Error> createErrorVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<Error>(const Error& val) {
    return val.toPropertyTree();
}

template<>
inline Error fromPt<Error>(const boost::property_tree::ptree& pt) {
    Error ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* Error_H_ */
