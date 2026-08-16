
/*
 * ProjectApiKey.h
 *
 * Represents an individual API key in a project.
 */

#ifndef TINY_CPP_CLIENT_ProjectApiKey_H_
#define TINY_CPP_CLIENT_ProjectApiKey_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ProjectApiKey_owner.h"

namespace Tiny {


/*! \brief Represents an individual API key in a project.
 *
 *  \ingroup Models
 *
 */

class ProjectApiKey{
public:

    /*! \brief Constructor.
	 */
    ProjectApiKey();
    ProjectApiKey(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProjectApiKey();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The object type, which is always `organization.project.api_key`
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `organization.project.api_key`
	 */
	void setObject(std::string  object);
	/*! \brief Get The redacted value of the API key
	 */
	std::string getRedactedValue();

	/*! \brief Set The redacted value of the API key
	 */
	void setRedactedValue(std::string  redacted_value);
	/*! \brief Get The name of the API key
	 */
	std::string getName();

	/*! \brief Set The name of the API key
	 */
	void setName(std::string  name);
	/*! \brief Get The Unix timestamp (in seconds) of when the API key was created
	 */
	int getCreatedAt();

	/*! \brief Set The Unix timestamp (in seconds) of when the API key was created
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get The identifier, which can be referenced in API endpoints
	 */
	std::string getId();

	/*! \brief Set The identifier, which can be referenced in API endpoints
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	ProjectApiKey_owner getOwner();

	/*! \brief Set 
	 */
	void setOwner(ProjectApiKey_owner  owner);


    private:
    std::string object{};
    std::string redacted_value{};
    std::string name{};
    int created_at{};
    std::string id{};
    ProjectApiKey_owner owner;
};
}

#endif /* TINY_CPP_CLIENT_ProjectApiKey_H_ */
