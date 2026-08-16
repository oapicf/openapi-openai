
/*
 * Project.h
 *
 * Represents an individual project.
 */

#ifndef TINY_CPP_CLIENT_Project_H_
#define TINY_CPP_CLIENT_Project_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Represents an individual project.
 *
 *  \ingroup Models
 *
 */

class Project{
public:

    /*! \brief Constructor.
	 */
    Project();
    Project(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Project();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The identifier, which can be referenced in API endpoints
	 */
	std::string getId();

	/*! \brief Set The identifier, which can be referenced in API endpoints
	 */
	void setId(std::string  id);
	/*! \brief Get The object type, which is always `organization.project`
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `organization.project`
	 */
	void setObject(std::string  object);
	/*! \brief Get The name of the project. This appears in reporting.
	 */
	std::string getName();

	/*! \brief Set The name of the project. This appears in reporting.
	 */
	void setName(std::string  name);
	/*! \brief Get The Unix timestamp (in seconds) of when the project was created.
	 */
	int getCreatedAt();

	/*! \brief Set The Unix timestamp (in seconds) of when the project was created.
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get The Unix timestamp (in seconds) of when the project was archived or `null`.
	 */
	int getArchivedAt();

	/*! \brief Set The Unix timestamp (in seconds) of when the project was archived or `null`.
	 */
	void setArchivedAt(int  archived_at);
	/*! \brief Get `active` or `archived`
	 */
	std::string getStatus();

	/*! \brief Set `active` or `archived`
	 */
	void setStatus(std::string  status);


    private:
    std::string id{};
    std::string object{};
    std::string name{};
    int created_at{};
    int archived_at{};
    std::string status{};
};
}

#endif /* TINY_CPP_CLIENT_Project_H_ */
