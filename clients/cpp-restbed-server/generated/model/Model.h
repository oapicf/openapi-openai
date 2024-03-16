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
 * Model.h
 *
 * 
 */

#ifndef Model_H_
#define Model_H_



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
class  Model 
{
public:
    Model() = default;
    explicit Model(boost::property_tree::ptree const& pt);
    virtual ~Model() = default;

    Model(const Model& other) = default; // copy constructor
    Model(Model&& other) noexcept = default; // move constructor

    Model& operator=(const Model& other) = default; // copy assignment
    Model& operator=(Model&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// Model members

    /// <summary>
    /// 
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getObject() const;
    void setObject(std::string value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getCreated() const;
    void setCreated(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    std::string getOwnedBy() const;
    void setOwnedBy(std::string value);

protected:
    std::string m_Id = "";
    std::string m_object = "";
    int32_t m_Created = 0;
    std::string m_Owned_by = "";
};

std::vector<Model> createModelVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<Model>(const Model& val) {
    return val.toPropertyTree();
}

template<>
inline Model fromPt<Model>(const boost::property_tree::ptree& pt) {
    Model ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* Model_H_ */
