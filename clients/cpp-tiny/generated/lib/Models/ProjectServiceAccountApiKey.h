
/*
 * ProjectServiceAccountApiKey.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ProjectServiceAccountApiKey_H_
#define TINY_CPP_CLIENT_ProjectServiceAccountApiKey_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ProjectServiceAccountApiKey{
public:

    /*! \brief Constructor.
	 */
    ProjectServiceAccountApiKey();
    ProjectServiceAccountApiKey(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProjectServiceAccountApiKey();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The object type, which is always `organization.project.service_account.api_key`
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `organization.project.service_account.api_key`
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	std::string getValue();

	/*! \brief Set 
	 */
	void setValue(std::string  value);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	int getCreatedAt();

	/*! \brief Set 
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);


    private:
    std::string object{};
    std::string value{};
    std::string name{};
    int created_at{};
    std::string id{};
};
}

#endif /* TINY_CPP_CLIENT_ProjectServiceAccountApiKey_H_ */
